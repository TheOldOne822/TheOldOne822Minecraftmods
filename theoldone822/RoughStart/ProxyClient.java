package theoldone822.RoughStart;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.relauncher.Side;

public class ProxyClient extends ProxyCommon
{    
	@Override
	public void initializeRenderers() {

			RenderingRegistry.registerEntityRenderingHandler(EntityStone.class, new RenderSnowball(RoughStart.rock));
	}
}
