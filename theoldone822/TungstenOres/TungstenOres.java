package theoldone822.TungstenOres;

import alexndr.SimpleOres.api.content.SimpleOre;
import alexndr.SimpleOres.plugins.fusion.FusionRecipes;
import akkamaddi.simpletungsten.code.SimpleTungstenCore;
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

@Mod(modid = "TungstenOres", name = "Natural alloys ore for Simple Tungsten", version = "1.0", dependencies = "required-after:simpleores; required-after:simpletungsten")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class TungstenOres {

	@Instance("tungstenores")
    public static TungstenOres instance;

    public static int oreWolframiteID;
    public static Configuration config;

    public static Block oreWolframite;
    
    public static int wolframiteSpawnRate;
    public static int wolframiteVeinSize;
    public static int wolframiteSpawnHeight;
    public static int wolframiteMinSpawnHeight;
    
    public static boolean enableRecyclingOres;
    public static boolean enableRecycling;

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        oreWolframiteID = config.getBlock("Wolframite Ore", "Wolframite Ore", 3992).getInt();
        wolframiteSpawnRate = config.get("Wolframite Ore", "Wolframite Spawn Rate", 5).getInt();
        wolframiteVeinSize = config.get("Wolframite Ore", "Wolframite Vein Size", 4).getInt();
        wolframiteSpawnHeight = config.get("Wolframite Ore", "Wolframite Maximum Spawn Height", 16).getInt();
        wolframiteMinSpawnHeight = config.get("Wolframite Ore", "Wolframite Minimum Spawn Height", 0).getInt();

        enableRecyclingOres= config.get("Recycling", "Enable Tungsten-Steel item recycling into Tungsten-Wolframite ore recipes: false or true?", false).getBoolean(false);
        enableRecycling= config.get("Recycling", "Enable other Simple Tungsten item recycling into large chunks recipes: false or true?", false).getBoolean(false);
        config.addCustomCategoryComment("Recycling", "Recycling must be off in Simple Tungsten config");

        config.save();

        oreWolframite = new SimpleOre(oreWolframiteID, Material.iron).modId("TungstenOres").setHardness(4.0F).setResistance(10.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("oreWolframite");
        
        OreDictionary.registerOre("oreWolframite", new ItemStack(oreWolframite));
        GameRegistry.addSmelting(oreWolframite.blockID, new ItemStack(SimpleTungstenCore.tungstenSteelIngot), 0.8F);

        if (!SimpleTungstenCore.enableRecycling) {
            if (enableRecyclingOres) {
              	 // Tungsten
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten), 10.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten, 2, 0), 20.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten, 2, 0), 20.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten), 10.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten), 10.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten), 10.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten), 10.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten), 10.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten), 10.0F);

                // Tungsten Steel
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(oreWolframite), 15.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(oreWolframite, 2, 0), 30.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(oreWolframite, 2, 0), 30.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(oreWolframite), 15.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(oreWolframite), 15.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(oreWolframite), 15.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(oreWolframite), 15.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(oreWolframite), 15.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(oreWolframite), 15.0F);
            }
            if (enableRecycling) {
              	 // Tungsten Carbide
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbideHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem), 15.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbideChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem, 2, 0), 30.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbideLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem, 2, 0), 30.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbideBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem), 15.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbideSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem), 15.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbideShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem), 15.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbidePickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem), 15.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbideAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem), 15.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbideHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem), 15.0F);
     		
            	 // Valfram
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem, 2, 0), 40.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem, 2, 0), 40.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
          		
            	 // Prasinos
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem), 25.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem, 2, 0), 50.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem, 2, 0), 50.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem), 25.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem), 25.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem), 25.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem), 25.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem), 25.0F);
                FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem), 25.0F);
            }
        }
    
    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	GameRegistry.registerWorldGenerator(new TungstenOresGenerator());

    	LanguageRegistry.addName(oreWolframite, "Wolframite Ore");
    	MinecraftForge.setBlockHarvestLevel(oreWolframite, "pickaxe", 2);

    }


}
