package theoldone822.WootzPignGray;

import SimpleOres.plugins.fusion.FusionRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

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

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.packedIron, true, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), Block.woodenButton, Character.valueOf('Y'), "ingotPigIron" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.packedIron, true, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), Block.woodenButton, Character.valueOf('Y'), Item.ingotIron }));

		// Tools
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzPick, true, new Object[] { "XXX", " Y ", " Y ", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzAxe, true, new Object[] { "XX ", "XY ", " Y ", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzShovel, true, new Object[] { "X", "Y", "Y", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzSword, true, new Object[] { "X", "X", "Y", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzHoe, true, new Object[] { "XX ", " Y ", " Y ", Character.valueOf('X'), "ingotWootz", Character.valueOf('Y'), "stickWood" }));
		
		// Armor
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzHelm, true, new Object[] { "XXX", "X X", Character.valueOf('X'), "ingotWootz" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzChest, true, new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), "ingotWootz" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzLegs, true, new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), "ingotWootz" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.wootzBoots, true, new Object[] { "X X", "X X", Character.valueOf('X'), "ingotWootz" }));

		// Smelting
		FusionRecipes.smelting().addSmelting(new ItemStack(Item.ingotIron), new ItemStack(Block.sand), new ItemStack(Item.coal, 3, OreDictionary.WILDCARD_VALUE),
				new ItemStack(Content.pigironIngot, 2), 1.0F);

		FusionRecipes.smelting().addSmelting(new ItemStack(Content.packedIron), new ItemStack(Block.leaves, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay),
				new ItemStack(Content.largeWootzsteelChunk), 1.0F);

		FusionRecipes.smelting().addSmelting(new ItemStack(Content.rePigironIngot), new ItemStack(Item.ingotIron), new ItemStack(Block.sand), new ItemStack(Content.largeGrayChunk), 1.0F);

		FusionRecipes.smelting().addSmelting(new ItemStack(Content.graphite), new ItemStack(Block.gravel), new ItemStack(Item.netherQuartz), new ItemStack(Block.oreRedstone), 1.0F);

//		FusionRecipes.smelting().addSmelting(new ItemStack(SimpleOres.plugins.fusion.Content.largeSinisiteChunk), new ItemStack(Content.largePyralisChunk), new ItemStack(Item.skull, 1, 1),
//				new ItemStack(Content.smallDragonBezoarChunk), 12.0F);
//		FusionRecipes.smelting().addSmelting(new ItemStack(SimpleOres.plugins.fusion.Content.largeSinisiteChunk), new ItemStack(Content.largePyralisChunk), new ItemStack(Block.dragonEgg, 0),
//				new ItemStack(Content.mediumDragonBezoarChunk), 20.0F);
//		FusionRecipes.smelting().addSmelting(new ItemStack(SimpleOres.plugins.fusion.Content.largeSinisiteChunk), new ItemStack(Content.largePyralisChunk), new ItemStack(Item.netherStar),
//				new ItemStack(Content.largeDragonBezoarChunk, 2), 60.0F);

		GameRegistry.addSmelting(Content.largeGrayChunk.itemID, new ItemStack(Content.grayIngot, 1, 0), 0.3F);
		GameRegistry.addSmelting(Content.largeWootzsteelChunk.itemID, new ItemStack(Content.wootzIngot, 1, 0), 0.6F);
		GameRegistry.addSmelting(Content.pigironIngot.itemID, new ItemStack(Content.rePigironIngot, 1, 0), 0.6F);

		if (Settings.enableRecycling) {
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot, 2, 0), 30.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot, 2, 0), 30.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzPick, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.wootzHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 15.0F);

			FusionRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 20.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot, 2, 0), 40.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot, 2, 0), 40.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 20.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 20.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 20.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelPick, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 20.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 20.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.hardenedsteelHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.sand), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.pigironIngot), 20.0F);
		}

	}
}
