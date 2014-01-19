package theoldone822.woolarmor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler {
	// WILL NOT WORK WITHOUT THIS

	public void preInit() {

	}

	public void registerRenderInformation() {
	// Does nothing serverside, only for client
	} public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	return null;
	}

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	return null;
	}

}
