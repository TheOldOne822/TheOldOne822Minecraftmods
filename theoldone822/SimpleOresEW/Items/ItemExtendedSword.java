package theoldone822.SimpleOresEW.Items;

import static theoldone822.SimpleOresEW.SimpleOresEW.extendedValues.increaseSwordDamage;
import static theoldone822.SimpleOresEW.SimpleOresEW.extendedValues.increaseSwordDurability;
import static theoldone822.SimpleOresEW.SimpleOresEW.extendedValues.increaseSwordMiningSpeed;

import java.lang.reflect.Field;

import theoldone822.SimpleOresEW.PluginChecks;
import theoldone822.SimpleOresEW.SimpleOresEW;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemExtendedSword extends ItemSword {
	protected EnumToolMaterial ewToolMaterial;
	protected float exWeaponDamage;

	public ItemExtendedSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.ewToolMaterial = par2EnumToolMaterial;
		setMaxDamage((int) (getMaxDamage() * increaseSwordDurability));
		exWeaponDamage = 5 + par2EnumToolMaterial.getDamageVsEntity() * 2;
	}

	@Override
	public Multimap getItemAttributeModifiers() {
		Multimap multimap = HashMultimap.create();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e,
				"Weapon modifier", (double) this.exWeaponDamage, 0));
		return multimap;
	}

	@Override
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
		return (int) (super.getStrVsBlock(par1ItemStack, par2Block) * increaseSwordMiningSpeed);
	}

	/**
	 * Adds special effects to the Fyrite and Illumenite Swords.
	 */
	@Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
		if ((PluginChecks.getNetherInstalled() && itemID == SimpleOresEW.extendedfyriteSword.itemID) || (PluginChecks.getNetherFusionInstalled() && (itemID == SimpleOresEW.extendedcinderstoneSword.itemID || itemID == SimpleOresEW.extendeddragonbezoarSword.itemID))) {
			par1ItemStack.damageItem(1, par3EntityLivingBase);
			par2EntityLivingBase.setFire(100);
		}

		if ((PluginChecks.getNetherInstalled() && itemID == SimpleOresEW.extendedillumeniteSword.itemID) || (PluginChecks.getNetherFusionInstalled() && (itemID == SimpleOresEW.extendedcinderstoneSword.itemID || itemID == SimpleOresEW.extendeddragonbezoarSword.itemID))) {
			par1ItemStack.damageItem(1, par3EntityLivingBase);
			par3EntityLivingBase.addPotionEffect(new PotionEffect(Potion.nightVision.id, 3600));
			par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.blindness.id, 60));

			if (!(par2EntityLivingBase instanceof EntityPlayer)) {
				par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 200, 3));
			}
		}
		if (PluginChecks.getNetherFusionInstalled() && this.itemID == SimpleOresEW.extendedpyralisSword.itemID) {
			par1ItemStack.damageItem(1, par3EntityLivingBase);
			par2EntityLivingBase.setFire(50);
			par3EntityLivingBase.addPotionEffect(new PotionEffect(Potion.nightVision.id, 1200));
			par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.blindness.id, 20));
			if (!(par2EntityLivingBase instanceof EntityPlayer)) {
				par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100, 2));
			}
		}
		if (PluginChecks.getArsenicInstalled()) {
			if (itemID == SimpleOresEW.item[0][13].itemID) {
				par1ItemStack.damageItem(1, par3EntityLivingBase);
				par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.poison.id, 130));
			}

			if (itemID == SimpleOresEW.item[0][14].itemID) {
				par1ItemStack.damageItem(1, par3EntityLivingBase);
				par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.poison.id, 55));
			}

			if (itemID == SimpleOresEW.item[0][15].itemID) {
				par1ItemStack.damageItem(1, par3EntityLivingBase);
				par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.poison.id, 80));
			}
		}
		par1ItemStack.damageItem(1, par3EntityLivingBase);
		return true;
	}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7,
			float par8, float par9, float par10) {
		if ((PluginChecks.getNetherInstalled() && itemID == SimpleOresEW.extendedfyriteSword.itemID) || (PluginChecks.getNetherFusionInstalled() && (itemID == SimpleOresEW.extendedcinderstoneSword.itemID || itemID == SimpleOresEW.extendeddragonbezoarSword.itemID || this.itemID == SimpleOresEW.extendedpyralisSword.itemID))) {
			if (par7 == 0) {
				--par5;
			}

			if (par7 == 1) {
				++par5;
			}

			if (par7 == 2) {
				--par6;
			}

			if (par7 == 3) {
				++par6;
			}

			if (par7 == 4) {
				--par4;
			}

			if (par7 == 5) {
				++par4;
			}

			if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
				return false;
			} else {
				int var11 = par3World.getBlockId(par4, par5, par6);

				if (var11 == 0) {
					par3World.playSoundEffect((double) par4 + 0.5D, (double) par5 + 0.5D, (double) par6 + 0.5D, "fire.ignite", 1.0F,
							itemRand.nextFloat() * 0.4F + 0.8F);
					par3World.setBlock(par4, par5, par6, Block.fire.blockID);
				}

				return true;
			}
		}
		return true;
	}
}