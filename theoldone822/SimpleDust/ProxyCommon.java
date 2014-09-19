package theoldone822.SimpleDust;

import theoldone822.SimpleDust.Grinder.GrinderContainer;
import theoldone822.SimpleDust.Grinder.GrinderGUI;
import theoldone822.SimpleDust.Grinder.GrinderTileEntity;
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
            
            
if(machine instanceof GrinderTileEntity)
        {
        	return new GrinderContainer(player.inventory, (GrinderTileEntity)machine);
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
            
		
        if(machine instanceof GrinderTileEntity)
        {
        	return new GrinderGUI(player.inventory, (GrinderTileEntity)machine);
        }
		
        return null;
    }

	public void registerRenderInformation() {
		// TODO Auto-generated method stub
		
	} 
}
