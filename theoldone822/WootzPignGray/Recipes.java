package theoldone822.WootzPignGray;

import alexndr.plugins.Fusion.FusionFurnaceRecipes;
import alexndr.plugins.Fusion.FusionMaterial;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
		OreDictionary.registerOre("blockPigiron", new ItemStack(Content.pigironBlock));
		OreDictionary.registerOre("blockPigIron", new ItemStack(Content.pigironBlock));
		OreDictionary.registerOre("ingotRefinedPigiron", new ItemStack(Content.rePigironIngot));
		OreDictionary.registerOre("ingotRefinedPigIron", new ItemStack(Content.rePigironIngot));
		OreDictionary.registerOre("blockRefinedPigiron", new ItemStack(Content.rePigironBlock));
		OreDictionary.registerOre("blockRefinedPigIron", new ItemStack(Content.rePigironBlock));
		OreDictionary.registerOre("ingotWootz", new ItemStack(Content.wootzIngot));
		OreDictionary.registerOre("ingotWootzsteel", new ItemStack(Content.wootzIngot));
		OreDictionary.registerOre("ingotWootzSteel", new ItemStack(Content.wootzIngot));
		OreDictionary.registerOre("blockWootz", new ItemStack(Content.wootzBlock));
		OreDictionary.registerOre("blockWootzsteel", new ItemStack(Content.wootzBlock));
		OreDictionary.registerOre("blockWootzSteel", new ItemStack(Content.wootzBlock));

		if (Settings.wootzissteel){
			OreDictionary.registerOre("ingotSteel", new ItemStack(Content.wootzIngot));
			OreDictionary.registerOre("blockSteel", new ItemStack(Content.wootzBlock));
		}

		OreDictionary.registerOre("ingotGrayIron", new ItemStack(Content.grayIngot));
		OreDictionary.registerOre("ingotGrayiron", new ItemStack(Content.grayIngot));
		OreDictionary.registerOre("blockGrayIron", new ItemStack(Content.grayBlock));
		OreDictionary.registerOre("blockGrayiron", new ItemStack(Content.grayBlock));

		// Furnace
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.grayFusionFurnace, true, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), "ingotGrayIron", Character.valueOf('Y'),
				alexndr.plugins.Fusion.Content.fusion_furnace }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.grayFurnace, true, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), "ingotGrayIron", Character.valueOf('Y'),
						Blocks.furnace }));

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

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.packedIron, true, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), Blocks.wooden_button, Character.valueOf('Y'), "ingotRefinedPigiron" }));

		if (!Settings.requirePigiron){
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.packedIron, true, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), Blocks.wooden_button, Character.valueOf('Y'), Items.iron_ingot }));
		}
		
		// Tools
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzPick, true, new Object[] { "XXX", " Y ", " Y ", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzAxe, true, new Object[] { "XX ", "XY ", " Y ", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzShovel, true, new Object[] { "X", "Y", "Y", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzSword, true, new Object[] { "X", "X", "Y", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzHoe, true, new Object[] { "XX ", " Y ", " Y ", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));

		FusionFurnaceRecipes.addSmelting(new ItemStack(Content.wootzSword), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.hardenedsteelSword), 15.0F);
		FusionFurnaceRecipes.addSmelting(new ItemStack(Content.wootzShovel), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.hardenedsteelShovel), 15.0F);
		FusionFurnaceRecipes.addSmelting(new ItemStack(Content.wootzPick), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.hardenedsteelPick), 15.0F);
		FusionFurnaceRecipes.addSmelting(new ItemStack(Content.wootzAxe), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.hardenedsteelAxe), 15.0F);
		FusionFurnaceRecipes.addSmelting(new ItemStack(Content.wootzHoe), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.hardenedsteelHoe), 15.0F);

		// Armor
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzHelm, true, new Object[] { "XXX", "X X", Character.valueOf('X'), "ingotWootz" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzChest, true, new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), "ingotWootz" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzLegs, true, new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), "ingotWootz" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzBoots, true, new Object[] { "X X", "X X", Character.valueOf('X'), "ingotWootz" }));

		// Items
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Items.writable_book, new Object[] { Items.book, Content.graphite, "stickWood" }));
		
		// Smelting
		FusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_ingot), new ItemStack(Blocks.sand, 0), new ItemStack(Items.coal, 2, OreDictionary.WILDCARD_VALUE),
				new ItemStack(Content.rawPigiron, 4), 1.0F);

		FusionFurnaceRecipes.addSmelting(FusionMaterial.of(new ItemStack(Content.packedIron)), FusionMaterial.of("treeLeaves", 1), FusionMaterial.of(new ItemStack(Items.clay_ball)),
				new ItemStack(Content.smallWootzsteelChunk), 1.0F);
		FusionFurnaceRecipes.addSmelting(FusionMaterial.of(new ItemStack(Content.packedIron)), FusionMaterial.of("treeSapling", 1), FusionMaterial.of(new ItemStack(Blocks.clay)),
				new ItemStack(Content.mediumWootzsteelChunk), 1.0F);
		FusionFurnaceRecipes.addSmelting(FusionMaterial.of(new ItemStack(Content.packedIron)), FusionMaterial.of("treeLeaves", 1), FusionMaterial.of(new ItemStack(Blocks.clay)), new ItemStack(Content.largeWootzsteelChunk), 1.F);

		FusionFurnaceRecipes.addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(Items.iron_ingot), new ItemStack(Blocks.sand), new ItemStack(Content.largeGrayChunk), 1.0F);

		if (Settings.graphiteToRedstone) {
		FusionFurnaceRecipes.addSmelting(new ItemStack(Content.graphite), new ItemStack(Items.quartz), new ItemStack(Items.gold_nugget), new ItemStack(Items.redstone, 2), 1.0F);
		}

		GameRegistry.addSmelting(Content.largeGrayChunk, new ItemStack(Content.grayIngot, 1, 0), 0.3F);
		GameRegistry.addSmelting(Content.largeWootzsteelChunk, new ItemStack(Content.wootzIngot, 1, 0), 0.6F);
		GameRegistry.addSmelting(Content.pigironIngot, new ItemStack(Content.rePigironIngot, 1, 0), 0.6F);
		
		if (Settings.enableRecycling) {
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.wootzHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.sand, 0), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.wootzChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.sand, 0), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot, 2, 0), 30.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.wootzLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.sand, 0), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot, 2, 0), 30.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.wootzBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.sand, 0), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.wootzSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.sand, 0), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.wootzShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.sand, 0), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.wootzPick, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.sand, 0), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.wootzAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.sand, 0), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.wootzHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.sand, 0), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);

			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.hardenedsteelSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.sand, 0), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.hardenedsteelShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.sand, 0), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.hardenedsteelPick, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.sand, 0), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.hardenedsteelAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.sand, 0), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 20.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.hardenedsteelHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.sand, 0), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 20.0F);
		}

	}
	
	public static void doPigiron() {
	if (Settings.enableOtherPigiron) {
/*		if (PluginChecks.getSterlingInstalled()) {
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(zotmc.onlysilver.api.OnlySilverAPI.silverIngot.get()), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.smallSterlingSteelChunkItem), 6.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(zotmc.onlysilver.api.OnlySilverAPI.silverIngot.get()), new ItemStack(Items.dyePowder, 1, 4), new ItemStack(akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.mediumSterlingSteelChunkItem), 8.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(zotmc.onlysilver.api.OnlySilverAPI.silverIngot.get()), new ItemStack(Items.glowstone), new ItemStack(akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.largeSterlingSteelChunkItem), 20.F);
		}

		if (PluginChecks.getHaditeInstalled()) {
			FusionFurnaceRecipes.addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(akkamaddi.hadite.code.HaditeCoalCore.haditeCoalIngot), new ItemStack(Items.gunpowder), new ItemStack(akkamaddi.hadite.code.HaditeCoalCore.largeHaditeSteelChunkItem), 6.0F);
		}
		
		if (PluginChecks.getTungstenInstalled()) {
			FusionFurnaceRecipes.addSmelting(new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenIngot), new ItemStack(Content.rePigironIngot), new ItemStack(CoreHelper.coreContent.tinIngot), new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.largeTungstenSteelChunkItem), 26.F);
		}

		if (PluginChecks.getCobaltInstalled()) {
			FusionFurnaceRecipes.addSmelting(new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.cobaltIngot), new ItemStack(Content.rePigironIngot), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.smallBlueDriftSteelChunkItem), 6.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.cobaltIngot), new ItemStack(Content.rePigironIngot), new ItemStack(Items.gunpowder), new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.mediumBlueDriftSteelChunkItem), 8.0F);
			FusionFurnaceRecipes.addSmelting(new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.cobaltIngot), new ItemStack(Content.rePigironIngot), new ItemStack(Items.dyePowder, 1, 4), new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.largeBlueDriftSteelChunkItem), 20.F);
		}

		if (PluginChecks.getSteelInstalled()) {
	        FusionFurnaceRecipes.addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.gunpowder), new ItemStack(akkamaddi.SteelyGlint.code.SteelyGlintCore.mediumCarbonizedIronChunkItem), 2.0F);
	        FusionFurnaceRecipes.addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(Items.dye, 1, 15), new ItemStack(Items.gunpowder), new ItemStack(akkamaddi.SteelyGlint.code.SteelyGlintCore.mediumRefinedIronChunkItem), 2.0F);
	    }
*/	}
	}

}
