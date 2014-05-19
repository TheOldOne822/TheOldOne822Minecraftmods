package akkamaddi.recycleyoursilver.code;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import com.google.common.base.Optional;

import net.minecraft.creativetab.CreativeTabs;
import zotmc.onlysilver.api.OnlySilverAPI;
import alexndr.SimpleOres.plugins.fusion.FusionHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = "SilverRecycle", name = "Recycle Your Silver Recipes", version = "1.2.0",  dependencies = "required-after:onlysilver; required-after:fusionplugin")

// dependencies = "required-after:onlysilver" --This is for soft dependencies.

public class SilverFusionRecycle
{
    // The instance of your mod that Forge uses.
    @Instance("SilverRecycle")
    public static SilverFusionRecycle instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "akkamaddi.recycleyoursilver.code.ClientProxy", serverSide = "akkamaddi.recycleyoursilver.code.CommonProxy")
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
        // Primary: helmet, chest, leggings, boots, sword, shovel, pickaxe, axe, hoe, ?horsearmor?, ?bow?
        // Secondary: Item.alpha, Block.alpha,
        // recycle your Silver
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(OnlySilverAPI.silverHelm.get(), 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(OnlySilverAPI.silverChest.get(), 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get(), 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(OnlySilverAPI.silverLegs.get(), 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get(), 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(OnlySilverAPI.silverBoots.get(), 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(OnlySilverAPI.silverSword.get(), 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(OnlySilverAPI.silverShovel.get(), 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(OnlySilverAPI.silverPick.get(), 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(OnlySilverAPI.silverAxe.get(), 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(OnlySilverAPI.silverHoe.get(), 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(OnlySilverAPI.silverBow.get(), 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
        // extra Silver recycling
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(OnlySilverAPI.silverRod.get(), 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}
