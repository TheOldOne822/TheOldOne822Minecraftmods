package theoldone822.WootzPignGray;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class IDs {
	//Blocks
	public static int pigironBlockID;
	public static int wootzBlockID;
	public static int rePigironBlockID;
	public static int grayBlockID;
	public static int grayFurnaceID;
	public static int grayFurnaceOnID;
	public static int grayFusionFurnaceID;
	public static int grayFusionFurnaceOnID;

	//Items
	public static int rawPigironID;
	public static int pigironIngotID;
	public static int wootzIngotID;
	public static int rePigironIngotID;
	public static int grayIngotID;
	public static int smallWootzsteelChunkID;
	public static int mediumWootzsteelChunkID;
	public static int largeWootzsteelChunkID;
	public static int packedIronID;
	public static int graphiteID;
	public static int mediumGrayChunkID;
	public static int largeGrayChunkID;

	//Tools
	public static int wootzPickID;
	public static int wootzAxeID;
	public static int wootzShovelID;
	public static int wootzSwordID;
	public static int wootzHoeID;
	public static int hardenedPickID;
	public static int hardenedAxeID;
	public static int hardenedShovelID;
	public static int hardenedSwordID;
	public static int hardenedHoeID;

	//Armor
	public static int wootzHelmID;
	public static int wootzChestID;
	public static int wootzLegsID;
	public static int wootzBootsID;

	public static void doConfig(FMLPreInitializationEvent event)
	{
	File installDir = event.getModConfigurationDirectory();
	File configDir = new File(installDir, "Wootz Pig and Gray Configuration");
	Configuration config = new Configuration(new File(configDir, "IDs.cfg"));


	config.load();

	//Block ID's
	pigironBlockID = config.getBlock("Blocks", "Pigiron Block", 1432).getInt();
	wootzBlockID = config.getBlock("Blocks", "Wootz steel Block", 1433).getInt();
	rePigironBlockID = config.getBlock("Blocks", "Refined Pigiron Block", 1434).getInt();
	grayBlockID = config.getBlock("Blocks", "Gray Block", 1435).getInt();
	grayFurnaceID = config.getBlock("Blocks", "Gray Furnace", 1436).getInt();
	grayFurnaceOnID = config.getBlock("Blocks", "Gray Furnace On", 1437).getInt();
	grayFusionFurnaceID = config.getBlock("Blocks", "Gray Fusion Furnace", 1438).getInt();
	grayFusionFurnaceOnID = config.getBlock("Blocks", "Gray Fusion Furnace On", 1439).getInt();

	//Item ID's
	rawPigironID = config.getItem("Items", "Raw Pigiron", 4798).getInt();
	pigironIngotID = config.getItem("Items", "Pigiron Ingot", 4799).getInt();
	wootzIngotID = config.getItem("Items", "Wootz steel Ingot", 4800).getInt();
	rePigironIngotID = config.getItem("Items", "Refined Pigiron Ingot", 4801).getInt();
	grayIngotID = config.getItem("Items", "Gray Ingot", 4802).getInt();
	smallWootzsteelChunkID = config.getItem("Items", "Wootz steel Chunk Small", 4803).getInt();
	mediumWootzsteelChunkID = config.getItem("Items", "Wootz steel Chunk Medium", 4804).getInt();
	largeWootzsteelChunkID = config.getItem("Items", "Wootz steel Chunk Large", 4805).getInt();
	packedIronID = config.getItem("Items", "Packed Iron", 4796).getInt();
	graphiteID = config.getItem("Items", "Graphite", 4797).getInt();
	mediumGrayChunkID = config.getItem("Items", "Gray Chunk Medium", 4806).getInt();
	largeGrayChunkID = config.getItem("Items", "Gray Chunk Large", 4807).getInt();

	//Tool ID's
	wootzPickID = config.getItem("Tools", "Wootz steel Pickaxe", 4808).getInt();
	wootzAxeID = config.getItem("Tools", "Wootz steel Axe", 4809).getInt();
	wootzShovelID = config.getItem("Tools", "Wootz steel Shovel", 4810).getInt();
	wootzSwordID = config.getItem("Weapons", "Wootz steel Sword", 4811).getInt();
	wootzHoeID = config.getItem("Tools", "Wootz steel Hoe", 4812).getInt();
	hardenedPickID = config.getItem("Tools", "Hardened steel Pickaxe", 4813).getInt();
	hardenedAxeID = config.getItem("Tools", "Hardened steel Axe", 4814).getInt();
	hardenedShovelID = config.getItem("Tools", "Hardened steel Shovel", 4815).getInt();
	hardenedSwordID = config.getItem("Weapons", "Hardened steel Sword", 4816).getInt();
	hardenedHoeID = config.getItem("Tools", "Hardened steel Hoe", 4817).getInt();

	//Armor ID's
	wootzHelmID = config.getItem("Armor", "Wootz steel Helmet", 4818).getInt();
	wootzChestID = config.getItem("Armor", "Wootz steel Chestplate", 4819).getInt();
	wootzLegsID = config.getItem("Armor", "Wootz steel Leggings", 4820).getInt();
	wootzBootsID = config.getItem("Armor", "Wootz steel Boots", 4821).getInt();

	config.save();
	}
}
