package theoldone822.MoreFusionFurnaces;

import theoldone822.MoreFusionFurnaces.Furnaces.MythrilFusionFurnaceContainer;
import theoldone822.MoreFusionFurnaces.Furnaces.MythrilFusionFurnaceGUI;
import theoldone822.MoreFusionFurnaces.Furnaces.MythrilFusionFurnaceTileEntity;
import theoldone822.MoreFusionFurnaces.Furnaces.OnyxFusionFurnaceContainer;
import theoldone822.MoreFusionFurnaces.Furnaces.OnyxFusionFurnaceGUI;
import theoldone822.MoreFusionFurnaces.Furnaces.OnyxFusionFurnaceTileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class ProxyCommon implements IGuiHandler
{
	
@Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
				TileEntity machine = world.getTileEntity(x, y, z);
		
        if(machine == null)
        {
        	return null;
        }
            
        if(machine instanceof MythrilFusionFurnaceTileEntity)
        {
        	return new MythrilFusionFurnaceContainer(player.inventory, (MythrilFusionFurnaceTileEntity)machine);
        }
            
        if(machine instanceof OnyxFusionFurnaceTileEntity)
        {
        	return new OnyxFusionFurnaceContainer(player.inventory, (OnyxFusionFurnaceTileEntity)machine);
        }
            
        return null;
    }
	
	 /**
	  * Determines whether to return the Container or GUI for certain 'machines' (ie. furnaces, in this case), depending upon if this is being 
	  * called by the server or client. Server will call the Containers, while Client will call the GUI (so the player can actually see them).
	  */
	@Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
				TileEntity machine = world.getTileEntity(x, y, z);
		
        if(machine == null)
        {
        	return null;
        }
            
        if(machine instanceof MythrilFusionFurnaceTileEntity)
        {
        	return new MythrilFusionFurnaceGUI(player.inventory, (MythrilFusionFurnaceTileEntity)machine);
        }
		
        if(machine instanceof OnyxFusionFurnaceTileEntity)
        {
        	return new OnyxFusionFurnaceGUI(player.inventory, (OnyxFusionFurnaceTileEntity)machine);
        }
		
        return null;
    } 
}
