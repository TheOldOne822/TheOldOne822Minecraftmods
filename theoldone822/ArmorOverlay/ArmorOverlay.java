package theoldone822.ArmorOverlay;

import java.io.File;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.common.config.Configuration;

@Mod(modid = "armoroverlay", name = "Armor Overlay", version = "2.0")
public class ArmorOverlay {

	static int overlayLevels = 3;
	static int armorPices = 2;
	static boolean showNumbers = false;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		File installDir = event.getModConfigurationDirectory();
		Configuration settings = new Configuration(new File(installDir, "ArmorOverlay.cfg"));

		settings.load();
		overlayLevels = settings.get("config", "OverlayLevels", 3,
				"Max armor 'bars'. can be 3 (iron-gold-diamond) 5 (leather-chain-iron..) 10 (adds mod armor icons with 2 past diamond) or 20").getInt();
		if (overlayLevels <= 3) {
			overlayLevels = 3;
		} else if (overlayLevels <= 5) {
			overlayLevels = 5;
		} else if (overlayLevels <= 10) {
			overlayLevels = 10;
		} else {
			overlayLevels = 20;
		}
		armorPices = settings.get("config", "ArmorPices", 2, "Number of armor points to make 1 full armor icon. can be 1, 2 or 4").getInt();
		if (armorPices == 3 || armorPices > 4)
			armorPices = 4;
		if (armorPices < 1)
			armorPices = 1;
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
