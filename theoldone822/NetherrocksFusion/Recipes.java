package theoldone822.NetherrocksFusion;

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
		OreDictionary.registerOre("ingotCinderstone", new ItemStack(Content.cinderstoneIngot));
		OreDictionary.registerOre("ingotThraka", new ItemStack(Content.thrakaIngot));
		OreDictionary.registerOre("ingotPyralis", new ItemStack(Content.pyralisIngot));
		OreDictionary.registerOre("ingotDragonBezoar", new ItemStack(Content.dragonbezoarIngot));
		OreDictionary.registerOre("ingotFyrite", new ItemStack(Netherrocks.core.Items.fyriteIngot));
		OreDictionary.registerOre("ingotMalachite", new ItemStack(Netherrocks.core.Items.malachiteIngot));
		OreDictionary.registerOre("gemAshstone", new ItemStack(Netherrocks.core.Items.ashstoneGem));
		OreDictionary.registerOre("ingotIllumenite", new ItemStack(Netherrocks.core.Items.illumeniteIngot));
		OreDictionary.registerOre("gemDragonStone", new ItemStack(Netherrocks.core.Items.dragonstoneGem));
		OreDictionary.registerOre("ingotArgonite", new ItemStack(Netherrocks.core.Items.argoniteIngot));
		OreDictionary.registerOre("oreFyrite", new ItemStack(Netherrocks.core.Blocks.fyriteOre));
		OreDictionary.registerOre("oreMalachite", new ItemStack(Netherrocks.core.Blocks.malachiteOre));
		OreDictionary.registerOre("oreAshstone", new ItemStack(Netherrocks.core.Blocks.ashstoneOre));
		OreDictionary.registerOre("oreIllumenite", new ItemStack(Netherrocks.core.Blocks.illumeniteOre));
		OreDictionary.registerOre("oreDragonStone", new ItemStack(Netherrocks.core.Blocks.dragonstoneOre));
		OreDictionary.registerOre("oreArgonite", new ItemStack(Netherrocks.core.Blocks.argoniteOre));

		// Furnace
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.dragonbezoarFusionFurnace, true, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), "ingotDragonBezoar", Character.valueOf('Y'),
						SimpleOres.plugins.fusion.Content.fusionFurnace }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.dragonbezoarFurnace, true, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), "ingotDragonBezoar", Character.valueOf('Y'),
						Block.furnaceIdle }));

		// Storage Blocks
		CraftingManager.getInstance().getRecipeList()
				.add(new ShapedOreRecipe(Content.cinderstoneBlock, true, new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), "ingotCinderstone" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.thrakaBlock, true, new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), "ingotThraka" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.pyralisBlock, true, new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), "ingotPyralis" }));
		CraftingManager.getInstance().getRecipeList()
				.add(new ShapedOreRecipe(Content.dragonbezoarBlock, true, new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), "ingotDragonBezoar" }));

		// Ingot
		GameRegistry.addShapelessRecipe(new ItemStack(Content.cinderstoneIngot, 9), new Object[] { Content.cinderstoneBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(Content.thrakaIngot, 9), new Object[] { Content.thrakaBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(Content.pyralisIngot, 9), new Object[] { Content.pyralisBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(Content.dragonbezoarIngot, 9), new Object[] { Content.dragonbezoarBlock });

		GameRegistry.addRecipe(new ItemStack(Content.pyralisChain, 8), new Object[] { " X ", "X X", " X ", Character.valueOf('X'), Content.pyralisIngot});
		GameRegistry.addRecipe(new ItemStack(Content.pyralisChain, 6), new Object[] { " Y ", "X X", " X ", Character.valueOf('X'), Content.pyralisIngot, Character.valueOf('Y'), Netherrocks.core.Items.dragonstoneGem});
		GameRegistry.addRecipe(new ItemStack(Content.pyralisChain, 6), new Object[] { " X ", "Y X", " X ", Character.valueOf('X'), Content.pyralisIngot, Character.valueOf('Y'), Netherrocks.core.Items.dragonstoneGem});
		GameRegistry.addRecipe(new ItemStack(Content.pyralisChain, 6), new Object[] { " X ", "X Y", " X ", Character.valueOf('X'), Content.pyralisIngot, Character.valueOf('Y'), Netherrocks.core.Items.dragonstoneGem});
		GameRegistry.addRecipe(new ItemStack(Content.pyralisChain, 6), new Object[] { " X ", "X X", " Y ", Character.valueOf('X'), Content.pyralisIngot, Character.valueOf('Y'), Netherrocks.core.Items.dragonstoneGem});

		GameRegistry.addRecipe(new ItemStack(Content.dragonbezoarChain, 8), new Object[] { " X ", "X X", " X ", Character.valueOf('X'), Content.dragonbezoarIngot});
		GameRegistry.addRecipe(new ItemStack(Content.dragonbezoarChain, 6), new Object[] { " Y ", "X X", " X ", Character.valueOf('X'), Content.dragonbezoarIngot, Character.valueOf('Y'), Content.pyralisIngot});
		GameRegistry.addRecipe(new ItemStack(Content.dragonbezoarChain, 6), new Object[] { " X ", "Y X", " X ", Character.valueOf('X'), Content.dragonbezoarIngot, Character.valueOf('Y'), Content.pyralisIngot});
		GameRegistry.addRecipe(new ItemStack(Content.dragonbezoarChain, 6), new Object[] { " X ", "X Y", " X ", Character.valueOf('X'), Content.dragonbezoarIngot, Character.valueOf('Y'), Content.pyralisIngot});
		GameRegistry.addRecipe(new ItemStack(Content.dragonbezoarChain, 6), new Object[] { " X ", "X X", " Y ", Character.valueOf('X'), Content.dragonbezoarIngot, Character.valueOf('Y'), Content.pyralisIngot});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Content.largeCinderstoneChunk, 1), new Object[] { Content.smallCinderstoneChunk, Content.smallCinderstoneChunk,
				Content.smallCinderstoneChunk, Content.smallCinderstoneChunk, Content.smallCinderstoneChunk });
		GameRegistry.addShapelessRecipe(new ItemStack(Content.largeCinderstoneChunk, 1), new Object[] { Content.mediumCinderstoneChunk, Content.mediumCinderstoneChunk,
				Content.mediumCinderstoneChunk });

		GameRegistry.addShapelessRecipe(new ItemStack(Content.largeThrakaChunk, 1), new Object[] { Content.smallThrakaChunk, Content.smallThrakaChunk, Content.smallThrakaChunk,
				Content.smallThrakaChunk, Content.smallThrakaChunk });
		GameRegistry.addShapelessRecipe(new ItemStack(Content.largeThrakaChunk, 1), new Object[] { Content.mediumThrakaChunk, Content.mediumThrakaChunk, Content.mediumThrakaChunk });

		GameRegistry.addShapelessRecipe(new ItemStack(Content.largePyralisChunk, 1), new Object[] { Content.smallPyralisChunk, Content.smallPyralisChunk, Content.smallPyralisChunk,
				Content.smallPyralisChunk, Content.smallPyralisChunk });
		GameRegistry.addShapelessRecipe(new ItemStack(Content.largePyralisChunk, 1), new Object[] { Content.mediumPyralisChunk, Content.mediumPyralisChunk, Content.mediumPyralisChunk });

		GameRegistry.addShapelessRecipe(new ItemStack(Content.largeDragonBezoarChunk, 1), new Object[] { Content.smallDragonBezoarChunk, Content.smallDragonBezoarChunk,
				Content.smallDragonBezoarChunk, Content.smallDragonBezoarChunk, Content.smallDragonBezoarChunk });
		GameRegistry.addShapelessRecipe(new ItemStack(Content.largeDragonBezoarChunk, 1), new Object[] { Content.mediumDragonBezoarChunk, Content.mediumDragonBezoarChunk,
				Content.mediumDragonBezoarChunk });

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.dragonbezoarRod, true, new Object[] { "X", "X", Character.valueOf('X'), "ingotDragonBezoar" }));

		// Tools
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.cinderstoneSword, true, new Object[] { "X", "X", "Y", Character.valueOf('X'), "ingotCinderstone", Character.valueOf('Y'), "stickWood" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.thrakaPick, true, new Object[] { "XXX", " Y ", " Y ", Character.valueOf('X'), "ingotThraka", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.thrakaAxe, true, new Object[] { "XX ", "XY ", " Y ", Character.valueOf('X'), "ingotThraka", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.thrakaShovel, true, new Object[] { "X", "Y", "Y", Character.valueOf('X'), "ingotThraka", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.thrakaSword, true, new Object[] { "X", "X", "Y", Character.valueOf('X'), "ingotThraka", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.thrakaHoe, true, new Object[] { "XX ", " Y ", " Y ", Character.valueOf('X'), "ingotThraka", Character.valueOf('Y'), "stickWood" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.pyralisPick, true, new Object[] { "XXX", " Y ", " Y ", Character.valueOf('X'), "ingotPyralis", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.pyralisAxe, true, new Object[] { "XX ", "XY ", " Y ", Character.valueOf('X'), "ingotPyralis", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.pyralisShovel, true, new Object[] { "X", "Y", "Y", Character.valueOf('X'), "ingotPyralis", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.pyralisSword, true, new Object[] { "X", "X", "Y", Character.valueOf('X'), "ingotPyralis", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.pyralisHoe, true, new Object[] { "XX ", " Y ", " Y ", Character.valueOf('X'), "ingotPyralis", Character.valueOf('Y'), "stickWood" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.dragonbezoarPick, true, new Object[] { "XXX", " Y ", " Y ", Character.valueOf('X'), "ingotDragonBezoar", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.dragonbezoarAxe, true, new Object[] { "XX ", "XY ", " Y ", Character.valueOf('X'), "ingotDragonBezoar", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.dragonbezoarShovel, true, new Object[] { "X", "Y", "Y", Character.valueOf('X'), "ingotDragonBezoar", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.dragonbezoarSword, true, new Object[] { "X", "X", "Y", Character.valueOf('X'), "ingotDragonBezoar", Character.valueOf('Y'), "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.dragonbezoarHoe, true, new Object[] { "XX ", " Y ", " Y ", Character.valueOf('X'), "ingotDragonBezoar", Character.valueOf('Y'), "stickWood" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.dragonbezoarBow, true, new Object[] { " XY", "Z Y", " XY", Character.valueOf('X'), Content.dragonbezoarRod, Character.valueOf('Y'), Item.silk, Character.valueOf('Z'), "ingotPyralis" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.dragonbezoarShears, true, new Object[]{"X ", " X", Character.valueOf('X'), "ingotDragonBezoar"}));
		
		// Armor
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.cinderstoneHelm, true, new Object[] { "XXX", "X X", Character.valueOf('X'), "ingotCinderstone" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.cinderstoneChest, true, new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), "ingotCinderstone" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.cinderstoneLegs, true, new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), "ingotCinderstone" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.cinderstoneBoots, true, new Object[] { "X X", "X X", Character.valueOf('X'), "ingotCinderstone" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.thrakaHelm, true, new Object[] { "XXX", "X X", Character.valueOf('X'), "ingotThraka" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.thrakaChest, true, new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), "ingotThraka" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.thrakaLegs, true, new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), "ingotThraka" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.thrakaBoots, true, new Object[] { "X X", "X X", Character.valueOf('X'), "ingotThraka" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.pyralisHelm, true, new Object[] { "XXX", "X X", Character.valueOf('X'), "ingotPyralis" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.pyralisChest, true, new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), "ingotPyralis" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.pyralisLegs, true, new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), "ingotPyralis" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.pyralisBoots, true, new Object[] { "X X", "X X", Character.valueOf('X'), "ingotPyralis" }));

		GameRegistry.addRecipe(new ItemStack(Content.pyralisChainHelm, 1), new Object[] { "XXX", "X X", Character.valueOf('X'), Content.pyralisChain });
		GameRegistry.addRecipe(new ItemStack(Content.pyralisChainChest, 1), new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), Content.pyralisChain });
		GameRegistry.addRecipe(new ItemStack(Content.pyralisChainLegs, 1), new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), Content.pyralisChain });
		GameRegistry.addRecipe(new ItemStack(Content.pyralisChainBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), Content.pyralisChain });

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.dragonbezoarHelm, true, new Object[] { "XXX", "X X", Character.valueOf('X'), "ingotDragonBezoar" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.dragonbezoarChest, true, new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), "ingotDragonBezoar" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.dragonbezoarLegs, true, new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), "ingotDragonBezoar" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Content.dragonbezoarBoots, true, new Object[] { "X X", "X X", Character.valueOf('X'), "ingotDragonBezoar" }));

		GameRegistry.addRecipe(new ItemStack(Content.dragonbezoarChainHelm, 1), new Object[] { "XXX", "X X", Character.valueOf('X'), Content.dragonbezoarChain });
		GameRegistry.addRecipe(new ItemStack(Content.dragonbezoarChainChest, 1), new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), Content.dragonbezoarChain });
		GameRegistry.addRecipe(new ItemStack(Content.dragonbezoarChainLegs, 1), new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), Content.dragonbezoarChain });
		GameRegistry.addRecipe(new ItemStack(Content.dragonbezoarChainBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), Content.dragonbezoarChain });

		// Smelting
		FusionRecipes.smelting().addSmelting(new ItemStack(Netherrocks.core.Items.fyriteIngot), new ItemStack(Netherrocks.core.Items.illumeniteIngot), new ItemStack(Item.gunpowder),
				new ItemStack(Content.smallCinderstoneChunk), 2.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(Netherrocks.core.Items.fyriteIngot), new ItemStack(Netherrocks.core.Items.illumeniteIngot), new ItemStack(Item.redstone),
				new ItemStack(Content.mediumCinderstoneChunk), 3.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(Netherrocks.core.Items.fyriteIngot), new ItemStack(Netherrocks.core.Items.illumeniteIngot), new ItemStack(Item.blazePowder),
				new ItemStack(Content.largeCinderstoneChunk), 10.0F);

		FusionRecipes.smelting().addSmelting(new ItemStack(Netherrocks.core.Items.malachiteIngot), new ItemStack(Netherrocks.core.Items.ashstoneGem), new ItemStack(Item.redstone),
				new ItemStack(Content.smallThrakaChunk), 6.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(Netherrocks.core.Items.malachiteIngot), new ItemStack(Netherrocks.core.Items.ashstoneGem), new ItemStack(Item.blazePowder),
				new ItemStack(Content.mediumThrakaChunk), 10.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(Netherrocks.core.Items.malachiteIngot), new ItemStack(Netherrocks.core.Items.ashstoneGem), new ItemStack(Item.ghastTear),
				new ItemStack(Content.largeThrakaChunk), 30.0F);

		FusionRecipes.smelting().addSmelting(new ItemStack(Content.largeCinderstoneChunk), new ItemStack(Netherrocks.core.Items.dragonstoneGem), new ItemStack(Item.blazePowder),
				new ItemStack(Content.smallPyralisChunk), 6.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.largeCinderstoneChunk), new ItemStack(Netherrocks.core.Items.dragonstoneGem), new ItemStack(Item.ghastTear),
				new ItemStack(Content.mediumPyralisChunk), 10.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(Content.largeCinderstoneChunk), new ItemStack(Netherrocks.core.Items.dragonstoneGem), new ItemStack(Item.skull, 1, 1),
				new ItemStack(Content.largePyralisChunk), 30.0F);

		FusionRecipes.smelting().addSmelting(new ItemStack(SimpleOres.plugins.fusion.Content.largeSinisiteChunk), new ItemStack(Content.largePyralisChunk), new ItemStack(Item.skull, 1, 1),
				new ItemStack(Content.smallDragonBezoarChunk), 12.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(SimpleOres.plugins.fusion.Content.largeSinisiteChunk), new ItemStack(Content.largePyralisChunk), new ItemStack(Block.dragonEgg, 0),
				new ItemStack(Content.mediumDragonBezoarChunk), 20.0F);
		FusionRecipes.smelting().addSmelting(new ItemStack(SimpleOres.plugins.fusion.Content.largeSinisiteChunk), new ItemStack(Content.largePyralisChunk), new ItemStack(Item.netherStar),
				new ItemStack(Content.largeDragonBezoarChunk, 2), 60.0F);

		GameRegistry.addSmelting(Content.largeCinderstoneChunk.itemID, new ItemStack(Content.cinderstoneIngot, 1, 0), 0.3F);
		GameRegistry.addSmelting(Content.largeThrakaChunk.itemID, new ItemStack(Content.thrakaIngot, 1, 0), 0.6F);
		GameRegistry.addSmelting(Content.largePyralisChunk.itemID, new ItemStack(Content.pyralisIngot, 1, 0), 0.6F);
		GameRegistry.addSmelting(Content.largeDragonBezoarChunk.itemID, new ItemStack(Content.dragonbezoarIngot, 1, 0), 1.0F);

		// Extended recipes

	}
}
