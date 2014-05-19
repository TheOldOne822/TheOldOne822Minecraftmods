package akkamaddi.simpleclay.code;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import alexndr.SimpleOres.plugins.fusion.FusionHelper;

@Mod(modid = "ClayFusion", name = "Clay and Cobblestone Fusion Recipes", version = "1.1.0", dependencies = "required-after:fusionplugin")
public class SimpleClay
{
    // The instance of your mod that Forge uses.
    @Instance("ClayFusion")
    public static SimpleClay instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "akkamaddi.simpleclay.code.ClientProxy", serverSide = "akkamaddi.simpleclay.code.CommonProxy")
    public static CommonProxy proxy;

    // wildcard
    private static final int WILDCARD_VALUE = OreDictionary.WILDCARD_VALUE;

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        // Stub Method
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();
        // Fusion Clay Recipes
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.dirt), new ItemStack(Blocks.dirt), new ItemStack(Items.clay_ball), new ItemStack(Items.clay_ball, 2, 0), 0.1F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.grass), new ItemStack(Blocks.dirt), new ItemStack(Items.clay_ball), new ItemStack(Items.clay_ball, 2, 0), 0.1F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.grass), new ItemStack(Blocks.grass), new ItemStack(Items.clay_ball), new ItemStack(Items.clay_ball, 2, 0), 0.1F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.brick_block), new ItemStack(Blocks.brick_block), new ItemStack(Items.clay_ball), new ItemStack(Blocks.clay), 0.2F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.hardened_clay), new ItemStack(Blocks.brick_block), new ItemStack(Items.clay_ball), new ItemStack(Blocks.clay), 0.2F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.hardened_clay), new ItemStack(Blocks.hardened_clay), new ItemStack(Items.clay_ball), new ItemStack(Blocks.clay), 0.2F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.stained_hardened_clay, 1, WILDCARD_VALUE), new ItemStack(Blocks.hardened_clay), new ItemStack(Items.clay_ball), new ItemStack(Blocks.clay), 0.2F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.stained_hardened_clay, 1, WILDCARD_VALUE), new ItemStack(Blocks.brick_block), new ItemStack(Items.clay_ball), new ItemStack(Blocks.clay), 0.2F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.stained_hardened_clay, 1, WILDCARD_VALUE), new ItemStack(Blocks.stained_hardened_clay, 1, WILDCARD_VALUE), new ItemStack(Items.clay_ball), new ItemStack(Blocks.clay), 0.2F);
        // from Clay
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.gravel), new ItemStack(Blocks.gravel), new ItemStack(Items.clay_ball), new ItemStack(Blocks.cobblestone), 0.1F);
        // Gratuitous
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.vine), new ItemStack(Items.dye, 1, 15), new ItemStack(Blocks.mossy_cobblestone), 0.3F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.stone), new ItemStack(Blocks.vine), new ItemStack(Items.dye, 1, 15), new ItemStack(Blocks.stone, 1, 1), 0.3F);
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}