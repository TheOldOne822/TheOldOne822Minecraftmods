package theoldone822.Endium;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Settings {
	//Tool Stats
	public static int EndiumMiningLevel;
	public static int EndiumUsesNum;
	public static float EndiumMiningSpeed;
	public static int EndiumDamageVsEntity;
	public static int EndiumEnchantability;
	public static int TelosMiningLevel;
	public static int TelosUsesNum;
	public static float TelosMiningSpeed;
	public static int TelosDamageVsEntity;
	public static int TelosEnchantability;
	public static int SunteleiaMiningLevel;
	public static int SunteleiaUsesNum;
	public static float SunteleiaMiningSpeed;
	public static int SunteleiaDamageVsEntity;
	public static int SunteleiaEnchantability;

	//Armor Stats
	public static int EndiumArmorDurability;
	public static int[] EndiumArmorDamageReduction;
	public static int EndiumArmorEnchantability;
	public static int TelosArmorDurability;
	public static int[] TelosArmorDamageReduction;
	public static int TelosArmorEnchantability;
    public static float TelosArmorMinFallHeight;
	public static double TelosArmorJumpBoostAmount;
	public static int SunteleiaArmorDurability;
	public static int[] SunteleiaArmorDamageReduction;
	public static int SunteleiaArmorEnchantability;

	//Block Stats
	//Endium
	public static float EndiumBlockHardness;
	public static float EndiumBlockResistance;
	public static float EndiumBlockLightValue;
	public static float EndiumOreHardness;
	public static float EndiumOreResistance;
	public static float EndiumOreLightValue;

	public static int EndiumSpawnRate;
	public static int EndiumVeinSize;

	//Telos
	public static float TelosBlockHardness;
	public static float TelosBlockResistance;
	public static float TelosBlockLightValue;

	//Sunteleia
	public static float SunteleiaBlockHardness;
	public static float SunteleiaBlockResistance;
	public static float SunteleiaBlockLightValue;

    public static boolean enableRecycling;


	/**
	 * The method that loads/creates the settings file. Values can be changed from true to false depending on user preference, and certain other values can be set. This is called by the main SimpleOres class.
	 */
	public static void doSettings(FMLPreInitializationEvent event)
	{
	File installDir = event.getModConfigurationDirectory();
	File configDir = new File(installDir, "Endium");
	Configuration settings = new Configuration(new File(configDir, "Endium Settings.cfg"));

	settings.load();

	//Tool Stat Modifiers
	EndiumMiningLevel = settings.get("Tool Stats", "Endium Mining Level", 6).getInt();
	EndiumUsesNum = settings.get("Tool Stats", "Endium Uses Number", 4250).getInt();
	EndiumMiningSpeed = (float) settings.get("Tool Stats", "Endium Mining Speed", 26.0).getDouble(EndiumMiningSpeed);
	EndiumDamageVsEntity = settings.get("Tool Stats", "Endium Damage Vs Entity", 9).getInt();
	EndiumEnchantability = settings.get("Tool Stats", "Endium Enchantability", 31).getInt();
	TelosMiningLevel = settings.get("Tool Stats", "Telos Mining Level", 7).getInt();
	TelosUsesNum = settings.get("Tool Stats", "Telos Uses Number", 4450).getInt();
	TelosMiningSpeed = (float) settings.get("Tool Stats", "Telos Mining Speed", 32).getDouble(TelosMiningSpeed);
	TelosDamageVsEntity = settings.get("Tool Stats", "Telos Damage Vs Entity", 10).getInt();
	TelosEnchantability = settings.get("Tool Stats", "Telos Enchantability", 34).getInt();
	SunteleiaMiningLevel = settings.get("Tool Stats", "Sunteleia Mining Level", 8).getInt();
	SunteleiaUsesNum = settings.get("Tool Stats", "Sunteleia Uses Number", 8000).getInt();
	SunteleiaMiningSpeed = (float) settings.get("Tool Stats", "Sunteleia Mining Speed", 24.0).getDouble(SunteleiaMiningSpeed);
	SunteleiaDamageVsEntity = settings.get("Tool Stats", "Sunteleia Damage Vs Entity", 11).getInt();
	SunteleiaEnchantability = settings.get("Tool Stats", "Sunteleia Enchantability", 38).getInt();

	//Armor Stat Modifiers
	EndiumArmorDurability = settings.get("Armor Stats", "Endium Armor Durability", 60).getInt();
	EndiumArmorDamageReduction = settings.get("Armor Stats", "Endium Armor Damage Reduction Array", new int[] {5, 9, 8, 5}).getIntList();
	EndiumArmorEnchantability = settings.get("Armor Stats", "Endium Armor Enchantability", 31).getInt();

	TelosArmorDurability = settings.get("Armor Stats", "Telos Armor Durability", 64).getInt();
	TelosArmorDamageReduction = settings.get("Armor Stats", "Telos Armor Damage Reduction Array", new int[] {6, 9, 8, 6}).getIntList();
	TelosArmorEnchantability = settings.get("Armor Stats", "Telos Armor Enchantability", 34).getInt();
	TelosArmorMinFallHeight = (float) settings.get("Armor Stats", "Telos Armor Fall Protection", 5.0).getDouble(TelosArmorMinFallHeight);
	TelosArmorJumpBoostAmount = settings.get("Armor Stats", "Telos Armor Jump Boost Amount(0.2 lets you jump 2.5 blocks)", 0.20).getDouble(TelosArmorJumpBoostAmount);

	SunteleiaArmorDurability = settings.get("Armor Stats", "Sunteleia Armor Durability", 96).getInt();
	SunteleiaArmorDamageReduction = settings.get("Armor Stats", "Sunteleia Armor Damage Reduction Array", new int[] {7, 10, 9, 8}).getIntList();
	SunteleiaArmorEnchantability = settings.get("Armor Stats", "Sunteleia Armor Enchantability", 38).getInt();

	//Block Stat Modifiers
	EndiumBlockHardness = (float) settings.get("Block Stats", "Endium Block Hardness", 5.0).getDouble(EndiumBlockHardness);
	EndiumBlockResistance = (float) settings.get("Block Stats", "Endium Block Resistance", 8.0).getDouble(EndiumBlockResistance);
	EndiumBlockLightValue = (float) settings.get("Block Stats", "Endium Block Light Value", 0.8).getDouble(EndiumBlockLightValue);

	TelosBlockHardness = (float) settings.get("Block Stats", "Telos Block Hardness", 7.0).getDouble(TelosBlockHardness);
	TelosBlockResistance = (float) settings.get("Block Stats", "Telos Block Resistance", 12.0).getDouble(TelosBlockResistance);
	TelosBlockLightValue = (float) settings.get("Block Stats", "Telos Block Light Value", 0.7).getDouble(EndiumOreLightValue);

	SunteleiaBlockHardness = (float) settings.get("Block Stats", "Sunteleia Block Hardness", 10.0).getDouble(SunteleiaBlockHardness);
	SunteleiaBlockResistance = (float) settings.get("Block Stats", "Sunteleia Block Resistance", 20.0).getDouble(SunteleiaBlockResistance);
	SunteleiaBlockLightValue = (float) settings.get("Block Stats", "Sunteleia Block Light Value", 0.9).getDouble(SunteleiaBlockLightValue);

	EndiumOreHardness = (float) settings.get("Block Stats", "Endium Ore Hardness", 12.0).getDouble(EndiumOreHardness);
	EndiumOreResistance = (float) settings.get("Block Stats", "Endium Ore Resistance", 40.0).getDouble(EndiumOreResistance);
	EndiumOreLightValue = (float) settings.get("Block Stats", "Endium Ore Light Value", 0.6).getDouble(EndiumOreLightValue);

    // Recycling
    enableRecycling= settings.get("Enable Recycling", "Enable item recycling recipes: false or true?", false).getBoolean(false);

    EndiumSpawnRate = settings.get("Spawn", "Endium Spawn Rate", 15).getInt();
    EndiumVeinSize = settings.get("Spawn", "Endium Vein Size", 7).getInt();

    settings.save();
}}
