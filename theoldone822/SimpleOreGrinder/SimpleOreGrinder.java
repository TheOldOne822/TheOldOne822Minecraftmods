package theoldone822.SimpleOreGrinder;

import java.io.File;



import theoldone822.SimpleOreGrinder.Grinder.Grinder;
import theoldone822.SimpleOreGrinder.Grinder.GrinderRecipes;
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

    @Instance("simpleoregrinder")
	public static SimpleOreGrinder instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		grinder = new Grinder(false).setHardness(1).setResistance(1).setBlockName("grinder");
		grinderOn = new Grinder(true).setHardness(1).setResistance(1).setLightLevel(1).setBlockName("grinderOn");

		GameRegistry.registerBlock(grinder, "grinder");
		GameRegistry.registerBlock(grinderOn, "grinderOn");

		LanguageRegistry.addName(grinder, "Grinder");
		LanguageRegistry.addName(grinderOn, "Grinder");

        GrinderRecipes.addGrinding(Item.getItemFromBlock(Blocks.cobblestone), 0, new ItemStack(Blocks.gravel));
        GrinderRecipes.addGrinding(Item.getItemFromBlock(Blocks.stone), 0, new ItemStack(Blocks.gravel));
        GrinderRecipes.addGrinding(Item.getItemFromBlock(Blocks.netherrack), 0, new ItemStack(Blocks.soul_sand));
        GrinderRecipes.addGrinding(Item.getItemFromBlock(Blocks.glowstone), 0, new ItemStack(Items.glowstone_dust, 4));
        GrinderRecipes.addGrinding(Item.getItemFromBlock(Blocks.gravel), 0, new ItemStack(Blocks.sand));
        GrinderRecipes.addGrinding(Item.getItemFromBlock(Blocks.sandstone), 0, new ItemStack(Blocks.sand, 4));
	
		if (Loader.isModLoaded("wootzpigngray")) {
	        GrinderRecipes.addGrinding(theoldone822.WootzPignGray.Content.grayIngot, 0, new ItemStack(theoldone822.WootzPignGray.Content.graphite));
		}

	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		instance = this;
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
		GameRegistry.registerTileEntity(GrinderTileEntity.class, "grinder");
//		GameRegistry.registerTileEntity(Grinder2TileEntity.class, "grinder");
//		GameRegistry.registerTileEntity(Grinder3TileEntity.class, "grinder");
//		GameRegistry.registerTileEntity(Grinder4TileEntity.class, "grinder");
//		GameRegistry.registerTileEntity(Grinder5TileEntity.class, "grinder");

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder, 1, 0), "CSC", "SFS", "CSC", 'C', "cobblestone", 'S', "stickWood", 'F', Blocks.furnace));
//        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder, 1, 1), "XXX", "XOX", "XXX", 'X', "ingotCopper", 'O', new ItemStack(grinder, 1, 0)));
//        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder, 1, 2), "XXX", "XOX", "XXX", 'X', "ingotIron", 'O', new ItemStack(grinder, 1, 1)));
//        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder, 1, 2), "XXX", "XOX", "XXX", 'X', "ingotIron", 'O', new ItemStack(grinder, 1, 0)));
//        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder, 1, 3), "XXX", "XOX", "XXX", 'X', "ingotMythril", 'O', new ItemStack(grinder, 1, 2)));
//        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder, 1, 3), "XXX", "XOX", "XXX", 'X', "ingotMythril", 'O', new ItemStack(grinder, 1, 1)));
//        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder, 1, 3), "XXX", "XOX", "XXX", 'X', "ingotMythril", 'O', new ItemStack(grinder, 1, 0)));
//        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(grinder, 1, 4), "XXX", "XOX", "XXX", 'X', "ingotAdamantium", 'O', new ItemStack(grinder, 1, OreDictionary.WILDCARD_VALUE)));
}}