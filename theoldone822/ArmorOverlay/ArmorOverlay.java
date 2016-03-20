package theoldone822.ArmorOverlay;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = "armoroverlay", name = "Armor Overlay", version = "2.0")
public class ArmorOverlay {

	static int overlayLevels = 3;
	static boolean showNumbers = false;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		File installDir = event.getModConfigurationDirectory();
		Configuration settings = new Configuration(new File(installDir, "ArmorOverlay.cfg"));

		settings.load();
		overlayLevels = settings.get("config", "OverlayLevels", 3,
				"Max armor 'bars'. can be 3 (iron-diamond-gold) 6 (leather-chain-iron..) 9 (adds lots of mod armor icons) or 18. All settings scale to show diamond at diamond level and full at cap").getInt();
		if (overlayLevels <= 3) {
			overlayLevels = 3;
		} else if (overlayLevels <= 6) {
			overlayLevels = 6;
		} else if (overlayLevels <= 9) {
			overlayLevels = 9;
		} else {
			overlayLevels = 18;
		}
		showNumbers = settings.get("config", "Displaynumber", false,
				"Shows the raw number of how much armor you have next to the bar").getBoolean();
		settings.save();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		if (event.getSide() == Side.CLIENT) {
			HUDOverlayHandler.init();
		}
	}
}
