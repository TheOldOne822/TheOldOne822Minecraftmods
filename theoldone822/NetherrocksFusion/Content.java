package theoldone822.NetherrocksFusion;

import theoldone822.NetherrocksFusion.Furnaces.SuperFurnace;
import theoldone822.NetherrocksFusion.Furnaces.SuperFusionFurnace;
import theoldone822.NetherrocksFusion.Items.ItemExtendedArmor;
import theoldone822.NetherrocksFusion.Items.ItemExtendedAxe;
import theoldone822.NetherrocksFusion.Items.ItemExtendedBow;
import theoldone822.NetherrocksFusion.Items.ItemExtendedHoe;
import theoldone822.NetherrocksFusion.Items.ItemExtendedPickaxe;
import theoldone822.NetherrocksFusion.Items.ItemExtendedShears;
import theoldone822.NetherrocksFusion.Items.ItemExtendedShovel;
import theoldone822.NetherrocksFusion.Items.ItemExtendedSword;
import theoldone822.NetherrocksFusion.Items.NetherAxe;
import theoldone822.NetherrocksFusion.Items.NetherPickaxe;
import theoldone822.NetherrocksFusion.Items.NetherShovel;
import theoldone822.NetherrocksFusion.Items.NetherSword;
import theoldone822.NetherrocksFusion.Items.SimpleBow;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import SimpleOres.core.SimpleOres;
import theoldone822.NetherrocksFusion.Items.SimpleArmor;
import theoldone822.NetherrocksFusion.Items.SimpleAxe;
import theoldone822.NetherrocksFusion.Items.SimpleHoe;
import theoldone822.NetherrocksFusion.Items.SimpleIngot;
import theoldone822.NetherrocksFusion.Items.SimpleOre;
import theoldone822.NetherrocksFusion.Items.SimplePickaxe;
import theoldone822.NetherrocksFusion.Items.SimpleShovel;
import theoldone822.NetherrocksFusion.Items.SimpleSword;
import theoldone822.NetherrocksFusion.Items.SimpleShears;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraftforge.common.MinecraftForge;

public class Content 
{
	public static NetherrocksFusion mod;
	
	/**
	 * Creating the blocks.
	 */
	public static Block cinderstoneBlock;
	public static Block thrakaBlock;
	public static Block pyralisBlock;
	public static Block dragonbezoarBlock;
	public static Block dragonbezoarFurnace;
	public static Block dragonbezoarFurnaceOn;
	public static Block dragonbezoarFusionFurnace;
	public static Block dragonbezoarFusionFurnaceOn;

	/**
	 * Creating the item int's. Fairly obvious.
	 */
	public static Item cinderstoneIngot;
	public static Item thrakaIngot;
	public static Item pyralisIngot;
	public static Item dragonbezoarIngot;
	public static Item dragonbezoarRod;
	
	public static Item smallCinderstoneChunk;
	public static Item mediumCinderstoneChunk;
	public static Item largeCinderstoneChunk;
	public static Item smallThrakaChunk;
	public static Item mediumThrakaChunk;
	public static Item largeThrakaChunk;
	public static Item smallPyralisChunk;
	public static Item mediumPyralisChunk;
	public static Item largePyralisChunk;
	public static Item smallDragonBezoarChunk;
	public static Item mediumDragonBezoarChunk;
	public static Item largeDragonBezoarChunk;
	
	/**
	 * Creating the tool items.
	 */
	public static Item cinderstoneSword;
	public static Item thrakaPick;
	public static Item thrakaAxe;
	public static Item thrakaShovel;
	public static Item thrakaSword;
	public static Item thrakaHoe;
	public static Item pyralisPick;
	public static Item pyralisAxe;
	public static Item pyralisShovel;
	public static Item pyralisSword;
	public static Item pyralisHoe;
	public static Item dragonbezoarPick;
	public static Item dragonbezoarAxe;
	public static Item dragonbezoarShovel;
	public static Item dragonbezoarSword;
	public static Item dragonbezoarHoe;
	public static Item dragonbezoarBow;
	public static Item dragonbezoarShears;
	
	/**
	 * Creating the armor items.
	 */
	public static Item cinderstoneHelm;
	public static Item cinderstoneChest;
	public static Item cinderstoneLegs;
	public static Item cinderstoneBoots;
	public static Item thrakaHelm;
	public static Item thrakaChest;
	public static Item thrakaLegs;
	public static Item thrakaBoots;
	public static Item pyralisHelm;
	public static Item pyralisChest;
	public static Item pyralisLegs;
	public static Item pyralisBoots;
	public static Item dragonbezoarHelm;
	public static Item dragonbezoarChest;
	public static Item dragonbezoarLegs;
	public static Item dragonbezoarBoots;
	
	/**
	 * Creating the tool items.
	 */
	public static Item extendedcinderstoneSword;
	public static Item extendedthrakaPick;
	public static Item extendedthrakaAxe;
	public static Item extendedthrakaShovel;
	public static Item extendedthrakaSword;
	public static Item extendedthrakaHoe;
	public static Item extendedpyralisPick;
	public static Item extendedpyralisAxe;
	public static Item extendedpyralisShovel;
	public static Item extendedpyralisSword;
	public static Item extendedpyralisHoe;
	public static Item extendeddragonbezoarPick;
	public static Item extendeddragonbezoarAxe;
	public static Item extendeddragonbezoarShovel;
	public static Item extendeddragonbezoarSword;
	public static Item extendeddragonbezoarHoe;
	public static Item extendeddragonbezoarBow;
	public static Item extendeddragonbezoarShears;
	
	/**
	 * Creating the armor items.
	 */
	public static Item extendedcinderstoneHelm;
	public static Item extendedcinderstoneChest;
	public static Item extendedcinderstoneLegs;
	public static Item extendedcinderstoneBoots;
	public static Item extendedthrakaHelm;
	public static Item extendedthrakaChest;
	public static Item extendedthrakaLegs;
	public static Item extendedthrakaBoots;
	public static Item extendedpyralisHelm;
	public static Item extendedpyralisChest;
	public static Item extendedpyralisLegs;
	public static Item extendedpyralisBoots;
	public static Item extendeddragonbezoarHelm;
	public static Item extendeddragonbezoarChest;
	public static Item extendeddragonbezoarLegs;
	public static Item extendeddragonbezoarBoots;
	/**
	 * The method that gives the armor items their properties and names. This is called by the main SimpleOres class.
	 */
	public static void doArmor()
	{
		//Armour Details
		cinderstoneHelm = new SimpleArmor(IDs.cinderstoneHelmID, mod.armorCinderstone, mod.rendererCinderstone, 0, "cinderstone", "netherrocksfusion", SimpleOres.tabSimpleCombat).setUnlocalizedName("netherrocksfusion:cinderstoneHelm").setTextureName("netherrocksfusion:cinderstoneHelm");
		cinderstoneChest = new SimpleArmor(IDs.cinderstoneChestID, mod.armorCinderstone, mod.rendererCinderstone, 1, "cinderstone", "netherrocksfusion", SimpleOres.tabSimpleCombat).setUnlocalizedName("netherrocksfusion:cinderstoneChest").setTextureName("netherrocksfusion:cinderstoneChest");
		cinderstoneLegs = new SimpleArmor(IDs.cinderstoneLegsID, mod.armorCinderstone, mod.rendererCinderstone, 2, "cinderstone", "netherrocksfusion", SimpleOres.tabSimpleCombat).setUnlocalizedName("netherrocksfusion:cinderstoneLegs").setTextureName("netherrocksfusion:cinderstoneLegs");
		cinderstoneBoots = new SimpleArmor(IDs.cinderstoneBootsID, mod.armorCinderstone, mod.rendererCinderstone, 3, "cinderstone", "netherrocksfusion", SimpleOres.tabSimpleCombat).setUnlocalizedName("netherrocksfusion:cinderstoneBoots").setTextureName("netherrocksfusion:cinderstoneBoots");
		thrakaHelm = new SimpleArmor(IDs.thrakaHelmID, mod.armorThraka, mod.rendererThraka, 0, "thraka", "netherrocksfusion", SimpleOres.tabSimpleCombat).setUnlocalizedName("netherrocksfusion:thrakaHelm").setTextureName("netherrocksfusion:thrakaHelm");
		thrakaChest = new SimpleArmor(IDs.thrakaChestID, mod.armorThraka, mod.rendererThraka, 1, "thraka", "netherrocksfusion", SimpleOres.tabSimpleCombat).setUnlocalizedName("netherrocksfusion:thrakaChest").setTextureName("netherrocksfusion:thrakaChest");
		thrakaLegs = new SimpleArmor(IDs.thrakaLegsID, mod.armorThraka, mod.rendererThraka, 2, "thraka", "netherrocksfusion", SimpleOres.tabSimpleCombat).setUnlocalizedName("netherrocksfusion:thrakaLegs").setTextureName("netherrocksfusion:thrakaLegs");
		thrakaBoots = new SimpleArmor(IDs.thrakaBootsID, mod.armorThraka, mod.rendererThraka, 3, "thraka", "netherrocksfusion", SimpleOres.tabSimpleCombat).setUnlocalizedName("netherrocksfusion:thrakaBoots").setTextureName("netherrocksfusion:thrakaBoots");
		pyralisHelm = new SimpleArmor(IDs.pyralisHelmID, mod.armorPyralis, mod.rendererPyralis, 0, "pyralis", "netherrocksfusion", SimpleOres.tabSimpleCombat).setUnlocalizedName("netherrocksfusion:pyralisHelm").setTextureName("netherrocksfusion:pyralisHelm");
		pyralisChest = new SimpleArmor(IDs.pyralisChestID, mod.armorPyralis, mod.rendererPyralis, 1, "pyralis", "netherrocksfusion", SimpleOres.tabSimpleCombat).setUnlocalizedName("netherrocksfusion:pyralisChest").setTextureName("netherrocksfusion:pyralisChest");
		pyralisLegs = new SimpleArmor(IDs.pyralisLegsID, mod.armorPyralis, mod.rendererPyralis, 2, "pyralis", "netherrocksfusion", SimpleOres.tabSimpleCombat).setUnlocalizedName("netherrocksfusion:pyralisLegs").setTextureName("netherrocksfusion:pyralisLegs");
		pyralisBoots = new SimpleArmor(IDs.pyralisBootsID, mod.armorPyralis, mod.rendererPyralis, 3, "pyralis", "netherrocksfusion", SimpleOres.tabSimpleCombat).setUnlocalizedName("netherrocksfusion:pyralisBoots").setTextureName("netherrocksfusion:pyralisBoots");
		dragonbezoarHelm = new SimpleArmor(IDs.dragonbezoarHelmID, mod.armorDragonBezoar, mod.rendererDragonBezoar, 0, "dragonbezoar", "netherrocksfusion", SimpleOres.tabSimpleCombat).setUnlocalizedName("netherrocksfusion:dragonbezoarHelm").setTextureName("netherrocksfusion:dragonbezoarHelm");
		dragonbezoarChest = new SimpleArmor(IDs.dragonbezoarChestID, mod.armorDragonBezoar, mod.rendererDragonBezoar, 1, "dragonbezoar", "netherrocksfusion", SimpleOres.tabSimpleCombat).setUnlocalizedName("netherrocksfusion:dragonbezoarChest").setTextureName("netherrocksfusion:dragonbezoarChest");
		dragonbezoarLegs = new SimpleArmor(IDs.dragonbezoarLegsID, mod.armorDragonBezoar, mod.rendererDragonBezoar, 2, "dragonbezoar", "netherrocksfusion", SimpleOres.tabSimpleCombat).setUnlocalizedName("netherrocksfusion:dragonbezoarLegs").setTextureName("netherrocksfusion:dragonbezoarLegs");
		dragonbezoarBoots = new SimpleArmor(IDs.dragonbezoarBootsID, mod.armorDragonBezoar, mod.rendererDragonBezoar, 3, "dragonbezoar", "netherrocksfusion", SimpleOres.tabSimpleCombat).setUnlocalizedName("netherrocksfusion:dragonbezoarBoots").setTextureName("netherrocksfusion:dragonbezoarBoots");

		LanguageRegistry.addName(cinderstoneHelm, "Cinderstone Helmet");
		LanguageRegistry.addName(cinderstoneChest, "Cinderstone Chestplate");
		LanguageRegistry.addName(cinderstoneLegs, "Cinderstone Leggings");
		LanguageRegistry.addName(cinderstoneBoots, "Cinderstone Boots");

		LanguageRegistry.addName(thrakaHelm, "Thraka Helmet");
		LanguageRegistry.addName(thrakaChest, "Thraka Chestplate");
		LanguageRegistry.addName(thrakaLegs, "Thraka Leggings");
		LanguageRegistry.addName(thrakaBoots, "Thraka Boots");

		LanguageRegistry.addName(pyralisHelm, "Pyralis Helmet");
		LanguageRegistry.addName(pyralisChest, "Pyralis Chestplate");
		LanguageRegistry.addName(pyralisLegs, "Pyralis Leggings");
		LanguageRegistry.addName(pyralisBoots, "Pyralis Boots");

		LanguageRegistry.addName(dragonbezoarHelm, "Dragon Bezoar Helmet");
		LanguageRegistry.addName(dragonbezoarChest, "Dragon Bezoar Chestplate");
		LanguageRegistry.addName(dragonbezoarLegs, "Dragon Bezoar Leggings");
		LanguageRegistry.addName(dragonbezoarBoots, "Dragon Bezoar Boots");

		if (EWAPI.getEWInstalled()) {
			extendedcinderstoneHelm = new ItemExtendedArmor(IDs.extendedcinderstoneHelmID, mod.armorCinderstone, mod.rendererextendedCinderstone, 0, "cinderstone", "netherrocksfusion").setUnlocalizedName("netherrocksfusion:extendedcinderstoneHelm").setTextureName("netherrocksfusion:extendedcinderstoneHelm");
			extendedcinderstoneChest = new ItemExtendedArmor(IDs.extendedcinderstoneChestID, mod.armorCinderstone, mod.rendererextendedCinderstone, 1, "cinderstone", "netherrocksfusion").setUnlocalizedName("netherrocksfusion:extendedcinderstoneChest").setTextureName("netherrocksfusion:extendedcinderstoneChest");
			extendedcinderstoneLegs = new ItemExtendedArmor(IDs.extendedcinderstoneLegsID, mod.armorCinderstone, mod.rendererextendedCinderstone, 2, "cinderstone", "netherrocksfusion").setUnlocalizedName("netherrocksfusion:extendedcinderstoneLegs").setTextureName("netherrocksfusion:extendedcinderstoneLegs");
			extendedcinderstoneBoots = new ItemExtendedArmor(IDs.extendedcinderstoneBootsID, mod.armorCinderstone, mod.rendererextendedCinderstone, 3, "cinderstone", "netherrocksfusion").setUnlocalizedName("netherrocksfusion:extendedcinderstoneBoots").setTextureName("netherrocksfusion:extendedcinderstoneBoots");
			extendedthrakaHelm = new ItemExtendedArmor(IDs.extendedthrakaHelmID, mod.armorThraka, mod.rendererextendedThraka, 0, "thraka", "netherrocksfusion").setUnlocalizedName("netherrocksfusion:extendedthrakaHelm").setTextureName("netherrocksfusion:extendedthrakaHelm");
			extendedthrakaChest = new ItemExtendedArmor(IDs.extendedthrakaChestID, mod.armorThraka, mod.rendererextendedThraka, 1, "thraka", "netherrocksfusion").setUnlocalizedName("netherrocksfusion:extendedthrakaChest").setTextureName("netherrocksfusion:extendedthrakaChest");
			extendedthrakaLegs = new ItemExtendedArmor(IDs.extendedthrakaLegsID, mod.armorThraka, mod.rendererextendedThraka, 2, "thraka", "netherrocksfusion").setUnlocalizedName("netherrocksfusion:extendedthrakaLegs").setTextureName("netherrocksfusion:extendedthrakaLegs");
			extendedthrakaBoots = new ItemExtendedArmor(IDs.extendedthrakaBootsID, mod.armorThraka, mod.rendererextendedThraka, 3, "thraka", "netherrocksfusion").setUnlocalizedName("netherrocksfusion:extendedthrakaBoots").setTextureName("netherrocksfusion:extendedthrakaBoots");
			extendedpyralisHelm = new ItemExtendedArmor(IDs.extendedpyralisHelmID, mod.armorPyralis, mod.rendererextendedPyralis, 0, "pyralis", "netherrocksfusion").setUnlocalizedName("netherrocksfusion:extendedpyralisHelm").setTextureName("netherrocksfusion:extendedpyralisHelm");
			extendedpyralisChest = new ItemExtendedArmor(IDs.extendedpyralisChestID, mod.armorPyralis, mod.rendererextendedPyralis, 1, "pyralis", "netherrocksfusion").setUnlocalizedName("netherrocksfusion:extendedpyralisChest").setTextureName("netherrocksfusion:extendedpyralisChest");
			extendedpyralisLegs = new ItemExtendedArmor(IDs.extendedpyralisLegsID, mod.armorPyralis, mod.rendererextendedPyralis, 2, "pyralis", "netherrocksfusion").setUnlocalizedName("netherrocksfusion:extendedpyralisLegs").setTextureName("netherrocksfusion:extendedpyralisLegs");
			extendedpyralisBoots = new ItemExtendedArmor(IDs.extendedpyralisBootsID, mod.armorPyralis, mod.rendererextendedPyralis, 3, "pyralis", "netherrocksfusion").setUnlocalizedName("netherrocksfusion:extendedpyralisBoots").setTextureName("netherrocksfusion:extendedpyralisBoots");
			extendeddragonbezoarHelm = new ItemExtendedArmor(IDs.extendeddragonbezoarHelmID, mod.armorDragonBezoar, mod.rendererextendedDragonBezoar, 0, "dragonbezoar", "netherrocksfusion").setUnlocalizedName("netherrocksfusion:extendeddragonbezoarHelm").setTextureName("netherrocksfusion:extendeddragonbezoarHelm");
			extendeddragonbezoarChest = new ItemExtendedArmor(IDs.extendeddragonbezoarChestID, mod.armorDragonBezoar, mod.rendererextendedDragonBezoar, 1, "dragonbezoar", "netherrocksfusion").setUnlocalizedName("netherrocksfusion:extendeddragonbezoarChest").setTextureName("netherrocksfusion:extendeddragonbezoarChest");
			extendeddragonbezoarLegs = new ItemExtendedArmor(IDs.extendeddragonbezoarLegsID, mod.armorDragonBezoar, mod.rendererextendedDragonBezoar, 2, "dragonbezoar", "netherrocksfusion").setUnlocalizedName("netherrocksfusion:extendeddragonbezoarLegs").setTextureName("netherrocksfusion:extendeddragonbezoarLegs");
			extendeddragonbezoarBoots = new ItemExtendedArmor(IDs.extendeddragonbezoarBootsID, mod.armorDragonBezoar, mod.rendererextendedDragonBezoar, 3, "dragonbezoar", "netherrocksfusion").setUnlocalizedName("netherrocksfusion:extendeddragonbezoarBoots").setTextureName("netherrocksfusion:extendeddragonbezoarBoots");
	
			LanguageRegistry.addName(extendedcinderstoneHelm, "Extended Cinderstone Helmet");
			LanguageRegistry.addName(extendedcinderstoneChest, "Extended Cinderstone Chestplate");
			LanguageRegistry.addName(extendedcinderstoneLegs, "Extended Cinderstone Leggings");
			LanguageRegistry.addName(extendedcinderstoneBoots, "Extended Cinderstone Boots");

			LanguageRegistry.addName(extendedthrakaHelm, "Extended Thraka Helmet");
			LanguageRegistry.addName(extendedthrakaChest, "Extended Thraka Chestplate");
			LanguageRegistry.addName(extendedthrakaLegs, "Extended Thraka Leggings");
			LanguageRegistry.addName(extendedthrakaBoots, "Extended Thraka Boots");

			LanguageRegistry.addName(extendedpyralisHelm, "Extended Pyralis Helmet");
			LanguageRegistry.addName(extendedpyralisChest, "Extended Pyralis Chestplate");
			LanguageRegistry.addName(extendedpyralisLegs, "Extended Pyralis Leggings");
			LanguageRegistry.addName(extendedpyralisBoots, "Extended Pyralis Boots");

			LanguageRegistry.addName(extendeddragonbezoarHelm, "Extended Dragon Bezoar Helmet");
			LanguageRegistry.addName(extendeddragonbezoarChest, "Extended Dragon Bezoar Chestplate");
			LanguageRegistry.addName(extendeddragonbezoarLegs, "Extended Dragon Bezoar Leggings");
			LanguageRegistry.addName(extendeddragonbezoarBoots, "Extended Dragon Bezoar Boots");
}	}
	
	/**
	 * The method that gives blocks their properties, names etc, harvest levels and registers them. This is called by the main SimpleOres class.
	 */
	public static void doBlocks()
	{
		//Block Properties
		cinderstoneBlock = new SimpleOre(IDs.cinderstoneBlockID, Material.iron, "netherrocksfusion", SimpleOres.tabSimpleBlocks).setHardness(Settings.cinderstoneBlockHardness).setResistance(Settings.cinderstoneBlockResistance).setCreativeTab(SimpleOres.tabSimpleBlocks).setUnlocalizedName("netherrocksfusion:cinderstoneBlock").setTextureName("netherrocksfusion:cinderstoneBlock");
		thrakaBlock = new SimpleOre(IDs.thrakaBlockID, Material.iron, "netherrocksfusion", SimpleOres.tabSimpleBlocks).setHardness(Settings.thrakaBlockHardness).setResistance(Settings.thrakaBlockResistance).setCreativeTab(SimpleOres.tabSimpleBlocks).setUnlocalizedName("netherrocksfusion:thrakaBlock").setTextureName("netherrocksfusion:thrakaBlock");
		pyralisBlock = new SimpleOre(IDs.pyralisBlockID, Material.iron, "netherrocksfusion", SimpleOres.tabSimpleBlocks).setHardness(Settings.pyralisBlockHardness).setResistance(Settings.pyralisBlockResistance).setCreativeTab(SimpleOres.tabSimpleBlocks).setUnlocalizedName("netherrocksfusion:pyralisBlock").setTextureName("netherrocksfusion:pyralisBlock");
		dragonbezoarBlock = new SimpleOre(IDs.dragonbezoarBlockID, Material.iron, "netherrocksfusion", SimpleOres.tabSimpleBlocks).setHardness(Settings.dragonbezoarBlockHardness).setResistance(Settings.dragonbezoarBlockResistance).setCreativeTab(SimpleOres.tabSimpleBlocks).setUnlocalizedName("netherrocksfusion:dragonbezoarBlock").setTextureName("netherrocksfusion:dragonbezoarBlock");
		dragonbezoarFurnace = new SuperFurnace(IDs.dragonbezoarFurnaceID, false).setHardness(Settings.dragonbezoarFurnaceHardness).setResistance(Settings.dragonbezoarFurnaceResistance).setUnlocalizedName("netherrocksfusion:dragonbezoarFurnace");
		dragonbezoarFurnaceOn = new SuperFurnace(IDs.dragonbezoarFurnaceOnID, true).setHardness(Settings.dragonbezoarFurnaceHardness).setResistance(Settings.dragonbezoarFurnaceResistance).setLightValue(Settings.dragonbezoarFurnaceLightValue).setUnlocalizedName("netherrocksfusion:dragonbezoarFurnaceOn");
		dragonbezoarFusionFurnace = new SuperFusionFurnace(IDs.dragonbezoarFusionFurnaceID, false).setHardness(Settings.dragonbezoarFurnaceHardness).setResistance(Settings.dragonbezoarFurnaceResistance).setUnlocalizedName("netherrocksfusion:dragonbezoarFusionFurnace");
		dragonbezoarFusionFurnaceOn = new SuperFusionFurnace(IDs.dragonbezoarFusionFurnaceOnID, true).setHardness(Settings.dragonbezoarFurnaceHardness).setResistance(Settings.dragonbezoarFurnaceResistance).setLightValue(Settings.dragonbezoarFurnaceLightValue).setUnlocalizedName("netherrocksfusion:dragonbezoarFusionFurnaceOn");

		//Block Registering
		GameRegistry.registerBlock(cinderstoneBlock, "cinderstoneBlock");
		GameRegistry.registerBlock(thrakaBlock, "thrakaBlock");
		GameRegistry.registerBlock(pyralisBlock, "pyralisBlock");
		GameRegistry.registerBlock(dragonbezoarBlock, "dragonbezoarBlock");
		GameRegistry.registerBlock(dragonbezoarFurnace, "dragonbezoarFurnace");
		GameRegistry.registerBlock(dragonbezoarFurnaceOn, "dragonbezoarFurnaceOn");
		GameRegistry.registerBlock(dragonbezoarFusionFurnace, "dragonbezoarFusionFurnace");
		GameRegistry.registerBlock(dragonbezoarFusionFurnaceOn, "dragonbezoarFusionFurnaceOn");

		LanguageRegistry.addName(cinderstoneBlock, "Block of Cinderstone");
		LanguageRegistry.addName(thrakaBlock, "Block of Thraka");
		LanguageRegistry.addName(pyralisBlock, "Block of Pyralis");
		LanguageRegistry.addName(dragonbezoarBlock, "Block of Dragon Bezoar");
		LanguageRegistry.addName(dragonbezoarFurnace, "Dragon Bezoar Furnace");
		LanguageRegistry.addName(dragonbezoarFurnaceOn, "Dragon Bezoar Furnace");
		LanguageRegistry.addName(dragonbezoarFusionFurnace, "Dragon Bezoar Fusion Furnace");
		LanguageRegistry.addName(dragonbezoarFusionFurnaceOn, "Dragon Bezoar Fusion Furnace");

	}	
	
	/**
	 * The method that gives items their properties, names etc, harvest levels and registers them. This is called by the main SimpleOres class.
	 */
	public static void doItems()
	{
		//Item Details
		cinderstoneIngot = new SimpleIngot(IDs.cinderstoneIngotID, "netherrocksfusion", SimpleOres.tabSimpleMaterials).setUnlocalizedName("netherrocksfusion:cinderstoneIngot").setTextureName("netherrocksfusion:cinderstoneIngot");
		pyralisIngot = new SimpleIngot(IDs.pyralisIngotID, "netherrocksfusion", SimpleOres.tabSimpleMaterials).setUnlocalizedName("netherrocksfusion:pyralisIngot").setTextureName("netherrocksfusion:pyralisIngot");
		thrakaIngot = new SimpleIngot(IDs.thrakaIngotID, "netherrocksfusion", SimpleOres.tabSimpleMaterials).setUnlocalizedName("netherrocksfusion:thrakaIngot").setTextureName("netherrocksfusion:thrakaIngot");
		dragonbezoarIngot = new SimpleIngot(IDs.dragonbezoarIngotID, "netherrocksfusion", SimpleOres.tabSimpleMaterials).setUnlocalizedName("netherrocksfusion:dragonbezoarIngot").setTextureName("netherrocksfusion:dragonbezoarIngot");
		dragonbezoarRod = new SimpleIngot(IDs.dragonbezoarRodID, "netherrocksfusion", SimpleOres.tabSimpleMaterials).setUnlocalizedName("netherrocksfusion:dragonbezoarRod").setTextureName("netherrocksfusion:dragonbezoarRod");	
		smallCinderstoneChunk = new SimpleIngot(IDs.smallCinderstoneChunkID, "netherrocksfusion", SimpleOres.tabSimpleMaterials).setUnlocalizedName("netherrocksfusion:smallCinderstoneChunk").setTextureName("netherrocksfusion:smallCinderstoneChunk");
		mediumCinderstoneChunk = new SimpleIngot(IDs.mediumCinderstoneChunkID, "netherrocksfusion", SimpleOres.tabSimpleMaterials).setUnlocalizedName("netherrocksfusion:mediumCinderstoneChunk").setTextureName("netherrocksfusion:mediumCinderstoneChunk");
		largeCinderstoneChunk = new SimpleIngot(IDs.largeCinderstoneChunkID, "netherrocksfusion", SimpleOres.tabSimpleMaterials).setUnlocalizedName("netherrocksfusion:largeCinderstoneChunk").setTextureName("netherrocksfusion:largeCinderstoneChunk");
		smallThrakaChunk = new SimpleIngot(IDs.smallThrakaChunkID, "netherrocksfusion", SimpleOres.tabSimpleMaterials).setUnlocalizedName("netherrocksfusion:smallThrakaChunk").setTextureName("netherrocksfusion:smallThrakaChunk");
		mediumThrakaChunk = new SimpleIngot(IDs.mediumThrakaChunkID, "netherrocksfusion", SimpleOres.tabSimpleMaterials).setUnlocalizedName("netherrocksfusion:mediumThrakaChunk").setTextureName("netherrocksfusion:mediumThrakaChunk");
		largeThrakaChunk = new SimpleIngot(IDs.largeThrakaChunkID, "netherrocksfusion", SimpleOres.tabSimpleMaterials).setUnlocalizedName("netherrocksfusion:largeThrakaChunk").setTextureName("netherrocksfusion:largeThrakaChunk");
		smallPyralisChunk = new SimpleIngot(IDs.smallPyralisChunkID, "netherrocksfusion", SimpleOres.tabSimpleMaterials).setUnlocalizedName("netherrocksfusion:smallPyralisChunk").setTextureName("netherrocksfusion:smallPyralisChunk");
		mediumPyralisChunk = new SimpleIngot(IDs.mediumPyralisChunkID, "netherrocksfusion", SimpleOres.tabSimpleMaterials).setUnlocalizedName("netherrocksfusion:mediumPyralisChunk").setTextureName("netherrocksfusion:mediumPyralisChunk");
		largePyralisChunk = new SimpleIngot(IDs.largePyralisChunkID, "netherrocksfusion", SimpleOres.tabSimpleMaterials).setUnlocalizedName("netherrocksfusion:largePyralisChunk").setTextureName("netherrocksfusion:largePyralisChunk");
		smallDragonBezoarChunk = new SimpleIngot(IDs.smallDragonBezoarChunkID, "netherrocksfusion", SimpleOres.tabSimpleMaterials).setUnlocalizedName("netherrocksfusion:smallDragonBezoarChunk").setTextureName("netherrocksfusion:smallDragonBezoarChunk");
		mediumDragonBezoarChunk = new SimpleIngot(IDs.mediumDragonBezoarChunkID, "netherrocksfusion", SimpleOres.tabSimpleMaterials).setUnlocalizedName("netherrocksfusion:mediumDragonBezoarChunk").setTextureName("netherrocksfusion:mediumDragonBezoarChunk");
		largeDragonBezoarChunk = new SimpleIngot(IDs.largeDragonBezoarChunkID, "netherrocksfusion", SimpleOres.tabSimpleMaterials).setUnlocalizedName("netherrocksfusion:largeDragonBezoarChunk").setTextureName("netherrocksfusion:largeDragonBezoarChunk");

		LanguageRegistry.addName(cinderstoneIngot, "Cinderstone Ingot");
		LanguageRegistry.addName(thrakaIngot, "Thraka Ingot");
		LanguageRegistry.addName(pyralisIngot, "Pyralis Ingot");
		LanguageRegistry.addName(dragonbezoarIngot, "Dragon Bezoar Ingot");
		LanguageRegistry.addName(dragonbezoarRod, "Dragon Bezoar Rod");
		LanguageRegistry.addName(smallCinderstoneChunk, "Small Cinderstone Chunk");
		LanguageRegistry.addName(mediumCinderstoneChunk, "Medium Cinderstone Chunk");
		LanguageRegistry.addName(largeCinderstoneChunk, "Large Cinderstone Chunk");
		LanguageRegistry.addName(smallThrakaChunk, "Small Thraka Chunk");
		LanguageRegistry.addName(mediumThrakaChunk, "Medium Thraka Chunk");
		LanguageRegistry.addName(largeThrakaChunk, "Large Thraka Chunk");
		LanguageRegistry.addName(smallPyralisChunk, "Small Pyralis Chunk");
		LanguageRegistry.addName(mediumPyralisChunk, "Medium Pyralis Chunk");
		LanguageRegistry.addName(largePyralisChunk, "Large Pyralis Chunk");
		LanguageRegistry.addName(smallDragonBezoarChunk, "Small Dragon Bezoar Chunk");
		LanguageRegistry.addName(mediumDragonBezoarChunk, "Medium Dragon Bezoar Chunk");
		LanguageRegistry.addName(largeDragonBezoarChunk, "Large Dragon Bezoar Chunk");
	}
	
	/**
	 * The method that gives the tools their properties and names, as well as registering them as their respective tool type. This is called by the main SimpleOres class.
	 */
	public static void doTools()
	{
		//Tool Details
		cinderstoneSword = new NetherSword(IDs.cinderstoneSwordID, NetherrocksFusion.toolCinderstone).setUnlocalizedName("netherrocksfusion:cinderstoneSword").setTextureName("netherrocksfusion:cinderstoneSword");
		thrakaPick = new SimplePickaxe(IDs.thrakaPickID, NetherrocksFusion.toolThraka, "netherrocksfusion", SimpleOres.tabSimpleTools).setUnlocalizedName("netherrocksfusion:thrakaPick").setTextureName("netherrocksfusion:thrakaPick");
		thrakaAxe = new SimpleAxe(IDs.thrakaAxeID, NetherrocksFusion.toolThraka, "netherrocksfusion", SimpleOres.tabSimpleTools).setUnlocalizedName("netherrocksfusion:thrakaAxe").setTextureName("netherrocksfusion:thrakaAxe");
		thrakaShovel = new SimpleShovel(IDs.thrakaShovelID, NetherrocksFusion.toolThraka, "netherrocksfusion", SimpleOres.tabSimpleTools).setUnlocalizedName("netherrocksfusion:thrakaShovel").setTextureName("netherrocksfusion:thrakaShovel");
		thrakaSword = new SimpleSword(IDs.thrakaSwordID, NetherrocksFusion.toolThraka, "netherrocksfusion", SimpleOres.tabSimpleCombat).setUnlocalizedName("netherrocksfusion:thrakaSword").setTextureName("netherrocksfusion:thrakaSword");
		thrakaHoe = new SimpleHoe(IDs.thrakaHoeID, NetherrocksFusion.toolThraka, "netherrocksfusion", SimpleOres.tabSimpleTools).setUnlocalizedName("netherrocksfusion:thrakaHoe").setTextureName("netherrocksfusion:thrakaHoe");
		pyralisPick = new NetherPickaxe(IDs.pyralisPickID, NetherrocksFusion.toolPyralis).setUnlocalizedName("netherrocksfusion:pyralisPick").setTextureName("netherrocksfusion:pyralisPick");
		pyralisAxe = new NetherAxe(IDs.pyralisAxeID, NetherrocksFusion.toolPyralis).setUnlocalizedName("netherrocksfusion:pyralisAxe").setTextureName("netherrocksfusion:pyralisAxe");
		pyralisShovel = new NetherShovel(IDs.pyralisShovelID, NetherrocksFusion.toolPyralis).setUnlocalizedName("netherrocksfusion:pyralisShovel").setTextureName("netherrocksfusion:pyralisShovel");
		pyralisSword = new NetherSword(IDs.pyralisSwordID, NetherrocksFusion.toolPyralis).setUnlocalizedName("netherrocksfusion:pyralisSword").setTextureName("netherrocksfusion:pyralisSword");
		pyralisHoe = new SimpleHoe(IDs.pyralisHoeID, NetherrocksFusion.toolPyralis, "netherrocksfusion", SimpleOres.tabSimpleTools).setUnlocalizedName("netherrocksfusion:pyralisHoe").setTextureName("netherrocksfusion:pyralisHoe");
		dragonbezoarPick = new NetherPickaxe(IDs.dragonbezoarPickID, NetherrocksFusion.toolDragonBezoar).setUnlocalizedName("netherrocksfusion:dragonbezoarPick").setTextureName("netherrocksfusion:dragonbezoarPick");
		dragonbezoarAxe = new NetherAxe(IDs.dragonbezoarAxeID, NetherrocksFusion.toolDragonBezoar).setUnlocalizedName("netherrocksfusion:dragonbezoarAxe").setTextureName("netherrocksfusion:dragonbezoarAxe");
		dragonbezoarShovel = new NetherShovel(IDs.dragonbezoarShovelID, NetherrocksFusion.toolDragonBezoar).setUnlocalizedName("netherrocksfusion:dragonbezoarShovel").setTextureName("netherrocksfusion:dragonbezoarShovel");
		dragonbezoarSword = new NetherSword(IDs.dragonbezoarSwordID, NetherrocksFusion.toolDragonBezoar).setUnlocalizedName("netherrocksfusion:dragonbezoarSword").setTextureName("netherrocksfusion:dragonbezoarSword");
		dragonbezoarHoe = new SimpleHoe(IDs.dragonbezoarHoeID, NetherrocksFusion.toolDragonBezoar, "netherrocksfusion", SimpleOres.tabSimpleTools).setUnlocalizedName("netherrocksfusion:dragonbezoarHoe").setTextureName("netherrocksfusion:dragonbezoarHoe");
		dragonbezoarBow = (ItemBow) new SimpleBow(IDs.dragonbezoarBowID, 1200, mod.toolPyralis).setFull3D().setUnlocalizedName("netherrocksfusion:dragonbezoarBow").setTextureName("netherrocksfusion:dragonbezoarBow");
		dragonbezoarShears = new SimpleShears(IDs.dragonbezoarShearsID, 9300).setUnlocalizedName("netherrocksfusion:dragonbezoarShears").setTextureName("netherrocksfusion:dragonbezoarShears");

		LanguageRegistry.addName(cinderstoneSword, "Cinderstone Sword");
		LanguageRegistry.addName(thrakaPick, "Thraka Pickaxe");
		LanguageRegistry.addName(thrakaAxe, "Thraka Axe");
		LanguageRegistry.addName(thrakaShovel, "Thraka Shovel");
		LanguageRegistry.addName(thrakaSword, "Thraka Sword");
		LanguageRegistry.addName(thrakaHoe, "Thraka Hoe");
		LanguageRegistry.addName(pyralisPick, "Pyralis Pickaxe");
		LanguageRegistry.addName(pyralisAxe, "Pyralis Axe");
		LanguageRegistry.addName(pyralisShovel, "Pyralis Shovel");
		LanguageRegistry.addName(pyralisSword, "Pyralis Sword");
		LanguageRegistry.addName(pyralisHoe, "Pyralis Hoe");
		LanguageRegistry.addName(dragonbezoarPick, "Dragon Bezoar Pickaxe");
		LanguageRegistry.addName(dragonbezoarAxe, "Dragon Bezoar Axe");
		LanguageRegistry.addName(dragonbezoarShovel, "Dragon Bezoar Shovel");
		LanguageRegistry.addName(dragonbezoarSword, "Dragon Bezoar Sword");
		LanguageRegistry.addName(dragonbezoarHoe, "Dragon Bezoar Hoe");
		LanguageRegistry.addName(dragonbezoarBow, "Dragon Bezoar Bow");
		LanguageRegistry.addName(dragonbezoarShears, "Dragon Bezoar Shears");

		//Tool Registering
        MinecraftForge.setToolClass(thrakaPick, "pickaxe", Settings.thrakaMiningLevel);
        MinecraftForge.setToolClass(thrakaShovel, "shovel", Settings.thrakaMiningLevel);
        MinecraftForge.setToolClass(thrakaAxe, "axe", Settings.thrakaMiningLevel);
        MinecraftForge.setToolClass(pyralisPick, "pickaxe", Settings.pyralisMiningLevel);
        MinecraftForge.setToolClass(pyralisShovel, "shovel", Settings.pyralisMiningLevel);
        MinecraftForge.setToolClass(pyralisAxe, "axe", Settings.pyralisMiningLevel);
        MinecraftForge.setToolClass(dragonbezoarPick, "pickaxe", Settings.dragonbezoarMiningLevel);
        MinecraftForge.setToolClass(dragonbezoarShovel, "shovel", Settings.dragonbezoarMiningLevel);
        MinecraftForge.setToolClass(dragonbezoarAxe, "axe", Settings.dragonbezoarMiningLevel);

		if (EWAPI.getEWInstalled()) {
		extendedcinderstoneSword = new ItemExtendedSword(IDs.extendedcinderstoneSwordID, NetherrocksFusion.toolCinderstone).setUnlocalizedName("extendedWorkbenchnf:cinderstoneSword").setTextureName("netherrocksfusion:extendedcinderstoneSword");
		extendedthrakaPick = new ItemExtendedPickaxe(IDs.extendedthrakaPickID, NetherrocksFusion.toolThraka).setUnlocalizedName("extendedWorkbenchnf:thrakaPick").setTextureName("netherrocksfusion:extendedthrakaPick");
		extendedthrakaAxe = new ItemExtendedAxe(IDs.extendedthrakaAxeID, NetherrocksFusion.toolThraka).setUnlocalizedName("extendedWorkbenchnf:thrakaAxe").setTextureName("netherrocksfusion:extendedthrakaAxe");
		extendedthrakaShovel = new ItemExtendedShovel(IDs.extendedthrakaShovelID, NetherrocksFusion.toolThraka).setUnlocalizedName("extendedWorkbenchnf:thrakaShovel").setTextureName("netherrocksfusion:extendedthrakaShovel");
		extendedthrakaSword = new ItemExtendedSword(IDs.extendedthrakaSwordID, NetherrocksFusion.toolThraka).setUnlocalizedName("extendedWorkbenchnf:thrakaSword").setTextureName("netherrocksfusion:extendedthrakaSword");
		extendedthrakaHoe = new ItemExtendedHoe(IDs.extendedthrakaHoeID, NetherrocksFusion.toolThraka).setUnlocalizedName("extendedWorkbenchnf:thrakaHoe").setTextureName("netherrocksfusion:extendedthrakaHoe");
		extendedpyralisPick = new ItemExtendedPickaxe(IDs.extendedpyralisPickID, NetherrocksFusion.toolPyralis).setUnlocalizedName("extendedWorkbenchnf:pyralisPick").setTextureName("netherrocksfusion:extendedpyralisPick");
		extendedpyralisAxe = new ItemExtendedAxe(IDs.extendedpyralisAxeID, NetherrocksFusion.toolPyralis).setUnlocalizedName("extendedWorkbenchnf:pyralisAxe").setTextureName("netherrocksfusion:extendedpyralisAxe");
		extendedpyralisShovel = new ItemExtendedShovel(IDs.extendedpyralisShovelID, NetherrocksFusion.toolPyralis).setUnlocalizedName("extendedWorkbenchnf:pyralisShovel").setTextureName("netherrocksfusion:extendedpyralisShovel");
		extendedpyralisSword = new ItemExtendedSword(IDs.extendedpyralisSwordID, NetherrocksFusion.toolPyralis).setUnlocalizedName("extendedWorkbenchnf:pyralisSword").setTextureName("netherrocksfusion:extendedpyralisSword");
		extendedpyralisHoe = new ItemExtendedHoe(IDs.extendedpyralisHoeID, NetherrocksFusion.toolPyralis).setUnlocalizedName("extendedWorkbenchnf:pyralisHoe").setTextureName("netherrocksfusion:extendedpyralisHoe");
		extendeddragonbezoarPick = new ItemExtendedPickaxe(IDs.extendeddragonbezoarPickID, NetherrocksFusion.toolDragonBezoar).setUnlocalizedName("extendedWorkbenchnf:dragonbezoarPick").setTextureName("netherrocksfusion:extendeddragonbezoarPick");
		extendeddragonbezoarAxe = new ItemExtendedAxe(IDs.extendeddragonbezoarAxeID, NetherrocksFusion.toolDragonBezoar).setUnlocalizedName("extendedWorkbenchnf:dragonbezoarAxe").setTextureName("netherrocksfusion:extendeddragonbezoarAxe");
		extendeddragonbezoarShovel = new ItemExtendedShovel(IDs.extendeddragonbezoarShovelID, NetherrocksFusion.toolDragonBezoar).setUnlocalizedName("extendedWorkbenchnf:dragonbezoarShovel").setTextureName("netherrocksfusion:extendeddragonbezoarShovel");
		extendeddragonbezoarSword = new ItemExtendedSword(IDs.extendeddragonbezoarSwordID, NetherrocksFusion.toolDragonBezoar).setUnlocalizedName("extendedWorkbenchnf:dragonbezoarSword").setTextureName("netherrocksfusion:extendeddragonbezoarSword");
		extendeddragonbezoarHoe = new ItemExtendedHoe(IDs.extendeddragonbezoarHoeID, NetherrocksFusion.toolDragonBezoar).setUnlocalizedName("extendedWorkbenchnf:dragonbezoarHoe").setTextureName("netherrocksfusion:extendeddragonbezoarHoe");
		extendeddragonbezoarBow = (ItemBow) new ItemExtendedBow(IDs.extendeddragonbezoarBowID, 1200, mod.toolPyralis).setFull3D().setUnlocalizedName("extendedWorkbenchnf:dragonbezoarBow").setTextureName("netherrocksfusion:extendeddragonbezoarBow");
		extendeddragonbezoarShears = new ItemExtendedShears(IDs.extendeddragonbezoarShearsID, 9300).setUnlocalizedName("extendedWorkbenchnf:dragonbezoarShears").setTextureName("netherrocksfusion:extendeddragonbezoarShears");

		LanguageRegistry.addName(extendedcinderstoneSword, "Extended Cinderstone Sword");
		LanguageRegistry.addName(extendedthrakaPick, "Extended Thraka Pickaxe");
		LanguageRegistry.addName(extendedthrakaAxe, "Extended Thraka Axe");
		LanguageRegistry.addName(extendedthrakaShovel, "Extended Thraka Shovel");
		LanguageRegistry.addName(extendedthrakaSword, "Extended Thraka Sword");
		LanguageRegistry.addName(extendedthrakaHoe, "Extended Thraka Hoe");
		LanguageRegistry.addName(extendedpyralisPick, "Extended Pyralis Pickaxe");
		LanguageRegistry.addName(extendedpyralisAxe, "Extended Pyralis Axe");
		LanguageRegistry.addName(extendedpyralisShovel, "Extended Pyralis Shovel");
		LanguageRegistry.addName(extendedpyralisSword, "Extended Pyralis Sword");
		LanguageRegistry.addName(extendedpyralisHoe, "Extended Pyralis Hoe");
		LanguageRegistry.addName(extendeddragonbezoarPick, "Extended Dragon Bezoar Pickaxe");
		LanguageRegistry.addName(extendeddragonbezoarAxe, "Extended Dragon Bezoar Axe");
		LanguageRegistry.addName(extendeddragonbezoarShovel, "Extended Dragon Bezoar Shovel");
		LanguageRegistry.addName(extendeddragonbezoarSword, "Extended Dragon Bezoar Sword");
		LanguageRegistry.addName(extendeddragonbezoarHoe, "Extended Dragon Bezoar Hoe");
		LanguageRegistry.addName(extendeddragonbezoarBow, "Extended Dragon Bezoar Bow");
		LanguageRegistry.addName(extendeddragonbezoarShears, "Extended Dragon Bezoar Shears");

        MinecraftForge.setToolClass(extendedthrakaPick, "pickaxe", Settings.thrakaMiningLevel);
        MinecraftForge.setToolClass(extendedthrakaShovel, "shovel", Settings.thrakaMiningLevel);
        MinecraftForge.setToolClass(extendedthrakaAxe, "axe", Settings.thrakaMiningLevel);
        MinecraftForge.setToolClass(extendedpyralisPick, "pickaxe", Settings.pyralisMiningLevel);
        MinecraftForge.setToolClass(extendedpyralisShovel, "shovel", Settings.pyralisMiningLevel);
        MinecraftForge.setToolClass(extendedpyralisAxe, "axe", Settings.pyralisMiningLevel);
        MinecraftForge.setToolClass(extendeddragonbezoarPick, "pickaxe", Settings.dragonbezoarMiningLevel);
        MinecraftForge.setToolClass(extendeddragonbezoarShovel, "shovel", Settings.dragonbezoarMiningLevel);
        MinecraftForge.setToolClass(extendeddragonbezoarAxe, "axe", Settings.dragonbezoarMiningLevel);
		}	}
}