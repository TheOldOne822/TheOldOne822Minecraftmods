package akkamaddi.netherrocksaddenda.code;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraft.item.Item;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import alexndr.plugins.Netherrocks.Content;

public class JoinWorldNR
{
    public static double rand;
    public static int range;

    public static RandomRange random = new RandomRange();

    /**
     * This class allows zombies and skeletons to spawn holding/wearing SimpleOres items.
     */
	@SubscribeEvent
    public void EntityJoinWorldEvent(EntityJoinWorldEvent event)
    {
        if (event.world.isRemote
                || !(event.entity instanceof EntitySkeleton || event.entity instanceof EntityZombie))
        {
            return;
        }

        rand = Math.random();
        range = random.nextInt(1, 155);

        if (rand <= 0.02D)
        {
            EntityLiving living = (EntityLiving)event.entity;

            if (range == 1 || range == 2 || range == 3)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.malachite_helmet));
            }

            if (range == 4 || range == 5 || range == 6)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(Content.malachite_chestplate));
            }

            if (range == 7 || range == 8 || range == 9)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.malachite_leggings));
            }

            if (range == 10 || range == 11 || range == 12)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(Content.malachite_boots));
            }

            if (range == 13 || range == 14 || range == 15)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.malachite_sword));
            }

            if (range == 16 || range == 17 || range == 18)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.malachite_axe));
            }

            if (range == 19 || range == 20 || range == 21)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.malachite_pickaxe));
            }

            if (range == 22 || range == 23 || range == 24)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.malachite_shovel));
            }

            if (range == 25 || range == 26 || range == 27)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.malachite_hoe));
            }

            if (range == 28 || range == 29 || range == 30)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.fyrite_helmet));
            }

            if (range == 31 || range == 32 || range == 33)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(Content.fyrite_chestplate));
            }

            if (range == 34 || range == 35 || range == 36)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.fyrite_leggings));
            }

            if (range == 37 || range == 38 || range == 39)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(Content.fyrite_boots));
            }

            if (range == 40 || range == 41 || range == 42)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.fyrite_sword));
            }

            if (range == 43 || range == 44 || range == 45)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_sword));
            }

            if (range == 46 || range == 47 || range == 48)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_axe));
            }

            if (range == 49 || range == 50 || range == 51)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_pickaxe));
            }

            if (range == 52 || range == 53 || range == 54)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_shovel));
            }

            if (range == 55 || range == 56 || range == 57)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_hoe));
            }

            if (range == 58 || range == 59)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_sword));
            }

            if (range == 60 || range == 61)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_axe));
            }

            if (range == 62 || range == 63)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_pickaxe));
            }

            if (range == 64 || range == 65)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_shovel));
            }

            if (range == 66 || range == 67)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_hoe));
            }

            if (range == 68 || range == 69)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.illumenite_helmet));
            }

            if (range == 70 || range == 71)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(Content.illumenite_chestplate));
            }

            if (range == 72 || range == 73)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.illumenite_leggings));
            }

            if (range == 74 || range == 75)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(Content.illumenite_boots));
            }

            if (range == 76 || range == 77)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.illumenite_sword));
            }

            if (range == 78 || range == 79)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.dragonstone_helmet));
            }

            if (range == 80 || range == 81)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(Content.dragonstone_chestplate));
            }

            if (range == 82 || range == 83)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.dragonstone_leggings));
            }

            if (range == 84 || range == 85)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(Content.dragonstone_boots));
            }

            if (range == 86 || range == 87)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstone_sword));
            }

            if (range == 88 || range == 89)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstone_axe));
            }

            if (range == 90 || range == 91)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstone_pickaxe));
            }

            if (range == 92 || range == 93)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstone_shovel));
            }

            if (range == 94 || range == 95)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstone_hoe));
            }

            if (range == 96 || range == 97)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.malachite_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.malachite_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(Content.malachite_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.malachite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.malachite_sword));
            }

            if (range == 98 || range == 99)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.malachite_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.malachite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.malachite_pickaxe));
            }

            if (range == 100 || range == 101)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.malachite_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.malachite_chestplate));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.malachite_axe));
            }

            if (range == 102 || range == 103)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.malachite_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.malachite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.malachite_shovel));
            }

            if (range == 104 || range == 105)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.malachite_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.malachite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.malachite_hoe));
            }

            if (range == 106 || range == 107)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.fyrite_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.fyrite_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(Content.fyrite_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.fyrite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.fyrite_sword));
            }

            if (range == 108)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.malachite_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.malachite_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(Content.malachite_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.malachite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_sword));
            }

            if (range == 109)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.malachite_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.malachite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_pickaxe));
            }

            if (range == 110)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.malachite_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.malachite_chestplate));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_axe));
            }

            if (range == 111)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.malachite_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.malachite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_shovel));
            }

            if (range == 112)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.malachite_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.malachite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_hoe));
            }

            if (range == 113)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.malachite_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.malachite_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(Content.malachite_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.malachite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_sword));
            }

            if (range == 114)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.malachite_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.malachite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_pickaxe));
            }

            if (range == 115)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.malachite_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.malachite_chestplate));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_axe));
            }

            if (range == 116)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.malachite_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.malachite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_shovel));
            }

            if (range == 117)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.malachite_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.malachite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_hoe));
            }

            if (range == 118)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Items.iron_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Items.iron_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(Items.iron_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Items.iron_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_sword));
            }

            if (range == 119)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Items.iron_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Items.iron_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_pickaxe));
            }

            if (range == 120)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Items.iron_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Items.iron_chestplate));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_axe));
            }

            if (range == 121)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Items.iron_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Items.iron_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_shovel));
            }

            if (range == 122)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Items.iron_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Items.iron_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_hoe));
            }

            if (range == 123 || range == 124)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Items.iron_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Items.iron_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(Items.iron_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Items.iron_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_sword));
            }

            if (range == 125 || range == 126)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Items.iron_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Items.iron_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_pickaxe));
            }

            if (range == 127 || range == 128)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Items.iron_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Items.iron_chestplate));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_axe));
            }

            if (range == 129 || range == 130)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Items.iron_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Items.iron_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_shovel));
            }

            if (range == 131 || range == 132)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Items.iron_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Items.iron_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_hoe));
            }

            if (range == 133)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_sword));
            }

            if (range == 134)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_pickaxe));
            }

            if (range == 135)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_axe));
            }

            if (range == 136)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_shovel));
            }

            if (range == 137)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstone_hoe));
            }

            if (range == 138)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_sword));
            }

            if (range == 139)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_pickaxe));
            }

            if (range == 140)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_axe));
            }

            if (range == 141)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_shovel));
            }

            if (range == 142)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.argonite_hoe));
            }

            if (range == 143)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.illumenite_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.illumenite_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(Content.illumenite_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.illumenite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.illumenite_sword));
            }

            if (range == 144)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.dragonstone_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.dragonstone_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(Content.dragonstone_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.dragonstone_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstone_sword));
            }

            if (range == 145)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.dragonstone_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.dragonstone_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstone_pickaxe));
            }

            if (range == 146)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.dragonstone_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.dragonstone_chestplate));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstone_axe));
            }

            if (range == 147)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.dragonstone_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.dragonstone_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstone_shovel));
            }

            if (range == 148)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.dragonstone_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.dragonstone_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstone_hoe));
            }

            if (range == 149)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.dragonstone_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.dragonstone_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(Content.dragonstone_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.dragonstone_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.illumenite_sword));
            }

            if (range == 150)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstone_sword));
            }

            if (range == 151)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstone_pickaxe));
            }

            if (range == 152)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstone_axe));
            }

            if (range == 153)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstone_shovel));
            }

            if (range == 154)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstone_hoe));
            }

            if (range == 155)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.illumenite_sword));
            }
        }
    }
}

class RandomRange extends Random
{
    public int nextInt(int min, int max)
    {
        return nextInt(max - min + 1) + min;
    }
}
