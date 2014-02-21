package theoldone822.SimpleOreRegen;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(
		modid = "simpleoreregen",
		name = "Simple Ores Regen Plugin",
		version = "1.0beta",
		dependencies = "after:oreregen, after:simpleores; after:onlysilver; after:simplecobalt; after:simpletungsten; after:Tennantite")
public class SimpleOreRegen {
	@Instance("simpleoreregen")
	public static SimpleOreRegen instance;

	public static Configuration config;

	public static int copperReSpawnRate;
	public static int copperReSpawnChance;

	public static int tinReSpawnRate;
	public static int tinReSpawnChance;

	public static int mythrilReSpawnRate;
	public static int mythrilReSpawnChance;

	public static int adamantiumReSpawnRate;
	public static int adamantiumReSpawnChance;

	public static int silverReSpawnRate;
	public static int silverReSpawnChance;

	public static int tungstenReSpawnRate;
	public static int tungstenReSpawnChance;

	public static int cobaltReSpawnRate;
	public static int cobaltReSpawnChance;

	public static int tennantiteReSpawnRate;
	public static int tennantiteReSpawnChance;

	@EventHandler
	// used in 1.6.2
			public
			void preInit(FMLPreInitializationEvent event) {
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

		if (PluginChecks.getSimpleInstalled()) {
			copperReSpawnRate = config.get("Simpleores", "Copper Respawn delay (in min)", 2).getInt();
			copperReSpawnChance = config.get("Simpleores", "Copper Respawn chance", 50).getInt();

			tinReSpawnRate = config.get("Simpleores", "Tin Respawn delay (in min)", 3).getInt();
			tinReSpawnChance = config.get("Simpleores", "Tin Respawn chance", 45).getInt();

			mythrilReSpawnRate = config.get("Simpleores", "Mythril Respawn delay (in min)", 12).getInt();
			mythrilReSpawnChance = config.get("Simpleores", "Mythril Respawn chance", 35).getInt();

			adamantiumReSpawnRate = config.get("Simpleores", "Adamantium Respawn delay (in min)", 15).getInt();
			adamantiumReSpawnChance = config.get("Simpleores", "Adamantium Respawn chance", 20).getInt();
		}

		if (PluginChecks.getSilverInstalled()) {
			silverReSpawnRate = config.get("Only Silver", "Silver Respawn delay (in min)", 12).getInt();
			silverReSpawnChance = config.get("Only Silver", "Silver Respawn chance", 35).getInt();
		}

		if (PluginChecks.getCobaltInstalled()) {
			cobaltReSpawnRate = config.get("Simple Cobalt", "Cobalt Respawn delay (in min)", 10).getInt();
			cobaltReSpawnChance = config.get("Simple Cobalt", "Cobalt Respawn chance", 40).getInt();
		}

		if (PluginChecks.getTungstenInstalled()) {
			tungstenReSpawnRate = config.get("Simple Tungsten", "Tungsten Respawn delay (in min)", 8).getInt();
			tungstenReSpawnChance = config.get("Simple Tungsten", "Tungsten Respawn chance", 45).getInt();
		}

		if (PluginChecks.getTennantiteInstalled()) {
			tennantiteReSpawnRate = config.get("Tennantite", "Tennantite Respawn delay (in min)", 10).getInt();
			tennantiteReSpawnChance = config.get("Tennantite", "Tennantite Respawn chance", 45).getInt();
		}

		config.save();
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		if (PluginChecks.getSimpleInstalled()) {
			FMLInterModComms.sendMessage("oreregen", "add-ore", alexndr.SimpleOres.api.helpers.CoreHelper.coreContent.copperOre.blockID + ", " + copperReSpawnRate + ", "
							+ copperReSpawnChance);
			FMLInterModComms.sendMessage("oreregen", "add-ore", alexndr.SimpleOres.api.helpers.CoreHelper.coreContent.tinOre.blockID + ", " + tinReSpawnRate + ", "
							+ tinReSpawnChance);
			FMLInterModComms.sendMessage("oreregen", "add-ore", alexndr.SimpleOres.api.helpers.CoreHelper.coreContent.mythrilOre.blockID + ", " + mythrilReSpawnRate + ", "
							+ mythrilReSpawnChance);
			FMLInterModComms.sendMessage("oreregen", "add-ore", alexndr.SimpleOres.api.helpers.CoreHelper.coreContent.adamantiumOre.blockID + ", " + adamantiumReSpawnRate
							+ ", " + adamantiumReSpawnChance);
		}

		if (PluginChecks.getSilverInstalled()) {
			FMLInterModComms.sendMessage("oreregen", "add-ore", OnlySilver.code.api.OnlySilverAPI.silverOre.get().blockID + ", " + silverReSpawnRate + ", " + silverReSpawnChance);
		}

		if (PluginChecks.getCobaltInstalled()) {
			FMLInterModComms.sendMessage("oreregen", "add-ore", akkamaddi.simplecobalt.code.SimpleCobaltCore.oreCobalt.blockID + ", " + cobaltReSpawnRate + ", " + cobaltReSpawnChance);
		}

		if (PluginChecks.getTungstenInstalled()) {
			FMLInterModComms.sendMessage("oreregen", "add-ore",
					akkamaddi.simpletungsten.code.SimpleTungstenCore.oreTungsten.blockID + ", " + tungstenReSpawnRate + ", " + tungstenReSpawnChance);
		}

		if (PluginChecks.getTennantiteInstalled()) {
			FMLInterModComms.sendMessage("oreregen", "add-ore", theoldone822.Tennantite.Tennantite.oreTennantite.blockID + ", " + tennantiteReSpawnRate + ", " + tennantiteReSpawnChance);
		}
	}
}
