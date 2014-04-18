package theoldone822.Glaucodot;

import alexndr.SimpleOres.api.content.SimpleOre;
import alexndr.SimpleOres.plugins.fusion.FusionRecipes;
import akkamaddi.simplecobalt.code.SimpleCobaltCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Glaucodot", name = "Glaucodot ore for Simple Cobolt", version = "1.0", dependencies = "required-after:simpleores; required-after:simplecobalt")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Glaucodot {
	@Instance("glaucodot")
    public static Glaucodot instance;

    public static int oreGlaucodotID;
    public static Configuration config;

    public static Block oreGlaucodot;
    
    public static int glaucodotSpawnRate;
    public static int glaucodotVeinSize;
    public static int glaucodotSpawnHeight;
    public static int glaucodotMinSpawnHeight;
    
    public static boolean enableRecyclingOres;
    public static boolean enableRecycling;

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        oreGlaucodotID = config.getBlock("Glaucodot Ore", "Glaucodot Ore", 3997).getInt();
        glaucodotSpawnRate = config.get("Glaucodot Ore", "Glaucodot Spawn Rate", 5).getInt();
        glaucodotVeinSize = config.get("Glaucodot Ore", "Glaucodot Vein Size", 6).getInt();
        glaucodotSpawnHeight = config.get("Glaucodot Ore", "Glaucodot Maximum Spawn Height", 24).getInt();
        glaucodotMinSpawnHeight = config.get("Glaucodot Ore", "Glaucodot Minimum Spawn Height", 0).getInt();

        enableRecyclingOres= config.get("Recycling", "Enable Cobalt-Blue Drift Steel item recycling into Cobalt-Glaucodot ore recipes: false or true?", false).getBoolean(false);
        enableRecycling= config.get("Recycling", "Enable other Simple Cobolt item recycling into large chunks recipes: false or true?", false).getBoolean(false);
        config.addCustomCategoryComment("Recycling", "Recycling must be off in Simple Cobolt config");

        config.save();

        oreGlaucodot = new SimpleOre(oreGlaucodotID, Material.iron).modId("Glaucodot").setHardness(4.0F).setResistance(10.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("oreGlaucodot");
        
        OreDictionary.registerOre("oreGlaucodot", new ItemStack(oreGlaucodot));
        OreDictionary.registerOre("oreBlueDriftSteel", new ItemStack(oreGlaucodot));
        GameRegistry.addSmelting(oreGlaucodot.blockID, new ItemStack(SimpleCobaltCore.blueDriftSteelIngot), 0.8F);

        if (!SimpleCobaltCore.enableRecycling) {
            if (enableRecyclingOres) {
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.cobaltHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleCobaltCore.oreCobalt), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.cobaltChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleCobaltCore.oreCobalt, 2, 0), 30.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.cobaltLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleCobaltCore.oreCobalt, 2, 0), 30.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.cobaltBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleCobaltCore.oreCobalt), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.cobaltSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleCobaltCore.oreCobalt), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.cobaltShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleCobaltCore.oreCobalt), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.cobaltPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleCobaltCore.oreCobalt), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.cobaltAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleCobaltCore.oreCobalt), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.cobaltHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleCobaltCore.oreCobalt), 15.0F);
            
            // Blue Drift Steel
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueDriftSteelHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(oreGlaucodot), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueDriftSteelChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(oreGlaucodot, 2, 0), 30.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueDriftSteelLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(oreGlaucodot, 2, 0), 30.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueDriftSteelBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(oreGlaucodot), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueDriftSteelSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(oreGlaucodot), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueDriftSteelShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(oreGlaucodot), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueDriftSteelPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(oreGlaucodot), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueDriftSteelAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(oreGlaucodot), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueDriftSteelHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(oreGlaucodot), 15.0F);
            }
            if (enableRecycling) {
            // Blue Celadon
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueCeladonHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeBlueCeladonChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueCeladonChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeBlueCeladonChunkItem, 2, 0), 40.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueCeladonLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeBlueCeladonChunkItem, 2, 0), 40.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueCeladonBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeBlueCeladonChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueCeladonSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeBlueCeladonChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueCeladonShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeBlueCeladonChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueCeladonPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeBlueCeladonChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueCeladonAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeBlueCeladonChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.blueCeladonHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeBlueCeladonChunkItem), 20.0F);
            
            // Green Celadon
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.greenCeladonHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeGreenCeladonChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.greenCeladonChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeGreenCeladonChunkItem, 2, 0), 40.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.greenCeladonLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeGreenCeladonChunkItem, 2, 0), 40.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.greenCeladonBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeGreenCeladonChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.greenCeladonSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeGreenCeladonChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.greenCeladonShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeGreenCeladonChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.greenCeladonPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeGreenCeladonChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.greenCeladonAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeGreenCeladonChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(SimpleCobaltCore.greenCeladonHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleCobaltCore.largeGreenCeladonChunkItem), 20.0F);
            }
        }
    
    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	GameRegistry.registerWorldGenerator(new GlaucodotGenerator());

    	LanguageRegistry.addName(oreGlaucodot, "Glaucodot Ore");
    	MinecraftForge.setBlockHarvestLevel(oreGlaucodot, "pickaxe", 2);

    }


}
