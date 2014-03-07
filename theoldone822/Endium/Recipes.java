package theoldone822.Endium;

import alexndr.SimpleOres.plugins.fusion.FusionRecipes;
import alexndr.SimpleOres.api.helpers.CoreHelper;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Loader;
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
		OreDictionary.registerOre("oreEndium", new ItemStack(Content.EndiumOre));
		OreDictionary.registerOre("ingotEndium", new ItemStack(Content.EndiumIngot));
		OreDictionary.registerOre("ingotTelos", new ItemStack(Content.TelosIngot));
		OreDictionary.registerOre("ingotSunteleia", new ItemStack(Content.SunteleiaIngot));

		// Storage Blocks
		CraftingManager.getInstance().getRecipeList()
				.add(new ShapedOreRecipe(Content.EndiumBlock, true, new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), "ingotEndium" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.TelosBlock, true, new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), "ingotTelos" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.SunteleiaBlock, true, new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), "ingotSunteleia" }));

		// Ingot
		GameRegistry.addShapelessRecipe(new ItemStack(Content.EndiumIngot, 9), new Object[] { Content.EndiumBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(Content.TelosIngot, 9), new Object[] { Content.TelosBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(Content.SunteleiaIngot, 9), new Object[] { Content.SunteleiaBlock });
		
		GameRegistry.addShapelessRecipe(new ItemStack(Content.largeTelosChunk, 1), new Object[] { Content.smallTelosChunk, Content.smallTelosChunk, Content.smallTelosChunk,
				Content.smallTelosChunk, Content.smallTelosChunk });
		GameRegistry.addShapelessRecipe(new ItemStack(Content.largeTelosChunk, 1), new Object[] { Content.mediumTelosChunk, Content.mediumTelosChunk, Content.mediumTelosChunk });

		GameRegistry.addShapelessRecipe(new ItemStack(Content.largeSunteleiaChunk, 1), new Object[] { Content.smallSunteleiaChunk, Content.smallSunteleiaChunk, Content.smallSunteleiaChunk,
				Content.smallSunteleiaChunk, Content.smallSunteleiaChunk });
		GameRegistry.addShapelessRecipe(new ItemStack(Content.largeSunteleiaChunk, 1), new Object[] { Content.mediumSunteleiaChunk, Content.mediumSunteleiaChunk, Content.mediumSunteleiaChunk });

		// Tools
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.EndiumSword, true, new Object[] { "X", "X", "Y", Character.valueOf('X'), "ingotEndium", Character.valueOf('Y'), "stickWood" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.TelosPick, true, new Object[] { "XXX", " Y ", " Y ", Character.valueOf('X'), "ingotTelos", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.TelosAxe, true, new Object[] { "XX ", "XY ", " Y ", Character.valueOf('X'), "ingotTelos", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.TelosShovel, true, new Object[] { "X", "Y", "Y", Character.valueOf('X'), "ingotTelos", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.TelosSword, true, new Object[] { "X", "X", "Y", Character.valueOf('X'), "ingotTelos", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.TelosHoe, true, new Object[] { "XX ", " Y ", " Y ", Character.valueOf('X'), "ingotTelos", Character.valueOf('Y'), "stickWood" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.SunteleiaPick, true, new Object[] { "XXX", " Y ", " Y ", Character.valueOf('X'), "ingotSunteleia", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.SunteleiaAxe, true, new Object[] { "XX ", "XY ", " Y ", Character.valueOf('X'), "ingotSunteleia", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.SunteleiaShovel, true, new Object[] { "X", "Y", "Y", Character.valueOf('X'), "ingotSunteleia", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.SunteleiaSword, true, new Object[] { "X", "X", "Y", Character.valueOf('X'), "ingotSunteleia", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.SunteleiaHoe, true, new Object[] { "XX ", " Y ", " Y ", Character.valueOf('X'), "ingotSunteleia", Character.valueOf('Y'), "stickWood" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.EndiumPick, true, new Object[] { "XXX", " Y ", " Y ", Character.valueOf('X'), "ingotDragonBezoar", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.EndiumAxe, true, new Object[] { "XX ", "XY ", " Y ", Character.valueOf('X'), "ingotDragonBezoar", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.EndiumShovel, true, new Object[] { "X", "Y", "Y", Character.valueOf('X'), "ingotDragonBezoar", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.EndiumSword, true, new Object[] { "X", "X", "Y", Character.valueOf('X'), "ingotDragonBezoar", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.EndiumHoe, true, new Object[] { "XX ", " Y ", " Y ", Character.valueOf('X'), "ingotDragonBezoar", Character.valueOf('Y'), "stickWood" }));
		
		// Armor
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.EndiumHelm, true, new Object[] { "XXX", "X X", Character.valueOf('X'), "ingotEndium" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.EndiumChest, true, new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), "ingotEndium" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.EndiumLegs, true, new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), "ingotEndium" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.EndiumBoots, true, new Object[] { "X X", "X X", Character.valueOf('X'), "ingotEndium" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.TelosHelm, true, new Object[] { "XXX", "X X", Character.valueOf('X'), "ingotTelos" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.TelosChest, true, new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), "ingotTelos" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.TelosLegs, true, new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), "ingotTelos" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.TelosBoots, true, new Object[] { "X X", "X X", Character.valueOf('X'), "ingotTelos" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.SunteleiaHelm, true, new Object[] { "XXX", "X X", Character.valueOf('X'), "ingotSunteleia" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.SunteleiaChest, true, new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), "ingotSunteleia" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.SunteleiaLegs, true, new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), "ingotSunteleia" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.SunteleiaBoots, true, new Object[] { "X X", "X X", Character.valueOf('X'), "ingotSunteleia" }));

		// Smelting
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.EndiumIngot), new ItemStack(CoreHelper.coreContent.mythrilIngot), new ItemStack(Item.redstone),
				new ItemStack(Content.smallTelosChunk), 6.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.EndiumIngot), new ItemStack(CoreHelper.coreContent.mythrilIngot), new ItemStack(Item.blazePowder),
				new ItemStack(Content.mediumTelosChunk), 10.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.EndiumIngot), new ItemStack(CoreHelper.coreContent.mythrilIngot), new ItemStack(Item.ghastTear),
				new ItemStack(Content.largeTelosChunk), 30.0F);

		if (Loader.isModLoaded("netherrocksfusion")) {
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.EndiumIngot), new ItemStack(theoldone822.NetherrocksFusion.Content.largeDragonBezoarChunk), new ItemStack(Item.blazePowder),
				new ItemStack(Content.smallSunteleiaChunk), 6.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.EndiumIngot), new ItemStack(theoldone822.NetherrocksFusion.Content.largeDragonBezoarChunk), new ItemStack(Item.ghastTear),
				new ItemStack(Content.mediumSunteleiaChunk), 10.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.EndiumIngot), new ItemStack(theoldone822.NetherrocksFusion.Content.largeDragonBezoarChunk), new ItemStack(Item.skull, 1, 1),
				new ItemStack(Content.largeSunteleiaChunk), 30.0F);
		}

		GameRegistry.addSmelting(Content.EndiumOre.blockID, new ItemStack(Content.EndiumIngot, 1, 0), 0.3F);
		GameRegistry.addSmelting(Content.largeTelosChunk.itemID, new ItemStack(Content.TelosIngot, 1, 0), 0.6F);
		GameRegistry.addSmelting(Content.largeSunteleiaChunk.itemID, new ItemStack(Content.SunteleiaIngot, 1, 0), 0.6F);

		if (Settings.enableRecycling) {
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.EndiumHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.netherQuartz, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.EndiumOre), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.EndiumChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone, 2, 0), new ItemStack(Item.netherQuartz, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.EndiumOre, 2, 0), 30.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.EndiumLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone, 2, 0), new ItemStack(Item.netherQuartz, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.EndiumOre, 2, 0), 30.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.EndiumBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.netherQuartz, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.EndiumOre), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.EndiumSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.netherQuartz, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.EndiumOre), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.EndiumShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.glowstone, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.EndiumOre), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.EndiumPick, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.glowstone, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.EndiumOre), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.EndiumAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.glowstone, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.EndiumOre), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.EndiumHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.glowstone, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.EndiumOre), 15.0F);

			FusionRecipes.smelting().addSmelting(new ItemStack(Content.TelosHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.glowstone, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.largeTelosChunk), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.TelosChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone, 2, 0), new ItemStack(Item.glowstone, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.largeTelosChunk, 2, 0), 30.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.TelosLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone, 2, 0), new ItemStack(Item.glowstone, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.largeTelosChunk, 2, 0), 30.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.TelosBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.glowstone, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.largeTelosChunk), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.TelosSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.glowstone, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.largeTelosChunk), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.TelosShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.glowstone, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.largeTelosChunk), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.TelosPick, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.glowstone, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.largeTelosChunk), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.TelosAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.glowstone, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.largeTelosChunk), 15.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.TelosHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.glowstone, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Content.largeTelosChunk), 15.0F);

			FusionRecipes.smelting().addSmelting(new ItemStack(Content.SunteleiaBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.blazePowder), new ItemStack(Content.largeSunteleiaChunk), 20.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.SunteleiaChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone, 2, 0), new ItemStack(Item.blazePowder), new ItemStack(Content.largeSunteleiaChunk, 2, 0), 40.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.SunteleiaLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone, 2, 0), new ItemStack(Item.blazePowder), new ItemStack(Content.largeSunteleiaChunk, 2, 0), 40.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.SunteleiaBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.blazePowder), new ItemStack(Content.largeSunteleiaChunk), 20.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.SunteleiaSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.blazePowder), new ItemStack(Content.largeSunteleiaChunk), 20.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.SunteleiaShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.blazePowder), new ItemStack(Content.largeSunteleiaChunk), 20.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.SunteleiaPick, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.blazePowder), new ItemStack(Content.largeSunteleiaChunk), 20.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.SunteleiaAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.blazePowder), new ItemStack(Content.largeSunteleiaChunk), 20.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(Content.SunteleiaHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.whiteStone), new ItemStack(Item.blazePowder), new ItemStack(Content.largeSunteleiaChunk), 20.0F);

		}

	}
}
