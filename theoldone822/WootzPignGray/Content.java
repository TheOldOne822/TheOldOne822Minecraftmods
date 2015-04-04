package theoldone822.WootzPignGray;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import theoldone822.WootzPignGray.Furnaces.GrayFurnace;
import theoldone822.WootzPignGray.Furnaces.GrayFusionFurnace;
import theoldone822.WootzPignGray.Items.HardenedAxe;
import theoldone822.WootzPignGray.Items.HardenedHoe;
import theoldone822.WootzPignGray.Items.HardenedPickaxe;
import theoldone822.WootzPignGray.Items.HardenedShovel;
import theoldone822.WootzPignGray.Items.HardenedSword;
import alexndr.api.content.items.SimpleArmor;
import alexndr.api.content.items.SimpleAxe;
import alexndr.api.content.items.SimpleHoe;
import alexndr.api.content.items.SimpleItem;
import alexndr.api.content.items.SimplePickaxe;
import alexndr.api.content.items.SimpleShovel;
import alexndr.api.content.items.SimpleSword;
import cpw.mods.fml.common.registry.GameRegistry;

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
		wootzHelm = new SimpleArmor(WootzPignGray.armorWootz, 0).modId("wootzpigngray").setUnlocalizedName("wootzHelm").setTextureName("wootzpigngray:wootzHelm");
		wootzChest = new SimpleArmor(WootzPignGray.armorWootz,1).modId("wootzpigngray").setUnlocalizedName("wootzChest").setTextureName("wootzpigngray:wootzChest");
		wootzLegs = new SimpleArmor(WootzPignGray.armorWootz, 2).modId("wootzpigngray").setUnlocalizedName("wootzLegs").setTextureName("wootzpigngray:wootzLegs");
		wootzBoots = new SimpleArmor(WootzPignGray.armorWootz, 3).modId("wootzpigngray").setUnlocalizedName("wootzBoots").setTextureName("wootzpigngray:wootzBoots");
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
		grayBlock = new SimpleOre(Material.iron).modId("wootzpigngray").setStackToDrop(new ItemStack(graphite)).setHardness(Settings.grayBlockHardness).setResistance(Settings.grayBlockResistance).setBlockName("grayBlock").setBlockTextureName("wootzpigngray:grayBlock");
		grayFurnace = new GrayFurnace(false).setHardness(Settings.grayFurnaceHardness).setResistance(Settings.grayFurnaceResistance).setBlockName("grayFurnace");
		grayFurnaceOn = new GrayFurnace(true).setHardness(Settings.grayFurnaceHardness).setResistance(Settings.grayFurnaceResistance).setLightLevel(Settings.grayFurnaceLightValue).setBlockName("grayFurnaceOn");
		grayFusionFurnace = new GrayFusionFurnace(false).setHardness(Settings.grayFurnaceHardness).setResistance(Settings.grayFurnaceResistance).setBlockName("grayFusionFurnace");
		grayFusionFurnaceOn = new GrayFusionFurnace(true).setHardness(Settings.grayFurnaceHardness).setResistance(Settings.grayFurnaceResistance).setLightLevel(Settings.grayFurnaceLightValue).setBlockName("grayFusionFurnaceOn");

		//Block Registering
		GameRegistry.registerBlock(grayFurnace, "grayFurnace");
		GameRegistry.registerBlock(grayFurnaceOn, "grayFurnaceOn");
		GameRegistry.registerBlock(grayFusionFurnace, "grayFusionFurnace");
		GameRegistry.registerBlock(grayFusionFurnaceOn, "grayFusionFurnaceOn");

	}	
	
	/**
	 * The method that gives items their properties, names etc, harvest levels and registers them. This is called by the main SimpleOres class.
	 */
	public static void doItems()
	{
		//Item Details
		rawPigiron = new SimpleItem().modId("wootzpigngray").setUnlocalizedName("rawPigiron").setTextureName("wootzpigngray:rawPigiron");
		pigironIngot = new SimpleItem().modId("wootzpigngray").setUnlocalizedName("pigironIngot").setTextureName("wootzpigngray:pigironIngot");
		rePigironIngot = new SimpleItem().modId("wootzpigngray").setUnlocalizedName("rePigironIngot").setTextureName("wootzpigngray:rePigironIngot");
		wootzIngot = new SimpleItem().modId("wootzpigngray").setUnlocalizedName("wootzIngot").setTextureName("wootzpigngray:wootzIngot");
		grayIngot = new SimpleItem().modId("wootzpigngray").setUnlocalizedName("grayIngot").setTextureName("wootzpigngray:grayIngot");
		smallWootzsteelChunk = new SimpleItem().modId("wootzpigngray").setUnlocalizedName("smallWootzsteelChunk").setTextureName("wootzpigngray:largeWootz steelChunk");
		mediumWootzsteelChunk = new SimpleItem().modId("wootzpigngray").setUnlocalizedName("mediumWootzsteelChunk").setTextureName("wootzpigngray:largeWootz steelChunk");
		largeWootzsteelChunk = new SimpleItem().modId("wootzpigngray").setUnlocalizedName("largeWootzsteelChunk").setTextureName("wootzpigngray:largeWootz steelChunk");
		packedIron = new SimpleItem().modId("wootzpigngray").setUnlocalizedName("packedIron").setTextureName("wootzpigngray:packedIron");
		graphite = new SimpleItem().modId("wootzpigngray").setUnlocalizedName("graphite").setTextureName("wootzpigngray:graphite");
		largeGrayChunk = new SimpleItem().modId("wootzpigngray").setUnlocalizedName("largeGrayChunk").setTextureName("wootzpigngray:largeGrayChunk");
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

		}
	public static void doLoot()
	{
		ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(wootzIngot), 1, 2, 2));
		ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(grayIngot), 1, 2, 5));
		ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(rePigironIngot), 1, 2, 4));
		ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(pigironIngot), 1, 2, 1));
		ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(rawPigiron), 2, 6, 1));
		ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(graphite), 2, 4, 1));
		ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(wootzHelm), 1, 2, 1));
		ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(wootzChest), 2, 6, 1));
		ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(wootzLegs), 2, 4, 1));
		ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(wootzBoots), 1, 1, 1));
		ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(wootzPick), 1, 5, 1));
		ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(wootzAxe), 1, 2, 1));
		ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(wootzShovel), 1, 1, 1));
		ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(wootzSword), 1, 2, 1));
		ChestGenHooks.getInfo("villageBlacksmith").addItem(new WeightedRandomChestContent(new ItemStack(wootzHoe), 1, 1, 1));
		ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(wootzIngot), 1, 2, 4));
		ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(wootzHelm), 1, 2, 5));
		ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(wootzChest), 1, 2, 4));
		ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(wootzLegs), 3, 5, 1));
		ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(wootzBoots), 2, 6, 1));
		ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(wootzPick), 2, 4, 1));
		ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(wootzAxe), 1, 1, 1));
		ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(wootzShovel), 1, 3, 1));
		ChestGenHooks.getInfo("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(wootzSword), 1, 2, 1));
		ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(wootzIngot), 1, 1, 1));
		ChestGenHooks.getInfo("strongholdCorridor").addItem(new WeightedRandomChestContent(new ItemStack(wootzSword), 1, 1, 2));
		ChestGenHooks.getInfo("strongholdCrossing").addItem(new WeightedRandomChestContent(new ItemStack(wootzIngot), 1, 1, 4));
		ChestGenHooks.getInfo("strongholdCrossing").addItem(new WeightedRandomChestContent(new ItemStack(wootzSword), 1, 1, 6));
		ChestGenHooks.getInfo("strongholdLibrary").addItem(new WeightedRandomChestContent(new ItemStack(wootzHelm), 1, 1, 2));
		ChestGenHooks.getInfo("strongholdLibrary").addItem(new WeightedRandomChestContent(new ItemStack(wootzChest), 1, 1, 1));
		ChestGenHooks.getInfo("strongholdLibrary").addItem(new WeightedRandomChestContent(new ItemStack(wootzLegs), 1, 1, 1));
		ChestGenHooks.getInfo("strongholdLibrary").addItem(new WeightedRandomChestContent(new ItemStack(wootzBoots), 1, 1, 1));
		ChestGenHooks.getInfo("mineshaftCorridor").addItem(new WeightedRandomChestContent(new ItemStack(wootzIngot), 1, 2, 2));
		ChestGenHooks.getInfo("mineshaftCorridor").addItem(new WeightedRandomChestContent(new ItemStack(wootzSword), 1, 1, 1));
		ChestGenHooks.getInfo("mineshaftCorridor").addItem(new WeightedRandomChestContent(new ItemStack(wootzShovel), 1, 3, 1));
		ChestGenHooks.getInfo("mineshaftCorridor").addItem(new WeightedRandomChestContent(new ItemStack(wootzAxe), 1, 1, 1));
		ChestGenHooks.getInfo("mineshaftCorridor").addItem(new WeightedRandomChestContent(new ItemStack(wootzPick), 1, 3, 1));
		ChestGenHooks.getInfo("pyramidDesertyChest").addItem(new WeightedRandomChestContent(new ItemStack(wootzSword), 3, 9, 3));
		ChestGenHooks.getInfo("pyramidDesertyChest").addItem(new WeightedRandomChestContent(new ItemStack(wootzAxe), 1, 2, 2));
		ChestGenHooks.getInfo("pyramidDesertyChest").addItem(new WeightedRandomChestContent(new ItemStack(wootzShovel), 1, 2, 1));
		ChestGenHooks.getInfo("pyramidJungleChest").addItem(new WeightedRandomChestContent(new ItemStack(wootzSword), 2, 4, 6));
		ChestGenHooks.getInfo("pyramidJungleChest").addItem(new WeightedRandomChestContent(new ItemStack(wootzChest), 1, 1, 2));
	}

}