package theoldone822.WootzPignGray;

import theoldone822.WootzPignGray.Furnaces.GrayFurnace;
import theoldone822.WootzPignGray.Furnaces.GrayFusionFurnace;
import theoldone822.WootzPignGray.Items.HardenedArmor;
import theoldone822.WootzPignGray.Items.HardenedAxe;
import theoldone822.WootzPignGray.Items.HardenedHoe;
import theoldone822.WootzPignGray.Items.HardenedPickaxe;
import theoldone822.WootzPignGray.Items.HardenedShovel;
import theoldone822.WootzPignGray.Items.HardenedSword;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import SimpleOres.core.SimpleOres;
import SimpleOres.core.api.SimpleIngot;
import SimpleOres.core.api.SimpleSword;
import SimpleOres.core.api.SimpleShovel;
import SimpleOres.core.api.SimpleAxe;
import SimpleOres.core.api.SimplePickaxe;
import SimpleOres.core.api.SimpleHoe;
import SimpleOres.core.api.SimpleArmor;
import SimpleOres.core.api.HandlerLoot;
import SimpleOres.core.api.SimpleOre;
import SimpleOres.core.api.SimpleTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
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
	public static Item hardenedsteelHelm;
	public static Item hardenedsteelChest;
	public static Item hardenedsteelLegs;
	public static Item hardenedsteelBoots;
	
	/**
	 * Creating the tool items.
	 */
	/**
	 * The method that gives the armor items their properties and names. This is called by the main SimpleOres class.
	 */
	public static void doArmor()
	{
		//Armour Details
		wootzHelm = new SimpleArmor(IDs.wootzHelmID, mod.armorWootz, mod.rendererWootz, 0, "wootz", "wootzpigngray", SimpleOres.tabSimpleCombat).setUnlocalizedName("wootzHelm").setTextureName("wootzpigngray:wootzHelm");
		wootzChest = new SimpleArmor(IDs.wootzChestID, mod.armorWootz, mod.rendererWootz, 1, "wootz", "wootzpigngray", SimpleOres.tabSimpleCombat).setUnlocalizedName("wootzChest").setTextureName("wootzpigngray:wootzChest");
		wootzLegs = new SimpleArmor(IDs.wootzLegsID, mod.armorWootz, mod.rendererWootz, 2, "wootz", "wootzpigngray", SimpleOres.tabSimpleCombat).setUnlocalizedName("wootzLegs").setTextureName("wootzpigngray:wootzLegs");
		wootzBoots = new SimpleArmor(IDs.wootzBootsID, mod.armorWootz, mod.rendererWootz, 3, "wootz", "wootzpigngray", SimpleOres.tabSimpleCombat).setUnlocalizedName("wootzBoots").setTextureName("wootzpigngray:wootzBoots");
		hardenedsteelHelm = new HardenedArmor(IDs.hardenedHelmID, mod.armorHardenedsteel, mod.rendererHardenedsteel, 0, "hardenedsteel", "wootzpigngray", SimpleOres.tabSimpleCombat).setUnlocalizedName("hardenedsteelHelm").setTextureName("wootzpigngray:hardenedsteelHelm");
		hardenedsteelChest = new HardenedArmor(IDs.hardenedChestID, mod.armorHardenedsteel, mod.rendererHardenedsteel, 1, "hardenedsteel", "wootzpigngray", SimpleOres.tabSimpleCombat).setUnlocalizedName("hardenedsteelChest").setTextureName("wootzpigngray:hardenedsteelChest");
		hardenedsteelLegs = new HardenedArmor(IDs.hardenedLegsID, mod.armorHardenedsteel, mod.rendererHardenedsteel, 2, "hardenedsteel", "wootzpigngray", SimpleOres.tabSimpleCombat).setUnlocalizedName("hardenedsteelLegs").setTextureName("wootzpigngray:hardenedsteelLegs");
		hardenedsteelBoots = new HardenedArmor(IDs.hardenedBootsID, mod.armorHardenedsteel, mod.rendererHardenedsteel, 3, "hardenedsteel", "wootzpigngray", SimpleOres.tabSimpleCombat).setUnlocalizedName("hardenedsteelBoots").setTextureName("wootzpigngray:hardenedsteelBoots");

		LanguageRegistry.addName(wootzHelm, "Wootz steel Helmet");
		LanguageRegistry.addName(wootzChest, "Wootz steel Chestplate");
		LanguageRegistry.addName(wootzLegs, "Wootz steel Leggings");
		LanguageRegistry.addName(wootzBoots, "Wootz steel Boots");

		LanguageRegistry.addName(hardenedsteelHelm, "Hardenedsteel Helmet");
		LanguageRegistry.addName(hardenedsteelChest, "Hardenedsteel Chestplate");
		LanguageRegistry.addName(hardenedsteelLegs, "Hardenedsteel Leggings");
		LanguageRegistry.addName(hardenedsteelBoots, "Hardenedsteel Boots");

}
	
	/**
	 * The method that gives blocks their properties, names etc, harvest levels and registers them. This is called by the main SimpleOres class.
	 */
	public static void doBlocks()
	{
		//Block Properties
		pigironBlock = new SimpleOre(IDs.pigironBlockID, Material.iron, "wootzpigngray", SimpleOres.tabSimpleBlocks).setHardness(Settings.pigironBlockHardness).setResistance(Settings.pigironBlockResistance).setCreativeTab(SimpleOres.tabSimpleBlocks).setUnlocalizedName("pigironBlock").setTextureName("wootzpigngray:pigironBlock");
		wootzBlock = new SimpleOre(IDs.wootzBlockID, Material.iron, "wootzpigngray", SimpleOres.tabSimpleBlocks).setHardness(Settings.wootzBlockHardness).setResistance(Settings.wootzBlockResistance).setCreativeTab(SimpleOres.tabSimpleBlocks).setUnlocalizedName("wootzBlock").setTextureName("wootzpigngray:wootzBlock");
		rePigironBlock = new SimpleOre(IDs.rePigironBlockID, Material.iron, "wootzpigngray", SimpleOres.tabSimpleBlocks).setHardness(Settings.rePigironBlockHardness).setResistance(Settings.rePigironBlockResistance).setCreativeTab(SimpleOres.tabSimpleBlocks).setUnlocalizedName("rePigironBlock").setTextureName("wootzpigngray:rePigironBlock");
		grayBlock = new SimpleGemOre(IDs.grayBlockID, Material.iron, "wootzpigngray", IDs.graphiteID, 3, 6, SimpleOres.tabSimpleBlocks).setHardness(Settings.grayBlockHardness).setResistance(Settings.grayBlockResistance).setCreativeTab(SimpleOres.tabSimpleBlocks).setUnlocalizedName("grayBlock").setTextureName("wootzpigngray:grayBlock");
		grayFurnace = new GrayFurnace(IDs.grayFurnaceID, false).setHardness(Settings.grayFurnaceHardness).setResistance(Settings.grayFurnaceResistance).setUnlocalizedName("grayFurnace");
		grayFurnaceOn = new GrayFurnace(IDs.grayFurnaceOnID, true).setHardness(Settings.grayFurnaceHardness).setResistance(Settings.grayFurnaceResistance).setLightValue(Settings.grayFurnaceLightValue).setUnlocalizedName("grayFurnaceOn");
		grayFusionFurnace = new GrayFusionFurnace(IDs.grayFusionFurnaceID, false).setHardness(Settings.grayFurnaceHardness).setResistance(Settings.grayFurnaceResistance).setUnlocalizedName("grayFusionFurnace");
		grayFusionFurnaceOn = new GrayFusionFurnace(IDs.grayFusionFurnaceOnID, true).setHardness(Settings.grayFurnaceHardness).setResistance(Settings.grayFurnaceResistance).setLightValue(Settings.grayFurnaceLightValue).setUnlocalizedName("grayFusionFurnaceOn");

		//Block Registering
		GameRegistry.registerBlock(pigironBlock, "pigironBlock");
		GameRegistry.registerBlock(wootzBlock, "wootzBlock");
		GameRegistry.registerBlock(rePigironBlock, "rePigironBlock");
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
		rawPigiron = new SimpleIngot(IDs.rawPigironID, "wootzpigngray", SimpleOres.tabSimpleMaterials).setUnlocalizedName("rawPigiron").setTextureName("wootzpigngray:rawPigiron");
		pigironIngot = new SimpleIngot(IDs.pigironIngotID, "wootzpigngray", SimpleOres.tabSimpleMaterials).setUnlocalizedName("pigironIngot").setTextureName("wootzpigngray:pigironIngot");
		rePigironIngot = new SimpleIngot(IDs.rePigironIngotID, "wootzpigngray", SimpleOres.tabSimpleMaterials).setUnlocalizedName("rePigironIngot").setTextureName("wootzpigngray:rePigironIngot");
		wootzIngot = new SimpleIngot(IDs.wootzIngotID, "wootzpigngray", SimpleOres.tabSimpleMaterials).setUnlocalizedName("wootzIngot").setTextureName("wootzpigngray:wootzIngot");
		grayIngot = new SimpleIngot(IDs.grayIngotID, "wootzpigngray", SimpleOres.tabSimpleMaterials).setUnlocalizedName("grayIngot").setTextureName("wootzpigngray:grayIngot");
		smallWootzsteelChunk = new SimpleIngot(IDs.smallWootzsteelChunkID, "wootzpigngray", SimpleOres.tabSimpleMaterials).setUnlocalizedName("smallWootzsteelChunk").setTextureName("wootzpigngray:largeWootz steelChunk");
		mediumWootzsteelChunk = new SimpleIngot(IDs.mediumWootzsteelChunkID, "wootzpigngray", SimpleOres.tabSimpleMaterials).setUnlocalizedName("mediumWootzsteelChunk").setTextureName("wootzpigngray:largeWootz steelChunk");
		largeWootzsteelChunk = new SimpleIngot(IDs.largeWootzsteelChunkID, "wootzpigngray", SimpleOres.tabSimpleMaterials).setUnlocalizedName("largeWootzsteelChunk").setTextureName("wootzpigngray:largeWootz steelChunk");
		packedIron = new SimpleIngot(IDs.packedIronID, "wootzpigngray", SimpleOres.tabSimpleMaterials).setUnlocalizedName("packedIron").setTextureName("wootzpigngray:packedIron");
		graphite = new SimpleIngot(IDs.graphiteID, "wootzpigngray", SimpleOres.tabSimpleMaterials).setUnlocalizedName("graphite").setTextureName("wootzpigngray:graphite");
		mediumGrayChunk = new SimpleIngot(IDs.mediumGrayChunkID, "wootzpigngray", SimpleOres.tabSimpleMaterials).setUnlocalizedName("mediumGrayChunk").setTextureName("wootzpigngray:mediumGrayChunk");
		largeGrayChunk = new SimpleIngot(IDs.largeGrayChunkID, "wootzpigngray", SimpleOres.tabSimpleMaterials).setUnlocalizedName("largeGrayChunk").setTextureName("wootzpigngray:largeGrayChunk");

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
		wootzPick = new SimplePickaxe(IDs.wootzPickID, WootzPignGray.toolWootz, "wootzpigngray", SimpleOres.tabSimpleTools).setUnlocalizedName("wootzPick").setTextureName("wootzpigngray:wootzPick");
		wootzAxe = new SimpleAxe(IDs.wootzAxeID, WootzPignGray.toolWootz, "wootzpigngray", SimpleOres.tabSimpleTools).setUnlocalizedName("wootzAxe").setTextureName("wootzpigngray:wootzAxe");
		wootzShovel = new SimpleShovel(IDs.wootzShovelID, WootzPignGray.toolWootz, "wootzpigngray", SimpleOres.tabSimpleTools).setUnlocalizedName("wootzShovel").setTextureName("wootzpigngray:wootzShovel");
		wootzSword = new SimpleSword(IDs.wootzSwordID, WootzPignGray.toolWootz, "wootzpigngray", SimpleOres.tabSimpleCombat).setUnlocalizedName("wootzSword").setTextureName("wootzpigngray:wootzSword");
		wootzHoe = new SimpleHoe(IDs.wootzHoeID, WootzPignGray.toolWootz, "wootzpigngray", SimpleOres.tabSimpleTools).setUnlocalizedName("wootzHoe").setTextureName("wootzpigngray:wootzHoe");
		hardenedsteelPick = new HardenedPickaxe(IDs.hardenedPickID, WootzPignGray.toolHardenedsteel, "wootzpigngray", SimpleOres.tabSimpleTools).setUnlocalizedName("hardenedsteelPick").setTextureName("wootzpigngray:hardenedsteelPick");
		hardenedsteelAxe = new HardenedAxe(IDs.hardenedAxeID, WootzPignGray.toolHardenedsteel, "wootzpigngray", SimpleOres.tabSimpleTools).setUnlocalizedName("hardenedsteelAxe").setTextureName("wootzpigngray:hardenedsteelAxe");
		hardenedsteelShovel = new HardenedShovel(IDs.hardenedShovelID, WootzPignGray.toolHardenedsteel, "wootzpigngray", SimpleOres.tabSimpleTools).setUnlocalizedName("hardenedsteelShovel").setTextureName("wootzpigngray:hardenedsteelShovel");
		hardenedsteelSword = new HardenedSword(IDs.hardenedSwordID, WootzPignGray.toolHardenedsteel, "wootzpigngray", SimpleOres.tabSimpleCombat).setUnlocalizedName("hardenedsteelSword").setTextureName("wootzpigngray:hardenedsteelSword");
		hardenedsteelHoe = new HardenedHoe(IDs.hardenedHoeID, WootzPignGray.toolHardenedsteel, "wootzpigngray", SimpleOres.tabSimpleTools).setUnlocalizedName("hardenedsteelHoe").setTextureName("wootzpigngray:hardenedsteelHoe");

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
		HandlerLoot.lootHandler().addLoot("villageBlacksmith", wootzIngot, 1, 2, 2);
		HandlerLoot.lootHandler().addLoot("villageBlacksmith", grayIngot, 1, 2, 5);
		HandlerLoot.lootHandler().addLoot("villageBlacksmith", rePigironIngot, 1, 2, 4);
		HandlerLoot.lootHandler().addLoot("villageBlacksmith", pigironIngot, 1, 2, 1);
		HandlerLoot.lootHandler().addLoot("villageBlacksmith", rawPigiron, 2, 6, 1);
		HandlerLoot.lootHandler().addLoot("villageBlacksmith", graphite, 2, 4, 1);
		HandlerLoot.lootHandler().addLoot("villageBlacksmith", wootzHelm, 1, 2, 1);
		HandlerLoot.lootHandler().addLoot("villageBlacksmith", wootzChest, 2, 6, 1);
		HandlerLoot.lootHandler().addLoot("villageBlacksmith", wootzLegs, 2, 4, 1);
		HandlerLoot.lootHandler().addLoot("villageBlacksmith", wootzBoots, 1, 1, 1);
		HandlerLoot.lootHandler().addLoot("villageBlacksmith", wootzPick, 1, 5, 1);
		HandlerLoot.lootHandler().addLoot("villageBlacksmith", wootzAxe, 1, 2, 1);
		HandlerLoot.lootHandler().addLoot("villageBlacksmith", wootzShovel, 1, 1, 1);
		HandlerLoot.lootHandler().addLoot("villageBlacksmith", wootzSword, 1, 2, 1);
		HandlerLoot.lootHandler().addLoot("villageBlacksmith", wootzHoe, 1, 1, 1);
		HandlerLoot.lootHandler().addLoot("dungeonChest", wootzIngot, 1, 2, 4);
		HandlerLoot.lootHandler().addLoot("dungeonChest", wootzHelm, 1, 2, 5);
		HandlerLoot.lootHandler().addLoot("dungeonChest", wootzChest, 1, 2, 4);
		HandlerLoot.lootHandler().addLoot("dungeonChest", wootzLegs, 3, 5, 1);
		HandlerLoot.lootHandler().addLoot("dungeonChest", wootzBoots, 2, 6, 1);
		HandlerLoot.lootHandler().addLoot("dungeonChest", wootzPick, 2, 4, 1);
		HandlerLoot.lootHandler().addLoot("dungeonChest", wootzAxe, 1, 1, 1);
		HandlerLoot.lootHandler().addLoot("dungeonChest", wootzShovel, 1, 3, 1);
		HandlerLoot.lootHandler().addLoot("dungeonChest", wootzSword, 1, 2, 1);
		HandlerLoot.lootHandler().addLoot("strongholdCorridor", wootzIngot, 1, 1, 1);
		HandlerLoot.lootHandler().addLoot("strongholdCorridor", wootzSword, 1, 1, 2);
		HandlerLoot.lootHandler().addLoot("strongholdCrossing", wootzIngot, 1, 1, 4);
		HandlerLoot.lootHandler().addLoot("strongholdCrossing", wootzSword, 1, 1, 6);
		HandlerLoot.lootHandler().addLoot("strongholdLibrary", wootzHelm, 1, 1, 2);
		HandlerLoot.lootHandler().addLoot("strongholdLibrary", wootzChest, 1, 1, 1);
		HandlerLoot.lootHandler().addLoot("strongholdLibrary", wootzLegs, 1, 1, 1);
		HandlerLoot.lootHandler().addLoot("strongholdLibrary", wootzBoots, 1, 1, 1);
		HandlerLoot.lootHandler().addLoot("mineshaftCorridor", wootzIngot, 1, 2, 2);
		HandlerLoot.lootHandler().addLoot("mineshaftCorridor", wootzSword, 1, 1, 1);
		HandlerLoot.lootHandler().addLoot("mineshaftCorridor", wootzShovel, 1, 3, 1);
		HandlerLoot.lootHandler().addLoot("mineshaftCorridor", wootzAxe, 1, 1, 1);
		HandlerLoot.lootHandler().addLoot("mineshaftCorridor", wootzPick, 1, 3, 1);
		HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", wootzSword, 3, 9, 3);
		HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", wootzAxe, 1, 2, 2);
		HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", wootzShovel, 1, 2, 1);
		HandlerLoot.lootHandler().addLoot("pyramidJungleChest", wootzSword, 2, 4, 6);
		HandlerLoot.lootHandler().addLoot("pyramidJungleChest", wootzChest, 1, 1, 2);
	}

}