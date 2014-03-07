package theoldone822.Endium;

import java.util.EnumSet;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;

public class TickHandler  implements ITickHandler
{
    //effects
	private void onPlayerTick(EntityPlayer player)
    {
        if (player.getCurrentItemOrArmor(4) != null && player.getCurrentItemOrArmor(3) != null && player.getCurrentItemOrArmor(2) != null && player.getCurrentItemOrArmor(1) != null)
        {
            ItemStack helmet = player.getCurrentItemOrArmor(4);
            ItemStack chest = player.getCurrentItemOrArmor(3);
            ItemStack legs = player.getCurrentItemOrArmor(2);
            ItemStack boots = player.getCurrentItemOrArmor(1);

            if (helmet.getItem() == Content.EndiumHelm & chest.getItem() == Content.EndiumChest & legs.getItem() == Content.EndiumLegs & boots.getItem() == Content.EndiumBoots)
            {
            	player.capabilities.setPlayerWalkSpeed(0.18F);
            } else if  (helmet.getItem() == Content.TelosHelm & chest.getItem() == Content.TelosChest & legs.getItem() == Content.TelosLegs & boots.getItem() == Content.TelosBoots)
                {
            	player.capabilities.setPlayerWalkSpeed(0.25F);
            } else {
            	player.capabilities.setPlayerWalkSpeed(0.1F);
            }
        }
    }

    @Override
    public void tickStart(EnumSet<TickType> type, Object... tickData)
    {
        if (type.equals(EnumSet.of(TickType.PLAYER)))
        {
            onPlayerTick((EntityPlayer)tickData[0]);
        }
    }

    @Override
    public EnumSet<TickType> ticks()
    {
        return EnumSet.of(TickType.PLAYER, TickType.SERVER);
    }

    @Override
    public void tickEnd(EnumSet<TickType> type, Object... tickData)
    {
        // TODO Auto-generated method stub
    }

    @Override
    public String getLabel()
    {
        // TODO Auto-generated method stub
        return null;
    }
}
