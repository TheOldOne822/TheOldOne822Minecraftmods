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
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class HUDOverlayHandler {

	private static final ResourceLocation modIcons = new ResourceLocation("armoroverlay", "textures/icons.png");

	public static void init()
	{
		HUDOverlayHandler hudOverlayHandler = new HUDOverlayHandler();
		FMLCommonHandler.instance().bus().register(hudOverlayHandler);
		MinecraftForge.EVENT_BUS.register(hudOverlayHandler);
	}

	@SubscribeEvent
	public void onRender(RenderGameOverlayEvent.Post event)
	{
		if (event.type != RenderGameOverlayEvent.ElementType.ARMOR)
			return;

		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = mc.thePlayer;
		int stats = player.getTotalArmorValue();

		ScaledResolution scale = event.resolution;

		int left = scale.getScaledWidth() / 2 - 91;
		int top = scale.getScaledHeight() - GuiIngameForge.left_height + 10;

		drawAromrOverlay(stats, mc, left, top);
	}

	public static void drawAromrOverlay(int armorLevel, Minecraft mc, int left, int top)
	{
		if (armorLevel  < 21)
			return;

		int armorLevel2 = armorLevel - 20;
		
		if (armorLevel > 40)
			armorLevel2 = 20;
		
		int endBar = (int) Math.ceil(Math.min(20, (armorLevel2)) / 2f);
		mc.getTextureManager().bindTexture(modIcons);

		for (int i = 0; i < (endBar + 1); ++i)
		{
			int x = left + i * 8;
			int y = top;
			float effectiveSaturationOfBar = (armorLevel2) / 2 - i;

			if (effectiveSaturationOfBar >= 1)
				mc.ingameGUI.drawTexturedModalRect(x, y, 9, 0, 9, 9);
			else if (effectiveSaturationOfBar != 0)
				mc.ingameGUI.drawTexturedModalRect((x - 8), y, 0, 0, 9, 9);
		}

		if (armorLevel  > 40){
			if (armorLevel  > 60)
				armorLevel = 60;
			endBar = (int) Math.ceil(Math.min(20, (armorLevel - 40)) / 2f);
			mc.getTextureManager().bindTexture(modIcons);

			for (int i = 0; i < (endBar + 1); ++i)
			{
				int x = left + i * 8;
				int y = top;
				float effectiveSaturationOfBar = (armorLevel - 40) / 2 - i;

				if (effectiveSaturationOfBar >= 1)
					mc.ingameGUI.drawTexturedModalRect(x, y, 27, 0, 9, 9);
				else if (effectiveSaturationOfBar != 0)
					mc.ingameGUI.drawTexturedModalRect((x - 8), y, 18, 0, 9, 9);
			}
		}

		// rebind default icons
		mc.getTextureManager().bindTexture(Gui.icons);
	}

}
