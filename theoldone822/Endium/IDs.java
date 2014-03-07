package theoldone822.Endium;

import java.io.File;
import alexndr.SimpleOres.api.helpers.FreeIdHelper;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class IDs {
	//Blocks
	public static int EndiumOreID;
	public static int EndiumBlockID;
	public static int TelosBlockID;
	public static int SunteleiaBlockID;

	//Items
	public static int EndiumIngotID;
	public static int TelosIngotID;
	public static int SunteleiaIngotID;
	public static int smallTelosChunkID;
	public static int mediumTelosChunkID;
	public static int largeTelosChunkID;
	public static int smallSunteleiaChunkID;
	public static int mediumSunteleiaChunkID;
	public static int largeSunteleiaChunkID;

	//Tools
	public static int EndiumPickID;
	public static int EndiumAxeID;
	public static int EndiumShovelID;
	public static int EndiumSwordID;
	public static int EndiumHoeID;
	public static int TelosPickID;
	public static int TelosAxeID;
	public static int TelosShovelID;
	public static int TelosSwordID;
	public static int TelosHoeID;
	public static int SunteleiaPickID;
	public static int SunteleiaAxeID;
	public static int SunteleiaShovelID;
	public static int SunteleiaSwordID;
	public static int SunteleiaHoeID;

	//Armor
	public static int EndiumHelmID;
	public static int EndiumChestID;
	public static int EndiumLegsID;
	public static int EndiumBootsID;
	public static int TelosHelmID;
	public static int TelosChestID;
	public static int TelosLegsID;
	public static int TelosBootsID;
	public static int SunteleiaHelmID;
	public static int SunteleiaChestID;
	public static int SunteleiaLegsID;
	public static int SunteleiaBootsID;

	public static void doConfig(FMLPreInitializationEvent event)
	{
	File installDir = event.getModConfigurationDirectory();
	File configDir = new File(installDir, "Endium");
	Configuration config = new Configuration(new File(configDir, "IDs.cfg"));


	config.load();
	
	FreeIdHelper.compileIdList();
	
	//Block ID's
	EndiumOreID = config.getBlock("Blocks", "Endium Ore", FreeIdHelper.freeBlock()).getInt();
	EndiumBlockID = config.getBlock("Blocks", "Endium Block", FreeIdHelper.freeBlock()).getInt();
	TelosBlockID = config.getBlock("Blocks", "Telos Block", FreeIdHelper.freeBlock()).getInt();
	SunteleiaBlockID = config.getBlock("Blocks", "Sunteleia Block", FreeIdHelper.freeBlock()).getInt();

	//Item ID's
	EndiumIngotID = config.getItem("Items", "Endium Ingot", FreeIdHelper.freeItem()).getInt();
	TelosIngotID = config.getItem("Items", "Telos Ingot", FreeIdHelper.freeItem()).getInt();
	SunteleiaIngotID = config.getItem("Items", "Sunteleia Ingot", FreeIdHelper.freeItem()).getInt();
	smallTelosChunkID = config.getItem("Items", "Telos Chunk Small", FreeIdHelper.freeItem()).getInt();
	mediumTelosChunkID = config.getItem("Items", "Telos Chunk Medium", FreeIdHelper.freeItem()).getInt();
	largeTelosChunkID = config.getItem("Items", "Telos Chunk Large", FreeIdHelper.freeItem()).getInt();
	smallSunteleiaChunkID = config.getItem("Items", "Sunteleia Chunk Small", FreeIdHelper.freeItem()).getInt();
	mediumSunteleiaChunkID = config.getItem("Items", "Sunteleia Chunk Medium", FreeIdHelper.freeItem()).getInt();
	largeSunteleiaChunkID = config.getItem("Items", "Sunteleia Chunk Large", FreeIdHelper.freeItem()).getInt();

	//Tool ID's
	EndiumPickID = config.getItem("Tools", "Endium Pickaxe", FreeIdHelper.freeItem()).getInt();
	EndiumAxeID = config.getItem("Tools", "Endium Axe", FreeIdHelper.freeItem()).getInt();
	EndiumShovelID = config.getItem("Tools", "Endium Shovel", FreeIdHelper.freeItem()).getInt();
	EndiumSwordID = config.getItem("Weapons", "Endium Sword", FreeIdHelper.freeItem()).getInt();
	EndiumHoeID = config.getItem("Tools", "Endium Hoe", FreeIdHelper.freeItem()).getInt();
	TelosPickID = config.getItem("Tools", "Telos Pickaxe", FreeIdHelper.freeItem()).getInt();
	TelosAxeID = config.getItem("Tools", "Telos Axe", FreeIdHelper.freeItem()).getInt();
	TelosShovelID = config.getItem("Tools", "Telos Shovel", FreeIdHelper.freeItem()).getInt();
	TelosSwordID = config.getItem("Weapons", "Telos Sword", FreeIdHelper.freeItem()).getInt();
	TelosHoeID = config.getItem("Tools", "Telos Hoe", FreeIdHelper.freeItem()).getInt();
	SunteleiaPickID = config.getItem("Tools", "Sunteleia Pickaxe", FreeIdHelper.freeItem()).getInt();
	SunteleiaAxeID = config.getItem("Tools", "Sunteleia Axe", FreeIdHelper.freeItem()).getInt();
	SunteleiaShovelID = config.getItem("Tools", "Sunteleia Shovel", FreeIdHelper.freeItem()).getInt();
	SunteleiaSwordID = config.getItem("Weapons", "Sunteleia Sword", FreeIdHelper.freeItem()).getInt();
	SunteleiaHoeID = config.getItem("Tools", "Sunteleia Hoe", FreeIdHelper.freeItem()).getInt();

	//Armor ID's
	EndiumHelmID = config.getItem("Armor", "Endium Helmet", FreeIdHelper.freeItem()).getInt();
	EndiumChestID = config.getItem("Armor", "Endium Chestplate", FreeIdHelper.freeItem()).getInt();
	EndiumLegsID = config.getItem("Armor", "Endium Leggings", FreeIdHelper.freeItem()).getInt();
	EndiumBootsID = config.getItem("Armor", "Endium Boots", FreeIdHelper.freeItem()).getInt();
	TelosHelmID = config.getItem("Armor", "Telos Helmet", FreeIdHelper.freeItem()).getInt();
	TelosChestID = config.getItem("Armor", "Telos Chestplate", FreeIdHelper.freeItem()).getInt();
	TelosLegsID = config.getItem("Armor", "Telos Leggings", FreeIdHelper.freeItem()).getInt();
	TelosBootsID = config.getItem("Armor", "Telos Boots", FreeIdHelper.freeItem()).getInt();
	SunteleiaHelmID = config.getItem("Armor", "Sunteleia Helmet", FreeIdHelper.freeItem()).getInt();
	SunteleiaChestID = config.getItem("Armor", "Sunteleia Chestplate", FreeIdHelper.freeItem()).getInt();
	SunteleiaLegsID = config.getItem("Armor", "Sunteleia Leggings", FreeIdHelper.freeItem()).getInt();
	SunteleiaBootsID = config.getItem("Armor", "Sunteleia Boots", FreeIdHelper.freeItem()).getInt();

	config.save();
	}
}
