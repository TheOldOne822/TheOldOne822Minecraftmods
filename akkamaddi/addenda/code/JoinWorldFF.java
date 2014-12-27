package akkamaddi.addenda.code;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import alexndr.plugins.Fusion.addons.ContentSimpleOres;
import net.minecraft.item.Item;

public class JoinWorldFF
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
        range = random.nextInt(1, 110);

        if (rand <= 0.02D)
        {
            EntityLiving living = (EntityLiving)event.entity;

            if (range == 1 || range == 2 || range == 3 || range == 4)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ContentSimpleOres.bronze_helmet));
            }

            if (range == 5 || range == 6 || range == 7 || range == 8)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(ContentSimpleOres.bronze_chestplate));
            }

            if (range == 9 || range == 10 || range == 11 || range == 12)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(ContentSimpleOres.bronze_leggings));
            }

            if (range == 13 || range == 14 || range == 15 || range == 16)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(ContentSimpleOres.bronze_boots));
            }

            if (range == 17 || range == 18 || range == 19 || range == 20)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.bronze_sword));
            }

            if (range == 21 || range == 22 || range == 23 || range == 24)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.bronze_axe));
            }

            if (range == 25 || range == 26 || range == 27 || range == 28)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.bronze_pickaxe));
            }

            if (range == 29 || range == 30 || range == 31 || range == 32)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.bronze_shovel));
            }

            if (range == 33 || range == 34 || range == 35 || range == 36)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.bronze_hoe));
            }

            if (range == 37 || range == 38 || range == 39)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ContentSimpleOres.thyrium_helmet));
            }

            if (range == 40 || range == 41 || range == 42)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(ContentSimpleOres.thyrium_chestplate));
            }

            if (range == 43 || range == 44 || range == 45)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(ContentSimpleOres.thyrium_leggings));
            }

            if (range == 46 || range == 47 || range == 48)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(ContentSimpleOres.thyrium_boots));
            }

            if (range == 49 || range == 50 || range == 51)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.thyrium_sword));
            }

            if (range == 52 || range == 53 || range == 54)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.thyrium_axe));
            }

            if (range == 55 || range == 56 || range == 57)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.thyrium_pickaxe));
            }

            if (range == 58 || range == 59 || range == 60)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.thyrium_shovel));
            }

            if (range == 61 || range == 62 || range == 63)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.thyrium_hoe));
            }

            if (range == 64 || range == 65)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ContentSimpleOres.sinisite_helmet));
            }

            if (range == 66 || range == 67)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(ContentSimpleOres.sinisite_chestplate));
            }

            if (range == 68 || range == 69)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(ContentSimpleOres.sinisite_leggings));
            }

            if (range == 70 || range == 71)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(ContentSimpleOres.sinisite_boots));
            }

            if (range == 72 || range == 109)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.sinisite_sword));
            }

            if (range == 110 || range == 73)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.sinisite_axe));
            }

            if (range == 74 || range == 75)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.sinisite_pickaxe));
            }

            if (range == 76 || range == 77)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.sinisite_shovel));
            }

            if (range == 78 || range == 79)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.sinisite_hoe));
            }

            if (range == 80 || range == 81 || range == 82)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ContentSimpleOres.bronze_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(ContentSimpleOres.bronze_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(ContentSimpleOres.bronze_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(ContentSimpleOres.bronze_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.bronze_sword));
            }

            if (range == 83 || range == 84 || range == 85)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ContentSimpleOres.bronze_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(ContentSimpleOres.bronze_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.bronze_pickaxe));
            }

            if (range == 86 || range == 87 || range == 88)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ContentSimpleOres.bronze_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(ContentSimpleOres.bronze_chestplate));
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.bronze_axe));
            }

            if (range == 89 || range == 90 || range == 91)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(ContentSimpleOres.bronze_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(ContentSimpleOres.bronze_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.bronze_shovel));
            }

            if (range == 92 || range == 93 || range == 94)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ContentSimpleOres.bronze_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(ContentSimpleOres.bronze_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.bronze_hoe));
            }

            if (range == 95 || range == 96)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ContentSimpleOres.thyrium_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(ContentSimpleOres.thyrium_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(ContentSimpleOres.thyrium_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(ContentSimpleOres.thyrium_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.thyrium_sword));
            }

            if (range == 97 || range == 98)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ContentSimpleOres.thyrium_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(ContentSimpleOres.thyrium_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.thyrium_pickaxe));
            }

            if (range == 99 || range == 100)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ContentSimpleOres.thyrium_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(ContentSimpleOres.thyrium_chestplate));
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.thyrium_axe));
            }

            if (range == 101 || range == 102)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(ContentSimpleOres.thyrium_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(ContentSimpleOres.thyrium_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.thyrium_shovel));
            }

            if (range == 103 || range == 104)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ContentSimpleOres.thyrium_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(ContentSimpleOres.thyrium_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.thyrium_hoe));
            }

            if (range == 105)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ContentSimpleOres.sinisite_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(ContentSimpleOres.sinisite_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(ContentSimpleOres.sinisite_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(ContentSimpleOres.sinisite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.sinisite_sword));
            }

            if (range == 106)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ContentSimpleOres.sinisite_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(ContentSimpleOres.sinisite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.sinisite_pickaxe));
            }

            if (range == 107)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ContentSimpleOres.sinisite_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(ContentSimpleOres.sinisite_chestplate));
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.sinisite_axe));
            }

            if (range == 108)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(ContentSimpleOres.sinisite_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(ContentSimpleOres.sinisite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.sinisite_shovel));
            }

            if (range == 109)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ContentSimpleOres.sinisite_helmet));
                living.setCurrentItemOrArmor(1, new ItemStack(ContentSimpleOres.sinisite_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.sinisite_hoe));
            }

            if (range == 110)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Items.golden_helmet));
                living.setCurrentItemOrArmor(3, new ItemStack(ContentSimpleOres.bronze_chestplate));
                living.setCurrentItemOrArmor(2, new ItemStack(Items.iron_leggings));
                living.setCurrentItemOrArmor(1, new ItemStack(Items.leather_boots));
                living.setCurrentItemOrArmor(0, new ItemStack(ContentSimpleOres.sinisite_sword));
            }
        }
    }
}
