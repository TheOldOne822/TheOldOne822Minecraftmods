package theoldone822.SimpleOresEW.Items;

import static theoldone822.SimpleOresEW.SimpleOresEW.extendedValues.increaseToolAttackDamage;
import static theoldone822.SimpleOresEW.SimpleOresEW.extendedValues.increaseToolDurability;
import static theoldone822.SimpleOresEW.SimpleOresEW.extendedValues.increaseToolPower;

import java.util.ArrayList;
import java.util.Random;

import theoldone822.SimpleOresEW.SimpleOresEW;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;

public class ItemExtendedPickaxe extends ItemPickaxe
{
    public ItemExtendedPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        setMaxDamage((int)(getMaxDamage() * increaseToolDurability));
        this.damageVsEntity *= increaseToolAttackDamage;
    }

    @Override
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        return super.getStrVsBlock(par1ItemStack, par2Block) * increaseToolPower;
    }
	@Override
public boolean onBlockStartBreak(ItemStack itemstack, int i, int j, int k, EntityPlayer player) {
		Random random = new Random();
		if (itemID == SimpleOresEW.extendedfyritePick.itemID && !player.capabilities.isCreativeMode) {
			Boolean flag = false;
			World world = player.worldObj;
			int blockID = world.getBlockId(i, j, k);
			int meta = world.getBlockMetadata(i, j, k);

			NBTTagList ench = itemstack.getEnchantmentTagList();
			short level = 0;
			if (ench != null) {
				for (int x = 0; x < ench.tagCount(); x++) {
					NBTTagCompound nbt = (NBTTagCompound) ench.tagAt(x);
					short id = nbt.getShort("id");
					if (id == Enchantment.fortune.effectId) {
						level = nbt.getShort("lvl");
					}
				}
			}
			ArrayList<ItemStack> items = Block.blocksList[blockID].getBlockDropped(world, i, j, k, meta, level);
			if (items == null || items.size() == 0) {
				return false;
			}
			if (Block.blocksList[blockID] != null && getStrVsBlock(itemstack, Block.blocksList[blockID], meta) > 1.0F) {
				for (ItemStack item : items) {
					if (FurnaceRecipes.smelting().getSmeltingResult(item) == null) {
						return false;
					}

					int var3 = random.nextInt(level + 2) - 1;

					if (var3 < 0) {
						var3 = 0;
					}

					int quantity = Block.blocksList[blockID].quantityDropped(random) * (var3 + 1);

					ItemStack drop = new ItemStack(FurnaceRecipes.smelting().getSmeltingResult(item).copy().itemID, quantity, meta);
					world.playSoundEffect(i + 0.5F, j + 0.5F, k + 0.5F, Block.blocksList[blockID].stepSound.getBreakSound(),
							(Block.blocksList[blockID].stepSound.getVolume() + 1.0F) / 2.0F, Block.blocksList[blockID].stepSound.getPitch() * 0.8F);

					world.setBlock(i, j, k, 0);
					if (!world.isRemote) {
						EntityItem entityitem = new EntityItem(world, i + 0.5, j + 0.5, k + 0.5, drop);
						world.spawnEntityInWorld(entityitem);
					}
					itemstack.damageItem(1, player);

					flag = true;
				}
			}

			return flag;
		} else
			return false;
}}
