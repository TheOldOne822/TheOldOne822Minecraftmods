package theoldone822.SimpleOresEW.Items;

import java.util.List;
import java.util.Random;

import org.lwjgl.opengl.GL11;

import theoldone822.SimpleOresEW.PluginChecks;
import theoldone822.SimpleOresEW.SimpleOresEW;
import static theoldone822.SimpleOresEW.SimpleOresEW.extendedValues.increaseBowDamage;
import static theoldone822.SimpleOresEW.SimpleOresEW.extendedValues.increaseBowStrength;
import static theoldone822.SimpleOresEW.SimpleOresEW.extendedValues.increaseBowTime;
import static theoldone822.SimpleOresEW.SimpleOresEW.extendedValues.increaseBowDurability;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemExtendedBow extends ItemBow {
	/**
	 * The EnumToolMaterial for the tool. This is used to set what item can be
	 * used to repair it.
	 */
	private final EnumToolMaterial material;

	/**
	 * Creating the icons for the bows. As you draw the bows back, the icon
	 * changes, which is why there are 4 icons for each bow here.
	 */
	public static Icon mythrilBow;
	public static Icon mythrilBow1;
	public static Icon mythrilBow2;
	public static Icon mythrilBow3;
	public static Icon mythrilBow4;
	public static Icon onyxBow;
	public static Icon onyxBow1;
	public static Icon onyxBow2;
	public static Icon onyxBow3;
	public static Icon onyxBow4;
	public static Icon thyriumBow;
	public static Icon thyriumBow1;
	public static Icon thyriumBow2;
	public static Icon thyriumBow3;
	public static Icon thyriumBow4;
	public static Icon sinisiteBow;
	public static Icon sinisiteBow1;
	public static Icon sinisiteBow2;
	public static Icon sinisiteBow3;
	public static Icon sinisiteBow4;
	public static Icon silverBow;
	public static Icon silverBow1;
	public static Icon silverBow2;
	public static Icon silverBow3;
	public static Icon silverBow4;
	public static Icon extendeddragonbezoarBow;
	public static Icon extendeddragonbezoarBow1;
	public static Icon extendeddragonbezoarBow2;
	public static Icon extendeddragonbezoarBow3;
	public static Icon extendeddragonbezoarBow4;

	/**
	 * Constructor for the bows. Worth noting are the following:
	 * 
	 * "this.maxStackSize = 1;" This basically just sets it so that you can only
	 * have one per stack. "this.bFull3D = true;" This allows it to be rendered
	 * in proper 3D when held in your hand. Tools are rendered like this, while
	 * items such as sugar are not.
	 */
	public ItemExtendedBow(int par1, int dam, EnumToolMaterial enumtoolmaterial) {
		super(par1);
		this.maxStackSize = 1;
		material = enumtoolmaterial;
		this.canRepair = true;
		this.bFull3D = true;
		this.setMaxDamage((int) ((dam) * increaseBowDurability));
	}

	/**
	 * Registers the icons for the bows. All icons are registered, and the
	 * default icons (when you haven't drawn it back at all) are set.
	 * 
	 * The default image for the mythril bow is set as mythrilBow. The default
	 * image for the onyx bow is set as onyxBow. The default image for the
	 * thyrium bow is set as thyriumBow. The default image for the sinisite bow
	 * is set as sinisiteBow.
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		if (PluginChecks.getSimpleInstalled()) {
			if (itemID == SimpleOresEW.extendedmythrilBow.itemID) {
				this.itemIcon = iconRegister.registerIcon("simpleoresew:" + "mythrilBow0");
			}

			if (itemID == SimpleOresEW.extendedonyxBow.itemID) {
				this.itemIcon = iconRegister.registerIcon("simpleoresew:" + "onyxBow0");
			}
		}
		if (PluginChecks.getFusionInstalled()) {
			if (itemID == SimpleOresEW.extendedthyriumBow.itemID) {
				this.itemIcon = iconRegister.registerIcon("simpleoresew:" + "thyriumBow0");
			}

			if (itemID == SimpleOresEW.extendedsinisiteBow.itemID) {
				this.itemIcon = iconRegister.registerIcon("simpleoresew:" + "sinisiteBow0");
			}
		}
		if (PluginChecks.getSilverInstalled() && itemID == SimpleOresEW.extendedsilverBow.itemID)
			this.itemIcon = iconRegister.registerIcon("simpleoresew:" + "silverBow0");

		if (PluginChecks.getNetherFusionInstalled() && itemID == SimpleOresEW.extendeddragonbezoarBow.itemID) {
			this.itemIcon = iconRegister.registerIcon("simpleoresew:" + "extendeddragonbezoarBow");
		}

		mythrilBow = iconRegister.registerIcon("simpleoresew:" + "mythrilBow0");
		mythrilBow1 = iconRegister.registerIcon("simpleoresew:" + "mythrilBow1");
		mythrilBow2 = iconRegister.registerIcon("simpleoresew:" + "mythrilBow2");
		mythrilBow3 = iconRegister.registerIcon("simpleoresew:" + "mythrilBow3");
		mythrilBow4 = iconRegister.registerIcon("simpleoresew:" + "mythrilBow4");
		onyxBow = iconRegister.registerIcon("simpleoresew:" + "onyxBow0");
		onyxBow1 = iconRegister.registerIcon("simpleoresew:" + "onyxBow1");
		onyxBow2 = iconRegister.registerIcon("simpleoresew:" + "onyxBow2");
		onyxBow3 = iconRegister.registerIcon("simpleoresew:" + "onyxBow3");
		onyxBow4 = iconRegister.registerIcon("simpleoresew:" + "onyxBow4");
		thyriumBow = iconRegister.registerIcon("simpleoresew:" + "thyriumBow0");
		thyriumBow1 = iconRegister.registerIcon("simpleoresew:" + "thyriumBow1");
		thyriumBow2 = iconRegister.registerIcon("simpleoresew:" + "thyriumBow2");
		thyriumBow3 = iconRegister.registerIcon("simpleoresew:" + "thyriumBow3");
		thyriumBow4 = iconRegister.registerIcon("simpleoresew:" + "thyriumBow4");
		sinisiteBow = iconRegister.registerIcon("simpleoresew:" + "sinisiteBow0");
		sinisiteBow1 = iconRegister.registerIcon("simpleoresew:" + "sinisiteBow1");
		sinisiteBow2 = iconRegister.registerIcon("simpleoresew:" + "sinisiteBow2");
		sinisiteBow3 = iconRegister.registerIcon("simpleoresew:" + "sinisiteBow3");
		sinisiteBow4 = iconRegister.registerIcon("simpleoresew:" + "sinisiteBow4");
		silverBow = iconRegister.registerIcon("simpleoresew:" + "silverBow0");
		silverBow1 = iconRegister.registerIcon("simpleoresew:" + "silverBow1");
		silverBow2 = iconRegister.registerIcon("simpleoresew:" + "silverBow2");
		silverBow3 = iconRegister.registerIcon("simpleoresew:" + "silverBow3");
		silverBow4 = iconRegister.registerIcon("simpleoresew:" + "silverBow4");
		extendeddragonbezoarBow = iconRegister.registerIcon("simpleoresew:" + "extendeddragonbezoarBow");
		extendeddragonbezoarBow1 = iconRegister.registerIcon("simpleoresew:" + "extendeddragonbezoarBow1");
		extendeddragonbezoarBow2 = iconRegister.registerIcon("simpleoresew:" + "extendeddragonbezoarBow2");
		extendeddragonbezoarBow3 = iconRegister.registerIcon("simpleoresew:" + "extendeddragonbezoarBow3");
		extendeddragonbezoarBow4 = iconRegister.registerIcon("simpleoresew:" + "extendeddragonbezoarBow4");
	}

	/**
	 * Gets the icon based on draw back time. As you draw back for longer, the
	 * image changes.
	 * 
	 * The GL11.glTranslate/Rotate sets how the item is held in third person, so
	 * it is held like a bow rather than a tool (ie. hand on the grip in the
	 * middle, not at the bottom.
	 */
	@Override
	public Icon getIcon(ItemStack itemStack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining) {
		if (Minecraft.getMinecraft().gameSettings.thirdPersonView != 0) {
			GL11.glTranslatef(0.0F, -0.6F, -0.025F);
			GL11.glRotatef(-17.0F, 0.0F, 0.0F, 1.0F);
			GL11.glRotatef(14.0F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(4.5F, 0.0F, 1.0F, 0.0F);
		}

		if (player.getItemInUse() == null)
			return this.itemIcon;
		int var8 = player.getItemInUseDuration();

		if (var8 >= 100) {
			if (PluginChecks.getSimpleInstalled()) {
				if (itemID == SimpleOresEW.extendedmythrilBow.itemID) {
					return mythrilBow4;
				}

				if (itemID == SimpleOresEW.extendedonyxBow.itemID) {
					return onyxBow4;
				}
			}
			if (PluginChecks.getFusionInstalled()) {
				if (itemID == SimpleOresEW.extendedthyriumBow.itemID) {
					return thyriumBow4;
				}

				if (itemID == SimpleOresEW.extendedsinisiteBow.itemID) {
					return sinisiteBow4;
				}
			}

			if (PluginChecks.getSilverInstalled() && itemID == SimpleOresEW.extendedsilverBow.itemID)
				return silverBow4;
			if (PluginChecks.getNetherFusionInstalled() && itemID == SimpleOresEW.extendeddragonbezoarBow.itemID) {
				return extendeddragonbezoarBow4;
			}
		}
		if (var8 >= 18 * increaseBowTime) {
			if (PluginChecks.getSimpleInstalled()) {
				if (itemID == SimpleOresEW.extendedmythrilBow.itemID) {
					return mythrilBow3;
				}

				if (itemID == SimpleOresEW.extendedonyxBow.itemID) {
					return onyxBow3;
				}
				if (PluginChecks.getFusionInstalled()) {
					if (itemID == SimpleOresEW.extendedthyriumBow.itemID) {
						return thyriumBow3;
					}

					if (itemID == SimpleOresEW.extendedsinisiteBow.itemID) {
						return sinisiteBow3;
					}
				}
			}

			if (PluginChecks.getSilverInstalled() && itemID == SimpleOresEW.extendedsilverBow.itemID)
				return silverBow3;
			if (PluginChecks.getNetherFusionInstalled() && itemID == SimpleOresEW.extendeddragonbezoarBow.itemID) {
				return extendeddragonbezoarBow3;
			}
		}
		if (var8 > 13 * increaseBowTime) {
			if (PluginChecks.getSimpleInstalled()) {
				if (itemID == SimpleOresEW.extendedmythrilBow.itemID) {
					return mythrilBow2;
				}

				if (itemID == SimpleOresEW.extendedonyxBow.itemID) {
					return onyxBow2;
				}
			}
			if (PluginChecks.getFusionInstalled()) {
				if (itemID == SimpleOresEW.extendedthyriumBow.itemID) {
					return thyriumBow2;
				}

				if (itemID == SimpleOresEW.extendedsinisiteBow.itemID) {
					return sinisiteBow2;
				}
			}

			if (PluginChecks.getSilverInstalled() && itemID == SimpleOresEW.extendedsilverBow.itemID)
				return silverBow2;
			if (PluginChecks.getNetherFusionInstalled() && itemID == SimpleOresEW.extendeddragonbezoarBow.itemID) {
				return extendeddragonbezoarBow2;
			}
		}
		if (var8 > 0) {
			if (PluginChecks.getSimpleInstalled()) {
				if (itemID == SimpleOresEW.extendedmythrilBow.itemID) {
					return mythrilBow1;
				}

				if (itemID == SimpleOresEW.extendedonyxBow.itemID) {
					return onyxBow1;
				}
			}
			if (PluginChecks.getFusionInstalled()) {
				if (itemID == SimpleOresEW.extendedthyriumBow.itemID) {
					return thyriumBow1;
				}

				if (itemID == SimpleOresEW.extendedsinisiteBow.itemID) {
					return sinisiteBow1;
				}
			}

			if (PluginChecks.getSilverInstalled() && itemID == SimpleOresEW.extendedsilverBow.itemID)
				return silverBow1;
			if (PluginChecks.getNetherFusionInstalled() && itemID == SimpleOresEW.extendeddragonbezoarBow.itemID) {
				return extendeddragonbezoarBow1;
			}
		}

		return this.itemIcon;
	}

	/**
	 * Sets the rarity of the item. This gives it a different coloured name
	 * (like with the golden apple). This is not in use though, it is simply
	 * here for reference so I can remember how to do it if I choose to do so
	 * later.
	 */
	/*
	 * public EnumRarity getRarity(ItemStack itemstack) { if(itemID ==
	 * SimpleOres.silverBow.itemID) { return EnumRarity.uncommon; }
	 * 
	 * if(itemID == SimpleOres.mythrilBow.itemID) { return EnumRarity.rare; }
	 * 
	 * if(itemID == SimpleOres.onyxBow.itemID) { return EnumRarity.epic; }
	 * 
	 * else return EnumRarity.common; }
	 */

	/**
	 * Adds info to the tool tip when you hover over the item. This is just to
	 * show the special effects of the bows.
	 */
	@Override
	public void addInformation(ItemStack stack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		if (PluginChecks.getSimpleInstalled()) {
			if (itemID == SimpleOresEW.extendedmythrilBow.itemID) {
				par3List.add(StatCollector.translateToLocal("tips.damageTooltip"));
				par3List.add(StatCollector.translateToLocal("tips.efficiencyTooltip"));
			}

			if (itemID == SimpleOresEW.extendedonyxBow.itemID) {
				par3List.add(StatCollector.translateToLocal("tips.damageTooltip"));
				par3List.add(StatCollector.translateToLocal("tips.flameTooltip"));
			}
		}
		if (PluginChecks.getFusionInstalled()) {
			if (itemID == SimpleOresEW.extendedthyriumBow.itemID) {
				par3List.add(StatCollector.translateToLocal("tips.damageTooltip"));
				par3List.add(StatCollector.translateToLocal("tips.zoomTooltip"));
			}

			if (itemID == SimpleOresEW.extendedsinisiteBow.itemID) {
				par3List.add(StatCollector.translateToLocal("tips.damageTooltip"));
				par3List.add(StatCollector.translateToLocal("tips.knockbackTooltip"));
			}
		}
		if (PluginChecks.getSilverInstalled() && itemID == SimpleOresEW.extendedsilverBow.itemID)
			par3List.add(StatCollector.translateToLocal("tips.knockbackTooltip"));
		if (PluginChecks.getNetherFusionInstalled() && itemID == SimpleOresEW.extendeddragonbezoarBow.itemID) {
			par3List.add(StatCollector.translateToLocal("tips.damageTooltip"));
			par3List.add(StatCollector.translateToLocal("tips.zoomTooltip"));
			par3List.add(StatCollector.translateToLocal("tips.knockbackTooltip"));
			par3List.add(StatCollector.translateToLocal("tips.efficiencyTooltip"));
			par3List.add(StatCollector.translateToLocal("tips.flameTooltip"));
		}
	}

	/**
	 * Determines what happens when you let go of the right mouse button,
	 * usually firing an arrow. Sets the arrows speed etc. depending on drawback
	 * time.
	 * 
	 * This is also where the special effects are determined, such as flame,
	 * damage and knockback. The Mythril Bows chance to not consume an arrow is
	 * determined here too.
	 */
	@Override
	public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4) {
		int var6 = getMaxItemUseDuration(par1ItemStack) - par4;
		ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, var6);
		MinecraftForge.EVENT_BUS.post(event);

		if (event.isCanceled()) {
			return;
		}

		var6 = event.charge;
		boolean flag = (par3EntityPlayer.capabilities.isCreativeMode)
				|| (EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0);

		if ((flag) || (par3EntityPlayer.inventory.hasItem(Item.arrow.itemID))) {
			int i = getMaxItemUseDuration(par1ItemStack) - par4;
			i /= increaseBowTime;
			float f = i / 20.0F;
			f = (f * f + f * 2.0F) / 3.0F;

			if (f < 0.1D * increaseBowTime) {
				return;
			}

			boolean superCharge = false;
			if (f > 1.0F) {
				if (f > 9.0f)
					superCharge = true;

				f = 1.0F;
			}

			EntityArrow var8 = new EntityArrow(par2World, par3EntityPlayer, f * 2.0F * (superCharge ? 2 : increaseBowStrength));

			if (f >= 1.0F) {
				var8.setIsCritical(true);
			}

			if (f >= 1.0F
					&& ((PluginChecks.getSimpleInstalled() && itemID == SimpleOresEW.extendedonyxBow.itemID) || (PluginChecks
							.getNetherFusionInstalled() && itemID == SimpleOresEW.extendeddragonbezoarBow.itemID))) {
				var8.setIsCritical(true);
				var8.setFire(100);
			}

			int j = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

			if (j > 0) {
				var8.setDamage(var8.getDamage() + j * 0.5D + 0.5D);
			}

			int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

			if (k > 0) {
				var8.setKnockbackStrength(k);
			}

			if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0) {
				var8.setFire(100);
			}

			par1ItemStack.damageItem(1, par3EntityPlayer);
			par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

			var8.setDamage(var8.getDamage() * increaseBowDamage);

			Random generator = new Random();

			int z;
			int r = generator.nextInt(100);

			if (r <= 50) {
				z = 1;
			}

			else {
				z = 0;
			}

			if (!flag) {
				if (z == 1
						&& ((PluginChecks.getSimpleInstalled() && itemID == SimpleOresEW.extendedmythrilBow.itemID) || (PluginChecks
								.getNetherFusionInstalled() && itemID == SimpleOresEW.extendeddragonbezoarBow.itemID))) {
					var8.canBePickedUp = 0;
				} else {
					par3EntityPlayer.inventory.consumeInventoryItem(Item.arrow.itemID);
				}
			}

			else {
				var8.canBePickedUp = 2;
			}

			if (!par2World.isRemote) {
				par2World.spawnEntityInWorld(var8);

				if (PluginChecks.getSimpleInstalled()) {
					if (itemID == SimpleOresEW.extendedmythrilBow.itemID) {
						var8.setDamage(var8.getDamage() + alexndr.SimpleOres.api.helpers.CoreHelper.coreSettings.mythrilBowDamageModifier * increaseBowDamage * 0.5D + 0.5D);
					}

					if (itemID == SimpleOresEW.extendedonyxBow.itemID) {
						var8.setDamage(var8.getDamage() + alexndr.SimpleOres.api.helpers.CoreHelper.coreSettings.onyxBowDamageModifier * increaseBowDamage * 0.5D + 0.5D);
					}
				}
				if (PluginChecks.getFusionInstalled()) {
					if (itemID == SimpleOresEW.extendedthyriumBow.itemID) {
						var8.setDamage(var8.getDamage() + alexndr.SimpleOres.plugins.fusion.Settings.thyriumBowDamageModifier * increaseBowDamage
								* 0.5D + 0.5D);
					}

					if (itemID == SimpleOresEW.extendedsinisiteBow.itemID) {
						var8.setDamage(var8.getDamage() + alexndr.SimpleOres.plugins.fusion.Settings.sinisiteBowDamageModifier * increaseBowDamage
								* 0.5D + 0.5D);
						var8.setKnockbackStrength(k + alexndr.SimpleOres.plugins.fusion.Settings.sinisiteBowKnockbackModifier);
					}
				}
				if (PluginChecks.getSilverInstalled() && itemID == SimpleOresEW.extendedsilverBow.itemID)
					var8.setKnockbackStrength(k + 2);
				
				if (itemID == SimpleOresEW.extendeddragonbezoarBow.itemID) {
					var8.setDamage(var8.getDamage() + theoldone822.NetherrocksFusion.Settings.dragonbezoarBowDamageModifier * increaseBowDamage
							* 0.5D + 0.5D);
					var8.setKnockbackStrength(k + theoldone822.NetherrocksFusion.Settings.dragonbezoarBowKnockbackModifier);
				}
			}
		}
	}

	public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		return par1ItemStack;
	}

	/**
	 * Determines how long you can use the item for. Not sure if it actually has
	 * any effect.
	 */
	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack) {
		return 72000;
	}

	/**
	 * Gets the action for holding right click, in this case the bow action.
	 */
	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.bow;
	}

	/**
	 * 
	 */
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if ((par3EntityPlayer.capabilities.isCreativeMode) || (par3EntityPlayer.inventory.hasItem(Item.arrow.itemID))) {
			par3EntityPlayer.setItemInUse(par1ItemStack, getMaxItemUseDuration(par1ItemStack));
		}

		return par1ItemStack;
	}

	/**
	 * Gets the items enchtantability.
	 */
	@Override
	public int getItemEnchantability() {
		return 1;
	}

	/**
	 * Determines if the tool is repairable, and gets the item which can be used
	 * to repair it depending on the material of the tool.
	 * 
	 * For example, a mythril bow can be repaired with a mythril ingot, an onyx
	 * bow with an onyx gem.
	 */
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
		return this.material.getToolCraftingMaterial() == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
}