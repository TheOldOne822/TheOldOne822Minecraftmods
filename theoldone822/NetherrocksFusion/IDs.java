package theoldone822.NetherrocksFusion;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class IDs {
	//Blocks
	public static int cinderstoneBlockID;
	public static int thrakaBlockID;
	public static int pyralisBlockID;
	public static int dragonbezoarBlockID;
	public static int dragonbezoarFurnaceID;
	public static int dragonbezoarFurnaceOnID;
	public static int dragonbezoarFusionFurnaceID;
	public static int dragonbezoarFusionFurnaceOnID;

	//Items
	public static int cinderstoneIngotID;
	public static int thrakaIngotID;
	public static int pyralisIngotID;
	public static int dragonbezoarIngotID;
	public static int dragonbezoarRodID;
	public static int pyralisChainID;
	public static int dragonbezoarChainID;
	public static int smallCinderstoneChunkID;
	public static int mediumCinderstoneChunkID;
	public static int largeCinderstoneChunkID;
	public static int smallThrakaChunkID;
	public static int mediumThrakaChunkID;
	public static int largeThrakaChunkID;
	public static int smallPyralisChunkID;
	public static int mediumPyralisChunkID;
	public static int largePyralisChunkID;
	public static int smallDragonBezoarChunkID;
	public static int mediumDragonBezoarChunkID;
	public static int largeDragonBezoarChunkID;

	//Tools
	public static int cinderstoneSwordID;
	public static int thrakaPickID;
	public static int thrakaAxeID;
	public static int thrakaShovelID;
	public static int thrakaSwordID;
	public static int thrakaHoeID;
	public static int pyralisPickID;
	public static int pyralisAxeID;
	public static int pyralisShovelID;
	public static int pyralisSwordID;
	public static int pyralisHoeID;
	public static int dragonbezoarPickID;
	public static int dragonbezoarAxeID;
	public static int dragonbezoarShovelID;
	public static int dragonbezoarSwordID;
	public static int dragonbezoarHoeID;
	public static int dragonbezoarBowID;
	public static int dragonbezoarShearsID;

	//Armor
	public static int cinderstoneHelmID;
	public static int cinderstoneChestID;
	public static int cinderstoneLegsID;
	public static int cinderstoneBootsID;
	public static int thrakaHelmID;
	public static int thrakaChestID;
	public static int thrakaLegsID;
	public static int thrakaBootsID;
	public static int pyralisHelmID;
	public static int pyralisChestID;
	public static int pyralisLegsID;
	public static int pyralisBootsID;
	public static int pyralisChainHelmID;
	public static int pyralisChainChestID;
	public static int pyralisChainLegsID;
	public static int pyralisChainBootsID;
	public static int dragonbezoarHelmID;
	public static int dragonbezoarChestID;
	public static int dragonbezoarLegsID;
	public static int dragonbezoarBootsID;
	public static int dragonbezoarChainHelmID;
	public static int dragonbezoarChainChestID;
	public static int dragonbezoarChainLegsID;
	public static int dragonbezoarChainBootsID;

	public static void doConfig(FMLPreInitializationEvent event)
	{
	File installDir = event.getModConfigurationDirectory();
	File configDir = new File(installDir, "Netherrocks Fusions Configuration");
	Configuration config = new Configuration(new File(configDir, "IDs.cfg"));


	config.load();

	//Block ID's
	cinderstoneBlockID = config.getBlock("Blocks", "Cinderstone Block", 477).getInt();
	thrakaBlockID = config.getBlock("Blocks", "Thraka Block", 478).getInt();
	pyralisBlockID = config.getBlock("Blocks", "Pyralis Block", 479).getInt();
	dragonbezoarBlockID = config.getBlock("Blocks", "Dragon Bezoar Block", 480).getInt();
	dragonbezoarFurnaceID = config.getBlock("Blocks", "Dragon Bezoar Furnace", 481).getInt();
	dragonbezoarFurnaceOnID = config.getBlock("Blocks", "Dragon Bezoar Furnace On", 482).getInt();
	dragonbezoarFusionFurnaceID = config.getBlock("Blocks", "Dragon Bezoar Fusion Furnace", 483).getInt();
	dragonbezoarFusionFurnaceOnID = config.getBlock("Blocks", "Dragon Bezoar Fusion Furnace On", 484).getInt();

	//Item ID's
	cinderstoneIngotID = config.getItem("Items", "Cinderstone Ingot", 6512).getInt();
	thrakaIngotID = config.getItem("Items", "Thraka Ingot", 6513).getInt();
	pyralisIngotID = config.getItem("Items", "Pyralis Ingot", 6514).getInt();
	dragonbezoarIngotID = config.getItem("Items", "Dragon Bezoar Ingot", 6515).getInt();
	dragonbezoarRodID = config.getItem("Items", "Dragon Bezoar Rod", 6516).getInt();
	pyralisChainID = config.getItem("Items", "Pyralis Chain", 6597).getInt();
	dragonbezoarChainID = config.getItem("Items", "Dragon Bezoar Chain", 6598).getInt();
	smallCinderstoneChunkID = config.getItem("Items", "Cinderstone Chunk Small", 6517).getInt();
	mediumCinderstoneChunkID = config.getItem("Items", "Cinderstone Chunk Medium ", 6518).getInt();
	largeCinderstoneChunkID = config.getItem("Items", "Cinderstone Chunk Large ", 6519).getInt();
	smallThrakaChunkID = config.getItem("Items", "Thraka Chunk Small", 6520).getInt();
	mediumThrakaChunkID = config.getItem("Items", "Thraka Chunk Medium ", 6521).getInt();
	largeThrakaChunkID = config.getItem("Items", "Thraka Chunk Large ", 6522).getInt();
	smallPyralisChunkID = config.getItem("Items", "Pyralis Chunk Small", 6523).getInt();
	mediumPyralisChunkID = config.getItem("Items", "Pyralis Chunk Medium ", 6524).getInt();
	largePyralisChunkID = config.getItem("Items", "Pyralis Chunk Large ", 6525).getInt();
	smallDragonBezoarChunkID = config.getItem("Items", "Dragon Bezoar Chunk Small", 6526).getInt();
	mediumDragonBezoarChunkID = config.getItem("Items", "Dragon Bezoar Chunk Medium ", 6527).getInt();
	largeDragonBezoarChunkID = config.getItem("Items", "Dragon Bezoar Chunk Large ", 6528).getInt();

	//Tool ID's
	cinderstoneSwordID = config.getItem("Weapons", "Cinderstone Sword", 6529).getInt();
	thrakaPickID = config.getItem("Tools", "Thraka Pickaxe", 6530).getInt();
	thrakaAxeID = config.getItem("Tools", "Thraka Axe", 6531).getInt();
	thrakaShovelID = config.getItem("Tools", "Thraka Shovel", 6532).getInt();
	thrakaSwordID = config.getItem("Weapons", "Thraka Sword", 6533).getInt();
	thrakaHoeID = config.getItem("Tools", "Thraka Hoe", 6534).getInt();
	pyralisPickID = config.getItem("Tools", "Pyralis Pickaxe", 6535).getInt();
	pyralisAxeID = config.getItem("Tools", "Pyralis Axe", 6536).getInt();
	pyralisShovelID = config.getItem("Tools", "Pyralis Shovel", 6537).getInt();
	pyralisSwordID = config.getItem("Weapons", "Pyralis Sword", 6538).getInt();
	pyralisHoeID = config.getItem("Tools", "Pyralis Hoe", 6539).getInt();
	dragonbezoarPickID = config.getItem("Tools", "Dragon Bezoar Pickaxe", 6540).getInt();
	dragonbezoarAxeID = config.getItem("Tools", "Dragon Bezoar Axe", 6541).getInt();
	dragonbezoarShovelID = config.getItem("Tools", "Dragon Bezoar Shovel", 6542).getInt();
	dragonbezoarSwordID = config.getItem("Weapons", "Dragon Bezoar Sword", 6543).getInt();
	dragonbezoarHoeID = config.getItem("Tools", "Dragon Bezoar Hoe", 6544).getInt();
	dragonbezoarBowID = config.getItem("Weapons", "Dragon Bezoar Bow", 6545).getInt();
	dragonbezoarShearsID = config.getItem("Tools", "Dragon Bezoar Shears", 6546).getInt();

	//Armor ID's
	cinderstoneHelmID = config.getItem("Armor", "Cinderstone Helmet", 6547).getInt();
	cinderstoneChestID = config.getItem("Armor", "Cinderstone Chestplate", 6548).getInt();
	cinderstoneLegsID = config.getItem("Armor", "Cinderstone Leggings", 6549).getInt();
	cinderstoneBootsID = config.getItem("Armor", "Cinderstone Boots", 6550).getInt();
	thrakaHelmID = config.getItem("Armor", "Thraka Helmet", 6551).getInt();
	thrakaChestID = config.getItem("Armor", "Thraka Chestplate", 6552).getInt();
	thrakaLegsID = config.getItem("Armor", "Thraka Leggings", 6553).getInt();
	thrakaBootsID = config.getItem("Armor", "Thraka Boots", 6554).getInt();
	pyralisHelmID = config.getItem("Armor", "Pyralis Helmet", 6555).getInt();
	pyralisChestID = config.getItem("Armor", "Pyralis Chestplate", 6556).getInt();
	pyralisLegsID = config.getItem("Armor", "Pyralis Leggings", 6557).getInt();
	pyralisBootsID = config.getItem("Armor", "Pyralis Boots", 6558).getInt();
	pyralisChainHelmID = config.getItem("Armor", "Pyralis Chain Helmet", 6599).getInt();
	pyralisChainChestID = config.getItem("Armor", "Pyralis Chain Chestplate", 6600).getInt();
	pyralisChainLegsID = config.getItem("Armor", "Pyralis Chain Leggings", 6601).getInt();
	pyralisChainBootsID = config.getItem("Armor", "Pyralis Chain Boots", 6602).getInt();
	dragonbezoarHelmID = config.getItem("Armor", "Dragon Bezoar Helmet", 6559).getInt();
	dragonbezoarChestID = config.getItem("Armor", "Dragon Bezoar Chestplate", 6560).getInt();
	dragonbezoarLegsID = config.getItem("Armor", "Dragon Bezoar Leggings", 6561).getInt();
	dragonbezoarBootsID = config.getItem("Armor", "Dragon Bezoar Boots", 6562).getInt();
	dragonbezoarChainHelmID = config.getItem("Armor", "Dragon Bezoar Chain Helmet", 6603).getInt();
	dragonbezoarChainChestID = config.getItem("Armor", "Dragon Bezoar Chain Chestplate", 6604).getInt();
	dragonbezoarChainLegsID = config.getItem("Armor", "Dragon Bezoar Chain Leggings", 6605).getInt();
	dragonbezoarChainBootsID = config.getItem("Armor", "Dragon Bezoar Chain Boots", 6606).getInt();

	config.save();
	}
}
