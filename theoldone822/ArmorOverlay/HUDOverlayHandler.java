package theoldone822.ArmorOverlay;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.FoodStats;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.GuiIngameForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;

import org.lwjgl.opengl.GL11;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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

		int stats;

		if (!Loader.isModLoaded("ArmorDamageRecalc")) {
			stats = player.getTotalArmorValue();
		} else {
			stats = (int) Math.floor(theoldone822.ArmorDamageRecalc.API.ExtendedHandler.getExtendedArmorValue(player));
		}

		if (ArmorOverlay.overlayLevels == 3 && ArmorOverlay.armorPices == 2 && !Loader.isModLoaded("ArmorDamageRecalc")) {
			drawAromrOverlay(stats, mc, left, top);
		} else {
			if (ArmorOverlay.armorPices == 4)
				drawExtendedAromrOverlay(stats, mc, left, top);
			if (ArmorOverlay.armorPices == 2)
				drawExtendedAromrOverlay(stats + stats, mc, left, top);
			if (ArmorOverlay.armorPices == 1)
				drawExtendedAromrOverlay(stats * 4, mc, left, top);
		}
	}

	public static void drawAromrOverlay(int armorLevel, Minecraft mc, int left, int top) {
		if (armorLevel < 21)
			return;

		int armorLevel2 = armorLevel - 20;

		if (armorLevel > 40)
			armorLevel2 = 20;

		int endBar = (int) Math.ceil(Math.min(20, (armorLevel2)) / 2f);
		mc.getTextureManager().bindTexture(modIcons);

		for (int i = 0; i < (endBar + 1); ++i) {
			int x = left + i * 8;
			int y = top;
			float HalfArmorBar = (armorLevel2) / 2 - i;

			if (HalfArmorBar >= 1)
				mc.ingameGUI.drawTexturedModalRect(x, y, 9, 0, 9, 9);
			else if (HalfArmorBar != 0)
				mc.ingameGUI.drawTexturedModalRect((x - 8), y, 0, 0, 9, 9);
		}

		if (armorLevel > 40) {
			if (armorLevel > 60)
				armorLevel = 60;
			endBar = (int) Math.ceil(Math.min(20, (armorLevel - 40)) / 2f);
			mc.getTextureManager().bindTexture(modIcons);

			for (int i = 0; i < (endBar + 1); ++i) {
				int x = left + i * 8;
				int y = top;
				float HalfArmorBar = (armorLevel - 40) / 2 - i;

				if (HalfArmorBar >= 1)
					mc.ingameGUI.drawTexturedModalRect(x, y, 27, 0, 9, 9);
				else if (HalfArmorBar != 0)
					mc.ingameGUI.drawTexturedModalRect((x - 8), y, 18, 0, 9, 9);
			}
		}
		if (ArmorOverlay.showNumbers)
		mc.ingameGUI.drawString(mc.fontRenderer, Integer.toString(armorLevel), left + 82, top + 1, 0xffffff);
		// rebind default icons
		mc.getTextureManager().bindTexture(Gui.icons);
	}

	public static void drawExtendedAromrOverlay(int armorLevel, Minecraft mc, int left, int top) {
		float al = armorLevel;
		if (al > ArmorOverlay.overlayLevels * 40)
			al = ArmorOverlay.overlayLevels * 40;
		
		int textureOfset1 = 0;
		int textureOfset2 = 0;
		
		if (ArmorOverlay.overlayLevels != 20)
			textureOfset2 = 36;

		if (ArmorOverlay.overlayLevels == 3)
			textureOfset1 = 54;
		
		if (ArmorOverlay.overlayLevels == 10)
			textureOfset1 = 90;
		
		int f1 = (int) Math.floor(al / 40);
		int f2 = (int) Math.floor(al - (40 * f1));
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
			if (ArmorOverlay.armorPices == 4)
				mc.ingameGUI.drawString(mc.fontRenderer, Integer.toString(armorLevel), left + 82, top + 1, 0xffffff);
			if (ArmorOverlay.armorPices == 2)
				mc.ingameGUI.drawString(mc.fontRenderer, Integer.toString(armorLevel / 2), left + 82, top + 1, 0xffffff);
			if (ArmorOverlay.armorPices == 1)
				mc.ingameGUI.drawString(mc.fontRenderer, Integer.toString(armorLevel / 4), left + 82, top + 1, 0xffffff);
		}
		// rebind default icons
		mc.getTextureManager().bindTexture(Gui.icons);
	}
}
