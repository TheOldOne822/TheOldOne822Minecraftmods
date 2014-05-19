package akkamaddi.addenda.code;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import alexndr.SimpleOres.plugins.fusion.FusionHelper;
import net.minecraftforge.oredict.OreDictionary;
import alexndr.SimpleOres.api.helpers.CoreHelper;
import alexndr.SimpleOres.plugins.fusion.Content;

public class RecycleRecipes
{
    // wildcard
    private static final int WILDCARD_VALUE = OreDictionary.WILDCARD_VALUE;

    public static alexndr.SimpleOres.plugins.fusion.Content soAlloy;

    public static void doRecycleRecipes()
    {
        // The mass of recipes
        // Primary: helmet, chest, leggings, boots, sword, shovel, pickaxe, axe, hoe, ?horsearmor?, ?bow?
        // Secondary: Item.alpha, Block.alpha,
        //
        // recycle your Gold
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore, 2, 0), 30.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore, 2, 0), 30.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_horse_armor, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore, 2, 0), 30.0F);
        // extra Gold recycling
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.clock), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, 1), new ItemStack(Blocks.gold_ore), 15.0F);
        //
        // recycle your Leather
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.leather_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.leather_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.leather_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.leather_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        //
        // recycle your Wood
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.wooden_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.wooden_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.wooden_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.wooden_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.wooden_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.bow, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        // extra Wood recycling
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.boat), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.bed), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.wooden_door), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.fishing_rod, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 3.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.bookshelf), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.chest), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.trapped_chest), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.hay_block), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.crafting_table), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 3.0F);
        //
        // recycle your Stone
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.stone_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.stone), 5.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.stone_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.stone), 5.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.stone_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.stone), 5.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.stone_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.stone), 5.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.stone_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.stone), 5.0F);
        // extra Stone recycling
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.furnace), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.stone, 2, 0), 10.0F);
        //
        // recycle your Iron
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_horse_armor, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore, 2, 0), 20.0F);
        // extra Iron recycling
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.chainmail_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.chainmail_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.chainmail_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.chainmail_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.bucket), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.cauldron), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.compass), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_door), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.flint_and_steel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.minecart), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.hopper_minecart), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.shears, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.anvil, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 4, 0), new ItemStack(Items.coal, 4, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore, 4, 0), 40.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.hopper), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        //
        // recycle your Diamond
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore, 2, 0), 40.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore, 2, 0), 40.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_horse_armor, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore, 2, 0), 20.0F);
        //
        // recycle your Copper
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.copper_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copper_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.copper_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copper_ore, 2, 0), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.copper_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copper_ore, 2, 0), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.copper_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copper_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.copper_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copper_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.copper_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copper_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.copper_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copper_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.copper_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copper_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.copper_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copper_ore), 10.0F);
        // extra Copper recycling
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.copper_bucket), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copper_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.copper_door_block), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copper_ore), 10.0F);
        //
        // recycle your Tin
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.tin_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tin_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.tin_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tin_ore, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.tin_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tin_ore, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.tin_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tin_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.tin_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tin_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.tin_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tin_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.tin_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tin_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.tin_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tin_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.tin_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tin_ore), 10.0F);
        // extra Tin recycling
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.tin_shears, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tin_ore), 10.0F);
        //
        // recycle your Mythril
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.mythril_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythril_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.mythril_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0),  new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythril_ore, 2, 0), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.mythril_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0),  new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythril_ore, 2, 0), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.mythril_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythril_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.mythril_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythril_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.mythril_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythril_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.mythril_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythril_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.mythril_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythril_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.mythril_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythril_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.mythril_bow, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythril_ore), 15.0F);
        // extra Mythril recycling
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.mythril_rod), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythril_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.mythril_furnace), new ItemStack(Blocks.gravel, 2, 0),  new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythril_ore, 2, 0), 15.0F);
        //
        // recycle your Adamantium
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.adamantium_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantium_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.adamantium_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0),  new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantium_ore, 2, 0), 30.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.adamantium_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0),  new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantium_ore, 2, 0), 30.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.adamantium_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantium_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.adamantium_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantium_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.adamantium_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantium_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.adamantium_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantium_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.adamantium_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantium_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.adamantium_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantium_ore), 15.0F);
        // extra Adamantium recycling
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.adamantium_shears, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantium_ore), 15.0F);
        //
        // recycle your Onyx
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.onyx_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(CoreHelper.coreContent.onyx_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.onyx_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(CoreHelper.coreContent.onyx_ore, 2, 0), 40.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.onyx_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(CoreHelper.coreContent.onyx_ore, 2, 0), 40.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.onyx_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(CoreHelper.coreContent.onyx_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.onyx_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(CoreHelper.coreContent.onyx_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.onyx_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(CoreHelper.coreContent.onyx_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.onyx_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(CoreHelper.coreContent.onyx_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.onyx_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(CoreHelper.coreContent.onyx_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.onyx_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(CoreHelper.coreContent.onyx_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.onyx_bow, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(CoreHelper.coreContent.onyx_ore), 20.0F);
        // extra Onyx recycling
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.onyx_door_block), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(CoreHelper.coreContent.onyx_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.onyx_rod), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(CoreHelper.coreContent.onyx_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.onyx_shears, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(CoreHelper.coreContent.onyx_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(CoreHelper.coreContent.onyx_furnace), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(CoreHelper.coreContent.onyx_ore, 2, 0), 40.0F);
        //
        // recycle your Bronze
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0),  new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0),  new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk), 10.0F);
        //
        // recycle your Thyrium
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk, 2, 0), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk, 2, 0), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_bow, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        // extra Thyrium recycling
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_rod), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        //
        // recycle your Sinisite
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_bow, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
        // extra Sinisite recycling
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_rod), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
    }
}
