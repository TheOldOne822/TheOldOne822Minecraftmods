package akkamaddi.addenda.code;

import cpw.mods.fml.common.Loader;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import alexndr.plugins.Fusion.FusionFurnaceRecipes;
import alexndr.plugins.Fusion.Settings;

public class RecycleRecipes
{
    // wildcard
    private static final int WILDCARD_VALUE = OreDictionary.WILDCARD_VALUE;

    public static alexndr.plugins.Fusion.addons.ContentSimpleOres soAlloy;
    public static alexndr.plugins.SimpleOres.Content soBase;

    public static void doRecycleRecipes()
    {
        // The mass of recipes
        // Primary: helmet, chest, leggings, boots, sword, shovel, pickaxe, axe, hoe, ?horsearmor?, ?bow?
        // Secondary: Item.alpha, Block.alpha,
        //
        // recycle your Gold
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore, 2, 0), 30.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore, 2, 0), 30.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.golden_horse_armor, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.gold_ore, 2, 0), 30.0F);
        // extra Gold recycling
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.clock), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, 1), new ItemStack(Blocks.gold_ore), 15.0F);
        //
        // recycle your Leather
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.leather_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.leather_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.leather_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.leather_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        //
        // recycle your Wood
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.wooden_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.wooden_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.wooden_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.wooden_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.wooden_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.bow, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        // extra Wood recycling
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.boat), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.bed), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.wooden_door), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 5.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.fishing_rod, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 3.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.bookshelf), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.chest), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.trapped_chest), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.hay_block), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.crafting_table), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), 3.0F);
        //
        // recycle your Stone
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.stone_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.stone), 5.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.stone_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.stone), 5.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.stone_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.stone), 5.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.stone_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.stone), 5.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.stone_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.stone), 5.0F);
        // extra Stone recycling
        FusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.furnace), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.stone, 2, 0), 10.0F);
        //
        // recycle your Iron
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore, 2, 0), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore, 2, 0), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_horse_armor, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore, 2, 0), 20.0F);
        // extra Iron recycling
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.chainmail_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.chainmail_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore, 2, 0), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.chainmail_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore, 2, 0), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.chainmail_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.bucket), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.cauldron), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore, 2, 0), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.compass), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.iron_door), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.flint_and_steel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.minecart), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.hopper_minecart), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore, 2, 0), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.shears, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.anvil, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 4, 0), new ItemStack(Items.coal, 4, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore, 4, 0), 40.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Blocks.hopper), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(Blocks.iron_ore), 10.0F);
        //
        // recycle your Diamond
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore, 2, 0), 40.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore, 2, 0), 40.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(Items.diamond_horse_armor, 1, WILDCARD_VALUE), new ItemStack(Blocks.coal_ore, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(Blocks.diamond_ore, 2, 0), 20.0F);
        //
		if(Loader.isModLoaded("simpleores") && Settings.enableSimpleOres){
        // recycle your Copper
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.copper_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.copper_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.copper_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(soBase.copper_ore, 2, 0), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.copper_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(soBase.copper_ore, 2, 0), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.copper_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.copper_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.copper_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.copper_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.copper_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.copper_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.copper_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.copper_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.copper_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.copper_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.copper_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.copper_ore), 10.0F);
        // extra Copper recycling
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.copper_bucket), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.copper_ore), 10.0F);
//        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.copper_door_block), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.copper_ore), 10.0F);
        //
        // recycle your Tin
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.tin_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.tin_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.tin_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(soBase.tin_ore, 2, 0), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.tin_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(soBase.tin_ore, 2, 0), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.tin_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.tin_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.tin_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.tin_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.tin_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.tin_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.tin_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.tin_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.tin_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.tin_ore), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.tin_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.tin_ore), 10.0F);
        // extra Tin recycling
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.tin_shears, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.tin_ore), 10.0F);
        //
        // recycle your Mythril
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.mythril_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.mythril_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.mythril_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0),  new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(soBase.mythril_ore, 2, 0), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.mythril_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0),  new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(soBase.mythril_ore, 2, 0), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.mythril_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.mythril_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.mythril_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.mythril_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.mythril_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.mythril_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.mythril_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.mythril_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.mythril_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.mythril_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.mythril_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.mythril_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.mythril_bow, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.mythril_ore), 15.0F);
        // extra Mythril recycling
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.mythril_rod), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.mythril_ore), 15.0F);
//        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.mythril_furnace), new ItemStack(Blocks.gravel, 2, 0),  new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(soBase.mythril_ore, 2, 0), 15.0F);
        //
        // recycle your Adamantium
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.adamantium_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.adamantium_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.adamantium_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0),  new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(soBase.adamantium_ore, 2, 0), 30.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.adamantium_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0),  new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(soBase.adamantium_ore, 2, 0), 30.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.adamantium_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.adamantium_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.adamantium_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.adamantium_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.adamantium_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.adamantium_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.adamantium_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.adamantium_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.adamantium_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.adamantium_ore), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.adamantium_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.adamantium_ore), 15.0F);
        // extra Adamantium recycling
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.adamantium_shears, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soBase.adamantium_ore), 15.0F);
        //
        // recycle your Onyx
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.onyx_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soBase.onyx_ore), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.onyx_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(soBase.onyx_ore, 2, 0), 40.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.onyx_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(soBase.onyx_ore, 2, 0), 40.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.onyx_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soBase.onyx_ore), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.onyx_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soBase.onyx_ore), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.onyx_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soBase.onyx_ore), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.onyx_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soBase.onyx_ore), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.onyx_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soBase.onyx_ore), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.onyx_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soBase.onyx_ore), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.onyx_bow, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soBase.onyx_ore), 20.0F);
        // extra Onyx recycling
//        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.onyx_door_block), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soBase.onyx_ore), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.onyx_rod), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soBase.onyx_ore), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.onyx_shears, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soBase.onyx_ore), 20.0F);
//        FusionFurnaceRecipes.addSmelting(new ItemStack(soBase.onyx_furnace), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(soBase.onyx_ore, 2, 0), 40.0F);
        //
        // recycle your Bronze
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0),  new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk, 2, 0), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0),  new ItemStack(Items.coal, 2, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk, 2, 0), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk), 10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.bronze_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel),  new ItemStack(Items.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.large_bronze_chunk), 10.0F);
        //
        // recycle your Thyrium
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk, 2, 0), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk, 2, 0), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_bow, 1, WILDCARD_VALUE), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        // extra Thyrium recycling
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.thyrium_rod), new ItemStack(Blocks.gravel), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_thyrium_chunk), 15.0F);
        //
        // recycle your Sinisite
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk, 2, 0), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk, 2, 0), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_bow, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
        // extra Sinisite recycling
        FusionFurnaceRecipes.addSmelting(new ItemStack(soAlloy.sinisite_rod), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(soAlloy.large_sinisite_chunk), 20.0F);
    }}
}
