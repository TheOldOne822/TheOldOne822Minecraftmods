package theoldone822.NetherrocksFusion;

import theoldone822.NetherrocksFusion.Furnaces.SuperFurnace;
import theoldone822.NetherrocksFusion.Furnaces.SuperFusionFurnace;
import theoldone822.NetherrocksFusion.Items.NetherAxe;
import theoldone822.NetherrocksFusion.Items.NetherPickaxe;
import theoldone822.NetherrocksFusion.Items.NetherShovel;
import theoldone822.NetherrocksFusion.Items.NetherSword;
import theoldone822.NetherrocksFusion.Items.SimpleBow;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import alexndr.SimpleOres.api.content.SimpleOre;
import alexndr.SimpleOres.api.helpers.CoreHelper;
import alexndr.SimpleOres.api.content.SimpleArmor;
import alexndr.SimpleOres.api.content.SimpleAxe;
import alexndr.SimpleOres.api.content.SimpleHoe;
import alexndr.SimpleOres.api.content.SimpleIngot;
import alexndr.SimpleOres.api.content.SimplePickaxe;
import alexndr.SimpleOres.api.content.SimpleShovel;
import alexndr.SimpleOres.api.content.SimpleSword;
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
	public static Item pyralisChain;
	public static Item dragonbezoarChain;
	
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
	public static Item pyralisChainHelm;
	public static Item pyralisChainChest;
	public static Item pyralisChainLegs;
	public static Item pyralisChainBoots;
	public static Item dragonbezoarHelm;
	public static Item dragonbezoarChest;
	public static Item dragonbezoarLegs;
	public static Item dragonbezoarBoots;
	public static Item dragonbezoarChainHelm;
	public static Item dragonbezoarChainChest;
	public static Item dragonbezoarChainLegs;
	public static Item dragonbezoarChainBoots;
	
	/**
	 * Creating the tool items.
	 */
	/**
	 * The method that gives the armor items their properties and names. This is called by the main SimpleOres class.
	 */
	public static void doArmor()
	{
		//Armour Details
		cinderstoneHelm = new SimpleArmor(IDs.cinderstoneHelmID, mod.armorCinderstone, mod.rendererCinderstone, 0).modId("netherrocksfusion").setType("cinderstone").setUnlocalizedName("cinderstoneHelm").setTextureName("netherrocksfusion:cinderstoneHelm");
		cinderstoneChest = new SimpleArmor(IDs.cinderstoneChestID, mod.armorCinderstone, mod.rendererCinderstone, 1).modId("netherrocksfusion").setType("cinderstone").setUnlocalizedName("cinderstoneChest").setTextureName("netherrocksfusion:cinderstoneChest");
		cinderstoneLegs = new SimpleArmor(IDs.cinderstoneLegsID, mod.armorCinderstone, mod.rendererCinderstone, 2).modId("netherrocksfusion").setType("cinderstone").setUnlocalizedName("cinderstoneLegs").setTextureName("netherrocksfusion:cinderstoneLegs");
		cinderstoneBoots = new SimpleArmor(IDs.cinderstoneBootsID, mod.armorCinderstone, mod.rendererCinderstone, 3).modId("netherrocksfusion").setType("cinderstone").setUnlocalizedName("cinderstoneBoots").setTextureName("netherrocksfusion:cinderstoneBoots");
		thrakaHelm = new SimpleArmor(IDs.thrakaHelmID, mod.armorThraka, mod.rendererThraka, 0).modId("netherrocksfusion").setType("thraka").setUnlocalizedName("thrakaHelm").setTextureName("netherrocksfusion:thrakaHelm");
		thrakaChest = new SimpleArmor(IDs.thrakaChestID, mod.armorThraka, mod.rendererThraka, 1).modId("netherrocksfusion").setType("thraka").setUnlocalizedName("thrakaChest").setTextureName("netherrocksfusion:thrakaChest");
		thrakaLegs = new SimpleArmor(IDs.thrakaLegsID, mod.armorThraka, mod.rendererThraka, 2).modId("netherrocksfusion").setType("thraka").setUnlocalizedName("thrakaLegs").setTextureName("netherrocksfusion:thrakaLegs");
		thrakaBoots = new SimpleArmor(IDs.thrakaBootsID, mod.armorThraka, mod.rendererThraka, 3).modId("netherrocksfusion").setType("thraka").setUnlocalizedName("thrakaBoots").setTextureName("netherrocksfusion:thrakaBoots");
		pyralisHelm = new SimpleArmor(IDs.pyralisHelmID, mod.armorPyralis, mod.rendererPyralis, 0).modId("netherrocksfusion").setType("pyralis").setUnlocalizedName("pyralisHelm").setTextureName("netherrocksfusion:pyralisHelm");
		pyralisChest = new SimpleArmor(IDs.pyralisChestID, mod.armorPyralis, mod.rendererPyralis, 1).modId("netherrocksfusion").setType("pyralis").setUnlocalizedName("pyralisChest").setTextureName("netherrocksfusion:pyralisChest");
		pyralisLegs = new SimpleArmor(IDs.pyralisLegsID, mod.armorPyralis, mod.rendererPyralis, 2).modId("netherrocksfusion").setType("pyralis").setUnlocalizedName("pyralisLegs").setTextureName("netherrocksfusion:pyralisLegs");
		pyralisBoots = new SimpleArmor(IDs.pyralisBootsID, mod.armorPyralis, mod.rendererPyralis, 3).modId("netherrocksfusion").setType("pyralis").setUnlocalizedName("pyralisBoots").setTextureName("netherrocksfusion:pyralisBoots");
		pyralisChainHelm = new SimpleArmor(IDs.pyralisChainHelmID, mod.armorPyralisChain, mod.rendererPyralisChain, 0).modId("netherrocksfusion").setType("pyralisChain").setUnlocalizedName("pyralisChainHelm").setTextureName("netherrocksfusion:pyralisChainHelm");
		pyralisChainChest = new SimpleArmor(IDs.pyralisChainChestID, mod.armorPyralisChain, mod.rendererPyralisChain, 1).modId("netherrocksfusion").setType("pyralisChain").setUnlocalizedName("pyralisChainChest").setTextureName("netherrocksfusion:pyralisChainChest");
		pyralisChainLegs = new SimpleArmor(IDs.pyralisChainLegsID, mod.armorPyralisChain, mod.rendererPyralisChain, 2).modId("netherrocksfusion").setType("pyralisChain").setUnlocalizedName("pyralisChainLegs").setTextureName("netherrocksfusion:pyralisChainLegs");
		pyralisChainBoots = new SimpleArmor(IDs.pyralisChainBootsID, mod.armorPyralisChain, mod.rendererPyralisChain, 3).modId("netherrocksfusion").setType("pyralisChain").setUnlocalizedName("pyralisChainBoots").setTextureName("netherrocksfusion:pyralisChainBoots");
		dragonbezoarHelm = new SimpleArmor(IDs.dragonbezoarHelmID, mod.armorDragonBezoar, mod.rendererDragonBezoar, 0).modId("netherrocksfusion").setType("dragonbezoar").setUnlocalizedName("dragonbezoarHelm").setTextureName("netherrocksfusion:dragonbezoarHelm");
		dragonbezoarChest = new SimpleArmor(IDs.dragonbezoarChestID, mod.armorDragonBezoar, mod.rendererDragonBezoar, 1).modId("netherrocksfusion").setType("dragonbezoar").setUnlocalizedName("dragonbezoarChest").setTextureName("netherrocksfusion:dragonbezoarChest");
		dragonbezoarLegs = new SimpleArmor(IDs.dragonbezoarLegsID, mod.armorDragonBezoar, mod.rendererDragonBezoar, 2).modId("netherrocksfusion").setType("dragonbezoar").setUnlocalizedName("dragonbezoarLegs").setTextureName("netherrocksfusion:dragonbezoarLegs");
		dragonbezoarBoots = new SimpleArmor(IDs.dragonbezoarBootsID, mod.armorDragonBezoar, mod.rendererDragonBezoar, 3).modId("netherrocksfusion").setType("dragonbezoar").setUnlocalizedName("dragonbezoarBoots").setTextureName("netherrocksfusion:dragonbezoarBoots");
		dragonbezoarChainHelm = new SimpleArmor(IDs.dragonbezoarChainHelmID, mod.armorDragonBezoarChain, mod.rendererDragonBezoarChain, 0).modId("netherrocksfusion").setType("dragonbezoarChain").setUnlocalizedName("dragonbezoarChainHelm").setTextureName("netherrocksfusion:dragonbezoarChainHelm");
		dragonbezoarChainChest = new SimpleArmor(IDs.dragonbezoarChainChestID, mod.armorDragonBezoarChain, mod.rendererDragonBezoarChain, 1).modId("netherrocksfusion").setType("dragonbezoarChain").setUnlocalizedName("dragonbezoarChainChest").setTextureName("netherrocksfusion:dragonbezoarChainChest");
		dragonbezoarChainLegs = new SimpleArmor(IDs.dragonbezoarChainLegsID, mod.armorDragonBezoarChain, mod.rendererDragonBezoarChain, 2).modId("netherrocksfusion").setType("dragonbezoarChain").setUnlocalizedName("dragonbezoarChainLegs").setTextureName("netherrocksfusion:dragonbezoarChainLegs");
		dragonbezoarChainBoots = new SimpleArmor(IDs.dragonbezoarChainBootsID, mod.armorDragonBezoarChain, mod.rendererDragonBezoarChain, 3).modId("netherrocksfusion").setType("dragonbezoarChain").setUnlocalizedName("dragonbezoarChainBoots").setTextureName("netherrocksfusion:dragonbezoarChainBoots");

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

		LanguageRegistry.addName(pyralisChainHelm, "Pyralis Chain Helmet");
		LanguageRegistry.addName(pyralisChainChest, "Pyralis Chain Chestplate");
		LanguageRegistry.addName(pyralisChainLegs, "Pyralis Chain Leggings");
		LanguageRegistry.addName(pyralisChainBoots, "Pyralis Chain Boots");

		LanguageRegistry.addName(dragonbezoarHelm, "Dragon Bezoar Helmet");
		LanguageRegistry.addName(dragonbezoarChest, "Dragon Bezoar Chestplate");
		LanguageRegistry.addName(dragonbezoarLegs, "Dragon Bezoar Leggings");
		LanguageRegistry.addName(dragonbezoarBoots, "Dragon Bezoar Boots");

		LanguageRegistry.addName(dragonbezoarChainHelm, "Dragon Bezoar Chain Helmet");
		LanguageRegistry.addName(dragonbezoarChainChest, "Dragon Bezoar Chain Chestplate");
		LanguageRegistry.addName(dragonbezoarChainLegs, "Dragon Bezoar Chain Leggings");
		LanguageRegistry.addName(dragonbezoarChainBoots, "Dragon Bezoar Chain Boots");
}
	
	/**
	 * The method that gives blocks their properties, names etc, harvest levels and registers them. This is called by the main SimpleOres class.
	 */
	public static void doBlocks()
	{
		//Block Properties
		cinderstoneBlock = new SimpleOre(IDs.cinderstoneBlockID, Material.iron).modId("netherrocksfusion").setHardness(Settings.cinderstoneBlockHardness).setResistance(Settings.cinderstoneBlockResistance).setLightValue(Settings.cinderstoneBlockLightValue).setUnlocalizedName("cinderstoneBlock").setTextureName("netherrocksfusion:cinderstoneBlock");
		thrakaBlock = new SimpleOre(IDs.thrakaBlockID, Material.iron).modId("netherrocksfusion").setHardness(Settings.thrakaBlockHardness).setResistance(Settings.thrakaBlockResistance).setUnlocalizedName("thrakaBlock").setTextureName("netherrocksfusion:thrakaBlock");
		pyralisBlock = new SimpleOre(IDs.pyralisBlockID, Material.iron).modId("netherrocksfusion").setHardness(Settings.pyralisBlockHardness).setResistance(Settings.pyralisBlockResistance).setLightValue(Settings.pyralisBlockLightValue).setUnlocalizedName("pyralisBlock").setTextureName("netherrocksfusion:pyralisBlock");
		dragonbezoarBlock = new SimpleOre(IDs.dragonbezoarBlockID, Material.iron).modId("netherrocksfusion").setHardness(Settings.dragonbezoarBlockHardness).setResistance(Settings.dragonbezoarBlockResistance).setLightValue(Settings.dragonbezoarBlockLightValue).setUnlocalizedName("dragonbezoarBlock").setTextureName("netherrocksfusion:dragonbezoarBlock");
		dragonbezoarFurnace = new SuperFurnace(IDs.dragonbezoarFurnaceID, false).setHardness(Settings.dragonbezoarFurnaceHardness).setResistance(Settings.dragonbezoarFurnaceResistance).setLightValue(Settings.dragonbezoarBlockLightValue).setUnlocalizedName("dragonbezoarFurnace");
		dragonbezoarFurnaceOn = new SuperFurnace(IDs.dragonbezoarFurnaceOnID, true).setHardness(Settings.dragonbezoarFurnaceHardness).setResistance(Settings.dragonbezoarFurnaceResistance).setLightValue(Settings.dragonbezoarFurnaceLightValue).setUnlocalizedName("dragonbezoarFurnaceOn");
		dragonbezoarFusionFurnace = new SuperFusionFurnace(IDs.dragonbezoarFusionFurnaceID, false).setHardness(Settings.dragonbezoarFurnaceHardness).setResistance(Settings.dragonbezoarFurnaceResistance).setLightValue(Settings.dragonbezoarBlockLightValue).setUnlocalizedName("dragonbezoarFusionFurnace");
		dragonbezoarFusionFurnaceOn = new SuperFusionFurnace(IDs.dragonbezoarFusionFurnaceOnID, true).setHardness(Settings.dragonbezoarFurnaceHardness).setResistance(Settings.dragonbezoarFurnaceResistance).setLightValue(Settings.dragonbezoarFurnaceLightValue).setUnlocalizedName("dragonbezoarFusionFurnaceOn");

		//Block Registering
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
		cinderstoneIngot = new SimpleIngot(IDs.cinderstoneIngotID).modId("netherrocksfusion").setUnlocalizedName("cinderstoneIngot").setTextureName("netherrocksfusion:cinderstoneIngot");
		pyralisIngot = new SimpleIngot(IDs.pyralisIngotID).modId("netherrocksfusion").setUnlocalizedName("pyralisIngot").setTextureName("netherrocksfusion:pyralisIngot");
		pyralisChain = new SimpleIngot(IDs.pyralisChainID).modId("netherrocksfusion").setUnlocalizedName("pyralisChain").setTextureName("netherrocksfusion:pyralisChain");
		thrakaIngot = new SimpleIngot(IDs.thrakaIngotID).modId("netherrocksfusion").setUnlocalizedName("thrakaIngot").setTextureName("netherrocksfusion:thrakaIngot");
		dragonbezoarIngot = new SimpleIngot(IDs.dragonbezoarIngotID).modId("netherrocksfusion").setUnlocalizedName("dragonbezoarIngot").setTextureName("netherrocksfusion:dragonbezoarIngot");
		dragonbezoarChain = new SimpleIngot(IDs.dragonbezoarChainID).modId("netherrocksfusion").setUnlocalizedName("dragonbezoarChain").setTextureName("netherrocksfusion:dragonbezoarChain");
		dragonbezoarRod = new SimpleIngot(IDs.dragonbezoarRodID).modId("netherrocksfusion").setUnlocalizedName("dragonbezoarRod").setTextureName("netherrocksfusion:dragonbezoarRod");	
		smallCinderstoneChunk = new SimpleIngot(IDs.smallCinderstoneChunkID).modId("netherrocksfusion").setUnlocalizedName("smallCinderstoneChunk").setTextureName("netherrocksfusion:smallCinderstoneChunk");
		mediumCinderstoneChunk = new SimpleIngot(IDs.mediumCinderstoneChunkID).modId("netherrocksfusion").setUnlocalizedName("mediumCinderstoneChunk").setTextureName("netherrocksfusion:mediumCinderstoneChunk");
		largeCinderstoneChunk = new SimpleIngot(IDs.largeCinderstoneChunkID).modId("netherrocksfusion").setUnlocalizedName("largeCinderstoneChunk").setTextureName("netherrocksfusion:largeCinderstoneChunk");
		smallThrakaChunk = new SimpleIngot(IDs.smallThrakaChunkID).modId("netherrocksfusion").setUnlocalizedName("smallThrakaChunk").setTextureName("netherrocksfusion:smallThrakaChunk");
		mediumThrakaChunk = new SimpleIngot(IDs.mediumThrakaChunkID).modId("netherrocksfusion").setUnlocalizedName("mediumThrakaChunk").setTextureName("netherrocksfusion:mediumThrakaChunk");
		largeThrakaChunk = new SimpleIngot(IDs.largeThrakaChunkID).modId("netherrocksfusion").setUnlocalizedName("largeThrakaChunk").setTextureName("netherrocksfusion:largeThrakaChunk");
		smallPyralisChunk = new SimpleIngot(IDs.smallPyralisChunkID).modId("netherrocksfusion").setUnlocalizedName("smallPyralisChunk").setTextureName("netherrocksfusion:smallPyralisChunk");
		mediumPyralisChunk = new SimpleIngot(IDs.mediumPyralisChunkID).modId("netherrocksfusion").setUnlocalizedName("mediumPyralisChunk").setTextureName("netherrocksfusion:mediumPyralisChunk");
		largePyralisChunk = new SimpleIngot(IDs.largePyralisChunkID).modId("netherrocksfusion").setUnlocalizedName("largePyralisChunk").setTextureName("netherrocksfusion:largePyralisChunk");
		smallDragonBezoarChunk = new SimpleIngot(IDs.smallDragonBezoarChunkID).modId("netherrocksfusion").setUnlocalizedName("smallDragonBezoarChunk").setTextureName("netherrocksfusion:smallDragonBezoarChunk");
		mediumDragonBezoarChunk = new SimpleIngot(IDs.mediumDragonBezoarChunkID).modId("netherrocksfusion").setUnlocalizedName("mediumDragonBezoarChunk").setTextureName("netherrocksfusion:mediumDragonBezoarChunk");
		largeDragonBezoarChunk = new SimpleIngot(IDs.largeDragonBezoarChunkID).modId("netherrocksfusion").setUnlocalizedName("largeDragonBezoarChunk").setTextureName("netherrocksfusion:largeDragonBezoarChunk");

		LanguageRegistry.addName(cinderstoneIngot, "Cinderstone Ingot");
		LanguageRegistry.addName(thrakaIngot, "Thraka Ingot");
		LanguageRegistry.addName(pyralisIngot, "Pyralis Ingot");
		LanguageRegistry.addName(pyralisChain, "Pyralis Chain Links");
		LanguageRegistry.addName(dragonbezoarIngot, "Dragon Bezoar Ingot");
		LanguageRegistry.addName(dragonbezoarChain, "Dragon Bezoar Chain Links");
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
		cinderstoneSword = new NetherSword(IDs.cinderstoneSwordID, NetherrocksFusion.toolCinderstone).setUnlocalizedName("cinderstoneSword").setTextureName("netherrocksfusion:cinderstoneSword");
		thrakaPick = new SimplePickaxe(IDs.thrakaPickID, NetherrocksFusion.toolThraka).modId("netherrocksfusion").setUnlocalizedName("thrakaPick").setTextureName("netherrocksfusion:thrakaPick");
		thrakaAxe = new SimpleAxe(IDs.thrakaAxeID, NetherrocksFusion.toolThraka).modId("netherrocksfusion").setUnlocalizedName("thrakaAxe").setTextureName("netherrocksfusion:thrakaAxe");
		thrakaShovel = new SimpleShovel(IDs.thrakaShovelID, NetherrocksFusion.toolThraka).modId("netherrocksfusion").setUnlocalizedName("thrakaShovel").setTextureName("netherrocksfusion:thrakaShovel");
		thrakaSword = new SimpleSword(IDs.thrakaSwordID, NetherrocksFusion.toolThraka).modId("netherrocksfusion").setUnlocalizedName("thrakaSword").setTextureName("netherrocksfusion:thrakaSword");
		thrakaHoe = new SimpleHoe(IDs.thrakaHoeID, NetherrocksFusion.toolThraka).modId("netherrocksfusion").setUnlocalizedName("thrakaHoe").setTextureName("netherrocksfusion:thrakaHoe");
		pyralisPick = new NetherPickaxe(IDs.pyralisPickID, NetherrocksFusion.toolPyralis).setUnlocalizedName("pyralisPick").setTextureName("netherrocksfusion:pyralisPick");
		pyralisAxe = new NetherAxe(IDs.pyralisAxeID, NetherrocksFusion.toolPyralis).setUnlocalizedName("pyralisAxe").setTextureName("netherrocksfusion:pyralisAxe");
		pyralisShovel = new NetherShovel(IDs.pyralisShovelID, NetherrocksFusion.toolPyralis).setUnlocalizedName("pyralisShovel").setTextureName("netherrocksfusion:pyralisShovel");
		pyralisSword = new NetherSword(IDs.pyralisSwordID, NetherrocksFusion.toolPyralis).setUnlocalizedName("pyralisSword").setTextureName("netherrocksfusion:pyralisSword");
		pyralisHoe = new SimpleHoe(IDs.pyralisHoeID, NetherrocksFusion.toolPyralis).modId("netherrocksfusion").setUnlocalizedName("pyralisHoe").setTextureName("netherrocksfusion:pyralisHoe");
		dragonbezoarPick = new NetherPickaxe(IDs.dragonbezoarPickID, NetherrocksFusion.toolDragonBezoar).setUnlocalizedName("dragonbezoarPick").setTextureName("netherrocksfusion:dragonbezoarPick");
		dragonbezoarAxe = new NetherAxe(IDs.dragonbezoarAxeID, NetherrocksFusion.toolDragonBezoar).setUnlocalizedName("dragonbezoarAxe").setTextureName("netherrocksfusion:dragonbezoarAxe");
		dragonbezoarShovel = new NetherShovel(IDs.dragonbezoarShovelID, NetherrocksFusion.toolDragonBezoar).setUnlocalizedName("dragonbezoarShovel").setTextureName("netherrocksfusion:dragonbezoarShovel");
		dragonbezoarSword = new NetherSword(IDs.dragonbezoarSwordID, NetherrocksFusion.toolDragonBezoar).setUnlocalizedName("dragonbezoarSword").setTextureName("netherrocksfusion:dragonbezoarSword");
		dragonbezoarHoe = new SimpleHoe(IDs.dragonbezoarHoeID, NetherrocksFusion.toolDragonBezoar).modId("netherrocksfusion").setUnlocalizedName("dragonbezoarHoe").setTextureName("netherrocksfusion:dragonbezoarHoe");
		dragonbezoarBow = (ItemBow) new SimpleBow(IDs.dragonbezoarBowID, 1200, mod.toolPyralis).setFull3D().setUnlocalizedName("dragonbezoarBow").setTextureName("netherrocksfusion:dragonbezoarBow");
		dragonbezoarShears = new SimpleShears(IDs.dragonbezoarShearsID, 9300).setUnlocalizedName("dragonbezoarShears").setTextureName("netherrocksfusion:dragonbezoarShears");

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

		}
}