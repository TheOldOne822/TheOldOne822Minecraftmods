package theoldone822.MithrilEW;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class CommonProxy implements IGuiHandler {
	// WILL NOT WORK WITHOUT THIS

	/**
	 * The methods used to add a zoom feature to the custom bows. The code is messy as it is mostly copy/paste. Obviously overriden by ProxyClient, so look there
	 * if you are curious to see the code.
	 */
	 public void preInit() {

	}

	public void registerRenderInformation() {
	// Does nothing serverside, only for client
	} @Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	return null;
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	return null;
	}



}