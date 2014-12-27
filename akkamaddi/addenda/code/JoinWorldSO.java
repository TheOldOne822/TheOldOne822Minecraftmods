package akkamaddi.addenda.code;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import alexndr.plugins.SimpleOres.Content;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class JoinWorldSO
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
        range = random.nextInt(1, 168);

        if (rand <= 0.03D)
        {
            EntityLiving living = (EntityLiving)event.entity;

            if (range == 1 || range == 2 || range == 3)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.copper_helmet));
            }

            if (range == 4 || range == 5 || range == 6)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(Content.copper_chestplate));
            }

            if (range == 7 || range == 8 || range == 9)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.copper_leggings));
            }

            if (range == 10 || range == 11 || range == 12)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(Content.copper_boots));
            }

            if (range == 13 || range == 14 || range == 15)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.copper_sword));
            }

            if (range == 16 || range == 17 || range == 18)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.copper_axe));
            }

            if (range == 19 || range == 20 || range == 21)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.copper_pickaxe));
            }

            if (range == 22 || range == 23 || range == 24)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.copper_shovel));
            }

            if (range == 25 || range == 26 || range == 27)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.copper_hoe));
            }

            if (range == 28 || range == 29 || range == 30)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.tin_helmet));
            }

            if (range == 31 || range == 32 || range == 33)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(Content.tin_chestplate));
            }

            if (range == 34 || range == 35 || range == 36)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.tin_leggings));
            }

            if (range == 37 || range == 38 || range == 39)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(Content.tin_boots));
            }

            if (range == 40 || range == 41 || range == 42)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.tin_sword));
            }

            if (range == 43 || range == 44 || range == 45)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.tin_axe));
            }

            if (range == 46 || range == 47 || range == 48)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.tin_pickaxe));
            }

            if (range == 49 || range == 50 || range == 51)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.tin_shovel));
            }

            if (range == 52 || range == 53 || range == 54)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.tin_hoe));
            }

            if (range == 55 || range == 56 || range == 57)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.mythril_helmet));
            }

            if (range == 58 || range == 59 || range == 60)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(Content.mythril_chestplate));
            }

            if (range == 61 || range == 62 || range == 63)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.mythril_leggings));
            }

            if (range == 64 || range == 65 || range == 66)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(Content.mythril_boots));
            }

            if (range == 67 || range == 68 || range == 69)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.mythril_sword));
            }

            if (range == 70 || range == 71 || range == 72)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.mythril_axe));
            }

            if (range == 73 || range == 74 || range == 75)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.mythril_pickaxe));
            }

            if (range == 76 || range == 77 || range == 78)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.mythril_shovel));
            }

            if (range == 79 || range == 80 || range == 81)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.mythril_hoe));
            }

            if (range == 82 || range == 83)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.adamantium_helmet));
            }

            if (range == 84 || range == 85)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(Content.adamantium_chestplate));
            }

            if (range == 86 || range == 87)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.adamantium_leggings));
            }

            if (range == 88 || range == 89)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(Content.adamantium_boots));
            }

            if (range == 90 || range == 91)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.adamantium_sword));
            }

            if (range == 92 || range == 93)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.adamantium_axe));
            }

            if (range == 94 || range == 95)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.adamantium_pickaxe));
            }

            if (range == 96 || range == 97)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.adamantium_shovel));
            }

            if (range == 98 || range == 99)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.adamantium_hoe));
            }

            if (range == 100 || range == 101)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.onyx_helmet));
            }

            if (range == 102 || range == 103)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(Content.onyx_chestplate));
            }

            if (range == 104 || range == 105)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.onyx_leggings));
            }

            if (range == 106 || range == 107)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(Content.onyx_boots));
            }

            if (range == 108 || range == 109)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.onyx_sword));
            }

            if (range == 110 || range == 111)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.onyx_axe));
            }

            if (range == 112 || range == 113)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.onyx_pickaxe));
            }

            if (range == 114 || range == 115)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.onyx_shovel));
            }

            if (range == 116 || range == 117)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.onyx_hoe));
            }

            if (range == 118 || range == 119)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.copper_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.copper_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(Content.copper_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.copper_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.copper_sword));
            }

            if (range == 120 || range == 121)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.copper_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.copper_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.copper_pickaxe));
            }

            if (range == 122 || range == 123)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.copper_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.copper_chestplate));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.copper_axe));
            }

            if (range == 124 || range == 125)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.copper_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.copper_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.copper_shovel));
            }

            if (range == 126 || range == 127)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.copper_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.copper_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.copper_hoe));
            }

            if (range == 128 || range == 129)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.tin_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.tin_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(Content.tin_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.tin_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.tin_sword));
            }

            if (range == 130 || range == 131)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.tin_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.tin_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.tin_pickaxe));
            }

            if (range == 132 || range == 133)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.tin_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.tin_chestplate));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.tin_axe));
            }

            if (range == 134 || range == 135)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.tin_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.tin_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.tin_shovel));
            }

            if (range == 136 || range == 137)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.tin_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.tin_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.tin_hoe));
            }

            if (range == 138 || range == 139)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.mythril_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.mythril_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(Content.mythril_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.mythril_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.mythril_sword));
            }

            if (range == 140 || range == 141)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.mythril_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.mythril_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.mythril_pickaxe));
            }

            if (range == 142 || range == 143)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.mythril_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.mythril_chestplate));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.mythril_axe));
            }

            if (range == 144 || range == 145)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.mythril_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.mythril_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.mythril_shovel));
            }

            if (range == 146 || range == 147)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.mythril_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.mythril_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.mythril_hoe));
            }

            if (range == 148)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.adamantium_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.adamantium_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(Content.adamantium_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.adamantium_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.adamantium_sword));
            }

            if (range == 149)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.adamantium_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.adamantium_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.adamantium_pickaxe));
            }

            if (range == 150)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.adamantium_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.adamantium_chestplate));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.adamantium_axe));
            }

            if (range == 151)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.adamantium_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.adamantium_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.adamantium_shovel));
            }

            if (range == 152)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.adamantium_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.adamantium_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.adamantium_hoe));
            }

            if (range == 153)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.onyx_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.onyx_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(Content.onyx_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.onyx_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.onyx_sword));
            }

            if (range == 154)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.onyx_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.onyx_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.onyx_pickaxe));
            }

            if (range == 155)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.onyx_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.onyx_chestplate));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.onyx_axe));
            }

            if (range == 156)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(Content.onyx_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.onyx_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.onyx_shovel));
            }

            if (range == 157)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.onyx_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.onyx_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.onyx_hoe));
            }

            if (range == 158)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.adamantium_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.adamantium_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(Content.adamantium_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Content.mythril_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.onyx_sword));
            }

            // shears

            if (range == 159 || range == 160 || range == 161)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.tin_shears));
            }

            if (range == 162 || range == 163)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.adamantium_shears));
            }

            if (range == 164)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(Content.onyx_shears));
            }

            if (range == 165 || range == 166)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.tin_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.tin_chestplate));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.tin_shears));
            }

            if (range == 167)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.adamantium_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.adamantium_chestplate));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.adamantium_shears));
            }

            if (range == 168)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Content.onyx_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(Content.onyx_chestplate));
                living.setCurrentItemOrArmor(0, new ItemStack(Content.onyx_shears));
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
