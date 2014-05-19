package akkamaddi.netherrocksaddenda.code;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import alexndr.SimpleOres.plugins.fusion.FusionHelper;
import alexndr.SimpleOres.plugins.netherrocks.Content;

public class NRRecycleRecipes
{
    // wildcard
    private static final int WILDCARD_VALUE = OreDictionary.WILDCARD_VALUE;

    public static void doRecycleRecipes()
    {
        // The mass of recipes
        //
        // recycle your Malachite
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.malachite_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.malachite_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.malachite_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.quartz, 2), new ItemStack(Content.malachite_ore, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.malachite_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.quartz, 2), new ItemStack(Content.malachite_ore, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.malachite_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.malachite_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.malachite_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.malachite_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.malachite_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.malachite_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.malachite_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.malachite_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.malachite_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.malachite_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.malachite_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.malachite_ore), 10.0F);
        //
        // recycle your Ashstone
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.ashstone_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.ashstone_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.ashstone_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.ashstone_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.ashstone_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.ashstone_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.ashstone_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.ashstone_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.ashstone_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.ashstone_ore), 15.0F);
        //
        // recycle your Dragonstone
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.dragonstone_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(Content.dragonstone_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.dragonstone_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(Content.dragonstone_ore, 2, 0), 40.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.dragonstone_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.lava_bucket), new ItemStack(Content.dragonstone_ore, 2, 0), 40.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.dragonstone_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(Content.dragonstone_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.dragonstone_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(Content.dragonstone_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.dragonstone_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(Content.dragonstone_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.dragonstone_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(Content.dragonstone_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.dragonstone_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(Content.dragonstone_ore), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.dragonstone_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.lava_bucket), new ItemStack(Content.dragonstone_ore), 20.0F);
        //
        // recycle your Argonite
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.argonite_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.argonite_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.argonite_axe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.argonite_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.argonite_shovel, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.argonite_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.argonite_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.argonite_ore), 15.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.argonite_hoe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.argonite_ore), 15.0F);
        //
        // recycle your Fyrite
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.fyrite_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.fyrite_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.fyrite_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.quartz, 2), new ItemStack(Content.fyrite_ore, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.fyrite_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.quartz, 2), new ItemStack(Content.fyrite_ore, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.fyrite_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.fyrite_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.fyrite_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.fyrite_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.fyrite_pickaxe, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.quartz), new ItemStack(Content.fyrite_ore), 10.0F);
        //
        //recycle your Illumenite
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.illumenite_helmet, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.glowstone_dust), new ItemStack(Content.illumenite_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.illumenite_chestplate, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.glowstone_dust, 2), new ItemStack(Content.illumenite_ore, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.illumenite_leggings, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack, 2, 0), new ItemStack(Items.glowstone_dust, 2), new ItemStack(Content.illumenite_ore, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.illumenite_boots, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.glowstone_dust), new ItemStack(Content.illumenite_ore), 10.0F);
        FusionHelper.fusionFurnaceRecipes.addSmelting(new ItemStack(Content.illumenite_sword, 1, WILDCARD_VALUE), new ItemStack(Blocks.netherrack), new ItemStack(Items.glowstone_dust), new ItemStack(Content.illumenite_ore), 10.0F);
    }
}
