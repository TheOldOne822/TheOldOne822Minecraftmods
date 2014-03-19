package theoldone822.SimpleOresEW.client;

import static naruto1310.extendedWorkbench.EWConfig.biggerTools;
import naruto1310.extendedWorkbench.mod_ExtendedWorkbench;
import naruto1310.extendedWorkbench.item.RenderExtendedTool;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.MinecraftForgeClient;
import theoldone822.SimpleOresEW.client.HandlerTick;
import theoldone822.SimpleOresEW.CommonProxy;
import theoldone822.SimpleOresEW.PluginChecks;
import theoldone822.SimpleOresEW.SimpleOresEW;
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
	public float fovModifierHand = 0F;
	protected float speedOnGround = 0.1F;

	@Override
	public void onBowUse(ItemStack stack, EntityPlayer player) {
		float f = 1.0F;

		if (player.capabilities.isFlying) {
			f *= 1.1F;
		}

		float speedOnGround = 0.1F;
		int i = player.getItemInUseDuration();
		float f1 = (float) i / 20.0F;

		if (f1 > 1.0F) {
			f1 = 1.0F;
		}

		else {
			f1 *= f1;
		}

		f *= 1.0F - f1 * HandlerTick.zoomAmount;
		fovModifierHand = fovModifierHand > 0.001F ? fovModifierHand : (Float) ObfuscationReflectionHelper.getPrivateValue(
				EntityRenderer.class, Minecraft.getMinecraft().entityRenderer, "fovModifierHand", "field_78507_R");
		fovModifierHand += (f - fovModifierHand) * 0.5F;

		if (fovModifierHand > 1.5F) {
			fovModifierHand = 1.5F;
		}

		if (fovModifierHand < 0.1F) {
			fovModifierHand = 0.1F;
		}

		ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, Minecraft.getMinecraft().entityRenderer, fovModifierHand,
				"fovModifierHand", "field_78507_R");
	}

	@Override
	public void resetSavedFOV() {
		this.fovModifierHand = 0F;
	}

	@Override
	public void registerClientTickHandler() {
		TickRegistry.registerTickHandler(new HandlerTick(), Side.CLIENT);
	}

	@Override
	public void preInit() {
		super.preInit();

	}

	@Override
	public void registerRenderInformation() {
		RenderExtendedTool render = new RenderExtendedTool();
		if (biggerTools != 0) {
			if (PluginChecks.getSimpleInstalled()) {
				for (int i = 0; i < (biggerTools == 1 ? 1 : 5); i++)
					for (int j = 0; j < 5; j++)
						MinecraftForgeClient.registerItemRenderer(SimpleOresEW.item[i][j].itemID, render);
			}
			if (PluginChecks.getFusionInstalled()) {
				for (int i = 0; i < (biggerTools == 1 ? 1 : 5); i++)
					for (int j = 5; j < 8; j++)
						MinecraftForgeClient.registerItemRenderer(SimpleOresEW.item[i][j].itemID, render);
			}
			if (PluginChecks.getNetherInstalled()) {
				for (int i = 0; i < (biggerTools == 1 ? 1 : 5); i++) {
					for (int j = 8; j < 12; j++)
						MinecraftForgeClient.registerItemRenderer(SimpleOresEW.item[i][j].itemID, render);
				}
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendedfyriteSword.itemID, render);
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendedillumeniteSword.itemID, render);
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendedfyritePick.itemID, render);
			}
			if (PluginChecks.getSilverInstalled()) {
				for (int i = 0; i < (biggerTools == 1 ? 1 : 5); i++)
					for (int j = 12; j < 13; j++)
						MinecraftForgeClient.registerItemRenderer(SimpleOresEW.item[i][j].itemID, render);
			}
			if (PluginChecks.getNetherFusionInstalled()) {
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendedcinderstoneSword.itemID, render);
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendedthrakaPick.itemID, render);
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendedthrakaAxe.itemID, render);
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendedthrakaShovel.itemID, render);
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendedthrakaSword.itemID, render);
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendedthrakaHoe.itemID, render);
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendedpyralisPick.itemID, render);
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendedpyralisAxe.itemID, render);
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendedpyralisShovel.itemID, render);
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendedpyralisSword.itemID, render);
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendedpyralisHoe.itemID, render);
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendeddragonbezoarAxe.itemID, render);
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendeddragonbezoarPick.itemID, render);
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendeddragonbezoarShovel.itemID, render);
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendeddragonbezoarSword.itemID, render);
				MinecraftForgeClient.registerItemRenderer(SimpleOresEW.extendeddragonbezoarHoe.itemID, render);
			}
			if (PluginChecks.getArsenicInstalled()) {
				for (int i = 0; i < (biggerTools == 1 ? 1 : 5); i++)
					for (int j = 13; j < 17; j++)
						MinecraftForgeClient.registerItemRenderer(SimpleOresEW.item[i][j].itemID, render);
			}
			if (PluginChecks.getAlchemyInstalled()) {
				for (int i = 0; i < (biggerTools == 1 ? 1 : 5); i++)
					for (int j = 17; j < 20; j++)
						MinecraftForgeClient.registerItemRenderer(SimpleOresEW.item[i][j].itemID, render);
				for (int i = 0; i < (biggerTools == 1 ? 1 : 4); i++)
					for (int j = 20; j < 22; j++)
						MinecraftForgeClient.registerItemRenderer(SimpleOresEW.item[i][j].itemID, render);
			}
			if (PluginChecks.getCthonInstalled()) {
				for (int i = 0; i < (biggerTools == 1 ? 1 : 5); i++)
					for (int j = 22; j < 23; j++)
						MinecraftForgeClient.registerItemRenderer(SimpleOresEW.item[i][j].itemID, render);
			}
			if (PluginChecks.getGlitterInstalled()) {
				for (int i = 0; i < (biggerTools == 1 ? 1 : 5); i++)
					for (int j = 23; j < 24; j++)
						MinecraftForgeClient.registerItemRenderer(SimpleOresEW.item[i][j].itemID, render);
				for (int i = 0; i < (biggerTools == 1 ? 1 : 4); i++)
					for (int j = 24; j < 27; j++)
						MinecraftForgeClient.registerItemRenderer(SimpleOresEW.item[i][j].itemID, render);

			}
			if (PluginChecks.getHaditeInstalled()) {
				for (int i = 0; i < (biggerTools == 1 ? 1 : 4); i++)
					for (int j = 27; j < 29; j++)
						MinecraftForgeClient.registerItemRenderer(SimpleOresEW.item[i][j].itemID, render);

			}
			if (PluginChecks.getCobaltInstalled()) {
				for (int i = 0; i < (biggerTools == 1 ? 1 : 5); i++)
					for (int j = 29; j < 33; j++)
						MinecraftForgeClient.registerItemRenderer(SimpleOresEW.item[i][j].itemID, render);

			}
			if (PluginChecks.getTungstenInstalled()) {
				for (int i = 0; i < (biggerTools == 1 ? 1 : 5); i++)
					for (int j = 33; j < 38; j++)
						MinecraftForgeClient.registerItemRenderer(SimpleOresEW.item[i][j].itemID, render);

			}
			if (PluginChecks.getSterlingInstalled()) {
				for (int i = 0; i < (biggerTools == 1 ? 1 : 5); i++)
					for (int j = 38; j < 40; j++)
						MinecraftForgeClient.registerItemRenderer(SimpleOresEW.item[i][j].itemID, render);

			}
			if (PluginChecks.getWootzInstalled()) {
				for (int i = 0; i < (biggerTools == 1 ? 1 : 5); i++)
					for (int j = 40; j < 41; j++)
						MinecraftForgeClient.registerItemRenderer(SimpleOresEW.item[i][j].itemID, render);
				
			}
			if (PluginChecks.getEndiumInstalled()) {
				for (int i = 0; i < (biggerTools == 1 ? 1 : 5); i++)
					for (int j = 41; j < 44; j++)
						MinecraftForgeClient.registerItemRenderer(SimpleOresEW.item[i][j].itemID, render);
				
			}
		}
	}
}
