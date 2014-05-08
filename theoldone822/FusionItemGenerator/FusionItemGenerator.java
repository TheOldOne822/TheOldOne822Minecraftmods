package theoldone822.FusionItemGenerator;

import java.util.Arrays;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import alexndr.SimpleOres.api.helpers.CoreHelper;
import alexndr.SimpleOres.plugins.fusion.FusionRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "fusionitemgenerator", name = "Fusion Item Generator", version = "2.0", dependencies = "required-after:simpleores; required-after:simpleoresfusion")

public class FusionItemGenerator {

    public static boolean enableCobble, enableFarming, enableTrees, enableChicken, enableNether, enableIron;
	
	public static Configuration config;

	@Instance("fusionitemgenerator")
	public static FusionItemGenerator instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModMetadata metadata = event.getModMetadata();
		metadata.autogenerated = false;

		metadata.authorList = Arrays.asList("theoldone822");
		metadata.description = "Use the fusion furnace to 'farm' things.";

		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

		enableCobble = config.get("recipes", "Cobble", true).getBoolean(true);
		enableFarming = config.get("recipes", "Farming", true).getBoolean(true);
		enableTrees = config.get("recipes", "Trees", true).getBoolean(true);
		enableChicken = config.get("recipes", "Chicken", true).getBoolean(true);
		enableNether = config.get("recipes", "Nether Star", false).getBoolean(false);
		enableIron = config.get("recipes", "Iron", false).getBoolean(false);
		
		config.save();
		
if(enableCobble){
		FusionRecipes.addSmelting(new ItemStack(Items.water_bucket, 0, 0), new ItemStack(Items.lava_bucket, 0, 0), new ItemStack(Blocks.cobblestone, 0, 0), new ItemStack(Blocks.cobblestone, 1, 0), 0.0F);
    	FusionRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.copper_bucket_water, 0, 0), new ItemStack(Items.lava_bucket, 0, 0), new ItemStack(Blocks.cobblestone, 0, 0), new ItemStack(Blocks.cobblestone, 1, 0), 0.0F);
}
if(enableFarming){
    	FusionRecipes.addSmelting(new ItemStack(Items.water_bucket, 0, 0), new ItemStack(Blocks.dirt, 0, 0), new ItemStack(Items.wheat_seeds, 0, 0), new ItemStack(Items.wheat, 1, 0), 0.0F);
    	FusionRecipes.addSmelting(new ItemStack(Items.water_bucket, 0, 0), new ItemStack(Blocks.dirt, 0, 0), new ItemStack(Items.pumpkin_seeds, 0, 0), new ItemStack(Blocks.pumpkin, 1, 0), 0.0F);
    	FusionRecipes.addSmelting(new ItemStack(Items.water_bucket, 0, 0), new ItemStack(Blocks.dirt, 0, 0), new ItemStack(Items.melon_seeds, 0, 0), new ItemStack(Items.melon, 1, 0), 0.0F);
    	FusionRecipes.addSmelting(new ItemStack(Items.water_bucket, 0, 0), new ItemStack(Blocks.dirt, 0, 0), new ItemStack(Items.carrot, 0, 0), new ItemStack(Items.carrot, 1, 0), 0.0F);
    	FusionRecipes.addSmelting(new ItemStack(Items.water_bucket, 0, 0), new ItemStack(Blocks.dirt, 0, 0), new ItemStack(Items.potato, 0, 0), new ItemStack(Items.potato, 1, 0), 0.0F);
    	FusionRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.copper_bucket_water, 0, 0), new ItemStack(Blocks.dirt, 0, 0), new ItemStack(Items.wheat_seeds, 0, 0), new ItemStack(Items.wheat, 1, 0), 0.0F);
    	FusionRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.copper_bucket_water, 0, 0), new ItemStack(Blocks.dirt, 0, 0), new ItemStack(Items.pumpkin_seeds, 0, 0), new ItemStack(Blocks.pumpkin, 1, 0), 0.0F);
    	FusionRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.copper_bucket_water, 0, 0), new ItemStack(Blocks.dirt, 0, 0), new ItemStack(Items.melon_seeds, 0, 0), new ItemStack(Items.melon, 1, 0), 0.0F);
    	FusionRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.copper_bucket_water, 0, 0), new ItemStack(Blocks.dirt, 0, 0), new ItemStack(Items.carrot, 0, 0), new ItemStack(Items.carrot, 1, 0), 0.0F);
    	FusionRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.copper_bucket_water, 0, 0), new ItemStack(Blocks.dirt, 0, 0), new ItemStack(Items.potato, 0, 0), new ItemStack(Items.potato, 1, 0), 0.0F);
}    	
if(enableTrees){
    	FusionRecipes.addSmelting(new ItemStack(Blocks.sapling, 0, 0), new ItemStack(Blocks.sapling, 0, 0), new ItemStack(Items.apple, 0, 0), new ItemStack(Items.apple, 1, 0), 0.0F);
    	FusionRecipes.addSmelting(new ItemStack(Blocks.sapling, 0, 0), new ItemStack(Blocks.sapling, 0, 0), new ItemStack(Blocks.sapling, 0, 0), new ItemStack(Blocks.log, 1, 0), 0.0F);
    	FusionRecipes.addSmelting(new ItemStack(Blocks.sapling, 0, 1), new ItemStack(Blocks.sapling, 0, 1), new ItemStack(Blocks.sapling, 0, 1), new ItemStack(Blocks.log, 1, 1), 0.0F);
    	FusionRecipes.addSmelting(new ItemStack(Blocks.sapling, 0, 2), new ItemStack(Blocks.sapling, 0, 2), new ItemStack(Blocks.sapling, 0, 2), new ItemStack(Blocks.log, 1, 2), 0.0F);
    	FusionRecipes.addSmelting(new ItemStack(Blocks.sapling, 0, 3), new ItemStack(Blocks.sapling, 0, 3), new ItemStack(Blocks.sapling, 0, 3), new ItemStack(Blocks.log, 1, 3), 0.0F);
}
if(enableChicken){
    	FusionRecipes.addSmelting(new ItemStack(Items.egg, 0, 0), new ItemStack(Items.egg, 0, 0), new ItemStack(Items.egg, 0, 0), new ItemStack(Items.egg, 1, 0), 0.0F);
    	FusionRecipes.addSmelting(new ItemStack(Items.egg, 0, 0), new ItemStack(Items.egg, 0, 0), new ItemStack(Items.chicken, 0, 0), new ItemStack(Items.chicken, 1, 0), 0.0F);
    	FusionRecipes.addSmelting(new ItemStack(Items.egg, 0, 0), new ItemStack(Items.egg, 0, 0), new ItemStack(Items.feather, 0, 0), new ItemStack(Items.feather, 1, 0), 0.0F);
}
if(enableNether){
    	FusionRecipes.addSmelting(new ItemStack(Items.nether_star, 0, 0), new ItemStack(Items.nether_star, 0, 0), new ItemStack(Items.nether_star, 0, 0), new ItemStack(Items.nether_star, 1, 0), 0.0F);
       	FusionRecipes.addSmelting(new ItemStack(Items.nether_star, 0, 0), new ItemStack(Items.nether_star, 0, 0), new ItemStack(Items.skull, 0, 1), new ItemStack(Items.skull, 1, 1), 0.0F);
}
if(enableIron){
       	FusionRecipes.addSmelting(new ItemStack(Items.experience_bottle, 0, 0), new ItemStack(Items.lava_bucket, 0, 0), new ItemStack(Items.iron_ingot, 0, 0), new ItemStack(Items.iron_ingot, 1, 0), 0.0F);
    	FusionRecipes.addSmelting(new ItemStack(Items.experience_bottle, 0, 0), new ItemStack(Items.lava_bucket, 0, 0), new ItemStack(Blocks.red_flower, 0, 0), new ItemStack(Blocks.red_flower, 1, 0), 0.0F);
}      	}
}
