package theoldone822.Tennantite;

import alexndr.SimpleOres.api.content.SimpleOre;
import akkamaddi.arsenic.code.ArsenicAndLace;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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

    public static int[] dimensionIDsArray;

    public static int oreTennantiteID;
    public static Configuration config;

    public static Block oreTennantite;
    
    public static int tennantiteSpawnRate;
    public static int tennantiteVeinSize;
    public static int tennantiteSpawnHeight;
    public static int tennantiteMinSpawnHeight;
    
    public static boolean enableHigherDimensionGen;
    
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

        enableHigherDimensionGen = config.get("Higher World Gen", "Spawn Tennantite in higher dimensions? (Advanced)", false).getBoolean(enableHigherDimensionGen);
        
        if (enableHigherDimensionGen)
        {
            dimensionIDsArray = config.get("Higher Dimensions", "Higher Dimensions ID List", new int[] {}).getIntList();
            System.out.println("Number of dimension ID's in the array = " + dimensionIDsArray.length);

            try
            {
                for (int i = 0; i < dimensionIDsArray.length; i++)
                {
                    config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Tennantite Spawn Rate", 16).getInt();
                    config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Tennantite Maximum Spawn Height", 48).getInt();
                    config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Tennantite Minimum Spawn Height", 0).getInt();
                    config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Tennantite Vein Size", 6).getInt();
                    System.out.println("Dimension ID in position " + i + " is " + dimensionIDsArray[i]);
                }
            }
            catch (Exception e)
            {
            }
        }
        else
            dimensionIDsArray = new int[] {};

        config.save();

        oreTennantite = new SimpleOre(oreTennantiteID, Material.iron).modId("Tennantite").setHardness(4.0F).setResistance(10.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("oreTennantite");
        
        OreDictionary.registerOre("oreTennantite", new ItemStack(oreTennantite));
        GameRegistry.addSmelting(oreTennantite.blockID, new ItemStack(ArsenicAndLace.arsenideBronzeIngot), 0.8F);
        }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	GameRegistry.registerWorldGenerator(new TennantiteGenerator());

    	LanguageRegistry.addName(oreTennantite, "Tennantite Ore");
    	MinecraftForge.setBlockHarvestLevel(oreTennantite, "pickaxe", 1);

    }

}
