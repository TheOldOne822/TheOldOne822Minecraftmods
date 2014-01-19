package theoldone822.SimpleOresEW.Items;

import static theoldone822.SimpleOresEW.SimpleOresEW.extendedValues.increaseShearMiningSpeed;
import static theoldone822.SimpleOresEW.SimpleOresEW.extendedValues.increaseShearDurability;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IShearable;

public class ItemExtendedShears extends ItemShears
{
	public ItemExtendedShears(int par1, int maxDamage)
	{
		super(par1);
        this.setMaxStackSize(1);
        this.setMaxDamage(Math.round((maxDamage) * increaseShearDurability));
	}

	/**
	 * Returns the strength of the stack against a given block. 1.0F base,
	 * (Quality+1)*2 if correct blocktype, 1.5F if sword
	 */
	@Override
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
	{
		return super.getStrVsBlock(par1ItemStack, par2Block) * increaseShearMiningSpeed;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase entity)
	{
		if(entity.worldObj.isRemote)
		{
			return false;
		}

		if(entity instanceof IShearable)
		{
			IShearable target = (IShearable) entity;
			Random rand = new Random();
			
			
			if(target.isShearable(itemstack, entity.worldObj, (int) entity.posX, (int) entity.posY, (int) entity.posZ))
			{
				ArrayList<ItemStack> drops = target.onSheared(itemstack, entity.worldObj, (int) entity.posX, (int) entity.posY, (int) entity.posZ, EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, itemstack));

				for(ItemStack stack : (ArrayList<ItemStack>) drops.clone())
				{
					drops.add(stack.copy());
				}

				if(rand.nextBoolean())
				{
					if(rand.nextBoolean())
						drops.add(drops.get(rand.nextInt(drops.size())).copy());
					else
						drops.remove(rand.nextInt(drops.size()));
				}

				for(ItemStack stack : drops)
				{
					EntityItem item = entity.entityDropItem(stack, 1.0F);
					item.motionY += rand.nextFloat() * 0.05F;
					item.motionX += (rand.nextFloat() - rand.nextFloat()) * 0.1F;
					item.motionZ += (rand.nextFloat() - rand.nextFloat()) * 0.1F;
				}

				itemstack.damageItem(1, entity);
			}
			
			return true;
		}
		
		return false;
	}
}
