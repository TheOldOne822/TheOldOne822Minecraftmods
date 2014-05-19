package theoldone822.Endium;

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
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraftforge.common.MinecraftForge;

public class Content 
{
	public static Endium mod;
	
	/**
	 * Creating the blocks.
	 */
	public static Block EndiumOre;
	public static Block EndiumBlock;
	public static Block TelosBlock;
	public static Block SunteleiaBlock;

	/**
	 * Creating the item int's. Fairly obvious.
	 */
	public static Item EndiumIngot;
	public static Item TelosIngot;
	public static Item SunteleiaIngot;
	
	public static Item smallTelosChunk;
	public static Item mediumTelosChunk;
	public static Item largeTelosChunk;
	public static Item smallSunteleiaChunk;
	public static Item mediumSunteleiaChunk;
	public static Item largeSunteleiaChunk;
	
	/**
	 * Creating the tool items.
	 */
	public static Item EndiumPick;
	public static Item EndiumAxe;
	public static Item EndiumShovel;
	public static Item EndiumSword;
	public static Item EndiumHoe;
	public static Item TelosPick;
	public static Item TelosAxe;
	public static Item TelosShovel;
	public static Item TelosSword;
	public static Item TelosHoe;
	public static Item SunteleiaPick;
	public static Item SunteleiaAxe;
	public static Item SunteleiaShovel;
	public static Item SunteleiaSword;
	public static Item SunteleiaHoe;
	
	/**
	 * Creating the armor items.
	 */
	public static Item EndiumHelm;
	public static Item EndiumChest;
	public static Item EndiumLegs;
	public static Item EndiumBoots;
	public static Item TelosHelm;
	public static Item TelosChest;
	public static Item TelosLegs;
	public static Item TelosBoots;
	public static Item SunteleiaHelm;
	public static Item SunteleiaChest;
	public static Item SunteleiaLegs;
	public static Item SunteleiaBoots;
	
	/**
	 * Creating the tool items.
	 */
	/**
	 * The method that gives the armor items their properties and names. This is called by the main SimpleOres class.
	 */
	public static void doArmor()
	{
		//Armour Details
		EndiumHelm = new SimpleArmor(mod.armorEndium, mod.rendererEndium, 0).modId("Endium").setType("Endium").setUnlocalizedName("EndiumHelm").setTextureName("Endium:EndiumHelm");
		EndiumChest = new SimpleArmor(mod.armorEndium, mod.rendererEndium, 1).modId("Endium").setType("Endium").setUnlocalizedName("EndiumChest").setTextureName("Endium:EndiumChest");
		EndiumLegs = new SimpleArmor(mod.armorEndium, mod.rendererEndium, 2).modId("Endium").setType("Endium").setUnlocalizedName("EndiumLegs").setTextureName("Endium:EndiumLegs");
		EndiumBoots = new SimpleArmor(mod.armorEndium, mod.rendererEndium, 3).modId("Endium").setType("Endium").setUnlocalizedName("EndiumBoots").setTextureName("Endium:EndiumBoots");
		TelosHelm = new SimpleArmor(mod.armorTelos, mod.rendererTelos, 0).modId("Endium").setType("Telos").setUnlocalizedName("TelosHelm").setTextureName("Endium:TelosHelm");
		TelosChest = new SimpleArmor(mod.armorTelos, mod.rendererTelos, 1).modId("Endium").setType("Telos").setUnlocalizedName("TelosChest").setTextureName("Endium:TelosChest");
		TelosLegs = new SimpleArmor(mod.armorTelos, mod.rendererTelos, 2).modId("Endium").setType("Telos").setUnlocalizedName("TelosLegs").setTextureName("Endium:TelosLegs");
		TelosBoots = new SimpleArmor(mod.armorTelos, mod.rendererTelos, 3).modId("Endium").setType("Telos").setUnlocalizedName("TelosBoots").setTextureName("Endium:TelosBoots");
		SunteleiaHelm = new SimpleArmor(mod.armorSunteleia, mod.rendererSunteleia, 0).modId("Endium").setType("Sunteleia").setUnlocalizedName("SunteleiaHelm").setTextureName("Endium:SunteleiaHelm");
		SunteleiaChest = new SimpleArmor(mod.armorSunteleia, mod.rendererSunteleia, 1).modId("Endium").setType("Sunteleia").setUnlocalizedName("SunteleiaChest").setTextureName("Endium:SunteleiaChest");
		SunteleiaLegs = new SimpleArmor(mod.armorSunteleia, mod.rendererSunteleia, 2).modId("Endium").setType("Sunteleia").setUnlocalizedName("SunteleiaLegs").setTextureName("Endium:SunteleiaLegs");
		SunteleiaBoots = new SimpleArmor(mod.armorSunteleia, mod.rendererSunteleia, 3).modId("Endium").setType("Sunteleia").setUnlocalizedName("SunteleiaBoots").setTextureName("Endium:SunteleiaBoots");

		LanguageRegistry.addName(EndiumHelm, "Endium Helmet");
		LanguageRegistry.addName(EndiumChest, "Endium Chestplate");
		LanguageRegistry.addName(EndiumLegs, "Endium Leggings");
		LanguageRegistry.addName(EndiumBoots, "Endium Boots");

		LanguageRegistry.addName(TelosHelm, "Telos Helmet");
		LanguageRegistry.addName(TelosChest, "Telos Chestplate");
		LanguageRegistry.addName(TelosLegs, "Telos Leggings");
		LanguageRegistry.addName(TelosBoots, "Telos Boots");

		LanguageRegistry.addName(SunteleiaHelm, "Sunteleia Helmet");
		LanguageRegistry.addName(SunteleiaChest, "Sunteleia Chestplate");
		LanguageRegistry.addName(SunteleiaLegs, "Sunteleia Leggings");
		LanguageRegistry.addName(SunteleiaBoots, "Sunteleia Boots");

}
	
	/**
	 * The method that gives blocks their properties, names etc, harvest levels and registers them. This is called by the main SimpleOres class.
	 */
	public static void doBlocks()
	{
		//Block Properties
		EndiumOre = new SimpleOre(Material.iron).modId("Endium").setHardness(Settings.EndiumOreHardness).setResistance(Settings.EndiumOreResistance).setLightLevel(Settings.EndiumOreLightValue).setBlockName("EndiumOre").setBlockTextureName("Endium:EndiumOre");
		EndiumBlock = new SimpleOre(Material.iron).modId("Endium").setHardness(Settings.EndiumBlockHardness).setResistance(Settings.EndiumBlockResistance).setLightLevel(Settings.EndiumBlockLightValue).setBlockName("EndiumBlock").setBlockTextureName("Endium:EndiumBlock");
		TelosBlock = new SimpleOre(Material.iron).modId("Endium").setHardness(Settings.TelosBlockHardness).setResistance(Settings.TelosBlockResistance).setBlockName("TelosBlock").setBlockTextureName("Endium:TelosBlock");
		SunteleiaBlock = new SimpleOre(Material.iron).modId("Endium").setHardness(Settings.SunteleiaBlockHardness).setResistance(Settings.SunteleiaBlockResistance).setLightLevel(Settings.SunteleiaBlockLightValue).setBlockName("SunteleiaBlock").setBlockTextureName("Endium:SunteleiaBlock");

		EndiumOre.setHarvestLevel("pickaxe", 5);
    	
    	LanguageRegistry.addName(EndiumOre, "Endium Ore");
		LanguageRegistry.addName(TelosBlock, "Block of Telos");
		LanguageRegistry.addName(SunteleiaBlock, "Block of Sunteleia");
		LanguageRegistry.addName(EndiumBlock, "Block of Endium");

	}	
	
	/**
	 * The method that gives items their properties, names etc, harvest levels and registers them. This is called by the main SimpleOres class.
	 */
	public static void doItems()
	{
		//Item Details
		EndiumIngot = new SimpleIngot().modId("Endium").setUnlocalizedName("EndiumIngot").setTextureName("Endium:EndiumIngot");
		TelosIngot = new SimpleIngot().modId("Endium").setUnlocalizedName("TelosIngot").setTextureName("Endium:TelosIngot");
		SunteleiaIngot = new SimpleIngot().modId("Endium").setUnlocalizedName("SunteleiaIngot").setTextureName("Endium:SunteleiaIngot");
		smallTelosChunk = new SimpleIngot().modId("Endium").setUnlocalizedName("smallTelosChunk").setTextureName("Endium:smallTelosChunk");
		mediumTelosChunk = new SimpleIngot().modId("Endium").setUnlocalizedName("mediumTelosChunk").setTextureName("Endium:mediumTelosChunk");
		largeTelosChunk = new SimpleIngot().modId("Endium").setUnlocalizedName("largeTelosChunk").setTextureName("Endium:largeTelosChunk");
		smallSunteleiaChunk = new SimpleIngot().modId("Endium").setUnlocalizedName("smallSunteleiaChunk").setTextureName("Endium:smallSunteleiaChunk");
		mediumSunteleiaChunk = new SimpleIngot().modId("Endium").setUnlocalizedName("mediumSunteleiaChunk").setTextureName("Endium:mediumSunteleiaChunk");
		largeSunteleiaChunk = new SimpleIngot().modId("Endium").setUnlocalizedName("largeSunteleiaChunk").setTextureName("Endium:largeSunteleiaChunk");

		LanguageRegistry.addName(EndiumIngot, "Endium Ingot");
		LanguageRegistry.addName(TelosIngot, "Telos Ingot");
		LanguageRegistry.addName(TelosIngot, "Telos Ingot");
		LanguageRegistry.addName(SunteleiaIngot, "Sunteleia Ingot");
		LanguageRegistry.addName(smallTelosChunk, "Small Telos Chunk");
		LanguageRegistry.addName(mediumTelosChunk, "Medium Telos Chunk");
		LanguageRegistry.addName(largeTelosChunk, "Large Telos Chunk");
		LanguageRegistry.addName(smallSunteleiaChunk, "Small Sunteleia Chunk");
		LanguageRegistry.addName(mediumSunteleiaChunk, "Medium Sunteleia Chunk");
		LanguageRegistry.addName(largeSunteleiaChunk, "Large Sunteleia Chunk");
	}
	
	/**
	 * The method that gives the tools their properties and names, as well as registering them as their respective tool type. This is called by the main SimpleOres class.
	 */
	public static void doTools()
	{
		//Tool Details
		EndiumPick = new SimplePickaxe(Endium.toolEndium).modId("Endium").setUnlocalizedName("EndiumPick").setTextureName("Endium:EndiumPick");
		EndiumAxe = new SimpleAxe(Endium.toolEndium).modId("Endium").setUnlocalizedName("EndiumAxe").setTextureName("Endium:EndiumAxe");
		EndiumShovel = new SimpleShovel(Endium.toolEndium).modId("Endium").setUnlocalizedName("EndiumShovel").setTextureName("Endium:EndiumShovel");
		EndiumSword = new SimpleSword(Endium.toolEndium).modId("Endium").setUnlocalizedName("EndiumSword").setTextureName("Endium:EndiumSword");
		EndiumHoe = new SimpleHoe(Endium.toolEndium).modId("Endium").setUnlocalizedName("EndiumHoe").setTextureName("Endium:EndiumHoe");
		TelosPick = new SimplePickaxe(Endium.toolTelos).modId("Endium").setUnlocalizedName("TelosPick").setTextureName("Endium:TelosPick");
		TelosAxe = new SimpleAxe(Endium.toolTelos).modId("Endium").setUnlocalizedName("TelosAxe").setTextureName("Endium:TelosAxe");
		TelosShovel = new SimpleShovel(Endium.toolTelos).modId("Endium").setUnlocalizedName("TelosShovel").setTextureName("Endium:TelosShovel");
		TelosSword = new SimpleSword(Endium.toolTelos).modId("Endium").setUnlocalizedName("TelosSword").setTextureName("Endium:TelosSword");
		TelosHoe = new SimpleHoe(Endium.toolTelos).modId("Endium").setUnlocalizedName("TelosHoe").setTextureName("Endium:TelosHoe");
		SunteleiaPick = new SimplePickaxe(Endium.toolSunteleia).modId("Endium").setUnlocalizedName("SunteleiaPick").setTextureName("Endium:SunteleiaPick");
		SunteleiaAxe = new SimpleAxe(Endium.toolSunteleia).modId("Endium").setUnlocalizedName("SunteleiaAxe").setTextureName("Endium:SunteleiaAxe");
		SunteleiaShovel = new SimpleShovel(Endium.toolSunteleia).modId("Endium").setUnlocalizedName("SunteleiaShovel").setTextureName("Endium:SunteleiaShovel");
		SunteleiaSword = new SimpleSword(Endium.toolSunteleia).modId("Endium").setUnlocalizedName("SunteleiaSword").setTextureName("Endium:SunteleiaSword");
		SunteleiaHoe = new SimpleHoe(Endium.toolSunteleia).modId("Endium").setUnlocalizedName("SunteleiaHoe").setTextureName("Endium:SunteleiaHoe");

		LanguageRegistry.addName(TelosPick, "Telos Pickaxe");
		LanguageRegistry.addName(TelosAxe, "Telos Axe");
		LanguageRegistry.addName(TelosShovel, "Telos Shovel");
		LanguageRegistry.addName(TelosSword, "Telos Sword");
		LanguageRegistry.addName(TelosHoe, "Telos Hoe");
		LanguageRegistry.addName(SunteleiaPick, "Sunteleia Pickaxe");
		LanguageRegistry.addName(SunteleiaAxe, "Sunteleia Axe");
		LanguageRegistry.addName(SunteleiaShovel, "Sunteleia Shovel");
		LanguageRegistry.addName(SunteleiaSword, "Sunteleia Sword");
		LanguageRegistry.addName(SunteleiaHoe, "Sunteleia Hoe");
		LanguageRegistry.addName(EndiumPick, "Endium Pickaxe");
		LanguageRegistry.addName(EndiumAxe, "Endium Axe");
		LanguageRegistry.addName(EndiumShovel, "Endium Shovel");
		LanguageRegistry.addName(EndiumSword, "Endium Sword");
		LanguageRegistry.addName(EndiumHoe, "Endium Hoe");

		}
}