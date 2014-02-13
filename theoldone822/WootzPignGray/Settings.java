package theoldone822.WootzPignGray;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Settings {
	//Custom Furnaces
	public static float grayFurnaceFuelMultiplier;
	public static int grayFurnaceMultiplier;
	public static int grayFurnaceMultiChance;
	public static int grayFurnaceExtra;
	public static int grayFurnaceExtraChance;
	public static float grayFurnaceSpeed;
	public static int grayFurnaceHardness;
	public static int grayFurnaceResistance;
	public static float grayFurnaceLightValue;

	//Bow Modifiers
	public static int grayBowDamageModifier;
	public static int grayBowZoomModifier;
	public static int grayBowKnockbackModifier;

	//Tool Stats
	public static int wootzMiningLevel;
	public static int wootzUsesNum;
	public static float wootzMiningSpeed;
	public static int wootzDamageVsEntity;
	public static int wootzEnchantability;
	public static int hardenedsteelMiningLevel;
	public static int hardenedsteelUsesNum;
	public static float hardenedsteelMiningSpeed;
	public static int hardenedsteelDamageVsEntity;
	public static int hardenedsteelEnchantability;
	public static int rePigironMiningLevel;
	public static int rePigironUsesNum;
	public static float rePigironMiningSpeed;
	public static int rePigironDamageVsEntity;
	public static int rePigironEnchantability;
	public static int grayMiningLevel;
	public static int grayUsesNum;
	public static float grayMiningSpeed;
	public static int grayDamageVsEntity;
	public static int grayEnchantability;

	//Armor Stats
	public static int wootzArmorDurability;
	public static int[] wootzArmorDamageReduction;
	public static int wootzArmorEnchantability;
	public static int hardenedsteelArmorDurability;
	public static int[] hardenedsteelArmorDamageReduction;
	public static int hardenedsteelArmorEnchantability;

	//Block Stats
	//Wootz
	public static float wootzBlockHardness;
	public static float wootzBlockResistance;

	//pigiron steel
	public static float pigironBlockHardness;
	public static float pigironBlockResistance;

	//Refined Pigiron
	public static float rePigironBlockHardness;
	public static float rePigironBlockResistance;

	//Gray
	public static float grayBlockHardness;
	public static float grayBlockResistance;

    public static boolean enableRecycling;


	/**
	 * The method that loads/creates the settings file. Values can be changed from true to false depending on user preference, and certain other values can be set. This is called by the main SimpleOres class.
	 */
	public static void doSettings(FMLPreInitializationEvent event)
	{
	File installDir = event.getModConfigurationDirectory();
	File configDir = new File(installDir, "WootzPignGray Configuration");
	Configuration settings = new Configuration(new File(configDir, "WootzPignGray Settings.cfg"));

	settings.load();

	//Custom Furnace Multipliers
	grayFurnaceFuelMultiplier = (float) settings.get("Furnace", "Gray Furnace Fuel Multiplier", 1.25).getDouble(grayFurnaceFuelMultiplier);
	grayFurnaceSpeed = (float) settings.get("Furnace", "Gray Furnace Speed Multiplier", 1.5).getDouble(grayFurnaceSpeed);
	grayFurnaceHardness = settings.get("Furnace", "Gray Furnace Hardness", 10).getInt();
	grayFurnaceResistance = settings.get("Furnace", "Gray Furnace Resistance", 20).getInt();
	grayFurnaceLightValue = (float) settings.get("Furnace", "Gray Furnace Light Value", 1.0).getDouble(grayFurnaceLightValue);

	//Tool Stat Modifiers
	wootzMiningLevel = settings.get("Tool Stats", "Wootz steel Mining Level", 2).getInt();
	wootzUsesNum = settings.get("Tool Stats", "Wootz steel Uses Number", 500).getInt();
	wootzMiningSpeed = (float) settings.get("Tool Stats", "Wootz steel Mining Speed", 8.0).getDouble(wootzMiningSpeed);
	wootzDamageVsEntity = settings.get("Tool Stats", "Wootz steel Damage Vs Entity", 2).getInt();
	wootzEnchantability = settings.get("Tool Stats", "Wootz steel Enchantability", 10).getInt();
	hardenedsteelMiningLevel = settings.get("Tool Stats", "Hardened steel Mining Level", 3).getInt();
	hardenedsteelUsesNum = settings.get("Tool Stats", "Hardened steel Uses Number", 36).getInt();
	hardenedsteelMiningSpeed = (float) settings.get("Tool Stats", "Hardened steel Mining Speed", 12).getDouble(hardenedsteelMiningSpeed);
	hardenedsteelDamageVsEntity = settings.get("Tool Stats", "Hardened steel Damage Vs Entity", 3).getInt();
	hardenedsteelEnchantability = settings.get("Tool Stats", "Hardened steel Enchantability", 3).getInt();

	//Armor Stat Modifiers
	wootzArmorDurability = settings.get("Armor Stats", "Wootz steel Armor Durability", 16).getInt();
	wootzArmorDamageReduction = settings.get("Armor Stats", "Wootz steel Armor Damage Reduction Array", new int[] {3, 6, 5, 3}).getIntList();
	wootzArmorEnchantability = settings.get("Armor Stats", "Wootz steel Armor Enchantability", 10).getInt();

	hardenedsteelArmorDurability = settings.get("Armor Stats", "Hardened steel Armor Durability", 6).getInt();
	hardenedsteelArmorDamageReduction = settings.get("Armor Stats", "Hardened steel Armor Damage Reduction Array", new int[] {3, 7, 6, 3}).getIntList();
	hardenedsteelArmorEnchantability = settings.get("Armor Stats", "Hardened steel Armor Enchantability", 3).getInt();

	//Block Stat Modifiers
	wootzBlockHardness = (float) settings.get("Block Stats", "Wootz steel Block Hardness", 5.0).getDouble(wootzBlockHardness);
	wootzBlockResistance = (float) settings.get("Block Stats", "Wootz steel Block Resistance", 8.0).getDouble(wootzBlockResistance);

	pigironBlockHardness = (float) settings.get("Block Stats", "Hardened steel Block Hardness", 7.0).getDouble(pigironBlockHardness);
	pigironBlockResistance = (float) settings.get("Block Stats", "Hardened steel Block Resistance", 12.0).getDouble(pigironBlockResistance);

	rePigironBlockHardness = (float) settings.get("Block Stats", "Refined Pigiron Block Hardness", 10.0).getDouble(rePigironBlockHardness);
	rePigironBlockResistance = (float) settings.get("Block Stats", "Refined Pigiron Block Resistance", 20.0).getDouble(rePigironBlockResistance);

	grayBlockHardness = (float) settings.get("Block Stats", "Gray Block Hardness", 8.0).getDouble(grayBlockHardness);
	grayBlockResistance = (float) settings.get("Block Stats", "Gray Block Resistance", 10.0).getDouble(grayBlockResistance);

    // Recycling
    enableRecycling= settings.get("Enable Recycling", "Enable item recycling recipes: false or true?", false).getBoolean(false);

	settings.save();
}}
