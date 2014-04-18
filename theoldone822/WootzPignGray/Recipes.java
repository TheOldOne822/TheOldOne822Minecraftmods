package theoldone822.WootzPignGray;

import alexndr.SimpleOres.api.helpers.CoreHelper;
import alexndr.SimpleOres.plugins.fusion.FusionHelper;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {

	public static void doRecipes() {
		// Forge OreDictionary
		OreDictionary.registerOre("ingotPigiron", new ItemStack(Content.pigironIngot));
		OreDictionary.registerOre("ingotPigIron", new ItemStack(Content.pigironIngot));
		OreDictionary.registerOre("ingotRefinedPigiron", new ItemStack(Content.rePigironIngot));
		OreDictionary.registerOre("ingotRefinedPigIron", new ItemStack(Content.rePigironIngot));
		OreDictionary.registerOre("ingotWootz", new ItemStack(Content.wootzIngot));
		OreDictionary.registerOre("ingotWootzsteel", new ItemStack(Content.wootzIngot));
		OreDictionary.registerOre("ingotWootzSteel", new ItemStack(Content.wootzIngot));

		if (Settings.wootzissteel)
			OreDictionary.registerOre("ingotSteel", new ItemStack(Content.wootzIngot));

		OreDictionary.registerOre("ingotGrayIron", new ItemStack(Content.grayIngot));
		OreDictionary.registerOre("ingotGrayiron", new ItemStack(Content.grayIngot));

		// Furnace
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.grayFusionFurnace, true, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), "ingotGrayIron", Character.valueOf('Y'),
				alexndr.SimpleOres.plugins.fusion.Content.fusionFurnace }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.grayFurnace, true, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), "ingotGrayIron", Character.valueOf('Y'),
						Block.furnaceIdle }));

		// Storage Blocks
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.pigironBlock, true, new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), "ingotPigiron" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.rePigironBlock, true, new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), "ingotRefinedPigiron" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzBlock, true, new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), "ingotWootz" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.grayBlock, true, new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), "ingotGrayIron" }));

		// Ingot
		GameRegistry.addShapelessRecipe(new ItemStack(Content.pigironIngot, 9), new Object[] { Content.pigironBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(Content.rePigironIngot, 9), new Object[] { Content.rePigironBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(Content.wootzIngot, 9), new Object[] { Content.wootzBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(Content.grayIngot, 9), new Object[] { Content.grayBlock });

		GameRegistry.addShapelessRecipe(new ItemStack(Content.largeWootzsteelChunk, 1), new Object[] { Content.smallWootzsteelChunk, Content.smallWootzsteelChunk, Content.smallWootzsteelChunk, Content.smallWootzsteelChunk, Content.smallWootzsteelChunk });
		GameRegistry.addShapelessRecipe(new ItemStack(Content.largeWootzsteelChunk, 1), new Object[] { Content.mediumWootzsteelChunk, Content.mediumWootzsteelChunk, Content.smallWootzsteelChunk, Content.smallWootzsteelChunk });
		GameRegistry.addShapelessRecipe(new ItemStack(Content.largeWootzsteelChunk, 1), new Object[] { Content.mediumWootzsteelChunk, Content.mediumWootzsteelChunk, Content.mediumWootzsteelChunk });

		GameRegistry.addShapelessRecipe(new ItemStack(Content.pigironIngot, 1), new Object[] { Content.rawPigiron, Content.rawPigiron, Content.rawPigiron });

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.packedIron, true, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), Block.woodenButton, Character.valueOf('Y'), "ingotRefinedPigiron" }));

		if (!Settings.requirePigiron){
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.packedIron, true, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), Block.woodenButton, Character.valueOf('Y'), Item.ingotIron }));
		}
		
		// Tools
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzPick, true, new Object[] { "XXX", " Y ", " Y ", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzAxe, true, new Object[] { "XX ", "XY ", " Y ", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzShovel, true, new Object[] { "X", "Y", "Y", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzSword, true, new Object[] { "X", "X", "Y", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzHoe, true, new Object[] { "XX ", " Y ", " Y ", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));

		FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.wootzSword), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.hardenedsteelSword), 15.0F);
		FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.wootzShovel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.hardenedsteelShovel), 15.0F);
		FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.wootzPick), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.hardenedsteelPick), 15.0F);
		FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.wootzAxe), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.hardenedsteelAxe), 15.0F);
		FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.wootzHoe), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.hardenedsteelHoe), 15.0F);

		// Armor
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzHelm, true, new Object[] { "XXX", "X X", Character.valueOf('X'), "ingotWootz" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzChest, true, new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), "ingotWootz" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzLegs, true, new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), "ingotWootz" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzBoots, true, new Object[] { "X X", "X X", Character.valueOf('X'), "ingotWootz" }));

		// Items
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Item.writableBook, new Object[] { Item.book, Content.graphite, "stickWood" }));
		
		// Smelting
		FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.ingotIron), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE),
				new ItemStack(Content.rawPigiron, 4), 1.0F);

		FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.packedIron), new ItemStack(Block.leaves, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay),
				new ItemStack(Content.smallWootzsteelChunk), 1.0F);
		FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.packedIron), new ItemStack(Block.sapling, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.blockClay),
				new ItemStack(Content.mediumWootzsteelChunk), 1.0F);
		FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.packedIron), new ItemStack(Block.leaves, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.blockClay),
				new ItemStack(Content.largeWootzsteelChunk), 1.0F);

		FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(Item.ingotIron), new ItemStack(Block.sand), new ItemStack(Content.largeGrayChunk), 1.0F);

		if (Settings.graphiteToRedstone) {
		FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.graphite), new ItemStack(Item.netherQuartz), new ItemStack(Item.goldNugget), new ItemStack(Item.redstone, 2), 1.0F);
		}

		GameRegistry.addSmelting(Content.largeGrayChunk.itemID, new ItemStack(Content.grayIngot, 1, 0), 0.3F);
		GameRegistry.addSmelting(Content.largeWootzsteelChunk.itemID, new ItemStack(Content.wootzIngot, 1, 0), 0.6F);
		GameRegistry.addSmelting(Content.pigironIngot.itemID, new ItemStack(Content.rePigironIngot, 1, 0), 0.6F);
		
		if (Settings.enableRecycling) {
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.wootzHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.wootzChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot, 2, 0), 30.0F);
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.wootzLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot, 2, 0), 30.0F);
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.wootzBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.wootzSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.wootzShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.wootzPick, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.wootzAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.wootzHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);

			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 20.0F);
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 20.0F);
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelPick, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 20.0F);
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 20.0F);
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 20.0F);
		}

	}
	
	public static void doPigiron() {
	if (Settings.enableOtherPigiron) {
		if (PluginChecks.getSterlingInstalled()) {
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(zotmc.onlysilver.api.OnlySilverAPI.silverIngot.get()), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.smallSterlingSteelChunkItem), 6.0F);
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(zotmc.onlysilver.api.OnlySilverAPI.silverIngot.get()), new ItemStack(Item.dyePowder, 1, 4), new ItemStack(akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.mediumSterlingSteelChunkItem), 8.0F);
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(zotmc.onlysilver.api.OnlySilverAPI.silverIngot.get()), new ItemStack(Item.glowstone), new ItemStack(akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.largeSterlingSteelChunkItem), 20.F);
		}

		if (PluginChecks.getHaditeInstalled()) {
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(akkamaddi.hadite.code.HaditeCoalCore.haditeCoalIngot), new ItemStack(Item.gunpowder), new ItemStack(akkamaddi.hadite.code.HaditeCoalCore.largeHaditeSteelChunkItem), 6.0F);
		}
		
		if (PluginChecks.getTungstenInstalled()) {
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenIngot), new ItemStack(Content.rePigironIngot), new ItemStack(CoreHelper.coreContent.tinIngot), new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.largeTungstenSteelChunkItem), 26.F);
		}

		if (PluginChecks.getCobaltInstalled()) {
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.cobaltIngot), new ItemStack(Content.rePigironIngot), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.smallBlueDriftSteelChunkItem), 6.0F);
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.cobaltIngot), new ItemStack(Content.rePigironIngot), new ItemStack(Item.gunpowder), new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.mediumBlueDriftSteelChunkItem), 8.0F);
			FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.cobaltIngot), new ItemStack(Content.rePigironIngot), new ItemStack(Item.dyePowder, 1, 4), new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.largeBlueDriftSteelChunkItem), 20.F);
		}

		if (PluginChecks.getSteelInstalled()) {
	        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.gunpowder), new ItemStack(akkamaddi.SteelyGlint.code.SteelyGlintCore.mediumCarbonizedIronChunkItem), 2.0F);
	        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(Item.gunpowder), new ItemStack(akkamaddi.SteelyGlint.code.SteelyGlintCore.mediumRefinedIronChunkItem), 2.0F);
	    }
	}
	}

}
