package theoldone822.SimpleDust;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import alexndr.SimpleOres.api.helpers.TabHelper;
import alexndr.SimpleOres.core.SimpleOres;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDust extends Item {
	public ItemDust(int id) {
		super(id);
		setHasSubtypes(true);
		setMaxDamage(0);
	}

	/**
	 * Registers the item in the GameRegistry, with the name given, and sends the name through to setUnlocalizedName in the
	 * super class.
	 */

	public ItemDust setUnlocalizedName(String unlocalizedName) {
		super.setUnlocalizedName(unlocalizedName);
		GameRegistry.registerItem(this, unlocalizedName);
		return this;
	}

	@SideOnly(Side.CLIENT)
	private Icon[] icons;

	public static final String[] names = new String[] { "iron", "gold", "diamond", "emerald", "copper", "tin", "mythril", "adamantium", "onyx", "bronze",
			"thyrium", "sinisite", "fyrite", "malachite", "illumenite", "argonite", "ashstone", "dragonstone", "arsenic", "arsenideBronze", "arsenideGold",
			"tenebrium", "sterlingSteel", "blackSilver", "haditeSteel", "gestankenzinn", "roseGold", "erubescentGold", "scarlatiteGold", "hephaestanGold",
			"cobalt", "blueDriftSteel", "blueCeladon", "greenCeladon", "tungsten", "tungstenCarbide", "valfram", "tungstenSteel", "prasinos", "cthon",
			"stannum", "cuprum", "pyropusBronze", "pulchrumBronze", "tombBronze", "cinderstone", "thraka", "pyralis", "dragonBezoar", "wootz", "silver",
			"endium", "telos", "sunteleia", "refinedIron", "carbonizedIron", "highSteel", "lowSteel" };

	// @Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		icons = new Icon[58];

		for (int i = 0; i < icons.length; i++) {
			icons[i] = iconRegister.registerIcon("simpleoresdust:" + names[i] + "Dust");
		}
	}

	public String getUnlocalizedName(ItemStack par1) {
		int i = MathHelper.clamp_int(par1.getItemDamage(), 0, 58);
		return super.getUnlocalizedName() + "." + names[i];
	}

	public Icon getIconFromDamage(int par1) {
		return icons[par1];
	}

	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2, List par3) {
		for (int i = 0; i < 58; i++) {
			par3.add(new ItemStack(par1, 1, i));
		}
	}

}