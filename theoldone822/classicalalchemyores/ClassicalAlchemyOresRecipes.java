package theoldone822.classicalalchemyores;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;
import akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore;
import alexndr.SimpleOres.plugins.fusion.FusionRecipes;

public class ClassicalAlchemyOresRecipes {
	public static void doClassicalAlchemyOres() {
		// Ore Dictionary
		OreDictionary.registerOre("oreBornite", new ItemStack(ClassicalAlchemyOresCore.borniteOre));
		OreDictionary.registerOre("oreCuprum", new ItemStack(ClassicalAlchemyOresCore.borniteOre));
		OreDictionary.registerOre("oreCassiterite", new ItemStack(ClassicalAlchemyOresCore.cassiteriteOre));
		OreDictionary.registerOre("oreStannum", new ItemStack(ClassicalAlchemyOresCore.cassiteriteOre));

		// recipes: Smelting
		GameRegistry.addSmelting(ClassicalAlchemyOresCore.borniteOre.blockID, new ItemStack(ClassicalAlchemyCore.cuprumIngot), 2.0F);
		GameRegistry.addSmelting(ClassicalAlchemyOresCore.cassiteriteOre.blockID, new ItemStack(ClassicalAlchemyCore.stannumIngot), 2.5F);

		if (!ClassicalAlchemyCore.enableRecycling) {
			if (ClassicalAlchemyOresCore.enableRecyclingOres) {
				// Stannum
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumHelm, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.cassiteriteOre), 7.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumChest, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.cassiteriteOre, 2, 0), 14.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumLegs, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.cassiteriteOre, 2, 0), 14.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumBoots, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.cassiteriteOre), 7.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumSword, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.cassiteriteOre), 7.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumShovel, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.cassiteriteOre), 7.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumPickaxe, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.cassiteriteOre), 7.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumAxe, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.cassiteriteOre), 7.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumHoe, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.cassiteriteOre), 7.0F);
				// Cuprum
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumHelm, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.borniteOre), 7.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumChest, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.borniteOre, 2, 0), 14.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumLegs, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.borniteOre, 2, 0), 14.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumBoots, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.borniteOre), 7.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumSword, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.borniteOre), 7.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumShovel, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.borniteOre), 7.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumPickaxe, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.borniteOre), 7.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumAxe, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.borniteOre), 7.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumHoe, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyOresCore.borniteOre), 7.0F);
			}
			if (ClassicalAlchemyOresCore.enableRecycling) {
				// Pyropus Bronze
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeHelm, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem), 10.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeChest, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem, 2, 0), 20.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeLegs, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem, 2, 0), 20.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeBoots, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem), 10.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeSword, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem), 10.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeShovel, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem), 10.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzePickaxe, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem), 10.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeAxe, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem), 10.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeHoe, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem), 10.0F);
				// Pulchrum Bronze
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pulchrumBronzeSword, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePulchrumBronzeChunkItem), 15.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pulchrumBronzeShovel, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePulchrumBronzeChunkItem), 15.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pulchrumBronzePickaxe, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePulchrumBronzeChunkItem), 15.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pulchrumBronzeAxe, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePulchrumBronzeChunkItem), 15.0F);
				// Tomb Bronze
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.tombBronzeHelm, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem), 15.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.tombBronzeChest, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.rottenFlesh), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem, 2, 0), 30.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.tombBronzeLegs, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.rottenFlesh), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem, 2, 0), 30.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.tombBronzeBoots, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem), 15.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.tombBronzeSword, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem), 15.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.tombBronzeShovel, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem), 15.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.tombBronzePickaxe, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem), 15.0F);
				FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.tombBronzeAxe, 1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem), 15.0F);

			}
		}
	}
}
