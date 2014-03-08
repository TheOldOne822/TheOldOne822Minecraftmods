package theoldone822.classicalalchemyores;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.FMLLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.event.ForgeSubscribe;
import alexndr.SimpleOres.api.content.SimpleOre;
import alexndr.SimpleOres.api.content.SimpleTab;
import alexndr.SimpleOres.api.helpers.LootHelper;

@Mod(modid = "classicalalchemyores", name = "Classical Alchemy Ores", version = "1.0", dependencies = "required-after:simpleores ; required-after:classicalalchemy")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class ClassicalAlchemyOresCore
{
    // The instance of your mod that Forge uses.
    @Instance("classicalalchemyores")
    public static ClassicalAlchemyOresCore instance;

    // set item ID, to-from config file

    public static int borniteOreID;
    public static int cassiteriteOreID;

    // set actual item names

    public static Block borniteOre;
    public static Block cassiteriteOre;

    // spawning
    public static int borniteSpawnRate;
    public static int borniteVeinSize;
    public static int borniteSpawnMaxHeight;
    public static int borniteSpawnMinHeight;
	
    public static int cassiteriteSpawnRate;
    public static int cassiteriteVeinSize;
    public static int cassiteriteSpawnMaxHeight;
    public static int cassiteriteSpawnMinHeight;
    
    
    // tab
    public static SimpleTab tabClassicalAlchemyOres = new SimpleTab("tabClassicalAlchemyOres");
    
    public static boolean enableRecyclingOres;
    public static boolean enableRecycling;

// Tab
    public void setTabIcons()
    {
        /**
         * Creating the custom tabs using the API class "SimpleTab" and setting their icon.
         */
        tabClassicalAlchemyOres.setIcon(new ItemStack(ClassicalAlchemyOresCore.borniteOre));
    }

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        
        
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        
    	config.load();
        
    	// Blocks
        borniteOreID = config.getBlock("Bornite Ore", "Ore Block", 1230).getInt();
        cassiteriteOreID = config.getBlock("Cassiterite Ore", "Ore Block", 1231).getInt();
        
        //Adjustable Ore Spawn Rates
        borniteSpawnRate = config.get("Bornite Spawn", "Bornite Spawn Rate", 5).getInt();
        borniteVeinSize = config.get("Bornite Spawn", "Bornite Vein Size", 4).getInt();
        borniteSpawnMaxHeight = config.get("Bornite Spawn", "Bornite Spawn Maximum Height", 16).getInt();
        borniteSpawnMinHeight = config.get("Bornite Spawn", "Bornite Spawn Minimum Height", 4).getInt();
        
        cassiteriteSpawnRate = config.get("Cassiterite Spawn", "Cassiterite Spawn Rate", 5).getInt();
        cassiteriteVeinSize = config.get("Cassiterite Spawn", "Cassiterite Vein Size", 4).getInt();
        cassiteriteSpawnMaxHeight = config.get("Cassiterite Spawn", "Cassiterite Spawn Maximum Height", 14).getInt();
        cassiteriteSpawnMinHeight = config.get("Cassiterite Spawn", "Cassiterite Spawn Minimum Height", 2).getInt();
		
        enableRecyclingOres= config.get("Recycling", "Enable Classical Alchemy item recycling into ores recipes: false or true?", false).getBoolean(false);
        enableRecycling= config.get("Recycling", "Enable other Classical Alchemy item recycling into large chunks recipes: false or true?", false).getBoolean(false);
        
        config.addCustomCategoryComment("Recycling", "Recycling must be off in Classical Alchemy config");

        config.save();
        
        // define blocks        
        borniteOre = new SimpleOre(borniteOreID, Material.rock).modId("classicalalchemyores")
        .setHardness(12.0F).setResistance(12.0F).setStepSound(Block.soundStoneFootstep)
        .setCreativeTab(tabClassicalAlchemyOres).setUnlocalizedName("borniteOre");
        
        cassiteriteOre = new SimpleOre(cassiteriteOreID, Material.rock).modId("classicalalchemyores")
        .setHardness(14.0F).setResistance(14.0F).setStepSound(Block.soundStoneFootstep)
        .setCreativeTab(tabClassicalAlchemyOres).setUnlocalizedName("cassiteriteOre");
        
        
        
        // loot
        LootHelper.addLoot("dungeonChest", new ItemStack(borniteOre), 2, 4, 1);
        LootHelper.addLoot("dungeonChest", new ItemStack(cassiteriteOre), 2, 4, 1);
        
        // run tab icon call
        setTabIcons();
        
        // recipes
        ClassicalAlchemyOresRecipes.doClassicalAlchemyOres();
        
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        GameRegistry.registerWorldGenerator(new ClassicalAlchemyOresGenerator());
        
        
        // name stuff
        
        LanguageRegistry.addName(borniteOre, "Bornite Ore");
        MinecraftForge.setBlockHarvestLevel(borniteOre, "pickaxe", 2);
        
        LanguageRegistry.addName(cassiteriteOre, "Cassiterite Ore");
        MinecraftForge.setBlockHarvestLevel(cassiteriteOre, "pickaxe", 2);
        
        
        
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabClassicalAlchemyOres", "en_US", "Ores for ClassicalAlchemy");
        

        
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}
