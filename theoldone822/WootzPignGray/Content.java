package theoldone822.WootzPignGray;

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
	public static Item mediumGrayChunk;
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
		wootzHelm = new SimpleArmor(IDs.wootzHelmID, mod.armorWootz, mod.rendererWootz, 0).modId("wootzpigngray").setUnlocalizedName("wootzHelm").setTextureName("wootzpigngray:wootzHelm");
		wootzChest = new SimpleArmor(IDs.wootzChestID, mod.armorWootz, mod.rendererWootz, 1).modId("wootzpigngray").setUnlocalizedName("wootzChest").setTextureName("wootzpigngray:wootzChest");
		wootzLegs = new SimpleArmor(IDs.wootzLegsID, mod.armorWootz, mod.rendererWootz, 2).modId("wootzpigngray").setUnlocalizedName("wootzLegs").setTextureName("wootzpigngray:wootzLegs");
		wootzBoots = new SimpleArmor(IDs.wootzBootsID, mod.armorWootz, mod.rendererWootz, 3).modId("wootzpigngray").setUnlocalizedName("wootzBoots").setTextureName("wootzpigngray:wootzBoots");

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
		pigironBlock = new SimpleOre(IDs.pigironBlockID, Material.iron).modId("wootzpigngray").setHardness(Settings.pigironBlockHardness).setResistance(Settings.pigironBlockResistance).setUnlocalizedName("pigironBlock").setTextureName("wootzpigngray:pigironBlock");
		wootzBlock = new SimpleOre(IDs.wootzBlockID, Material.iron).modId("wootzpigngray").setHardness(Settings.wootzBlockHardness).setResistance(Settings.wootzBlockResistance).setUnlocalizedName("wootzBlock").setTextureName("wootzpigngray:wootzBlock");
		rePigironBlock = new SimpleOre(IDs.rePigironBlockID, Material.iron).modId("wootzpigngray").setHardness(Settings.rePigironBlockHardness).setResistance(Settings.rePigironBlockResistance).setUnlocalizedName("rePigironBlock").setTextureName("wootzpigngray:rePigironBlock");
		grayBlock = new SimpleGemOre(IDs.grayBlockID, Material.iron, "wootzpigngray", IDs.graphiteID, 3, 6).setHardness(Settings.grayBlockHardness).setResistance(Settings.grayBlockResistance).setUnlocalizedName("grayBlock").setTextureName("wootzpigngray:grayBlock");
		grayFurnace = new GrayFurnace(IDs.grayFurnaceID, false).setHardness(Settings.grayFurnaceHardness).setResistance(Settings.grayFurnaceResistance).setUnlocalizedName("grayFurnace");
		grayFurnaceOn = new GrayFurnace(IDs.grayFurnaceOnID, true).setHardness(Settings.grayFurnaceHardness).setResistance(Settings.grayFurnaceResistance).setLightValue(Settings.grayFurnaceLightValue).setUnlocalizedName("grayFurnaceOn");
		grayFusionFurnace = new GrayFusionFurnace(IDs.grayFusionFurnaceID, false).setHardness(Settings.grayFurnaceHardness).setResistance(Settings.grayFurnaceResistance).setUnlocalizedName("grayFusionFurnace");
		grayFusionFurnaceOn = new GrayFusionFurnace(IDs.grayFusionFurnaceOnID, true).setHardness(Settings.grayFurnaceHardness).setResistance(Settings.grayFurnaceResistance).setLightValue(Settings.grayFurnaceLightValue).setUnlocalizedName("grayFusionFurnaceOn");

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
		rawPigiron = new SimpleIngot(IDs.rawPigironID).modId("wootzpigngray").setUnlocalizedName("rawPigiron").setTextureName("wootzpigngray:rawPigiron");
		pigironIngot = new SimpleIngot(IDs.pigironIngotID).modId("wootzpigngray").setUnlocalizedName("pigironIngot").setTextureName("wootzpigngray:pigironIngot");
		rePigironIngot = new SimpleIngot(IDs.rePigironIngotID).modId("wootzpigngray").setUnlocalizedName("rePigironIngot").setTextureName("wootzpigngray:rePigironIngot");
		wootzIngot = new SimpleIngot(IDs.wootzIngotID).modId("wootzpigngray").setUnlocalizedName("wootzIngot").setTextureName("wootzpigngray:wootzIngot");
		grayIngot = new SimpleIngot(IDs.grayIngotID).modId("wootzpigngray").setUnlocalizedName("grayIngot").setTextureName("wootzpigngray:grayIngot");
		smallWootzsteelChunk = new SimpleIngot(IDs.smallWootzsteelChunkID).modId("wootzpigngray").setUnlocalizedName("smallWootzsteelChunk").setTextureName("wootzpigngray:largeWootz steelChunk");
		mediumWootzsteelChunk = new SimpleIngot(IDs.mediumWootzsteelChunkID).modId("wootzpigngray").setUnlocalizedName("mediumWootzsteelChunk").setTextureName("wootzpigngray:largeWootz steelChunk");
		largeWootzsteelChunk = new SimpleIngot(IDs.largeWootzsteelChunkID).modId("wootzpigngray").setUnlocalizedName("largeWootzsteelChunk").setTextureName("wootzpigngray:largeWootz steelChunk");
		packedIron = new SimpleIngot(IDs.packedIronID).modId("wootzpigngray").setUnlocalizedName("packedIron").setTextureName("wootzpigngray:packedIron");
		graphite = new SimpleIngot(IDs.graphiteID).modId("wootzpigngray").setUnlocalizedName("graphite").setTextureName("wootzpigngray:graphite");
		mediumGrayChunk = new SimpleIngot(IDs.mediumGrayChunkID).modId("wootzpigngray").setUnlocalizedName("mediumGrayChunk").setTextureName("wootzpigngray:mediumGrayChunk");
		largeGrayChunk = new SimpleIngot(IDs.largeGrayChunkID).modId("wootzpigngray").setUnlocalizedName("largeGrayChunk").setTextureName("wootzpigngray:largeGrayChunk");

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
		LanguageRegistry.addName(mediumGrayChunk, "Medium Gray Iron Chunk");
		LanguageRegistry.addName(largeGrayChunk, "Large Gray Iron Chunk");
	}
	
	/**
	 * The method that gives the tools their properties and names, as well as registering them as their respective tool type. This is called by the main SimpleOres class.
	 */
	public static void doTools()
	{
		//Tool Details
		wootzPick = new SimplePickaxe(IDs.wootzPickID, WootzPignGray.toolWootz).modId("wootzpigngray").setUnlocalizedName("wootzPick").setTextureName("wootzpigngray:wootzPick");
		wootzAxe = new SimpleAxe(IDs.wootzAxeID, WootzPignGray.toolWootz).modId("wootzpigngray").setUnlocalizedName("wootzAxe").setTextureName("wootzpigngray:wootzAxe");
		wootzShovel = new SimpleShovel(IDs.wootzShovelID, WootzPignGray.toolWootz).modId("wootzpigngray").setUnlocalizedName("wootzShovel").setTextureName("wootzpigngray:wootzShovel");
		wootzSword = new SimpleSword(IDs.wootzSwordID, WootzPignGray.toolWootz).modId("wootzpigngray").setUnlocalizedName("wootzSword").setTextureName("wootzpigngray:wootzSword");
		wootzHoe = new SimpleHoe(IDs.wootzHoeID, WootzPignGray.toolWootz).modId("wootzpigngray").setUnlocalizedName("wootzHoe").setTextureName("wootzpigngray:wootzHoe");
		hardenedsteelPick = new HardenedPickaxe(IDs.hardenedPickID, WootzPignGray.toolHardenedsteel, "wootzpigngray").setUnlocalizedName("hardenedsteelPick").setTextureName("wootzpigngray:hardenedsteelPick");
		hardenedsteelAxe = new HardenedAxe(IDs.hardenedAxeID, WootzPignGray.toolHardenedsteel, "wootzpigngray").setUnlocalizedName("hardenedsteelAxe").setTextureName("wootzpigngray:hardenedsteelAxe");
		hardenedsteelShovel = new HardenedShovel(IDs.hardenedShovelID, WootzPignGray.toolHardenedsteel, "wootzpigngray").setUnlocalizedName("hardenedsteelShovel").setTextureName("wootzpigngray:hardenedsteelShovel");
		hardenedsteelSword = new HardenedSword(IDs.hardenedSwordID, WootzPignGray.toolHardenedsteel, "wootzpigngray").setUnlocalizedName("hardenedsteelSword").setTextureName("wootzpigngray:hardenedsteelSword");
		hardenedsteelHoe = new HardenedHoe(IDs.hardenedHoeID, WootzPignGray.toolHardenedsteel, "wootzpigngray").setUnlocalizedName("hardenedsteelHoe").setTextureName("wootzpigngray:hardenedsteelHoe");

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
        MinecraftForge.setToolClass(wootzPick, "pickaxe", Settings.wootzMiningLevel);
        MinecraftForge.setToolClass(wootzShovel, "shovel", Settings.wootzMiningLevel);
        MinecraftForge.setToolClass(wootzAxe, "axe", Settings.wootzMiningLevel);
        MinecraftForge.setToolClass(hardenedsteelPick, "pickaxe", Settings.hardenedsteelMiningLevel);
        MinecraftForge.setToolClass(hardenedsteelShovel, "shovel", Settings.hardenedsteelMiningLevel);
        MinecraftForge.setToolClass(hardenedsteelAxe, "axe", Settings.hardenedsteelMiningLevel);

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