package theoldone822.NetherrocksFusion;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Settings {
	//Custom Furnaces
	public static float dragonbezoarFurnaceFuelMultiplier;
	public static int dragonbezoarFurnaceMultiplier;
	public static int dragonbezoarFurnaceMultiChance;
	public static int dragonbezoarFurnaceExtra;
	public static int dragonbezoarFurnaceExtraChance;
	public static float dragonbezoarFurnaceSpeed;
	public static int dragonbezoarFurnaceHardness;
	public static int dragonbezoarFurnaceResistance;
	public static float dragonbezoarFurnaceLightValue;

	//Bow Modifiers
	public static int dragonbezoarBowDamageModifier;
	public static int dragonbezoarBowZoomModifier;
	public static int dragonbezoarBowKnockbackModifier;

	//Tool Stats
	public static int cinderstoneMiningLevel;
	public static int cinderstoneUsesNum;
	public static float cinderstoneMiningSpeed;
	public static int cinderstoneDamageVsEntity;
	public static int cinderstoneEnchantability;
	public static int thrakaMiningLevel;
	public static int thrakaUsesNum;
	public static float thrakaMiningSpeed;
	public static int thrakaDamageVsEntity;
	public static int thrakaEnchantability;
	public static int pyralisMiningLevel;
	public static int pyralisUsesNum;
	public static float pyralisMiningSpeed;
	public static int pyralisDamageVsEntity;
	public static int pyralisEnchantability;
	public static int dragonbezoarMiningLevel;
	public static int dragonbezoarUsesNum;
	public static float dragonbezoarMiningSpeed;
	public static int dragonbezoarDamageVsEntity;
	public static int dragonbezoarEnchantability;

	//Armor Stats
	public static int cinderstoneArmorDurability;
	public static int[] cinderstoneArmorDamageReduction;
	public static int cinderstoneArmorEnchantability;
	public static int thrakaArmorDurability;
	public static int[] thrakaArmorDamageReduction;
	public static int thrakaArmorEnchantability;
	public static int pyralisArmorDurability;
	public static int[] pyralisArmorDamageReduction;
	public static int pyralisArmorEnchantability;
	public static int pyralisArmorResistance;
	public static int pyralischainArmorDurability;
	public static int[] pyralischainArmorDamageReduction;
	public static int pyralischainArmorEnchantability;
	public static int pyralischainArmorResistance;
	public static int dragonbezoarArmorDurability;
	public static int[] dragonbezoarArmorDamageReduction;
	public static int dragonbezoarArmorEnchantability;
	public static int dragonbezoarchainArmorDurability;
	public static int[] dragonbezoarchainArmorDamageReduction;
	public static int dragonbezoarchainArmorEnchantability;

	//Block Stats
	//Cinderstone
	public static float cinderstoneBlockHardness;
	public static float cinderstoneBlockResistance;
	public static float cinderstoneBlockLightValue;

	//Thraka
	public static float thrakaBlockHardness;
	public static float thrakaBlockResistance;

	//Pyralis
	public static float pyralisBlockHardness;
	public static float pyralisBlockResistance;
	public static float pyralisBlockLightValue;

	//DragonBezoar
	public static float dragonbezoarBlockHardness;
	public static float dragonbezoarBlockResistance;
	public static float dragonbezoarBlockLightValue;

    public static boolean enableRecycling;


	/**
	 * The method that loads/creates the settings file. Values can be changed from true to false depending on user preference, and certain other values can be set. This is called by the main SimpleOres class.
	 */
	public static void doSettings(FMLPreInitializationEvent event)
	{
	File installDir = event.getModConfigurationDirectory();
	File configDir = new File(installDir, "Netherrocks Fusions Configuration");
	Configuration settings = new Configuration(new File(configDir, "Netherrocks Fusions Settings.cfg"));

	settings.load();

	//Custom Furnace Multipliers
	dragonbezoarFurnaceFuelMultiplier = (float) settings.get("Furnace", "Dragon Bezoar Furnace Fuel Multiplier", 2.0).getDouble(dragonbezoarFurnaceFuelMultiplier);
	dragonbezoarFurnaceMultiplier = settings.get("Furnace", "Dragon Bezoar Furnace Multiplier", 2).getInt();
	dragonbezoarFurnaceMultiChance = settings.get("Furnace", "Dragon Bezoar Furnace Multiplier Chance", 25).getInt();
	dragonbezoarFurnaceExtra = settings.get("Furnace", "Dragon Bezoar Furnace Extra Amount", 1).getInt();
	dragonbezoarFurnaceExtraChance = settings.get("Furnace", "Dragon Bezoar Furnace Extra Chance", 50).getInt();
	dragonbezoarFurnaceSpeed = (float) settings.get("Furnace", "Dragon Bezoar Furnace Speed Multiplier", 3.0).getDouble(dragonbezoarFurnaceSpeed);
	dragonbezoarFurnaceHardness = settings.get("Furnace", "Dragon Bezoar Furnace Hardness", 60).getInt();
	dragonbezoarFurnaceResistance = settings.get("Furnace", "Dragon Bezoar Furnace Resistance", 120).getInt();
	dragonbezoarFurnaceLightValue = (float) settings.get("Furnace", "Dragon Bezoar Furnace Light Value", 1.0).getDouble(dragonbezoarFurnaceLightValue);

	//Bow Modifiers
	dragonbezoarBowDamageModifier = settings.get("Bow Modifiers", "Dragon Bezoar Bow Damage Modifier", 7).getInt();
	dragonbezoarBowZoomModifier = settings.get("Bow Modifiers", "Dragon Bezoar Bow Zoom Modifier", 35).getInt();
	dragonbezoarBowKnockbackModifier = settings.get("Bow Modifiers", "Dragon Bezoar Bow Knockback Modifier", 2).getInt();

	//Tool Stat Modifiers
	cinderstoneMiningLevel = settings.get("Tool Stats", "Cinderstone Mining Level", 0).getInt();
	cinderstoneUsesNum = settings.get("Tool Stats", "Cinderstone Uses Number", 40).getInt();
	cinderstoneMiningSpeed = (float) settings.get("Tool Stats", "Cinderstone Mining Speed", 10.0).getDouble(cinderstoneMiningSpeed);
	cinderstoneDamageVsEntity = settings.get("Tool Stats", "Cinderstone Damage Vs Entity", 7).getInt();
	cinderstoneEnchantability = settings.get("Tool Stats", "Cinderstone Enchantability", 4).getInt();
	thrakaMiningLevel = settings.get("Tool Stats", "Thraka Mining Level", 3).getInt();
	thrakaUsesNum = settings.get("Tool Stats", "Thraka Uses Number", 825).getInt();
	thrakaMiningSpeed = (float) settings.get("Tool Stats", "Thraka Mining Speed", 14).getDouble(thrakaMiningSpeed);
	thrakaDamageVsEntity = settings.get("Tool Stats", "Thraka Damage Vs Entity", 3).getInt();
	thrakaEnchantability = settings.get("Tool Stats", "Thraka Enchantability", 34).getInt();
	pyralisMiningLevel = settings.get("Tool Stats", "Pyralis Mining Level", 4).getInt();
	pyralisUsesNum = settings.get("Tool Stats", "Pyralis Uses Number", 3200).getInt();
	pyralisMiningSpeed = (float) settings.get("Tool Stats", "Pyralis Mining Speed", 12.0).getDouble(pyralisMiningSpeed);
	pyralisDamageVsEntity = settings.get("Tool Stats", "Pyralis Damage Vs Entity", 8).getInt();
	pyralisEnchantability = settings.get("Tool Stats", "Pyralis Enchantability", 29).getInt();
	dragonbezoarMiningLevel = settings.get("Tool Stats", "Dragon Bezoar Mining Level", 6).getInt();
	dragonbezoarUsesNum = settings.get("Tool Stats", "Dragon Bezoar Uses Number", 4500).getInt();
	dragonbezoarMiningSpeed = (float) settings.get("Tool Stats", "Dragon Bezoar Mining Speed", 16.0).getDouble(dragonbezoarMiningSpeed);
	dragonbezoarDamageVsEntity = settings.get("Tool Stats", "Dragon Bezoar Damage Vs Entity", 9).getInt();
	dragonbezoarEnchantability = settings.get("Tool Stats", "Dragon Bezoar Enchantability", 40).getInt();

	//Armor Stat Modifiers
	cinderstoneArmorDurability = settings.get("Armor Stats", "Cinderstone Armor Durability", 3).getInt();
	cinderstoneArmorDamageReduction = settings.get("Armor Stats", "Cinderstone Armor Damage Reduction Array", new int[] {1, 2, 1, 1}).getIntList();
	cinderstoneArmorEnchantability = settings.get("Armor Stats", "Cinderstone Armor Enchantability", 4).getInt();

	thrakaArmorDurability = settings.get("Armor Stats", "Thraka Armor Durability", 18).getInt();
	thrakaArmorDamageReduction = settings.get("Armor Stats", "Thraka Armor Damage Reduction Array", new int[] {3, 5, 4, 2}).getIntList();
	thrakaArmorEnchantability = settings.get("Armor Stats", "Thraka Armor Enchantability", 34).getInt();

	pyralisArmorDurability = settings.get("Armor Stats", "Pyralis Armor Durability", 25).getInt();
	pyralisArmorDamageReduction = settings.get("Armor Stats", "Pyralis Armor Damage Reduction Array", new int[] {3, 8, 6, 3}).getIntList();
	pyralisArmorEnchantability = settings.get("Armor Stats", "Pyralis Armor Enchantability", 29).getInt();
	pyralisArmorResistance = settings.get("Armor Stats", "Pyralis Armor Resistance", 50).getInt();

	pyralischainArmorDurability = settings.get("Armor Stats", "Pyralis Chain Armor Durability", 20).getInt();
	pyralischainArmorDamageReduction = settings.get("Armor Stats", "Pyralis Chain Armor Damage Reduction Array", new int[] {2, 6, 5, 2}).getIntList();
	pyralischainArmorEnchantability = settings.get("Armor Stats", "Pyralis Chain Armor Enchantability", 31).getInt();
	pyralischainArmorResistance = settings.get("Armor Stats", "Pyralis Chain Armor Resistance", 50).getInt();

	dragonbezoarchainArmorDurability = settings.get("Armor Stats", "Dragon Bezoar Chain Armor Durability", 51).getInt();
	dragonbezoarchainArmorDamageReduction = settings.get("Armor Stats", "Dragon Chain Bezoar Armor Damage Reduction Array", new int[] {4, 7, 6, 4}).getIntList();
	dragonbezoarchainArmorEnchantability = settings.get("Armor Stats", "Dragon Chain Bezoar Armor Enchantability", 40).getInt();

	dragonbezoarArmorDurability = settings.get("Armor Stats", "Dragon Bezoar Armor Durability", 62).getInt();
	dragonbezoarArmorDamageReduction = settings.get("Armor Stats", "Dragon Bezoar Armor Damage Reduction Array", new int[] {6, 9, 8, 7}).getIntList();
	dragonbezoarArmorEnchantability = settings.get("Armor Stats", "Dragon Bezoar Armor Enchantability", 40).getInt();

	//Block Stat Modifiers
	cinderstoneBlockHardness = (float) settings.get("Block Stats", "Cinderstone Block Hardness", 5.0).getDouble(cinderstoneBlockHardness);
	cinderstoneBlockResistance = (float) settings.get("Block Stats", "Cinderstone Block Resistance", 8.0).getDouble(cinderstoneBlockResistance);
	cinderstoneBlockLightValue = (float) settings.get("Block Stats", "Cinderstone Block Light Value", 1.0).getDouble(cinderstoneBlockLightValue);

	thrakaBlockHardness = (float) settings.get("Block Stats", "Thraka Block Hardness", 7.0).getDouble(thrakaBlockHardness);
	thrakaBlockResistance = (float) settings.get("Block Stats", "Thraka Block Resistance", 12.0).getDouble(thrakaBlockResistance);

	pyralisBlockHardness = (float) settings.get("Block Stats", "Pyralis Block Hardness", 10.0).getDouble(pyralisBlockHardness);
	pyralisBlockResistance = (float) settings.get("Block Stats", "Pyralis Block Resistance", 20.0).getDouble(pyralisBlockResistance);
	pyralisBlockLightValue = (float) settings.get("Block Stats", "Pyralis Block Light Value", 0.7).getDouble(pyralisBlockLightValue);

	dragonbezoarBlockHardness = (float) settings.get("Block Stats", "Dragon Bezoar Block Hardness", 12.0).getDouble(dragonbezoarBlockHardness);
	dragonbezoarBlockResistance = (float) settings.get("Block Stats", "Dragon Bezoar Block Resistance", 40.0).getDouble(dragonbezoarBlockResistance);
	dragonbezoarBlockLightValue = (float) settings.get("Block Stats", "Dragon Bezoar Block Light Value", 1.0).getDouble(dragonbezoarBlockLightValue);

    // Recycling
    enableRecycling= settings.get("Enable Recycling", "Enable item recycling recipes: false or true?", false).getBoolean(false);

	settings.save();
}}
