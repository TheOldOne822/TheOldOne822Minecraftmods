package theoldone822.WootzPignGray;

import SimpleOres.plugins.fusion.FusionRecipes;
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
		OreDictionary.registerOre("ingotRefinedIron", new ItemStack(Content.rePigironIngot));
		OreDictionary.registerOre("ingotRefinediron", new ItemStack(Content.rePigironIngot));
		OreDictionary.registerOre("ingotWootz", new ItemStack(Content.wootzIngot));
		OreDictionary.registerOre("ingotWootzsteel", new ItemStack(Content.wootzIngot));
		OreDictionary.registerOre("ingotWootzSteel", new ItemStack(Content.wootzIngot));
		OreDictionary.registerOre("ingotGrayIron", new ItemStack(Content.grayIngot));
		OreDictionary.registerOre("ingotGrayiron", new ItemStack(Content.grayIngot));

		// Furnace
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.grayFusionFurnace, true, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), "ingotGrayIron", Character.valueOf('Y'),
						SimpleOres.plugins.fusion.Content.fusionFurnace }));
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

		GameRegistry.addShapelessRecipe(new ItemStack(Content.largeGrayChunk, 1), new Object[] { Content.mediumGrayChunk, Content.mediumGrayChunk, Content.mediumGrayChunk });

		GameRegistry.addShapelessRecipe(new ItemStack(Content.pigironIngot, 1), new Object[] { Content.rawPigiron, Content.rawPigiron, Content.rawPigiron });

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.packedIron, true, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), Block.woodenButton, Character.valueOf('Y'), "ingotRefinedIron" }));

		if (!Settings.requirePigiron){
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.packedIron, true, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), Block.woodenButton, Character.valueOf('Y'), Item.ingotIron }));
		}
		
		// Tools
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzPick, true, new Object[] { "XXX", " Y ", " Y ", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzAxe, true, new Object[] { "XX ", "XY ", " Y ", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzShovel, true, new Object[] { "X", "Y", "Y", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzSword, true, new Object[] { "X", "X", "Y", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzHoe, true, new Object[] { "XX ", " Y ", " Y ", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));

		FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzSword), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.hardenedsteelSword), 15.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzShovel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.hardenedsteelShovel), 15.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzPick), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.hardenedsteelPick), 15.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzAxe), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.hardenedsteelAxe), 15.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzHoe), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.hardenedsteelHoe), 15.0F);

		// Armor
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzHelm, true, new Object[] { "XXX", "X X", Character.valueOf('X'), "ingotWootz" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzChest, true, new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), "ingotWootz" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzLegs, true, new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), "ingotWootz" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzBoots, true, new Object[] { "X X", "X X", Character.valueOf('X'), "ingotWootz" }));

		// Items
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Item.writableBook, new Object[] { Item.book, Content.graphite, "stickWood" }));
		
		// Smelting
		FusionRecipes.smelting().addSmelting(new ItemStack(Item.ingotIron), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE),
				new ItemStack(Content.rawPigiron, 4), 1.0F);

		FusionRecipes.smelting().addSmelting(new ItemStack(Content.packedIron), new ItemStack(Block.leaves, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay),
				new ItemStack(Content.smallWootzsteelChunk), 1.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.packedIron), new ItemStack(Block.sapling, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.blockClay),
				new ItemStack(Content.mediumWootzsteelChunk), 1.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.packedIron), new ItemStack(Block.leaves, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.blockClay),
				new ItemStack(Content.largeWootzsteelChunk), 1.0F);

		FusionRecipes.smelting().addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(Item.ingotIron), new ItemStack(Block.sand), new ItemStack(Content.mediumGrayChunk), 1.0F);

		if (Settings.graphiteToRedstone) {
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.graphite), new ItemStack(Block.gravel), new ItemStack(Item.netherQuartz), new ItemStack(Block.oreRedstone), 1.0F);
		}

		GameRegistry.addSmelting(Content.largeGrayChunk.itemID, new ItemStack(Content.grayIngot, 1, 0), 0.3F);
		GameRegistry.addSmelting(Content.largeWootzsteelChunk.itemID, new ItemStack(Content.wootzIngot, 1, 0), 0.6F);
		GameRegistry.addSmelting(Content.pigironIngot.itemID, new ItemStack(Content.rePigironIngot, 1, 0), 0.6F);
		
		if (Settings.enableOtherPigiron) {
			if (PluginChecks.getSterlingInstalled()) {
				FusionRecipes.smelting().addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(OnlySilver.code.api.OnlySilverAPI.silverIngot.get()), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleOres.plugins.akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.smallSterlingSteelChunkItem), 6.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(OnlySilver.code.api.OnlySilverAPI.silverIngot.get()), new ItemStack(Item.dyePowder, 1, 4), new ItemStack(SimpleOres.plugins.akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.mediumSterlingSteelChunkItem), 8.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(OnlySilver.code.api.OnlySilverAPI.silverIngot.get()), new ItemStack(Item.glowstone), new ItemStack(SimpleOres.plugins.akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.largeSterlingSteelChunkItem), 20.F);
			}

			if (PluginChecks.getHaditeInstalled()) {
				FusionRecipes.smelting().addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(SimpleOres.plugins.akkamaddi.hadite.code.HaditeCoalCore.haditeCoalIngot), new ItemStack(Item.gunpowder), new ItemStack(SimpleOres.plugins.akkamaddi.hadite.code.HaditeCoalCore.largeHaditeSteelChunkItem), 6.0F);
			}
			
			if (PluginChecks.getTungstenInstalled()) {
				FusionRecipes.smelting().addSmelting(new ItemStack(SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.tungstenIngot), new ItemStack(Content.rePigironIngot), new ItemStack(SimpleOres.core.Items.tinIngot), new ItemStack(SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.largeTungstenSteelChunkItem), 26.F);
			}

			if (PluginChecks.getCobaltInstalled()) {
				FusionRecipes.smelting().addSmelting(new ItemStack(SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.cobaltIngot), new ItemStack(Content.rePigironIngot), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.smallBlueDriftSteelChunkItem), 6.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.cobaltIngot), new ItemStack(Content.rePigironIngot), new ItemStack(Item.gunpowder), new ItemStack(SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.mediumBlueDriftSteelChunkItem), 8.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.cobaltIngot), new ItemStack(Content.rePigironIngot), new ItemStack(Item.dyePowder, 1, 4), new ItemStack(SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.largeBlueDriftSteelChunkItem), 20.F);
			}
		}
/**
		for (int i = 0; i < ((Settings.wootzArmorDurability * 11) / 4); i++){
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzHelm, 1, (i)), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot, 4), 15.0F);
		}

		for (int i = ((Settings.wootzArmorDurability * 11) / 4); i < ((Settings.wootzArmorDurability * 11) / 2); i++){
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzHelm, 1, (i)), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot, 3), 15.0F);
		}

		for (int i = ((Settings.wootzArmorDurability * 11) / 2); i < ((Settings.wootzArmorDurability * 11 * 3) / 4); i++){
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzHelm, 1, (i)), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot, 2), 15.0F);
		}

		for (int i = ((Settings.wootzArmorDurability * 11 * 3) / 4); i < (Settings.wootzArmorDurability * 11); i++){
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzHelm, 1, (i)), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot, 1), 15.0F);
		}
*/
		if (Settings.enableRecycling) {
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.rawPigiron, 5), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.rawPigiron, 8), 30.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.rawPigiron, 7), 30.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.rawPigiron, 4), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.rawPigiron, 2), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.rawPigiron, 1), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzPick, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.rawPigiron, 3), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.rawPigiron, 3), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.rawPigiron, 2), 15.0F);

			FusionRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.rawPigiron, 2), 20.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.rawPigiron, 1), 20.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelPick, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.rawPigiron, 3), 20.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.rawPigiron, 3), 20.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand, 0), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.rawPigiron, 2), 20.0F);
		}

	}
}
