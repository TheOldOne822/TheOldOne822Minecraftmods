package theoldone822.McoEW;

import static naruto1310.extendedWorkbench.EWConfig.biggerTools;
import naruto1310.extendedWorkbench.mod_ExtendedWorkbench;
import naruto1310.extendedWorkbench.item.RenderExtendedTool;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	/**
	 * Some very messy code to determine the zooming of the bows when you draw
	 * them back. Most of this is copy paste so I won't attempt to explain it.
	 * It is fairly straight forward if you actually look at it though.
	 */
	@Override
	public void preInit() {
		super.preInit();

	}

	@Override
	public void registerRenderInformation() {
		RenderExtendedTool render = new RenderExtendedTool();
		if (biggerTools != 0) {
				for (int i = 0; i < (biggerTools == 1 ? 1 : 5); i++)
					for (int j = 0; j < 3; j++)
						MinecraftForgeClient.registerItemRenderer(McoEW.item[i][j].itemID, render);
		}
	}
}
