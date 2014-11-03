package theoldone822.SimpleOreGrinder;

import java.io.File;





import theoldone822.SimpleOreGrinder.Grinder.Grinder;
import theoldone822.SimpleOreGrinder.Grinder.Grinder2;
import theoldone822.SimpleOreGrinder.Grinder.Grinder3;
import theoldone822.SimpleOreGrinder.Grinder.Grinder4;
import theoldone822.SimpleOreGrinder.Grinder.Grinder5;
import theoldone822.SimpleOreGrinder.Grinder.OreGrinderRecipes;
import theoldone822.SimpleOreGrinder.Grinder.GrinderTileEntity;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(
		modid = "simpleoregrinder",
		name = "Simple Ore Grinder",
		version = "1.0",
		dependencies = "after:wootzpigngray")
public class SimpleOreGrinder {

	@SidedProxy(clientSide = "theoldone822.SimpleOreGrinder.ProxyClient", serverSide = "theoldone822.SimpleOreGrinder.ProxyCommon")	
	public static ProxyCommon proxy;
	
    public static Block grinder;
    public static Block grinderOn;
    public static Block grinder2;
    public static Block grinderOn2;
    public static Block grinder3;
    public static Block grinderOn3;
    public static Block grinder4;
    public static Block grinderOn4;
    public static Block grinder5;
    public static Block grinderOn5;

    @Instance("simpleoregrinder")
	public static SimpleOreGrinder instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		grinder = new Grinder(false).setHardness(1).setResistance(1).setBlockName("grinder");
		grinderOn = new Grinder(true).setHardness(1).setResistance(1).setLightLevel(1).setBlockName("grinderOn");
		grinder2 = new Grinder2(false).setHardness(1).setResistance(1).setBlockName("grinder2");
		grinderOn2 = new Grinder2(true).setHardness(1).setResistance(1).setLightLevel(1).setBlockName("grinderOn2");
		grinder3 = new Grinder3(false).setHardness(1).setResistance(1).setBlockName("grinder3");
		grinderOn3 = new Grinder3(true).setHardness(1).setResistance(1).setLightLevel(1).setBlockName("grinderOn3");
		grinder4 = new Grinder4(false).setHardness(1).setResistance(1).setBlockName("grinder4");
		grinderOn4 = new Grinder4(true).setHardness(1).setResistance(1).setLightLevel(1).setBlockName("grinderOn4");
		grinder5 = new Grinder5(false).setHardness(1).setResistance(1).setBlockName("grinder5");
		grinderOn5 = new Grinder5(true).setHardness(1).setResistance(1).setLightLevel(1).setBlockName("grinderOn5");

		GameRegistry.registerBlock(grinder, "grinder");
		GameRegistry.registerBlock(grinderOn, "grinderOn");
		GameRegistry.registerBlock(grinder2, "grinder2");
		GameRegistry.registerBlock(grinderOn2, "grinderOn2");
		GameRegistry.registerBlock(grinder3, "grinder3");
		GameRegistry.registerBlock(grinderOn3, "grinderOn3");
		GameRegistry.registerBlock(grinder4, "grinder4");
		GameRegistry.registerBlock(grinderOn4, "grinderOn4");
		GameRegistry.registerBlock(grinder5, "grinder5");
		GameRegistry.registerBlock(grinderOn5, "grinderOn5");

		LanguageRegistry.addName(grinder, "Stone Grinder");
		LanguageRegistry.addName(grinderOn, "Stone Grinder");
		LanguageRegistry.addName(grinder2, "Copper Grinder");
		LanguageRegistry.addName(grinderOn2, "Copper Grinder");
		LanguageRegistry.addName(grinder3, "Iron Grinder");
		LanguageRegistry.addName(grinderOn3, "Iron Grinder");
		LanguageRegistry.addName(grinder4, "Mythril Grinder");
		LanguageRegistry.addName(grinderOn4, "Mythril Grinder");
		LanguageRegistry.addName(grinder5, "Adamantium Grinder");
		LanguageRegistry.addName(grinderOn5, "Adamantium Grinder");

        OreGrinderRecipes.addGrinding(Item.getItemFromBlock(Blocks.cobblestone), 0, new ItemStack(Blocks.gravel));
        OreGrinderRecipes.addGrinding(Item.getItemFromBlock(Blocks.stone), 0, new ItemStack(Blocks.gravel));
        OreGrinderRecipes.addGrinding(Item.getItemFromBlock(Blocks.netherrack), 0, new ItemStack(Blocks.soul_sand));
        OreGrinderRecipes.addGrinding(Item.getItemFromBlock(Blocks.glowstone), 0, new ItemStack(Items.glowstone_dust, 4));
        OreGrinderRecipes.addGrinding(Item.getItemFromBlock(Blocks.gravel), 0, new ItemStack(Blocks.sand));
        OreGrinderRecipes.addGrinding(Item.getItemFromBlock(Blocks.sandstone), 0, new ItemStack(Blocks.sand, 4));
	
		if (Loader.isModLoaded("wootzpigngray")) {
	        OreGrinderRecipes.addGrinding(theoldone822.WootzPignGray.Content.grayIngot, 0, new ItemStack(theoldone822.WootzPignGray.Content.graphite));
		}

	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		instance = this;
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
		GameRegistry.registerTileEntity(GrinderTileEntity.class, "simpleoregrinder");

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder), "CSC", "SFS", "CSC", 'C', "cobblestone", 'S', "stickWood", 'F', Blocks.furnace));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder2), "XXX", "XOX", "XXX", 'X', "ingotCopper", 'O', new ItemStack(grinder)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder3), "XXX", "XOX", "XXX", 'X', "ingotIron", 'O', new ItemStack(grinder)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder3), "XXX", "XOX", "XXX", 'X', "ingotIron", 'O', new ItemStack(grinder2)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder4), "XXX", "XOX", "XXX", 'X', "ingotMythril", 'O', new ItemStack(grinder)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder4), "XXX", "XOX", "XXX", 'X', "ingotMythril", 'O', new ItemStack(grinder2)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder4), "XXX", "XOX", "XXX", 'X', "ingotMythril", 'O', new ItemStack(grinder3)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder5), "XXX", "XOX", "XXX", 'X', "ingotAdamantium", 'O', new ItemStack(grinder)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder5), "XXX", "XOX", "XXX", 'X', "ingotAdamantium", 'O', new ItemStack(grinder2)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder5), "XXX", "XOX", "XXX", 'X', "ingotAdamantium", 'O', new ItemStack(grinder3)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder5), "XXX", "XOX", "XXX", 'X', "ingotAdamantium", 'O', new ItemStack(grinder4)));
}}