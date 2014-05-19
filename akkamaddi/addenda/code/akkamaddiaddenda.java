package akkamaddi.addenda.code;

import java.io.File;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = "akkamaddiAddenda", name = "akkamaddi's Addenda", version = "1.0.1", dependencies = "required-after:simpleores ; required-after:fusionplugin")
public class akkamaddiaddenda
{
    // The instance of your mod that Forge uses.
    @Instance("akkamaddiAddenda")
    public static akkamaddiaddenda instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "akkamaddi.addenda.code.ClientProxy", serverSide = "akkamaddi.addenda.code.CommonProxy")
    public static CommonProxy proxy;
    

    // config
    public static Configuration config;


    public static boolean enableRecycling;
    public static boolean enableSimpleOresMobEquips;
    public static boolean enableFusionAlloyMobEquips;
    public static boolean enableChestGenSO;
    public static boolean enableChestGenFF;
    public static boolean enableHigherDimensionGen;

    //Higher Dimensions
    public static int[] dimensionIDsArray;


    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        File installDir = event.getModConfigurationDirectory();
        File configDir = new File(installDir, "akkamaddi");
        File configFile = new File(configDir, "akkamaddi_addenda.cfg");
        config = new Configuration(configFile);
        config.load();
        enableRecycling = config.get("1. Enable Simple Fusion Recycling recipes for Simple Ores, Fusion Furnace, and Minecraft materials", "Enable Recycling, false or true", false).getBoolean(false);
        enableSimpleOresMobEquips = config.get("2. Enable Simple Ores material equips on mobs", "SO mob equips, false or true", false).getBoolean(false);
        enableFusionAlloyMobEquips = config.get("3. Enable Fusion Furnace material equips on mobs", "FF mob equips, false or true", false).getBoolean(false);
        enableChestGenSO = config.get("4. Enable chest loot generation for SO material items", "SO chest gen, false or true", false).getBoolean(false);
        enableChestGenFF = config.get("5. Enable chest loot generation for FF material items", "FF chest gen, false or true", false).getBoolean(false);
        
        config.save();

        if (akkamaddiaddenda.enableChestGenSO)
        {
            SOChestGen.doSOChestGen();
        }

        if (akkamaddiaddenda.enableChestGenFF)
        {
            FFChestGen.doFFChestGen();
        }
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();

        if (akkamaddiaddenda.enableFusionAlloyMobEquips)
        {
            MinecraftForge.EVENT_BUS.register(new JoinWorldFF());
        }

        if (akkamaddiaddenda.enableSimpleOresMobEquips)
        {
            MinecraftForge.EVENT_BUS.register(new JoinWorldSO());
        }

        if (akkamaddiaddenda.enableRecycling)
        {
            RecycleRecipes.doRecycleRecipes();
        }
        
        
    }
}