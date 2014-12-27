package akkamaddi.FusionMonsterEggs;

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
import alexndr.plugins.Fusion.FusionFurnaceRecipes;

@Mod(modid = "spawneggfusion", name = "Fusion recipes for spawn eggs of common mobs", version = "2.0.0", dependencies = "required-after:fusion")

public class FusionEggsCore
{
    // The instance of your mod that Forge uses.
    @Instance("spawneggfusion")
    public static FusionEggsCore instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "akkamaddi.FusionMonsterEggs.ClientProxy", serverSide = "akkamaddi.FusionMonsterEggs.CommonProxy")
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
        // The Eggs
        // the bad
        // creeper
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.egg), new ItemStack(Items.gunpowder), new ItemStack(Items.dye, 1, 10), new ItemStack(Items.spawn_egg, 1, 50), 1.0F);
        // skeleton
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.egg), new ItemStack(Items.bone), new ItemStack(Items.dye, 1, 15), new ItemStack(Items.spawn_egg, 1, 51), 1.0F);
        // spider
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.egg), new ItemStack(Items.spider_eye), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.spawn_egg, 1, 52), 1.0F);
        // cave spider
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.egg), new ItemStack(Blocks.web), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.spawn_egg, 1, 59), 1.0F);
        // zombie
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.egg), new ItemStack(Items.rotten_flesh), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.spawn_egg, 1, 54), 1.0F);
        // slime
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.egg), new ItemStack(Items.slime_ball), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.spawn_egg, 1, 55), 1.0F);
        // the good
        // sheep
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.egg), new ItemStack(Blocks.wool, 1, WILDCARD_VALUE), new ItemStack(Items.dye, 1, 7), new ItemStack(Items.spawn_egg, 1, 91), 1.0F);
        // pig
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.egg), new ItemStack(Items.porkchop), new ItemStack(Items.dye, 1, 9), new ItemStack(Items.spawn_egg, 1, 90), 1.0F);
        // cow
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.egg), new ItemStack(Items.beef), new ItemStack(Items.dye, 1, 3), new ItemStack(Items.spawn_egg, 1, 92), 1.0F);
        // horse
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.egg), new ItemStack(Blocks.hay_block), new ItemStack(Items.dye, 1, 3), new ItemStack(Items.spawn_egg, 1, 100), 1.0F);
        // chicken
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.egg), new ItemStack(Items.feather), new ItemStack(Items.dye, 1, 15), new ItemStack(Items.spawn_egg, 1, 93), 1.0F);
        // the neutral
        // wolf
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.egg), new ItemStack(Items.bone), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.spawn_egg, 1, 95), 1.0F);
        // ocelot
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.egg), new ItemStack(Items.fish), new ItemStack(Items.dye, 1, 11), new ItemStack(Items.spawn_egg, 1, 98), 1.0F);
        // squid
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.egg), new ItemStack(Items.fish), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.spawn_egg, 1, 94), 1.0F);
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}
