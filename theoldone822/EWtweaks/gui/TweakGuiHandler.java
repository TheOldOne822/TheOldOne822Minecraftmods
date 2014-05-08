package theoldone822.EWtweaks.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class TweakGuiHandler implements IGuiHandler
{
    public static final int craftingGui = 5;

    @Override
    public Object getClientGuiElement (int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if (ID == craftingGui)
        {
            return new WorkbenchGui(player.inventory, world);
        }
        return null;
    }

    @Override
    public Object getServerGuiElement (int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if (ID == craftingGui)
        {
            return new WorkbenchContainer(player.inventory, world);
        }
        return null;
    }
}
