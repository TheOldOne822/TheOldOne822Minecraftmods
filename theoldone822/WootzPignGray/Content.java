package theoldone822.WootzPignGray;

import java.util.Random;

import theoldone822.WootzPignGray.Furnaces.GrayFurnace;
import theoldone822.WootzPignGray.Furnaces.GrayFusionFurnace;
import theoldone822.WootzPignGray.Items.HardenedAxe;
import theoldone822.WootzPignGray.Items.HardenedHoe;
import theoldone822.WootzPignGray.Items.HardenedPickaxe;
import theoldone822.WootzPignGray.Items.HardenedShovel;
import theoldone822.WootzPignGray.Items.HardenedSword;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import alexndr.SimpleOres.api.content.SimpleIngot;
import alexndr.SimpleOres.api.content.SimpleSword;
import alexndr.SimpleOres.api.content.SimpleShovel;
import alexndr.SimpleOres.api.content.SimpleAxe;
import alexndr.SimpleOres.api.content.SimplePickaxe;
import alexndr.SimpleOres.api.content.SimpleHoe;
import alexndr.SimpleOres.api.content.SimpleArmor;
import alexndr.SimpleOres.api.helpers.LootHelper;
import alexndr.SimpleOres.api.content.SimpleOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class Content 
{
	public static WootzPignGray mod;
	
	/**
	 * Creating the blocks.
	 */
	public static Block pigironBlock;
	public static Block wootzBlock;
	public static Block rePigironBlock;
	public static Block grayBlock;
	public static Block grayFurnace;
	public static Block grayFurnaceOn;
	public static Block grayFusionFurnace;
	public static Block grayFusionFurnaceOn;

	/**
	 * Creating the item int's. Fairly obvious.
	 */
	public static Item rawPigiron;
	public static Item pigironIngot;
	public static Item wootzIngot;
	public static Item rePigironIngot;
	public static Item grayIngot;
	

	public static Item smallWootzsteelChunk;
	public static Item mediumWootzsteelChunk;
	public static Item largeWootzsteelChunk;
	public static Item packedIron;
	public static Item graphite;
	public static Item largeGrayChunk;
	
	/**
	 * Creating the tool items.
	 */
	public static Item wootzPick;
	public static Item wootzAxe;
	public static Item wootzShovel;
	public static Item wootzSword;
	public static Item wootzHoe;
	public static Item hardenedsteelPick;
	public static Item hardenedsteelAxe;
	public static Item hardenedsteelShovel;
	public static Item hardenedsteelSword;
	public static Item hardenedsteelHoe;
	
	/**
	 * Creating the armor items.
	 */
	public static Item wootzHelm;
	public static Item wootzChest;
	public static Item wootzLegs;
	public static Item wootzBoots;
	
	/**
	 * Creating the tool items.
	 */
	/**
	 * The method that gives the armor items their properties and names. This is called by the main SimpleOres class.
	 */
	public static void doArmor()
	{
		//Armour Details
		wootzHelm = new SimpleArmor(mod.armorWootz, mod.rendererWootz, 0).modId("wootzpigngray").setUnlocalizedName("wootzHelm").setTextureName("wootzpigngray:wootzHelm");
		wootzChest = new SimpleArmor(mod.armorWootz, mod.rendererWootz, 1).modId("wootzpigngray").setUnlocalizedName("wootzChest").setTextureName("wootzpigngray:wootzChest");
		wootzLegs = new SimpleArmor(mod.armorWootz, mod.rendererWootz, 2).modId("wootzpigngray").setUnlocalizedName("wootzLegs").setTextureName("wootzpigngray:wootzLegs");
		wootzBoots = new SimpleArmor(mod.armorWootz, mod.rendererWootz, 3).modId("wootzpigngray").setUnlocalizedName("wootzBoots").setTextureName("wootzpigngray:wootzBoots");

		LanguageRegistry.addName(wootzHelm, "Wootz steel Helmet");
		LanguageRegistry.addName(wootzChest, "Wootz steel Chestplate");
		LanguageRegistry.addName(wootzLegs, "Wootz steel Leggings");
		LanguageRegistry.addName(wootzBoots, "Wootz steel Boots");

}
	
	/**
	 * The method that gives blocks their properties, names etc, harvest levels and registers them. This is called by the main SimpleOres class.
	 */
	public static void doBlocks()
	{
		//Block Properties
		pigironBlock = new SimpleOre(Material.iron).modId("wootzpigngray").setHardness(Settings.pigironBlockHardness).setResistance(Settings.pigironBlockResistance).setBlockName("pigironBlock").setBlockTextureName("wootzpigngray:pigironBlock");
		wootzBlock = new SimpleOre(Material.iron).modId("wootzpigngray").setHardness(Settings.wootzBlockHardness).setResistance(Settings.wootzBlockResistance).setBlockName("wootzBlock").setBlockTextureName("wootzpigngray:wootzBlock");
		rePigironBlock = new SimpleOre(Material.iron).modId("wootzpigngray").setHardness(Settings.rePigironBlockHardness).setResistance(Settings.rePigironBlockResistance).setBlockName("rePigironBlock").setBlockTextureName("wootzpigngray:rePigironBlock");
	    Random generator = new Random();
    	int r = generator.nextInt(3);
		grayBlock = new SimpleOre(Material.iron).modId("wootzpigngray").setStackToDrop(new ItemStack(graphite, (3 + r))).setHardness(Settings.grayBlockHardness).setResistance(Settings.grayBlockResistance).setBlockName("grayBlock").setBlockTextureName("wootzpigngray:grayBlock");
		grayFurnace = new GrayFurnace(false).setHardness(Settings.grayFurnaceHardness).setResistance(Settings.grayFurnaceResistance).setBlockName("grayFurnace");
		grayFurnaceOn = new GrayFurnace(true).setHardness(Settings.grayFurnaceHardness).setResistance(Settings.grayFurnaceResistance).setLightLevel(Settings.grayFurnaceLightValue).setBlockName("grayFurnaceOn");
		grayFusionFurnace = new GrayFusionFurnace(false).setHardness(Settings.grayFurnaceHardness).setResistance(Settings.grayFurnaceResistance).setBlockName("grayFusionFurnace");
		grayFusionFurnaceOn = new GrayFusionFurnace(true).setHardness(Settings.grayFurnaceHardness).setResistance(Settings.grayFurnaceResistance).setLightLevel(Settings.grayFurnaceLightValue).setBlockName("grayFusionFurnaceOn");

		//Block Registering
		GameRegistry.registerBlock(grayBlock, "grayBlock");
		GameRegistry.registerBlock(grayFurnace, "grayFurnace");
		GameRegistry.registerBlock(grayFurnaceOn, "grayFurnaceOn");
		GameRegistry.registerBlock(grayFusionFurnace, "grayFusionFurnace");
		GameRegistry.registerBlock(grayFusionFurnaceOn, "grayFusionFurnaceOn");

		LanguageRegistry.addName(pigironBlock, "Block of Pigiron");
		LanguageRegistry.addName(wootzBlock, "Block of Wootz steel");
		LanguageRegistry.addName(rePigironBlock, "Block of Refined Pigiron");
		LanguageRegistry.addName(grayBlock, "Block of Gray Iron");
		LanguageRegistry.addName(grayFurnace, "Gray Iron Furnace");
		LanguageRegistry.addName(grayFurnaceOn, "Gray Iron Furnace");
		LanguageRegistry.addName(grayFusionFurnace, "Gray Iron Fusion Furnace");
		LanguageRegistry.addName(grayFusionFurnaceOn, "Gray Iron Fusion Furnace");

	}	
	
	/**
	 * The method that gives items their properties, names etc, harvest levels and registers them. This is called by the main SimpleOres class.
	 */
	public static void doItems()
	{
		//Item Details
		rawPigiron = new SimpleIngot().modId("wootzpigngray").setUnlocalizedName("rawPigiron").setTextureName("wootzpigngray:rawPigiron");
		pigironIngot = new SimpleIngot().modId("wootzpigngray").setUnlocalizedName("pigironIngot").setTextureName("wootzpigngray:pigironIngot");
		rePigironIngot = new SimpleIngot().modId("wootzpigngray").setUnlocalizedName("rePigironIngot").setTextureName("wootzpigngray:rePigironIngot");
		wootzIngot = new SimpleIngot().modId("wootzpigngray").setUnlocalizedName("wootzIngot").setTextureName("wootzpigngray:wootzIngot");
		grayIngot = new SimpleIngot().modId("wootzpigngray").setUnlocalizedName("grayIngot").setTextureName("wootzpigngray:grayIngot");
		smallWootzsteelChunk = new SimpleIngot().modId("wootzpigngray").setUnlocalizedName("smallWootzsteelChunk").setTextureName("wootzpigngray:largeWootz steelChunk");
		mediumWootzsteelChunk = new SimpleIngot().modId("wootzpigngray").setUnlocalizedName("mediumWootzsteelChunk").setTextureName("wootzpigngray:largeWootz steelChunk");
		largeWootzsteelChunk = new SimpleIngot().modId("wootzpigngray").setUnlocalizedName("largeWootzsteelChunk").setTextureName("wootzpigngray:largeWootz steelChunk");
		packedIron = new SimpleIngot().modId("wootzpigngray").setUnlocalizedName("packedIron").setTextureName("wootzpigngray:packedIron");
		graphite = new SimpleIngot().modId("wootzpigngray").setUnlocalizedName("graphite").setTextureName("wootzpigngray:graphite");
		largeGrayChunk = new SimpleIngot().modId("wootzpigngray").setUnlocalizedName("largeGrayChunk").setTextureName("wootzpigngray:largeGrayChunk");

		LanguageRegistry.addName(rawPigiron, "Raw Pigiron");
		LanguageRegistry.addName(pigironIngot, "Pigiron Ingot");
		LanguageRegistry.addName(wootzIngot, "Wootz steel Ingot");
		LanguageRegistry.addName(rePigironIngot, "Refined Pigiron Ingot");
		LanguageRegistry.addName(grayIngot, "Gray Iron Ingot");
		LanguageRegistry.addName(smallWootzsteelChunk, "Small Wootz steel Chunk");
		LanguageRegistry.addName(mediumWootzsteelChunk, "Medium Wootz steel Chunk");
		LanguageRegistry.addName(largeWootzsteelChunk, "Large Wootz steel Chunk");
		LanguageRegistry.addName(packedIron, "Packed Iron");
		LanguageRegistry.addName(graphite, "Graphite");
		LanguageRegistry.addName(largeGrayChunk, "Large Gray Iron Chunk");
	}
	
	/**
	 * The method that gives the tools their properties and names, as well as registering them as their respective tool type. This is called by the main SimpleOres class.
	 */
	public static void doTools()
	{
		//Tool Details
		wootzPick = new SimplePickaxe(WootzPignGray.toolWootz).modId("wootzpigngray").setUnlocalizedName("wootzPick").setTextureName("wootzpigngray:wootzPick");
		wootzAxe = new SimpleAxe(WootzPignGray.toolWootz).modId("wootzpigngray").setUnlocalizedName("wootzAxe").setTextureName("wootzpigngray:wootzAxe");
		wootzShovel = new SimpleShovel(WootzPignGray.toolWootz).modId("wootzpigngray").setUnlocalizedName("wootzShovel").setTextureName("wootzpigngray:wootzShovel");
		wootzSword = new SimpleSword(WootzPignGray.toolWootz).modId("wootzpigngray").setUnlocalizedName("wootzSword").setTextureName("wootzpigngray:wootzSword");
		wootzHoe = new SimpleHoe(WootzPignGray.toolWootz).modId("wootzpigngray").setUnlocalizedName("wootzHoe").setTextureName("wootzpigngray:wootzHoe");
		hardenedsteelPick = new HardenedPickaxe(WootzPignGray.toolHardenedsteel, "wootzpigngray").setUnlocalizedName("hardenedsteelPick").setTextureName("wootzpigngray:hardenedsteelPick");
		hardenedsteelAxe = new HardenedAxe(WootzPignGray.toolHardenedsteel, "wootzpigngray").setUnlocalizedName("hardenedsteelAxe").setTextureName("wootzpigngray:hardenedsteelAxe");
		hardenedsteelShovel = new HardenedShovel(WootzPignGray.toolHardenedsteel, "wootzpigngray").setUnlocalizedName("hardenedsteelShovel").setTextureName("wootzpigngray:hardenedsteelShovel");
		hardenedsteelSword = new HardenedSword(WootzPignGray.toolHardenedsteel, "wootzpigngray").setUnlocalizedName("hardenedsteelSword").setTextureName("wootzpigngray:hardenedsteelSword");
		hardenedsteelHoe = new HardenedHoe(WootzPignGray.toolHardenedsteel, "wootzpigngray").setUnlocalizedName("hardenedsteelHoe").setTextureName("wootzpigngray:hardenedsteelHoe");

		LanguageRegistry.addName(wootzPick, "Wootz steel Pickaxe");
		LanguageRegistry.addName(wootzAxe, "Wootz steel Axe");
		LanguageRegistry.addName(wootzShovel, "Wootz steel Shovel");
		LanguageRegistry.addName(wootzSword, "Wootz steel Sword");
		LanguageRegistry.addName(wootzHoe, "Wootz steel Hoe");
		LanguageRegistry.addName(hardenedsteelPick, "Hardened steel Pickaxe");
		LanguageRegistry.addName(hardenedsteelAxe, "Hardened steel Axe");
		LanguageRegistry.addName(hardenedsteelShovel, "Hardened steel Shovel");
		LanguageRegistry.addName(hardenedsteelSword, "Hardened steel Sword");
		LanguageRegistry.addName(hardenedsteelHoe, "Hardened steel Hoe");

		//Tool Registering
//        MinecraftForge.setHarvestLevel(hardenedsteelPick, "pickaxe", Settings.hardenedsteelMiningLevel);
//        MinecraftForge.setToolClass(hardenedsteelShovel, "shovel", Settings.hardenedsteelMiningLevel);
//        MinecraftForge.setToolClass(hardenedsteelAxe, "axe", Settings.hardenedsteelMiningLevel);

		}
	public static void doLoot()
	{
		LootHelper.addLoot("villageBlacksmith", new ItemStack(wootzIngot), 1, 2, 2);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(grayIngot), 1, 2, 5);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(rePigironIngot), 1, 2, 4);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(pigironIngot), 1, 2, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(rawPigiron), 2, 6, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(graphite), 2, 4, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(wootzHelm), 1, 2, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(wootzChest), 2, 6, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(wootzLegs), 2, 4, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(wootzBoots), 1, 1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(wootzPick), 1, 5, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(wootzAxe), 1, 2, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(wootzShovel), 1, 1, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(wootzSword), 1, 2, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(wootzHoe), 1, 1, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(wootzIngot), 1, 2, 4);
		LootHelper.addLoot("dungeonChest", new ItemStack(wootzHelm), 1, 2, 5);
		LootHelper.addLoot("dungeonChest", new ItemStack(wootzChest), 1, 2, 4);
		LootHelper.addLoot("dungeonChest", new ItemStack(wootzLegs), 3, 5, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(wootzBoots), 2, 6, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(wootzPick), 2, 4, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(wootzAxe), 1, 1, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(wootzShovel), 1, 3, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(wootzSword), 1, 2, 1);
		LootHelper.addLoot("strongholdCorridor", new ItemStack(wootzIngot), 1, 1, 1);
		LootHelper.addLoot("strongholdCorridor", new ItemStack(wootzSword), 1, 1, 2);
		LootHelper.addLoot("strongholdCrossing", new ItemStack(wootzIngot), 1, 1, 4);
		LootHelper.addLoot("strongholdCrossing", new ItemStack(wootzSword), 1, 1, 6);
		LootHelper.addLoot("strongholdLibrary", new ItemStack(wootzHelm), 1, 1, 2);
		LootHelper.addLoot("strongholdLibrary", new ItemStack(wootzChest), 1, 1, 1);
		LootHelper.addLoot("strongholdLibrary", new ItemStack(wootzLegs), 1, 1, 1);
		LootHelper.addLoot("strongholdLibrary", new ItemStack(wootzBoots), 1, 1, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(wootzIngot), 1, 2, 2);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(wootzSword), 1, 1, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(wootzShovel), 1, 3, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(wootzAxe), 1, 1, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(wootzPick), 1, 3, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(wootzSword), 3, 9, 3);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(wootzAxe), 1, 2, 2);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(wootzShovel), 1, 2, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(wootzSword), 2, 4, 6);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(wootzChest), 1, 1, 2);
	}

}