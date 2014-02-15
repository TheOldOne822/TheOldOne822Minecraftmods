package theoldone822.WootzPignGray;

import theoldone822.WootzPignGray.Furnaces.GrayFurnaceContainer;
import theoldone822.WootzPignGray.Furnaces.GrayFurnaceGUI;
import theoldone822.WootzPignGray.Furnaces.GrayFurnaceTileEntity;
import theoldone822.WootzPignGray.Furnaces.GrayFusionFurnaceContainer;
import theoldone822.WootzPignGray.Furnaces.GrayFusionFurnaceGUI;
import theoldone822.WootzPignGray.Furnaces.GrayFusionFurnaceTileEntity;
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
				TileEntity machine = world.getBlockTileEntity(x, y, z);
		
        if(machine == null)
        {
        	return null;
        }
            
            
        if(machine instanceof GrayFusionFurnaceTileEntity)
        {
        	return new GrayFusionFurnaceContainer(player.inventory, (GrayFusionFurnaceTileEntity)machine);
        }
if(machine instanceof GrayFurnaceTileEntity)
        {
        	return new GrayFurnaceContainer(player.inventory, (GrayFurnaceTileEntity)machine);
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
				TileEntity machine = world.getBlockTileEntity(x, y, z);
		
        if(machine == null)
        {
        	return null;
        }
            
		
        if(machine instanceof GrayFusionFurnaceTileEntity)
        {
        	return new GrayFusionFurnaceGUI(player.inventory, (GrayFusionFurnaceTileEntity)machine);
        }
        if(machine instanceof GrayFurnaceTileEntity)
        {
        	return new GrayFurnaceGUI(player.inventory, (GrayFurnaceTileEntity)machine);
        }
		
        return null;
    }

	public void registerRenderInformation() {
		// TODO Auto-generated method stub
		
	} 
}
