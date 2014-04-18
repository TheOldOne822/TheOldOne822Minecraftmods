package theoldone822.SimpleOresEW.Items;

import static naruto1310.extendedWorkbench.mod_ExtendedWorkbench.extendedValues.increaseToolAttackDamage;
import static naruto1310.extendedWorkbench.mod_ExtendedWorkbench.extendedValues.increaseToolDurability;
import static naruto1310.extendedWorkbench.mod_ExtendedWorkbench.extendedValues.increaseToolPower;

import java.util.ArrayList;
import java.util.Random;

import theoldone822.SimpleOresEW.PluginChecks;
import theoldone822.SimpleOresEW.SimpleOresEW;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemExtendedNetherShovel extends ItemSpade
{
    public ItemExtendedNetherShovel(int par1, EnumToolMaterial par2EnumToolMaterial)
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
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
		if (PluginChecks.getNetherFusionInstalled() && this.itemID == SimpleOresEW.extendeddragonbezoarShovel.itemID) {
			par1ItemStack.damageItem(1, par3EntityLivingBase);
			par2EntityLivingBase.setFire(100);
			par3EntityLivingBase.addPotionEffect(new PotionEffect(Potion.nightVision.id, 3600));
			par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.blindness.id, 60));
			if (!(par2EntityLivingBase instanceof EntityPlayer)) {
				par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 200, 3));
			}

		}
		if (PluginChecks.getNetherFusionInstalled() && this.itemID == SimpleOresEW.extendedpyralisShovel.itemID) {
			par1ItemStack.damageItem(1, par3EntityLivingBase);
			par2EntityLivingBase.setFire(50);
			par3EntityLivingBase.addPotionEffect(new PotionEffect(Potion.nightVision.id, 1200));
			par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.blindness.id, 20));
			if (!(par2EntityLivingBase instanceof EntityPlayer)) {
				par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100, 2));
			}
		}
		par1ItemStack.damageItem(1, par3EntityLivingBase);
		return true;
	}

	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		if (PluginChecks.getNetherFusionInstalled() && (this.itemID == SimpleOresEW.extendeddragonbezoarShovel.itemID || this.itemID == SimpleOresEW.extendedpyralisShovel.itemID)) {
			if (par7 == 0) {
				par5--;
			}
			if (par7 == 1) {
				par5++;
			}
			if (par7 == 2) {
				par6--;
			}
			if (par7 == 3) {
				par6++;
			}
			if (par7 == 4) {
				par4--;
			}
			if (par7 == 5) {
				par4++;
			}
			if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
				return false;
			}
			int var11 = par3World.getBlockId(par4, par5, par6);
			if (var11 == 0) {
				par3World.playSoundEffect(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, Item.itemRand.nextFloat() * 0.4F + 0.8F);
				par3World.setBlock(par4, par5, par6, Block.fire.blockID);
			}
			return true;
		}
		return true;
	}

	public boolean onBlockStartBreak(ItemStack itemstack, int i, int j, int k, EntityPlayer player) {
		Random random = new Random();
		if (PluginChecks.getNetherFusionInstalled() && (itemID == SimpleOresEW.extendeddragonbezoarShovel.itemID && !player.capabilities.isCreativeMode)) {
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

					ItemStack drop = new ItemStack(FurnaceRecipes.smelting().getSmeltingResult(item).copy().itemID, quantity, FurnaceRecipes.smelting().getSmeltingResult(item).copy().getItemDamage());
					world.playSoundEffect(i + 0.5F, j + 0.5F, k + 0.5F, Block.blocksList[blockID].stepSound.getBreakSound(), (Block.blocksList[blockID].stepSound.getVolume() + 1.0F) / 2.0F,
							Block.blocksList[blockID].stepSound.getPitch() * 0.8F);

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
