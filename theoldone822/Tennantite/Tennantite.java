package theoldone822.Tennantite;

import alexndr.SimpleOres.api.content.SimpleOre;
import alexndr.SimpleOres.plugins.fusion.FusionRecipes;
import akkamaddi.arsenic.code.ArsenicAndLace;
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

@Mod(modid = "Tennantite", name = "Tennantite ore for Simple Arsenic, and Old Lace", version = "2.0", dependencies = "required-after:simpleores; required-after:SimpleArsenic")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Tennantite {

	@Instance("tennantite")
    public static Tennantite instance;

    public static int oreTennantiteID;
    public static Configuration config;

    public static Block oreTennantite;
    
    public static int tennantiteSpawnRate;
    public static int tennantiteVeinSize;
    public static int tennantiteSpawnHeight;
    public static int tennantiteMinSpawnHeight;
    
    public static boolean enableRecyclingOres;
    public static boolean enableRecycling;

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        oreTennantiteID = config.getBlock("Tennantite Ore", "Tennantite Ore", 3999).getInt();
        tennantiteSpawnRate = config.get("Tennantite Ore", "Tennantite Spawn Rate", 7).getInt();
        tennantiteVeinSize = config.get("Tennantite Ore", "Tennantite Vein Size", 6).getInt();
        tennantiteSpawnHeight = config.get("Tennantite Ore", "Tennantite Maximum Spawn Height", 38).getInt();
        tennantiteMinSpawnHeight = config.get("Tennantite Ore", "Tennantite Minimum Spawn Height", 0).getInt();

        enableRecyclingOres= config.get("Recycling", "Enable Arsenide Bronze item recycling into Tennantite recipes: false or true?", false).getBoolean(false);
        enableRecycling= config.get("Recycling", "Enable other Simple Arsenic item recycling into large chunks recipes: false or true?", false).getBoolean(false);
        config.addCustomCategoryComment("Recycling", "Recycling must be off in Simple Arsenic, and Old Lace config");

        config.save();

        oreTennantite = new SimpleOre(oreTennantiteID, Material.iron).modId("Tennantite").setHardness(4.0F).setResistance(10.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("oreTennantite");
        
        OreDictionary.registerOre("oreTennantite", new ItemStack(oreTennantite));
        GameRegistry.addSmelting(oreTennantite.blockID, new ItemStack(ArsenicAndLace.arsenideBronzeIngot), 0.8F);

        if (!ArsenicAndLace.enableRecycling) {
            if (enableRecyclingOres) {
            // Arsenide Bronze
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideBronzeHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenideBronzeChunkItem), 10.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideBronzeChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.rottenFlesh, 2, 0), new ItemStack(ArsenicAndLace.largeArsenideBronzeChunkItem, 2, 0), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideBronzeLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.rottenFlesh, 2, 0), new ItemStack(ArsenicAndLace.largeArsenideBronzeChunkItem, 2, 0), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideBronzeBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenideBronzeChunkItem), 10.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideBronzeSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenideBronzeChunkItem), 10.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideBronzeShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenideBronzeChunkItem), 10.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideBronzePickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenideBronzeChunkItem), 10.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideBronzeAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenideBronzeChunkItem), 10.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideBronzeHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenideBronzeChunkItem), 10.0F);
            }
            if (enableRecycling) {
            // Arsenic tools
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenicSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenicChunkItem), 10.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenicShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenicChunkItem), 10.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenicPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenicChunkItem), 10.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenicAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenicChunkItem), 10.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenicHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenicChunkItem), 10.0F);
            // other Arsenic
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.plateArsenic), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenicChunkItem), 10.0F);
            // Arsenide Gold
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideGoldHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenideGoldChunkItem), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideGoldChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.rottenFlesh, 2, 0), new ItemStack(ArsenicAndLace.largeArsenideGoldChunkItem, 2, 0), 30.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideGoldLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.rottenFlesh, 2, 0), new ItemStack(ArsenicAndLace.largeArsenideGoldChunkItem, 2, 0), 30.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideGoldBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenideGoldChunkItem), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideGoldSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenideGoldChunkItem), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideGoldShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenideGoldChunkItem), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideGoldPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenideGoldChunkItem), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideGoldAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenideGoldChunkItem), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.arsenideGoldHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeArsenideGoldChunkItem), 15.0F);
            // Tenebrium
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.tenebriumHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.netherQuartz), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeTenebriumChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.tenebriumChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.netherQuartz, 2, 0), new ItemStack(Item.rottenFlesh, 2, 0), new ItemStack(ArsenicAndLace.largeTenebriumChunkItem, 2, 0), 40.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.tenebriumLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.netherQuartz, 2, 0), new ItemStack(Item.rottenFlesh, 2, 0), new ItemStack(ArsenicAndLace.largeTenebriumChunkItem, 2, 0), 40.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.tenebriumBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.netherQuartz), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeTenebriumChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.tenebriumSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.netherQuartz), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeTenebriumChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.tenebriumShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.netherQuartz), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeTenebriumChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.tenebriumPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.netherQuartz), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeTenebriumChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.tenebriumAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.netherQuartz), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeTenebriumChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.tenebriumHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.netherQuartz), new ItemStack(Item.rottenFlesh), new ItemStack(ArsenicAndLace.largeTenebriumChunkItem), 20.0F);
            // Shrouds
            FusionRecipes.smelting().addSmelting(new ItemStack(ArsenicAndLace.oldLaceChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.oreCoal), 15.0F);
            }
        }
    
    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	GameRegistry.registerWorldGenerator(new TennantiteGenerator());

    	LanguageRegistry.addName(oreTennantite, "Tennantite Ore");
    	MinecraftForge.setBlockHarvestLevel(oreTennantite, "pickaxe", 1);

    }

}
