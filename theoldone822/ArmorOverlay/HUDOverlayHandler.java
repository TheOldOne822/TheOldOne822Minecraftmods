package theoldone822.ArmorOverlay;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.FoodStats;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.GuiIngameForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class HUDOverlayHandler {

	private static final ResourceLocation modIcons = new ResourceLocation("armoroverlay", "textures/icons.png");

	public static void init() {
		HUDOverlayHandler hudOverlayHandler = new HUDOverlayHandler();
		FMLCommonHandler.instance().bus().register(hudOverlayHandler);
		MinecraftForge.EVENT_BUS.register(hudOverlayHandler);
	}

	@SubscribeEvent
	public void onRender(RenderGameOverlayEvent.Post event) {
		if (event.type != RenderGameOverlayEvent.ElementType.ARMOR)
			return;

		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = mc.thePlayer;

		ScaledResolution scale = event.resolution;

		int left = scale.getScaledWidth() / 2 - 91;
		int top = scale.getScaledHeight() - GuiIngameForge.left_height + 10;

		float stats = (float)player.getEntityAttribute(SharedMonsterAttributes.ARMOR).getAttributeValue();

//			if (ArmorOverlay.armorPices == 4)
				drawAromrOverlay(stats, mc, left, top);
	}

	public static void drawAromrOverlay(float al, Minecraft mc, int left, int top) {
		float armorLevel = al * (ArmorOverlay.overlayLevels * 40 / 30);
		
		int textureOfset1 = 0;
		int textureOfset2 = 0;
		
		if (ArmorOverlay.overlayLevels != 18)
			textureOfset2 = 36;

		if (ArmorOverlay.overlayLevels == 3)
			textureOfset1 = 63;
		
		if (ArmorOverlay.overlayLevels == 9)
			textureOfset1 = 99;
		
		
		
		int f1 = (int) Math.floor(armorLevel / 40);
		int f2 = (int) Math.floor(armorLevel - (40 * f1));
		int f3 = (int) Math.floor((f2) / 4);

		if (f1 < 1 && f2 < 1 && f3 < 1)
			return;

		mc.getTextureManager().bindTexture(modIcons);

		for (int i = 0; i < 10; ++i) {
			int x = left + i * 8;
			int y = top;

			if (f2 > 4 * i) {
				mc.ingameGUI.drawTexturedModalRect(x, y, textureOfset1 + ((f1 + 1) * 9), textureOfset2 + (9 * Math.min(f2 - (4 * i), 4)), 9, 9);
			} else {
				mc.ingameGUI.drawTexturedModalRect(x, y, textureOfset1 + (f1 * 9), textureOfset2 + 36, 9, 9);
			}
		}
		if (ArmorOverlay.showNumbers){
				mc.ingameGUI.drawString(mc.fontRendererObj, Float.toString(al), left + 82, top + 1, 0xffffff);
		}
		// rebind default icons
		mc.getTextureManager().bindTexture(Gui.icons);
	}
}
