package theoldone822.ArmorOverlay;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "armoroverlay", name = "Armor Overlay", version = "1.0")
public class ArmorOverlay {

	@EventHandler
	public void init(FMLInitializationEvent event)
	{

		if (event.getSide() == Side.CLIENT)
		{
			HUDOverlayHandler.init();
		}
	}
}
