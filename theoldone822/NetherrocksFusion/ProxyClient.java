package theoldone822.NetherrocksFusion;

import theoldone822.NetherrocksFusion.HandlerTick;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.relauncher.Side;

public class ProxyClient extends ProxyCommon
{   

 @Override
 public void registerClientTickHandler()
 {
		FMLCommonHandler.instance().bus().register(new HandlerTick());
 }
}
