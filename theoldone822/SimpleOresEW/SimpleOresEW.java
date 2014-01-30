package theoldone822.SimpleOresEW;

import java.io.File;
import java.util.Arrays;

import theoldone822.SimpleOresEW.Items.ItemExtendedArmor;
import theoldone822.SimpleOresEW.Items.ItemExtendedAxe;
import theoldone822.SimpleOresEW.Items.ItemExtendedBow;
import theoldone822.SimpleOresEW.Items.ItemExtendedHoe;
import theoldone822.SimpleOresEW.Items.ItemExtendedPickaxe;
import theoldone822.SimpleOresEW.Items.ItemExtendedShovel;
import theoldone822.SimpleOresEW.Items.ItemExtendedSword;
import theoldone822.SimpleOresEW.Items.ItemExtendedShears;
import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(
		modid = "simpleoresew",
		name = "Simple Ore Extended Work Bench Plugin",
		version = "1.7",
		dependencies = "required-after:extendedWorkbench; after:simpleores; after:simpleoresfusion; after:onlysilver; after:MoCreatures; after:SimpleArsenic; after:netherrocksfusion; after:netherrocks; after:classicalalchemy; after:simplecthon; after:goldenglitter; after:haditecoal; after:simplecobalt; after:simpletungsten; after:sterlingandblack")
public class SimpleOresEW {

	public static int simpleID;
	public static int fusionID;
	public static int netherID;
	public static int silverID;
	public static int netherfusionID;
	public static int arsenicID;
	public static int alchemyID;
	public static int cthonID;
	public static int glitterID;
	public static int haditeID;
	public static int cobaltID;
	public static int tungstenID;
	public static int sterlingID;

	public static Item extendedmythrilBow;
	public static Item extendedonyxBow;
	public static Item extendedthyriumBow;
	public static Item extendedsinisiteBow;
	public static Item extendedtinShears;
	public static Item extendedadamantiumShears;
	public static Item extendedonyxShears;

	public static Item extendedfyriteHelm;
	public static Item extendedfyriteChest;
	public static Item extendedfyriteLegs;
	public static Item extendedfyriteBoots;
	public static Item extendedillumeniteHelm;
	public static Item extendedillumeniteChest;
	public static Item extendedillumeniteLegs;
	public static Item extendedillumeniteBoots;

	public static Item extendedfyriteSword;
	public static Item extendedillumeniteSword;
	public static Item extendedfyritePick;

	public static Item extendedsilverHelm;
	public static Item extendedsilverChest;
	public static Item extendedsilverLegs;
	public static Item extendedsilverBoots;

	public static Item extendedsilverBow;

	public static Item extendedcthonHelm;
	public static Item extendedcthonChest;
	public static Item extendedcthonLegs;
	public static Item extendedcthonBoots;

	public static Item extendedcinderstoneSword;
	public static Item extendedthrakaPick;
	public static Item extendedthrakaAxe;
	public static Item extendedthrakaShovel;
	public static Item extendedthrakaSword;
	public static Item extendedthrakaHoe;
	public static Item extendedpyralisPick;
	public static Item extendedpyralisAxe;
	public static Item extendedpyralisShovel;
	public static Item extendedpyralisSword;
	public static Item extendedpyralisHoe;
	public static Item extendeddragonbezoarPick;
	public static Item extendeddragonbezoarAxe;
	public static Item extendeddragonbezoarShovel;
	public static Item extendeddragonbezoarSword;
	public static Item extendeddragonbezoarHoe;
	public static Item extendeddragonbezoarBow;
	public static Item extendeddragonbezoarShears;

	public static Item extendedcinderstoneHelm;
	public static Item extendedcinderstoneChest;
	public static Item extendedcinderstoneLegs;
	public static Item extendedcinderstoneBoots;
	public static Item extendedthrakaHelm;
	public static Item extendedthrakaChest;
	public static Item extendedthrakaLegs;
	public static Item extendedthrakaBoots;
	public static Item extendedpyralisHelm;
	public static Item extendedpyralisChest;
	public static Item extendedpyralisLegs;
	public static Item extendedpyralisBoots;
	public static Item extendeddragonbezoarHelm;
	public static Item extendeddragonbezoarChest;
	public static Item extendeddragonbezoarLegs;
	public static Item extendeddragonbezoarBoots;

	public static int extendedcinderstoneSwordID;
	public static int extendedthrakaPickID;
	public static int extendedthrakaAxeID;
	public static int extendedthrakaShovelID;
	public static int extendedthrakaSwordID;
	public static int extendedthrakaHoeID;
	public static int extendedpyralisPickID;
	public static int extendedpyralisAxeID;
	public static int extendedpyralisShovelID;
	public static int extendedpyralisSwordID;
	public static int extendedpyralisHoeID;
	public static int extendeddragonbezoarPickID;
	public static int extendeddragonbezoarAxeID;
	public static int extendeddragonbezoarShovelID;
	public static int extendeddragonbezoarSwordID;
	public static int extendeddragonbezoarHoeID;
	public static int extendeddragonbezoarBowID;
	public static int extendeddragonbezoarShearsID;

	public static int extendedcinderstoneHelmID;
	public static int extendedcinderstoneChestID;
	public static int extendedcinderstoneLegsID;
	public static int extendedcinderstoneBootsID;
	public static int extendedthrakaHelmID;
	public static int extendedthrakaChestID;
	public static int extendedthrakaLegsID;
	public static int extendedthrakaBootsID;
	public static int extendedpyralisHelmID;
	public static int extendedpyralisChestID;
	public static int extendedpyralisLegsID;
	public static int extendedpyralisBootsID;
	public static int extendeddragonbezoarHelmID;
	public static int extendeddragonbezoarChestID;
	public static int extendeddragonbezoarLegsID;
	public static int extendeddragonbezoarBootsID;
	
	public static class extendedValues {

		// sword
		public static float increaseSwordDurability = 1.5f;
		public static float increaseSwordDamage = 2f;
		public static float increaseSwordMiningSpeed = 1.5f;

		// tool + hoe
		public static float increaseToolDurability = 2f;
		public static float increaseToolPower = 2f;
		public static float increaseToolAttackDamage = 1.5f;
		public static float increaseHoeDurability = 2f;

		// bow
		public static float increaseBowDurability = 1.5f;
		public static float increaseBowStrength = 1.5f;
		public static float increaseBowTime = 1.2f;
		public static float increaseBowDamage = 1.5f;

		// armor
		public static float increaseArmorDurability = 1.5f;
		// damage reduction increased

		// shears
		public static float increaseShearDurability = 1.5f;
		public static float increaseShearMiningSpeed = 1.5f;
		// efficiency is doubled

	}

	public static int rendererextendedCinderstone;
	public static int rendererextendedThraka;
	public static int rendererextendedPyralis;
	public static int rendererextendedDragonBezoar;

	public static Configuration config;

	public static Item[][] item = new Item[5][40];
	public static ItemArmor[][] armor = new ItemArmor[33][4];

	@SidedProxy(clientSide = "theoldone822.SimpleOresEW.client.ClientProxy",
			serverSide = "theoldone822.SimpleOresEW.CommonProxy")
	public static CommonProxy proxy;

	@Instance("SimpleOresEW")
	public static SimpleOresEW instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new HandlerEvent());
		proxy.registerClientTickHandler();
		proxy.registerServerTickHandler();
		proxy.preInit();
		ModMetadata metadata = event.getModMetadata();
		metadata.autogenerated = false;

		metadata.authorList = Arrays.asList("theoldone822");
		metadata.description = "Adds Extended Workbench versions of Simple Ore tools.";
		config = new Configuration(new File("config", "SimpleOresEW.cfg"));
		config.load();

		simpleID = (config.getItem("Base", "SO Base ID", 24034)).getInt();
		fusionID = (config.getItem("Base", "Fusion Base ID", 24084)).getInt();
		netherID = (config.getItem("Base", "Netherrocks Base ID", 24123)).getInt();
		silverID = (config.getItem("Base", "Silver Base ID", 24202)).getInt();
		netherfusionID = (config.getItem("Base", "Netherrocks Fusion Base ID", 0)).getInt();
		arsenicID = (config.getItem("Base", "Arsenic Base ID", 24212)).getInt();
		alchemyID = (config.getItem("Base", "Alchemy Base ID", 24244)).getInt();
		cthonID = (config.getItem("Base", "Cthon Base ID", 24283)).getInt();
		glitterID = (config.getItem("Base", "Glittering Gold Base ID", 24292)).getInt();
		haditeID = (config.getItem("Base", "Hadite Base ID", 24313)).getInt();
		cobaltID = (config.getItem("Base", "Cobalt Base ID", 24321)).getInt();
		tungstenID = (config.getItem("Base", "Tungsten Base ID", 24357)).getInt();
		sterlingID = (config.getItem("Base", "Sterling Base ID", 24402)).getInt();

		extendedcinderstoneSwordID = config.getItem("Weapons", "Extended Cinderstone Sword", 6563).getInt();
		extendedthrakaPickID = config.getItem("Tools", "Extended Thraka Pickaxe", 6564).getInt();
		extendedthrakaAxeID = config.getItem("Tools", "Extended Thraka Axe", 6565).getInt();
		extendedthrakaShovelID = config.getItem("Tools", "Extended Thraka Shovel", 6566).getInt();
		extendedthrakaSwordID = config.getItem("Weapons", "Extended Thraka Sword", 6567).getInt();
		extendedthrakaHoeID = config.getItem("Tools", "Extended Thraka Hoe", 6568).getInt();
		extendedpyralisPickID = config.getItem("Tools", "Extended Pyralis Pickaxe", 6569).getInt();
		extendedpyralisAxeID = config.getItem("Tools", "Extended Pyralis Axe", 6570).getInt();
		extendedpyralisShovelID = config.getItem("Tools", "Extended Pyralis Shovel", 6571).getInt();
		extendedpyralisSwordID = config.getItem("Weapons", "Extended Pyralis Sword", 6572).getInt();
		extendedpyralisHoeID = config.getItem("Tools", "Extended Pyralis Hoe", 6573).getInt();
		extendeddragonbezoarPickID = config.getItem("Tools", "Extended Dragon Bezoar Pickaxe", 6574).getInt();
		extendeddragonbezoarAxeID = config.getItem("Tools", "Extended Dragon Bezoar Axe", 6575).getInt();
		extendeddragonbezoarShovelID = config.getItem("Tools", "Extended Dragon Bezoar Shovel", 6576).getInt();
		extendeddragonbezoarSwordID = config.getItem("Weapons", "Extended Dragon Bezoar Sword", 6577).getInt();
		extendeddragonbezoarHoeID = config.getItem("Tools", "Extended Dragon Bezoar Hoe", 6578).getInt();
		extendeddragonbezoarBowID = config.getItem("Weapons", "Extended Dragon Bezoar Bow", 6579).getInt();
		extendeddragonbezoarShearsID = config.getItem("Tools", "Extended Dragon Bezoar Shears", 6580).getInt();

		extendedcinderstoneHelmID = config.getItem("Armor", "Extended Cinderstone Helmet", 6581).getInt();
		extendedcinderstoneChestID = config.getItem("Armor", "Extended Cinderstone Chestplate", 6582).getInt();
		extendedcinderstoneLegsID = config.getItem("Armor", "Extended Cinderstone Leggings", 6583).getInt();
		extendedcinderstoneBootsID = config.getItem("Armor", "Extended Cinderstone Boots", 6584).getInt();
		extendedthrakaHelmID = config.getItem("Armor", "Extended Thraka Helmet", 6585).getInt();
		extendedthrakaChestID = config.getItem("Armor", "Extended Thraka Chestplate", 6586).getInt();
		extendedthrakaLegsID = config.getItem("Armor", "Extended Thraka Leggings", 6587).getInt();
		extendedthrakaBootsID = config.getItem("Armor", "Extended Thraka Boots", 6588).getInt();
		extendedpyralisHelmID = config.getItem("Armor", "Extended Pyralis Helmet", 6589).getInt();
		extendedpyralisChestID = config.getItem("Armor", "Extended Pyralis Chestplate", 6590).getInt();
		extendedpyralisLegsID = config.getItem("Armor", "Extended Pyralis Leggings", 6591).getInt();
		extendedpyralisBootsID = config.getItem("Armor", "Extended Pyralis Boots", 6592).getInt();
		extendeddragonbezoarHelmID = config.getItem("Armor", "Extended Dragon Bezoar Helmet", 6593).getInt();
		extendeddragonbezoarChestID = config.getItem("Armor", "Extended Dragon Bezoar Chestplate", 6594).getInt();
		extendeddragonbezoarLegsID = config.getItem("Armor", "Extended Dragon Bezoar Leggings", 6595).getInt();
		extendeddragonbezoarBootsID = config.getItem("Armor", "Extended Dragon Bezoar Boots", 6596).getInt();
		
		config.save();
	}

	@EventHandler
	public void Initiatesimpleoresew(FMLInitializationEvent initEvent) {
		int armorRenderer[] = new int[31];

		if (FMLCommonHandler.instance().getEffectiveSide().isClient())
			armorRenderer =
					new int[] { RenderingRegistry.addNewArmourRendererPrefix("extendedCopper"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedTin"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedMythril"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedAdamantium"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedOnyx"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedBronze"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedThyrium"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedSinisite"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedMalachite"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedDragonstone"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedFyrite"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedIllumenite"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedSilver"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedarsenideBronze"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedarsenideGold"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedtenebrium"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedstannum"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedcuprum"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedpyropus"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedtombBronze"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedcthon"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedroseGold"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedcobalt"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedblueDriftSteel"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedblueCeladon"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedgreenCeladon"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedtungsten"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedtungstencarbide"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedvalfram"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedtungstensteel"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedPrasinos"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedsterlingSteel"),
							RenderingRegistry.addNewArmourRendererPrefix("extendedblackSilver"), };

		String[] toolmatNames =
				new String[] { "Copper", "Tin", "Mythril", "Adamantium", "Onyx", "Bronze", "Thyrium", "Sinisite", "Malachite",
						"Ashstone", "Dragonstone", "Argonite", "Silver", "Arsenic", "Arsenide Bronze", "Arsenide Gold",
						"Tenebrium", "Stannum", "Cuprum", "Pyropus Bronze", "Tomb Bronze", "Pulchrum", "Cthon", "Rose Gold",
						"Erubescent Gold", "Scarlatite Gold", "Hephaestan Gold", "Hadite Steel", "Gestankenzinn", "Cobalt",
						"Blue Drift Steel", "Blue Celadon", "Green Celadon", "Tungsten", "Tungsten Carbide", "Valfram",
						"Tungsten Steel", "Prasinos", "Sterling Steel", "Black Silver" };
		String[] toolNames = new String[] { "Sword", "Shovel", "Pickaxe", "Axe", "Hoe" };
		String[] armormatNames =
				new String[] { "Copper", "Tin", "Mythril", "Adamantium", "Onyx", "Bronze", "Thyrium", "Sinisite", "Malachite",
						"Dragonstone", "Fyrite", "Illumenite", "Silver", "Arsenide Bronze", "Arsenide Gold", "Tenebrium",
						"Stannum", "Cuprum", "Pyropus Bronze", "Tomb Bronze", "Cthon", "Rose Gold", "Cobalt",
						"Blue Drift Steel", "Blue Celadon", "Green Celadon", "Tungsten", "Tungsten Carbide", "Valfram",
						"Tungsten Steel", "Prasinos", "Sterling Steel", "Black Silver" };
		String[] armorNames = new String[] { "Helmet", "Chestplate", "Leggings", "Boots" };

		if (PluginChecks.getSimpleInstalled()) {
			{
				Object[] material =
						new Object[] { SimpleOres.core.Items.copperIngot, SimpleOres.core.Items.tinIngot,
								SimpleOres.core.Items.mythrilIngot, SimpleOres.core.Items.adamantiumIngot,
								SimpleOres.core.Items.onyxGem };
				EnumToolMaterial[] sotool =
						new EnumToolMaterial[] { SimpleOres.core.SimpleOres.toolCopper, SimpleOres.core.SimpleOres.toolTin,
								SimpleOres.core.SimpleOres.toolMythril, SimpleOres.core.SimpleOres.toolAdamantium,
								SimpleOres.core.SimpleOres.toolOnyx };
				Object[] handle = new Object[] { Block.planks, Block.planks, Item.ingotIron, Item.ingotIron, Item.diamond };

				for (int i = 0; i < 5; i++) {

					item[0][i] =
							new ItemExtendedSword(simpleID + i * 5 + 0, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool0" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Sword");
					item[1][i] =
							new ItemExtendedShovel(simpleID + i * 5 + 1, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool1" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Shovel");
					item[2][i] =
							new ItemExtendedPickaxe(simpleID + i * 5 + 2, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool2" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Pickaxe");
					item[3][i] =
							new ItemExtendedAxe(simpleID + i * 5 + 3, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool3" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Axe");
					item[4][i] =
							new ItemExtendedHoe(simpleID + i * 5 + 4, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool4" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Hoe");

					MinecraftForge.setToolClass(item[2][i], "pickaxe", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[1][i], "shovel", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[3][i], "axe", sotool[i].getHarvestLevel());

					EWAPI.addRecipe(new ItemStack(item[0][i], 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[1][i], 1), new Object[] { " X ", " X ", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[2][i], 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[3][i], 1), new Object[] { "X  ", "XXX", "XY ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[4][i], 1), new Object[] { " X ", " XX", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });

					for (int j = 0; j < 5; j++)
						LanguageRegistry.addName(item[j][i], "Extended " + (toolmatNames[i]) + " " + (toolNames[j]));
				}
			}

			{
				Object[] material =
						new Object[] { SimpleOres.core.Items.copperIngot, SimpleOres.core.Items.tinIngot,
								SimpleOres.core.Items.mythrilIngot, SimpleOres.core.Items.adamantiumIngot,
								SimpleOres.core.Items.onyxGem };
				EnumArmorMaterial[] soarmor =
						new EnumArmorMaterial[] { SimpleOres.core.SimpleOres.armorCopper, SimpleOres.core.SimpleOres.armorTin,
								SimpleOres.core.SimpleOres.armorMythril, SimpleOres.core.SimpleOres.armorAdamantium,
								SimpleOres.core.SimpleOres.armorOnyx };

				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 4; j++) {
						armor[i][j] =
								(ItemArmor) new ItemExtendedArmor(simpleID + 25 + i * 4 + j, soarmor[i], armorRenderer[i], j,
										armormatNames[i]).setUnlocalizedName("extendedWorkbenchso:armor" + i + j)
										.setTextureName("SimpleOresEW:armorextended" + armormatNames[i] + armorNames[j]);
						LanguageRegistry.addName(armor[i][j], "Extended " + armormatNames[i] + " " + armorNames[j]);
					}

					EWAPI.addRecipe(new ItemStack(armor[i][3], 1), new Object[] { "X X", "X X", "X X", ('X'), material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][2], 1), new Object[] { "XXX", "XXX", "X X", "X X", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][1], 1), new Object[] { "X X", "XXX", "XXX", "XXX", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][0], 1), new Object[] { "XXX", "XXX", "X X", ('X'), material[i] });
				}
			}

			extendedmythrilBow =
					(ItemBow) new ItemExtendedBow(simpleID + 45, 750, SimpleOres.core.SimpleOres.toolMythril).setFull3D()
							.setUnlocalizedName("extendedWorkbenchso:mythrilBow");
			extendedonyxBow =
					(ItemBow) new ItemExtendedBow(simpleID + 46, 1000, SimpleOres.core.SimpleOres.toolOnyx).setFull3D()
							.setUnlocalizedName("extendedWorkbenchso:onyxBow");
			EWAPI.addRecipe(new ItemStack(extendedmythrilBow, 1), new Object[] { " YX", "Y X", "Z X", "Z X", "Y X", " YX",
					('X'), Item.silk, ('Y'), SimpleOres.core.Items.mythrilRod, ('Z'), Item.ingotIron });
			EWAPI.addRecipe(new ItemStack(extendedonyxBow, 1), new Object[] { " YX", "Y X", "ZWX", "ZWX", "Y X", " YX", ('W'),
					Item.flintAndSteel, ('X'), Item.silk, ('Y'), SimpleOres.core.Items.onyxRod, ('Z'), Item.diamond });

			extendedtinShears =
					new ItemExtendedShears(simpleID + 47, 176).setUnlocalizedName("extendedWorkbenchso:tinShears")
							.setTextureName("SimpleOresEW:tinShears");
			extendedadamantiumShears =
					new ItemExtendedShears(simpleID + 48, 1092).setUnlocalizedName("extendedWorkbenchso:adamantiumShears")
							.setTextureName("SimpleOresEW:adamantiumShears");
			extendedonyxShears =
					new ItemExtendedShears(simpleID + 49, 3116).setUnlocalizedName("extendedWorkbenchso:onyxShears")
							.setTextureName("SimpleOresEW:onyxShears");
			EWAPI.addRecipe(new ItemStack(extendedtinShears, 1), new Object[] { "X ", " X", "X ", " X", "X ", ('X'),
					SimpleOres.core.Items.tinIngot });
			EWAPI.addRecipe(new ItemStack(extendedadamantiumShears, 1), new Object[] { "X ", " X", "X ", " X", "X ", ('X'),
					SimpleOres.core.Items.adamantiumIngot });
			EWAPI.addRecipe(new ItemStack(extendedonyxShears, 1), new Object[] { "X ", " X", "X ", " X", "X ", ('X'),
					SimpleOres.core.Items.onyxGem });

			LanguageRegistry.addName(extendedmythrilBow, "Extended Mythril Bow");
			LanguageRegistry.addName(extendedonyxBow, "Extended Onyx Bow");
			LanguageRegistry.addName(extendedtinShears, "Extended Tin Shears");
			LanguageRegistry.addName(extendedadamantiumShears, "Extended Adamantium Shears");
			LanguageRegistry.addName(extendedonyxShears, "Extended Onyx Shears");

		}

		if (PluginChecks.getFusionInstalled()) {
			{
				Object[] material =
						new Object[] { Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								SimpleOres.plugins.fusion.Content.bronzeIngot, SimpleOres.plugins.fusion.Content.thyriumIngot,
								SimpleOres.plugins.fusion.Content.sinisiteIngot };
				EnumToolMaterial[] sotool =
						new EnumToolMaterial[] { EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								SimpleOres.plugins.fusion.FusionPlugin.toolBronze,
								SimpleOres.plugins.fusion.FusionPlugin.toolThyrium,
								SimpleOres.plugins.fusion.FusionPlugin.toolSinisite };
				Object[] handle =
						new Object[] { Block.planks, Block.planks, Item.ingotIron, Item.ingotIron, Item.diamond,
								Block.cobblestone, Item.ingotIron, Item.diamond };

				for (int i = 5; i < 8; i++) {

					item[0][i] =
							new ItemExtendedSword(fusionID + (i - 5) * 5, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool0" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Sword");
					item[1][i] =
							new ItemExtendedShovel(fusionID + (i - 5) * 5 + 1, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool1" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Shovel");
					item[2][i] =
							new ItemExtendedPickaxe(fusionID + (i - 5) * 5 + 2, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool2" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Pickaxe");
					item[3][i] =
							new ItemExtendedAxe(fusionID + (i - 5) * 5 + 3, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool3" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Axe");
					item[4][i] =
							new ItemExtendedHoe(fusionID + (i - 5) * 5 + 4, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool4" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Hoe");

					MinecraftForge.setToolClass(item[2][i], "pickaxe", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[1][i], "shovel", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[3][i], "axe", sotool[i].getHarvestLevel());

					EWAPI.addRecipe(new ItemStack(item[0][i], 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[1][i], 1), new Object[] { " X ", " X ", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[2][i], 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[3][i], 1), new Object[] { "X  ", "XXX", "XY ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[4][i], 1), new Object[] { " X ", " XX", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });

					for (int j = 0; j < 5; j++)
						LanguageRegistry.addName(item[j][i], "Extended " + (toolmatNames[i]) + " " + (toolNames[j]));
				}
			}

			{
				Object[] material =
						new Object[] { SimpleOres.core.Items.copperIngot, SimpleOres.core.Items.tinIngot,
								SimpleOres.core.Items.mythrilIngot, SimpleOres.core.Items.adamantiumIngot,
								SimpleOres.core.Items.onyxGem, SimpleOres.plugins.fusion.Content.bronzeIngot,
								SimpleOres.plugins.fusion.Content.thyriumIngot, SimpleOres.plugins.fusion.Content.sinisiteIngot };
				EnumArmorMaterial[] soarmor =
						new EnumArmorMaterial[] { SimpleOres.core.SimpleOres.armorCopper, SimpleOres.core.SimpleOres.armorTin,
								SimpleOres.core.SimpleOres.armorMythril, SimpleOres.core.SimpleOres.armorAdamantium,
								SimpleOres.core.SimpleOres.armorOnyx, SimpleOres.plugins.fusion.FusionPlugin.armorBronze,
								SimpleOres.plugins.fusion.FusionPlugin.armorThyrium,
								SimpleOres.plugins.fusion.FusionPlugin.armorSinisite };

				for (int i = 5; i < 8; i++) {
					for (int j = 0; j < 4; j++) {
						armor[i][j] =
								(ItemArmor) new ItemExtendedArmor(fusionID + 15 + (i - 5) * 4 + j, soarmor[i],
										armorRenderer[i], j, armormatNames[i]).setUnlocalizedName(
										"extendedWorkbenchso:armor" + i + j).setTextureName(
										"SimpleOresEW:armorextended" + armormatNames[i] + armorNames[j]);
						LanguageRegistry.addName(armor[i][j], "Extended " + armormatNames[i] + " " + armorNames[j]);
					}

					EWAPI.addRecipe(new ItemStack(armor[i][3], 1), new Object[] { "X X", "X X", "X X", ('X'), material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][2], 1), new Object[] { "XXX", "XXX", "X X", "X X", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][1], 1), new Object[] { "X X", "XXX", "XXX", "XXX", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][0], 1), new Object[] { "XXX", "XXX", "X X", ('X'), material[i] });
				}
			}
			extendedthyriumBow =
					(ItemBow) new ItemExtendedBow(fusionID + 37, 900, SimpleOres.plugins.fusion.FusionPlugin.toolThyrium)
							.setFull3D().setUnlocalizedName("extendedWorkbenchso:thyriumBow");
			extendedsinisiteBow =
					(ItemBow) new ItemExtendedBow(fusionID + 38, 1200, SimpleOres.plugins.fusion.FusionPlugin.toolSinisite)
							.setFull3D().setUnlocalizedName("extendedWorkbenchso:sinisiteBow");
			EWAPI.addRecipe(new ItemStack(extendedthyriumBow, 1), new Object[] { " YX", "Y X", "Z X", "Z X", "Y X", " YX",
					('X'), Item.silk, ('Y'), SimpleOres.plugins.fusion.Content.thyriumRod, ('Z'), Item.ingotGold });
			EWAPI.addRecipe(new ItemStack(extendedsinisiteBow, 1), new Object[] { " YX", "Y X", "Z X", "Z X", "Y X", " YX",
					('X'), Item.silk, ('Y'), SimpleOres.plugins.fusion.Content.sinisiteRod, ('Z'),
					SimpleOres.core.Items.onyxGem });

			LanguageRegistry.addName(extendedthyriumBow, "Extended Thyrium Bow");
			LanguageRegistry.addName(extendedsinisiteBow, "Extended Sinisite Bow");

		}

		if (PluginChecks.getNetherInstalled()) {
			{
				Object[] material =
						new Object[] { Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Netherrocks.core.Items.malachiteIngot,
								Netherrocks.core.Items.ashstoneGem, Netherrocks.core.Items.dragonstoneGem,
								Netherrocks.core.Items.argoniteIngot };
				EnumToolMaterial[] sotool =
						new EnumToolMaterial[] { EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, Netherrocks.core.Netherrocks.toolMalachite,
								Netherrocks.core.Netherrocks.toolAshstone, Netherrocks.core.Netherrocks.toolDragonstone,
								Netherrocks.core.Netherrocks.toolArgonite };
				Object[] handle =
						new Object[] { Block.planks, Block.planks, Item.ingotIron, Item.ingotIron, Item.diamond,
								Block.cobblestone, Item.ingotIron, Item.diamond, Item.ingotIron, Item.ingotIron, Item.diamond,
								Item.ingotIron };

				for (int i = 8; i < 12; i++) {

					item[0][i] =
							new ItemExtendedSword(netherID + 0 + (i - 8) * 5, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchnr:tool0" + i).setTextureName(
									"SimpleOresEW:toolextended" + toolmatNames[i] + "Sword");
					item[1][i] =
							new ItemExtendedShovel(netherID + 1 + (i - 8) * 5, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchnr:tool1" + i).setTextureName(
									"SimpleOresEW:toolextended" + toolmatNames[i] + "Shovel");
					item[2][i] =
							new ItemExtendedPickaxe(netherID + 2 + (i - 8) * 5, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchnr:tool2" + i).setTextureName(
									"SimpleOresEW:toolextended" + toolmatNames[i] + "Pickaxe");
					item[3][i] =
							new ItemExtendedAxe(netherID + 3 + (i - 8) * 5, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchnr:tool3" + i).setTextureName(
									"SimpleOresEW:toolextended" + toolmatNames[i] + "Axe");
					item[4][i] =
							new ItemExtendedHoe(netherID + 4 + (i - 8) * 5, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchnr:tool4" + i).setTextureName(
									"SimpleOresEW:toolextended" + toolmatNames[i] + "Hoe");

					MinecraftForge.setToolClass(item[2][i], "pickaxe", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[1][i], "shovel", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[3][i], "axe", sotool[i].getHarvestLevel());

					EWAPI.addRecipe(new ItemStack(item[0][i], 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[1][i], 1), new Object[] { " X ", " X ", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[2][i], 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[3][i], 1), new Object[] { "X  ", "XXX", "XY ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[4][i], 1), new Object[] { " X ", " XX", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });

					for (int j = 0; j < 5; j++)
						LanguageRegistry.addName(item[j][i], "Extended " + (toolmatNames[i]) + " " + (toolNames[j]));
				}
			}
			{
				Object[] material =
						new Object[] { Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Netherrocks.core.Items.malachiteIngot,
								Netherrocks.core.Items.dragonstoneGem };
				EnumArmorMaterial[] soarmor =
						new EnumArmorMaterial[] { EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, Netherrocks.core.Netherrocks.armorMalachite,
								Netherrocks.core.Netherrocks.armorDragonstone };

				for (int i = 8; i < 10; i++) {
					for (int j = 0; j < 4; j++) {
						armor[i][j] =
								(ItemArmor) new ItemExtendedArmor(netherID + 28 + (i - 8) * 4 + j, soarmor[i],
										armorRenderer[i], j, armormatNames[i]).setUnlocalizedName(
										"extendedWorkbenchnr:armor" + i + j).setTextureName(
										"SimpleOresEW:armorextended" + armormatNames[i] + armorNames[j]);
						LanguageRegistry.addName(armor[i][j], "Extended " + armormatNames[i] + " " + armorNames[j]);
					}

					EWAPI.addRecipe(new ItemStack(armor[i][3], 1), new Object[] { "X X", "X X", "X X", ('X'), material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][2], 1), new Object[] { "XXX", "XXX", "X X", "X X", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][1], 1), new Object[] { "X X", "XXX", "XXX", "XXX", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][0], 1), new Object[] { "XXX", "XXX", "X X", ('X'), material[i] });
				}
			}

			extendedfyriteHelm =
					new ItemExtendedArmor(netherID + 68, Netherrocks.core.Netherrocks.armorFyrite, armorRenderer[10], 0,
							"Fyrite").setUnlocalizedName("extendedWorkbenchnr:armorFyriteHelmet").setTextureName(
							"SimpleOresEW:armorextendedFyriteHelmet");
			extendedfyriteChest =
					new ItemExtendedArmor(netherID + 69, Netherrocks.core.Netherrocks.armorFyrite, armorRenderer[10], 1,
							"Fyrite").setUnlocalizedName("extendedWorkbenchnr:armorFyriteChestplate").setTextureName(
							"SimpleOresEW:armorextendedFyriteChestplate");
			extendedfyriteLegs =
					new ItemExtendedArmor(netherID + 70, Netherrocks.core.Netherrocks.armorFyrite, armorRenderer[10], 2,
							"Fyrite").setUnlocalizedName("extendedWorkbenchnr:armorFyriteLeggings").setTextureName(
							"SimpleOresEW:armorextendedFyriteLeggings");
			extendedfyriteBoots =
					new ItemExtendedArmor(netherID + 71, Netherrocks.core.Netherrocks.armorFyrite, armorRenderer[10], 3,
							"Fyrite").setUnlocalizedName("extendedWorkbenchnr:armorFyriteBoots").setTextureName(
							"SimpleOresEW:armorextendedFyriteBoots");
			extendedillumeniteHelm =
					new ItemExtendedArmor(netherID + 72, Netherrocks.core.Netherrocks.armorIllumenite, armorRenderer[11], 0,
							"Illumenite").setUnlocalizedName("extendedWorkbenchnr:armorIllumeniteHelmet").setTextureName(
							"SimpleOresEW:armorextendedIllumeniteHelmet");
			extendedillumeniteChest =
					new ItemExtendedArmor(netherID + 73, Netherrocks.core.Netherrocks.armorIllumenite, armorRenderer[11], 1,
							"Illumenite").setUnlocalizedName("extendedWorkbenchnr:armorIllumeniteChestplate").setTextureName(
							"SimpleOresEW:armorextendedIllumeniteChestplate");
			extendedillumeniteLegs =
					new ItemExtendedArmor(netherID + 74, Netherrocks.core.Netherrocks.armorIllumenite, armorRenderer[11], 2,
							"Illumenite").setUnlocalizedName("extendedWorkbenchnr:armorIllumeniteLeggings").setTextureName(
							"SimpleOresEW:armorextendedIllumeniteLeggings");
			extendedillumeniteBoots =
					new ItemExtendedArmor(netherID + 75, Netherrocks.core.Netherrocks.armorIllumenite, armorRenderer[11], 3,
							"Illumenite").setUnlocalizedName("extendedWorkbenchnr:armorIllumeniteBoots").setTextureName(
							"SimpleOresEW:armorextendedIllumeniteBoots");

			EWAPI.addRecipe(new ItemStack(extendedfyriteHelm, 1), new Object[] { "X X", "X X", "X X", ('X'),
					Netherrocks.core.Items.fyriteIngot });
			EWAPI.addRecipe(new ItemStack(extendedfyriteChest, 1), new Object[] { "XXX", "XXX", "X X", "X X", ('X'),
					Netherrocks.core.Items.fyriteIngot });
			EWAPI.addRecipe(new ItemStack(extendedfyriteLegs, 1), new Object[] { "X X", "XXX", "XXX", "XXX", ('X'),
					Netherrocks.core.Items.fyriteIngot });
			EWAPI.addRecipe(new ItemStack(extendedfyriteBoots, 1), new Object[] { "XXX", "XXX", "X X", ('X'),
					Netherrocks.core.Items.fyriteIngot });
			EWAPI.addRecipe(new ItemStack(extendedillumeniteHelm, 1), new Object[] { "X X", "X X", "X X", ('X'),
					Netherrocks.core.Items.illumeniteIngot });
			EWAPI.addRecipe(new ItemStack(extendedillumeniteChest, 1), new Object[] { "XXX", "XXX", "X X", "X X", ('X'),
					Netherrocks.core.Items.illumeniteIngot });
			EWAPI.addRecipe(new ItemStack(extendedillumeniteLegs, 1), new Object[] { "X X", "XXX", "XXX", "XXX", ('X'),
					Netherrocks.core.Items.illumeniteIngot });
			EWAPI.addRecipe(new ItemStack(extendedillumeniteBoots, 1), new Object[] { "XXX", "XXX", "X X", ('X'),
					Netherrocks.core.Items.illumeniteIngot });

			LanguageRegistry.addName(extendedfyriteHelm, "Extended Fyrite Helmet");
			LanguageRegistry.addName(extendedfyriteChest, "Extended Fyrite Chestplate");
			LanguageRegistry.addName(extendedfyriteLegs, "Extended Fyrite Leggings");
			LanguageRegistry.addName(extendedfyriteBoots, "Extended Fyrite Boots");
			LanguageRegistry.addName(extendedillumeniteHelm, "Extended Illumenite Helmet");
			LanguageRegistry.addName(extendedillumeniteChest, "Extended Illumenite Chestplate");
			LanguageRegistry.addName(extendedillumeniteLegs, "Extended Illumenite Leggings");
			LanguageRegistry.addName(extendedillumeniteBoots, "Extended Illumenite Boots");

			extendedfyriteSword =
					new ItemExtendedSword(netherID + 76, Netherrocks.core.Netherrocks.toolFyrite).setUnlocalizedName(
							"extendedWorkbenchnr:toolFyriteSword").setTextureName("SimpleOresEW:toolextendedFyriteSword");
			extendedillumeniteSword =
					new ItemExtendedSword(netherID + 77, Netherrocks.core.Netherrocks.toolIllumenite).setUnlocalizedName(
							"extendedWorkbenchnr:toolIllumeniteSword").setTextureName(
							"SimpleOresEW:toolextendedIllumeniteSword");
			extendedfyritePick =
					new ItemExtendedPickaxe(netherID + 78, Netherrocks.core.Netherrocks.toolFyrite).setUnlocalizedName(
							"extendedWorkbenchnr:toolFyritePick").setTextureName("SimpleOresEW:toolextendedFyritePickaxe");

			EWAPI.addRecipe(new ItemStack(extendedfyriteSword, 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ",
					('X'), Netherrocks.core.Items.fyriteIngot, ('Y'), Item.ingotIron });
			EWAPI.addRecipe(new ItemStack(extendedillumeniteSword, 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ",
					('X'), Netherrocks.core.Items.illumeniteIngot, ('Y'), Item.ingotGold });
			EWAPI.addRecipe(new ItemStack(extendedfyritePick, 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ", " Y ",
					('X'), Netherrocks.core.Items.fyriteIngot, ('Y'), Item.ingotIron });

			LanguageRegistry.addName(extendedfyriteSword, "Extended Fyrite Sword");
			LanguageRegistry.addName(extendedillumeniteSword, "Extended Illumenite Sword");
			LanguageRegistry.addName(extendedfyritePick, "Extended Fyrite Pickaxe");

			MinecraftForge.setToolClass(extendedfyritePick, "pickaxe", 3);

		}
		if (PluginChecks.getSilverInstalled()) {
			item[0][12] =
					new ItemExtendedSword(silverID + 0, OnlySilver.code.Items.toolSilver).setUnlocalizedName(
							"extendedWorkbenchnr:tool012").setTextureName("SimpleOresEW:toolSilverSword");
			item[1][12] =
					new ItemExtendedShovel(silverID + 1, OnlySilver.code.Items.toolSilver).setUnlocalizedName(
							"extendedWorkbenchnr:tool112").setTextureName("SimpleOresEW:toolSilverShovel");
			item[2][12] =
					new ItemExtendedPickaxe(silverID + 2, OnlySilver.code.Items.toolSilver).setUnlocalizedName(
							"extendedWorkbenchnr:tool212").setTextureName("SimpleOresEW:toolSilverPickaxe");
			item[3][12] =
					new ItemExtendedAxe(silverID + 3, OnlySilver.code.Items.toolSilver).setUnlocalizedName(
							"extendedWorkbenchnr:tool312").setTextureName("SimpleOresEW:toolSilverAxe");
			item[4][12] =
					new ItemExtendedHoe(silverID + 4, OnlySilver.code.Items.toolSilver).setUnlocalizedName(
							"extendedWorkbenchnr:tool412").setTextureName("SimpleOresEW:toolSilverHoe");

			MinecraftForge.setToolClass(item[2][12], "pickaxe", OnlySilver.code.Items.toolSilver.getHarvestLevel());
			MinecraftForge.setToolClass(item[1][12], "shovel", OnlySilver.code.Items.toolSilver.getHarvestLevel());
			MinecraftForge.setToolClass(item[3][12], "axe", OnlySilver.code.Items.toolSilver.getHarvestLevel());

			EWAPI.addRecipe(new ItemStack(item[0][12], 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ", ('X'),
					OnlySilver.code.api.OnlySilverAPI.silverIngot.get(), ('Y'), Block.cobblestone });
			EWAPI.addRecipe(new ItemStack(item[1][12], 1), new Object[] { " X ", " X ", " Y ", " Y ", " Y ", " Y ", ('X'),
					OnlySilver.code.api.OnlySilverAPI.silverIngot.get(), ('Y'), Block.cobblestone });
			EWAPI.addRecipe(new ItemStack(item[2][12], 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ", " Y ", ('X'),
					OnlySilver.code.api.OnlySilverAPI.silverIngot.get(), ('Y'), Block.cobblestone });
			EWAPI.addRecipe(new ItemStack(item[3][12], 1), new Object[] { "X  ", "XXX", "XY ", " Y ", " Y ", " Y ", ('X'),
					OnlySilver.code.api.OnlySilverAPI.silverIngot.get(), ('Y'), Block.cobblestone });
			EWAPI.addRecipe(new ItemStack(item[4][12], 1), new Object[] { " X ", " XX", " Y ", " Y ", " Y ", " Y ", ('X'),
					OnlySilver.code.api.OnlySilverAPI.silverIngot.get(), ('Y'), Block.cobblestone });

			for (int j = 0; j < 5; j++)
				LanguageRegistry.addName(item[j][12], "Extended Silver" + " " + (toolNames[j]));

			extendedsilverHelm =
					new ItemExtendedArmor(silverID + 5, OnlySilver.code.Items.armorSilver, armorRenderer[12], 0, "Silver")
							.setUnlocalizedName("extendedWorkbenchnr:armorSilverHelmet").setTextureName(
									"SimpleOresEW:armorextendedSilverHelmet");
			extendedsilverChest =
					new ItemExtendedArmor(silverID + 6, OnlySilver.code.Items.armorSilver, armorRenderer[12], 1, "Silver")
							.setUnlocalizedName("extendedWorkbenchnr:armorSilverChestplate").setTextureName(
									"SimpleOresEW:armorextendedSilverChestplate");
			extendedsilverLegs =
					new ItemExtendedArmor(silverID + 7, OnlySilver.code.Items.armorSilver, armorRenderer[12], 2, "Silver")
							.setUnlocalizedName("extendedWorkbenchnr:armorSilverLeggings").setTextureName(
									"SimpleOresEW:armorextendedSilverLeggings");
			extendedsilverBoots =
					new ItemExtendedArmor(silverID + 8, OnlySilver.code.Items.armorSilver, armorRenderer[12], 3, "Silver")
							.setUnlocalizedName("extendedWorkbenchnr:armorSilverBoots").setTextureName(
									"SimpleOresEW:armorextendedSilverBoots");

			EWAPI.addRecipe(new ItemStack(extendedsilverHelm, 1), new Object[] { "X X", "X X", "X X", ('X'),
					OnlySilver.code.api.OnlySilverAPI.silverIngot.get() });
			EWAPI.addRecipe(new ItemStack(extendedsilverChest, 1), new Object[] { "XXX", "XXX", "X X", "X X", ('X'),
					OnlySilver.code.api.OnlySilverAPI.silverIngot.get() });
			EWAPI.addRecipe(new ItemStack(extendedsilverLegs, 1), new Object[] { "X X", "XXX", "XXX", "XXX", ('X'),
					OnlySilver.code.api.OnlySilverAPI.silverIngot.get() });
			EWAPI.addRecipe(new ItemStack(extendedsilverBoots, 1), new Object[] { "XXX", "XXX", "X X", ('X'),
					OnlySilver.code.api.OnlySilverAPI.silverIngot.get() });

			LanguageRegistry.addName(extendedsilverHelm, "Extended Silver Helmet");
			LanguageRegistry.addName(extendedsilverChest, "Extended Silver Chestplate");
			LanguageRegistry.addName(extendedsilverLegs, "Extended Silver Leggings");
			LanguageRegistry.addName(extendedsilverBoots, "Extended Silver Boots");

			extendedsilverBow =
					(ItemBow) new ItemExtendedBow(silverID + 9, 500, OnlySilver.code.Items.toolSilver).setFull3D()
							.setUnlocalizedName("extendedWorkbenchso:silverBow");
			EWAPI.addRecipe(new ItemStack(extendedthyriumBow, 1), new Object[] { " YX", "Y X", "Z X", "Z X", "Y X", " YX",
					('X'), Item.silk, ('Y'), OnlySilver.code.api.OnlySilverAPI.silverRod.get(), ('Z'), Item.ingotIron });

			LanguageRegistry.addName(extendedsilverBow, "Extended Silver Bow");

			if (OnlySilver.code.conf.Config.werewolfEffectiveness.get())
				try {
					MinecraftForge.EVENT_BUS.register(new WerewolfHandler());
				} catch (Exception ignored) {
				}

		}
		if (PluginChecks.getNetherFusionInstalled()) {
			if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
				rendererextendedCinderstone = RenderingRegistry.addNewArmourRendererPrefix("extendedcinderstone");
				rendererextendedThraka = RenderingRegistry.addNewArmourRendererPrefix("extendedthraka");
				rendererextendedPyralis = RenderingRegistry.addNewArmourRendererPrefix("extendedpyralis");
				rendererextendedDragonBezoar = RenderingRegistry.addNewArmourRendererPrefix("extendeddragonbezoar");
			}
			extendedcinderstoneHelm =
					new ItemExtendedArmor(extendedcinderstoneHelmID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.armorCinderstone, rendererextendedCinderstone, 0,
							"cinderstone").setUnlocalizedName("SimpleOresEW:extendedcinderstoneHelm").setTextureName(
							"SimpleOresEW:extendedcinderstoneHelm");
			extendedcinderstoneChest =
					new ItemExtendedArmor(extendedcinderstoneChestID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.armorCinderstone, rendererextendedCinderstone, 1,
							"cinderstone").setUnlocalizedName("SimpleOresEW:extendedcinderstoneChest").setTextureName(
							"SimpleOresEW:extendedcinderstoneChest");
			extendedcinderstoneLegs =
					new ItemExtendedArmor(extendedcinderstoneLegsID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.armorCinderstone, rendererextendedCinderstone, 2,
							"cinderstone").setUnlocalizedName("SimpleOresEW:extendedcinderstoneLegs").setTextureName(
							"SimpleOresEW:extendedcinderstoneLegs");
			extendedcinderstoneBoots =
					new ItemExtendedArmor(extendedcinderstoneBootsID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.armorCinderstone, rendererextendedCinderstone, 3,
							"cinderstone").setUnlocalizedName("SimpleOresEW:extendedcinderstoneBoots").setTextureName(
							"SimpleOresEW:extendedcinderstoneBoots");
			extendedthrakaHelm =
					new ItemExtendedArmor(extendedthrakaHelmID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.armorThraka, rendererextendedThraka, 0, "thraka")
							.setUnlocalizedName("SimpleOresEW:extendedthrakaHelm").setTextureName(
									"SimpleOresEW:extendedthrakaHelm");
			extendedthrakaChest =
					new ItemExtendedArmor(extendedthrakaChestID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.armorThraka, rendererextendedThraka, 1, "thraka")
							.setUnlocalizedName("SimpleOresEW:extendedthrakaChest").setTextureName(
									"SimpleOresEW:extendedthrakaChest");
			extendedthrakaLegs =
					new ItemExtendedArmor(extendedthrakaLegsID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.armorThraka, rendererextendedThraka, 2, "thraka")
							.setUnlocalizedName("SimpleOresEW:extendedthrakaLegs").setTextureName(
									"SimpleOresEW:extendedthrakaLegs");
			extendedthrakaBoots =
					new ItemExtendedArmor(extendedthrakaBootsID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.armorThraka, rendererextendedThraka, 3, "thraka")
							.setUnlocalizedName("SimpleOresEW:extendedthrakaBoots").setTextureName(
									"SimpleOresEW:extendedthrakaBoots");
			extendedpyralisHelm =
					new ItemExtendedArmor(extendedpyralisHelmID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.armorPyralis, rendererextendedPyralis, 0,
							"pyralis").setUnlocalizedName("SimpleOresEW:extendedpyralisHelm").setTextureName(
							"SimpleOresEW:extendedpyralisHelm");
			extendedpyralisChest =
					new ItemExtendedArmor(extendedpyralisChestID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.armorPyralis, rendererextendedPyralis, 1,
							"pyralis").setUnlocalizedName("SimpleOresEW:extendedpyralisChest").setTextureName(
							"SimpleOresEW:extendedpyralisChest");
			extendedpyralisLegs =
					new ItemExtendedArmor(extendedpyralisLegsID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.armorPyralis, rendererextendedPyralis, 2,
							"pyralis").setUnlocalizedName("SimpleOresEW:extendedpyralisLegs").setTextureName(
							"SimpleOresEW:extendedpyralisLegs");
			extendedpyralisBoots =
					new ItemExtendedArmor(extendedpyralisBootsID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.armorPyralis, rendererextendedPyralis, 3,
							"pyralis").setUnlocalizedName("SimpleOresEW:extendedpyralisBoots").setTextureName(
							"SimpleOresEW:extendedpyralisBoots");
			extendeddragonbezoarHelm =
					new ItemExtendedArmor(extendeddragonbezoarHelmID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.armorDragonBezoar, rendererextendedDragonBezoar,
							0, "dragonbezoar").setUnlocalizedName("SimpleOresEW:extendeddragonbezoarHelm").setTextureName(
							"SimpleOresEW:extendeddragonbezoarHelm");
			extendeddragonbezoarChest =
					new ItemExtendedArmor(extendeddragonbezoarChestID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.armorDragonBezoar, rendererextendedDragonBezoar,
							1, "dragonbezoar").setUnlocalizedName("SimpleOresEW:extendeddragonbezoarChest")
							.setTextureName("SimpleOresEW:extendeddragonbezoarChest");
			extendeddragonbezoarLegs =
					new ItemExtendedArmor(extendeddragonbezoarLegsID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.armorDragonBezoar, rendererextendedDragonBezoar,
							2, "dragonbezoar").setUnlocalizedName("SimpleOresEW:extendeddragonbezoarLegs").setTextureName(
							"SimpleOresEW:extendeddragonbezoarLegs");
			extendeddragonbezoarBoots =
					new ItemExtendedArmor(extendeddragonbezoarBootsID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.armorDragonBezoar, rendererextendedDragonBezoar,
							3, "dragonbezoar").setUnlocalizedName("SimpleOresEW:extendeddragonbezoarBoots")
							.setTextureName("SimpleOresEW:extendeddragonbezoarBoots");

			LanguageRegistry.addName(extendedcinderstoneHelm, "Extended Cinderstone Helmet");
			LanguageRegistry.addName(extendedcinderstoneChest, "Extended Cinderstone Chestplate");
			LanguageRegistry.addName(extendedcinderstoneLegs, "Extended Cinderstone Leggings");
			LanguageRegistry.addName(extendedcinderstoneBoots, "Extended Cinderstone Boots");

			LanguageRegistry.addName(extendedthrakaHelm, "Extended Thraka Helmet");
			LanguageRegistry.addName(extendedthrakaChest, "Extended Thraka Chestplate");
			LanguageRegistry.addName(extendedthrakaLegs, "Extended Thraka Leggings");
			LanguageRegistry.addName(extendedthrakaBoots, "Extended Thraka Boots");

			LanguageRegistry.addName(extendedpyralisHelm, "Extended Pyralis Helmet");
			LanguageRegistry.addName(extendedpyralisChest, "Extended Pyralis Chestplate");
			LanguageRegistry.addName(extendedpyralisLegs, "Extended Pyralis Leggings");
			LanguageRegistry.addName(extendedpyralisBoots, "Extended Pyralis Boots");

			LanguageRegistry.addName(extendeddragonbezoarHelm, "Extended Dragon Bezoar Helmet");
			LanguageRegistry.addName(extendeddragonbezoarChest, "Extended Dragon Bezoar Chestplate");
			LanguageRegistry.addName(extendeddragonbezoarLegs, "Extended Dragon Bezoar Leggings");
			LanguageRegistry.addName(extendeddragonbezoarBoots, "Extended Dragon Bezoar Boots");

			extendedcinderstoneSword =
					new ItemExtendedSword(extendedcinderstoneSwordID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.toolCinderstone).setUnlocalizedName(
							"extendedWorkbenchnf:cinderstoneSword")
							.setTextureName("SimpleOresEW:extendedcinderstoneSword");
			extendedthrakaPick =
					new ItemExtendedPickaxe(extendedthrakaPickID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.toolThraka).setUnlocalizedName(
							"extendedWorkbenchnf:thrakaPick").setTextureName("SimpleOresEW:extendedthrakaPick");
			extendedthrakaAxe =
					new ItemExtendedAxe(extendedthrakaAxeID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.toolThraka).setUnlocalizedName(
							"extendedWorkbenchnf:thrakaAxe").setTextureName("SimpleOresEW:extendedthrakaAxe");
			extendedthrakaShovel =
					new ItemExtendedShovel(extendedthrakaShovelID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.toolThraka).setUnlocalizedName(
							"extendedWorkbenchnf:thrakaShovel").setTextureName("SimpleOresEW:extendedthrakaShovel");
			extendedthrakaSword =
					new ItemExtendedSword(extendedthrakaSwordID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.toolThraka).setUnlocalizedName(
							"extendedWorkbenchnf:thrakaSword").setTextureName("SimpleOresEW:extendedthrakaSword");
			extendedthrakaHoe =
					new ItemExtendedHoe(extendedthrakaHoeID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.toolThraka).setUnlocalizedName(
							"extendedWorkbenchnf:thrakaHoe").setTextureName("SimpleOresEW:extendedthrakaHoe");
			extendedpyralisPick =
					new ItemExtendedPickaxe(extendedpyralisPickID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.toolPyralis).setUnlocalizedName(
							"extendedWorkbenchnf:pyralisPick").setTextureName("SimpleOresEW:extendedpyralisPick");
			extendedpyralisAxe =
					new ItemExtendedAxe(extendedpyralisAxeID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.toolPyralis).setUnlocalizedName(
							"extendedWorkbenchnf:pyralisAxe").setTextureName("SimpleOresEW:extendedpyralisAxe");
			extendedpyralisShovel =
					new ItemExtendedShovel(extendedpyralisShovelID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.toolPyralis).setUnlocalizedName(
							"extendedWorkbenchnf:pyralisShovel").setTextureName("SimpleOresEW:extendedpyralisShovel");
			extendedpyralisSword =
					new ItemExtendedSword(extendedpyralisSwordID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.toolPyralis).setUnlocalizedName(
							"extendedWorkbenchnf:pyralisSword").setTextureName("SimpleOresEW:extendedpyralisSword");
			extendedpyralisHoe =
					new ItemExtendedHoe(extendedpyralisHoeID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.toolPyralis).setUnlocalizedName(
							"extendedWorkbenchnf:pyralisHoe").setTextureName("SimpleOresEW:extendedpyralisHoe");
			extendeddragonbezoarPick =
					new ItemExtendedPickaxe(extendeddragonbezoarPickID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.toolDragonBezoar).setUnlocalizedName(
							"extendedWorkbenchnf:dragonbezoarPick")
							.setTextureName("SimpleOresEW:extendeddragonbezoarPick");
			extendeddragonbezoarAxe =
					new ItemExtendedAxe(extendeddragonbezoarAxeID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.toolDragonBezoar).setUnlocalizedName(
							"extendedWorkbenchnf:dragonbezoarAxe").setTextureName("SimpleOresEW:extendeddragonbezoarAxe");
			extendeddragonbezoarShovel =
					new ItemExtendedShovel(extendeddragonbezoarShovelID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.toolDragonBezoar).setUnlocalizedName(
							"extendedWorkbenchnf:dragonbezoarShovel").setTextureName(
							"SimpleOresEW:extendeddragonbezoarShovel");
			extendeddragonbezoarSword =
					new ItemExtendedSword(extendeddragonbezoarSwordID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.toolDragonBezoar).setUnlocalizedName(
							"extendedWorkbenchnf:dragonbezoarSword").setTextureName(
							"SimpleOresEW:extendeddragonbezoarSword");
			extendeddragonbezoarHoe =
					new ItemExtendedHoe(extendeddragonbezoarHoeID,
							theoldone822.NetherrocksFusion.NetherrocksFusion.toolDragonBezoar).setUnlocalizedName(
							"extendedWorkbenchnf:dragonbezoarHoe").setTextureName("SimpleOresEW:extendeddragonbezoarHoe");
			extendeddragonbezoarBow =
					(ItemBow) new ItemExtendedBow(extendeddragonbezoarBowID, 1200,
							theoldone822.NetherrocksFusion.NetherrocksFusion.toolPyralis).setFull3D()
							.setUnlocalizedName("extendedWorkbenchnf:dragonbezoarBow")
							.setTextureName("SimpleOresEW:extendeddragonbezoarBow");
			extendeddragonbezoarShears =
					new ItemExtendedShears(extendeddragonbezoarShearsID, 9300)
							.setUnlocalizedName("extendedWorkbenchnf:dragonbezoarShears").setTextureName(
									"SimpleOresEW:extendeddragonbezoarShears");

			LanguageRegistry.addName(extendedcinderstoneSword, "Extended Cinderstone Sword");
			LanguageRegistry.addName(extendedthrakaPick, "Extended Thraka Pickaxe");
			LanguageRegistry.addName(extendedthrakaAxe, "Extended Thraka Axe");
			LanguageRegistry.addName(extendedthrakaShovel, "Extended Thraka Shovel");
			LanguageRegistry.addName(extendedthrakaSword, "Extended Thraka Sword");
			LanguageRegistry.addName(extendedthrakaHoe, "Extended Thraka Hoe");
			LanguageRegistry.addName(extendedpyralisPick, "Extended Pyralis Pickaxe");
			LanguageRegistry.addName(extendedpyralisAxe, "Extended Pyralis Axe");
			LanguageRegistry.addName(extendedpyralisShovel, "Extended Pyralis Shovel");
			LanguageRegistry.addName(extendedpyralisSword, "Extended Pyralis Sword");
			LanguageRegistry.addName(extendedpyralisHoe, "Extended Pyralis Hoe");
			LanguageRegistry.addName(extendeddragonbezoarPick, "Extended Dragon Bezoar Pickaxe");
			LanguageRegistry.addName(extendeddragonbezoarAxe, "Extended Dragon Bezoar Axe");
			LanguageRegistry.addName(extendeddragonbezoarShovel, "Extended Dragon Bezoar Shovel");
			LanguageRegistry.addName(extendeddragonbezoarSword, "Extended Dragon Bezoar Sword");
			LanguageRegistry.addName(extendeddragonbezoarHoe, "Extended Dragon Bezoar Hoe");
			LanguageRegistry.addName(extendeddragonbezoarBow, "Extended Dragon Bezoar Bow");
			LanguageRegistry.addName(extendeddragonbezoarShears, "Extended Dragon Bezoar Shears");

			MinecraftForge.setToolClass(extendedthrakaPick, "pickaxe",
					theoldone822.NetherrocksFusion.Settings.thrakaMiningLevel);
			MinecraftForge.setToolClass(extendedthrakaShovel, "shovel",
					theoldone822.NetherrocksFusion.Settings.thrakaMiningLevel);
			MinecraftForge.setToolClass(extendedthrakaAxe, "axe", theoldone822.NetherrocksFusion.Settings.thrakaMiningLevel);
			MinecraftForge.setToolClass(extendedpyralisPick, "pickaxe",
					theoldone822.NetherrocksFusion.Settings.pyralisMiningLevel);
			MinecraftForge.setToolClass(extendedpyralisShovel, "shovel",
					theoldone822.NetherrocksFusion.Settings.pyralisMiningLevel);
			MinecraftForge.setToolClass(extendedpyralisAxe, "axe", theoldone822.NetherrocksFusion.Settings.pyralisMiningLevel);
			MinecraftForge.setToolClass(extendeddragonbezoarPick, "pickaxe",
					theoldone822.NetherrocksFusion.Settings.dragonbezoarMiningLevel);
			MinecraftForge.setToolClass(extendeddragonbezoarShovel, "shovel",
					theoldone822.NetherrocksFusion.Settings.dragonbezoarMiningLevel);
			MinecraftForge.setToolClass(extendeddragonbezoarAxe, "axe",
					theoldone822.NetherrocksFusion.Settings.dragonbezoarMiningLevel);

			// Armor
			EWAPI.addRecipe(new ItemStack(extendedcinderstoneBoots, 1), new Object[] { "X X", "X X", "X X", ('X'),
					theoldone822.NetherrocksFusion.Content.cinderstoneIngot });
			EWAPI.addRecipe(new ItemStack(extendedcinderstoneLegs, 1), new Object[] { "XXX", "XXX", "X X", "X X", ('X'),
					theoldone822.NetherrocksFusion.Content.cinderstoneIngot });
			EWAPI.addRecipe(new ItemStack(extendedcinderstoneChest, 1), new Object[] { "X X", "XXX", "XXX", "XXX", ('X'),
					theoldone822.NetherrocksFusion.Content.cinderstoneIngot });
			EWAPI.addRecipe(new ItemStack(extendedcinderstoneHelm, 1), new Object[] { "XXX", "XXX", "X X", ('X'),
					theoldone822.NetherrocksFusion.Content.cinderstoneIngot });

			EWAPI.addRecipe(new ItemStack(extendedthrakaBoots, 1), new Object[] { "X X", "X X", "X X", ('X'),
					theoldone822.NetherrocksFusion.Content.thrakaIngot });
			EWAPI.addRecipe(new ItemStack(extendedthrakaLegs, 1), new Object[] { "XXX", "XXX", "X X", "X X", ('X'),
					theoldone822.NetherrocksFusion.Content.thrakaIngot });
			EWAPI.addRecipe(new ItemStack(extendedthrakaChest, 1), new Object[] { "X X", "XXX", "XXX", "XXX", ('X'),
					theoldone822.NetherrocksFusion.Content.thrakaIngot });
			EWAPI.addRecipe(new ItemStack(extendedthrakaHelm, 1), new Object[] { "XXX", "XXX", "X X", ('X'),
					theoldone822.NetherrocksFusion.Content.thrakaIngot });

			EWAPI.addRecipe(new ItemStack(extendedpyralisBoots, 1), new Object[] { "X X", "X X", "X X", ('X'),
					theoldone822.NetherrocksFusion.Content.pyralisIngot });
			EWAPI.addRecipe(new ItemStack(extendedpyralisLegs, 1), new Object[] { "XXX", "XXX", "X X", "X X", ('X'),
					theoldone822.NetherrocksFusion.Content.pyralisIngot });
			EWAPI.addRecipe(new ItemStack(extendedpyralisChest, 1), new Object[] { "X X", "XXX", "XXX", "XXX", ('X'),
					theoldone822.NetherrocksFusion.Content.pyralisIngot });
			EWAPI.addRecipe(new ItemStack(extendedpyralisHelm, 1), new Object[] { "XXX", "XXX", "X X", ('X'),
					theoldone822.NetherrocksFusion.Content.pyralisIngot });

			EWAPI.addRecipe(new ItemStack(extendeddragonbezoarBoots, 1), new Object[] { "X X", "X X", "X X", ('X'),
					theoldone822.NetherrocksFusion.Content.dragonbezoarIngot });
			EWAPI.addRecipe(new ItemStack(extendeddragonbezoarLegs, 1), new Object[] { "XXX", "XXX", "X X", "X X", ('X'),
					theoldone822.NetherrocksFusion.Content.dragonbezoarIngot });
			EWAPI.addRecipe(new ItemStack(extendeddragonbezoarChest, 1), new Object[] { "X X", "XXX", "XXX", "XXX", ('X'),
					theoldone822.NetherrocksFusion.Content.dragonbezoarIngot });
			EWAPI.addRecipe(new ItemStack(extendeddragonbezoarHelm, 1), new Object[] { "XXX", "XXX", "X X", ('X'),
					theoldone822.NetherrocksFusion.Content.dragonbezoarIngot });

			// Tools
			EWAPI.addRecipe(new ItemStack(extendedcinderstoneSword, 1), new Object[] { " X ", " X ", " X ", " X ", "YXY",
					" Y ", ('X'), theoldone822.NetherrocksFusion.Content.cinderstoneIngot, ('Y'), Item.ingotIron });

			EWAPI.addRecipe(new ItemStack(extendedthrakaSword, 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ",
					('X'), theoldone822.NetherrocksFusion.Content.thrakaIngot, ('Y'), SimpleOres.core.Items.mythrilIngot });
			EWAPI.addRecipe(new ItemStack(extendedthrakaShovel, 1), new Object[] { " X ", " X ", " Y ", " Y ", " Y ", " Y ",
					('X'), theoldone822.NetherrocksFusion.Content.thrakaIngot, ('Y'), SimpleOres.core.Items.mythrilIngot });
			EWAPI.addRecipe(new ItemStack(extendedthrakaPick, 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ", " Y ",
					('X'), theoldone822.NetherrocksFusion.Content.thrakaIngot, ('Y'), SimpleOres.core.Items.mythrilIngot });
			EWAPI.addRecipe(new ItemStack(extendedthrakaAxe, 1), new Object[] { "X  ", "XXX", "XY ", " Y ", " Y ", " Y ",
					('X'), theoldone822.NetherrocksFusion.Content.thrakaIngot, ('Y'), SimpleOres.core.Items.mythrilIngot });
			EWAPI.addRecipe(new ItemStack(extendedthrakaHoe, 1), new Object[] { " X ", " XX", " Y ", " Y ", " Y ", " Y ",
					('X'), theoldone822.NetherrocksFusion.Content.thrakaIngot, ('Y'), SimpleOres.core.Items.mythrilIngot });

			EWAPI.addRecipe(new ItemStack(extendedpyralisSword, 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ",
					('X'), theoldone822.NetherrocksFusion.Content.pyralisIngot, ('Y'), Netherrocks.core.Items.argoniteIngot });
			EWAPI.addRecipe(new ItemStack(extendedpyralisShovel, 1), new Object[] { " X ", " X ", " Y ", " Y ", " Y ", " Y ",
					('X'), theoldone822.NetherrocksFusion.Content.pyralisIngot, ('Y'), Netherrocks.core.Items.argoniteIngot });
			EWAPI.addRecipe(new ItemStack(extendedpyralisPick, 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ", " Y ",
					('X'), theoldone822.NetherrocksFusion.Content.pyralisIngot, ('Y'), Netherrocks.core.Items.argoniteIngot });
			EWAPI.addRecipe(new ItemStack(extendedpyralisAxe, 1), new Object[] { "X  ", "XXX", "XY ", " Y ", " Y ", " Y ",
					('X'), theoldone822.NetherrocksFusion.Content.pyralisIngot, ('Y'), Netherrocks.core.Items.argoniteIngot });
			EWAPI.addRecipe(new ItemStack(extendedpyralisHoe, 1), new Object[] { " X ", " XX", " Y ", " Y ", " Y ", " Y ",
					('X'), theoldone822.NetherrocksFusion.Content.pyralisIngot, ('Y'), Netherrocks.core.Items.argoniteIngot });

			EWAPI.addRecipe(new ItemStack(extendeddragonbezoarSword, 1), new Object[] { " X ", " X ", " X ", " X ", "YXY",
					" Y ", ('X'), theoldone822.NetherrocksFusion.Content.dragonbezoarIngot, ('Y'),
					theoldone822.NetherrocksFusion.Content.pyralisIngot });
			EWAPI.addRecipe(new ItemStack(extendeddragonbezoarShovel, 1), new Object[] { " X ", " X ", " Y ", " Y ", " Y ",
					" Y ", ('X'), theoldone822.NetherrocksFusion.Content.dragonbezoarIngot, ('Y'),
					theoldone822.NetherrocksFusion.Content.pyralisIngot });
			EWAPI.addRecipe(new ItemStack(extendeddragonbezoarPick, 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ",
					" Y ", ('X'), theoldone822.NetherrocksFusion.Content.dragonbezoarIngot, ('Y'),
					theoldone822.NetherrocksFusion.Content.pyralisIngot });
			EWAPI.addRecipe(new ItemStack(extendeddragonbezoarAxe, 1), new Object[] { "X  ", "XXX", "XY ", " Y ", " Y ", " Y ",
					('X'), theoldone822.NetherrocksFusion.Content.dragonbezoarIngot, ('Y'),
					theoldone822.NetherrocksFusion.Content.pyralisIngot });
			EWAPI.addRecipe(new ItemStack(extendeddragonbezoarHoe, 1), new Object[] { " X ", " XX", " Y ", " Y ", " Y ", " Y ",
					('X'), theoldone822.NetherrocksFusion.Content.dragonbezoarIngot, ('Y'),
					theoldone822.NetherrocksFusion.Content.pyralisIngot });

			EWAPI.addRecipe(new ItemStack(extendeddragonbezoarBow, 1), new Object[] { " YX", "Y X", "Z X", "Z X", "Y X", " YX",
					('X'), Item.silk, ('Y'), theoldone822.NetherrocksFusion.Content.dragonbezoarRod, ('Z'),
					theoldone822.NetherrocksFusion.Content.pyralisIngot });
			EWAPI.addRecipe(new ItemStack(extendeddragonbezoarShears, 1), new Object[] { "X ", " X", "X ", " X", "X ", ('X'),
					theoldone822.NetherrocksFusion.Content.dragonbezoarIngot });

		}
		if (PluginChecks.getArsenicInstalled()) {
			{
				Object[] material =
						new Object[] { Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron,
								SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.arsenicIngot,
								SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.arsenideBronzeIngot,
								SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.arsenideGoldIngot,
								SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.tenebriumIngot };
				EnumToolMaterial[] sotool =
						new EnumToolMaterial[] { EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.toolArsenic,
								SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.toolArsenideBronze,
								SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.toolArsenideGold,
								SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.toolTenebrium };
				Object[] handle =
						new Object[] { Block.planks, Block.planks, Item.ingotIron, Item.ingotIron, Item.diamond,
								Block.cobblestone, Item.ingotIron, Item.diamond, Item.ingotIron, Item.ingotIron, Item.diamond,
								Item.ingotIron, Item.ingotIron, Block.cobblestone,
								SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.arsenicIngot,
								SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.arsenicIngot,
								SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.arsenicIngot };

				for (int i = 13; i < 17; i++) {

					item[0][i] =
							new ItemExtendedSword(arsenicID + (i - 13) * 5, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool0" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Sword");
					item[1][i] =
							new ItemExtendedShovel(arsenicID + (i - 13) * 5 + 1, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool1" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Shovel");
					item[2][i] =
							new ItemExtendedPickaxe(arsenicID + (i - 13) * 5 + 2, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool2" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Pickaxe");
					item[3][i] =
							new ItemExtendedAxe(arsenicID + (i - 13) * 5 + 3, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool3" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Axe");
					item[4][i] =
							new ItemExtendedHoe(arsenicID + (i - 13) * 5 + 4, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool4" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Hoe");

					MinecraftForge.setToolClass(item[2][i], "pickaxe", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[1][i], "shovel", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[3][i], "axe", sotool[i].getHarvestLevel());

					EWAPI.addRecipe(new ItemStack(item[0][i], 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[1][i], 1), new Object[] { " X ", " X ", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[2][i], 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[3][i], 1), new Object[] { "X  ", "XXX", "XY ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[4][i], 1), new Object[] { " X ", " XX", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });

					for (int j = 0; j < 5; j++)
						LanguageRegistry.addName(item[j][i], "Extended " + (toolmatNames[i]) + " " + (toolNames[j]));
				}
			}

			{
				Object[] material =
						new Object[] { Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron,
								SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.arsenideBronzeIngot,
								SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.arsenideGoldIngot,
								SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.tenebriumIngot };
				EnumArmorMaterial[] soarmor =
						new EnumArmorMaterial[] { EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.armorArsenideBronze,
								SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.armorArsenideGold,
								SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.armorTenebrium };

				for (int i = 13; i < 16; i++) {
					for (int j = 0; j < 4; j++) {
						armor[i][j] =
								(ItemArmor) new ItemExtendedArmor(arsenicID + 20 + (i - 13) * 4 + j, soarmor[i],
										armorRenderer[i], j, armormatNames[i]).setUnlocalizedName(
										"extendedWorkbenchso:armor" + i + j).setTextureName(
										"SimpleOresEW:armorextended" + armormatNames[i] + armorNames[j]);
						LanguageRegistry.addName(armor[i][j], "Extended " + armormatNames[i] + " " + armorNames[j]);
					}

					EWAPI.addRecipe(new ItemStack(armor[i][3], 1), new Object[] { "X X", "X X", "X X", ('X'), material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][2], 1), new Object[] { "XXX", "XXX", "X X", "X X", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][1], 1), new Object[] { "X X", "XXX", "XXX", "XXX", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][0], 1), new Object[] { "XXX", "XXX", "X X", ('X'), material[i] });
				}
			}
			if (SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.werewolfEffectiveness)
				try {
					MinecraftForge.EVENT_BUS.register(new WerewolfHandler());
				} catch (Exception ignored) {
				}

		}
		if (PluginChecks.getAlchemyInstalled()) {
			{
				Object[] material =
						new Object[] { Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.stannumIngot,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.cuprumIngot,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.pyropusBronzeIngot,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.tombBronzeIngot,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.pulchrumBronzeIngot };
				EnumToolMaterial[] sotool =
						new EnumToolMaterial[] { EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.toolStannum,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.toolCuprum,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.toolPyropusBronze,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.toolTombBronze,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.toolPulchrumBronze };
				Object[] handle =
						new Object[] { Block.planks, Block.planks, Item.ingotIron, Item.ingotIron, Item.diamond,
								Block.cobblestone, Item.ingotIron, Item.diamond, Item.ingotIron, Item.ingotIron, Item.diamond,
								Item.ingotIron, Item.ingotIron, Block.cobblestone, Block.cobblestone, Block.cobblestone,
								Item.ingotIron, SimpleOres.core.Items.tinIngot, SimpleOres.core.Items.copperIngot,
								SimpleOres.plugins.fusion.Content.bronzeIngot, SimpleOres.plugins.fusion.Content.bronzeIngot,
								SimpleOres.plugins.fusion.Content.bronzeIngot };

				for (int i = 17; i < 20; i++) {

					item[0][i] =
							new ItemExtendedSword(alchemyID + (i - 17) * 5, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool0" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Sword");
					item[1][i] =
							new ItemExtendedShovel(alchemyID + (i - 17) * 5 + 1, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool1" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Shovel");
					item[2][i] =
							new ItemExtendedPickaxe(alchemyID + (i - 17) * 5 + 2, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool2" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Pickaxe");
					item[3][i] =
							new ItemExtendedAxe(alchemyID + (i - 17) * 5 + 3, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool3" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Axe");
					item[4][i] =
							new ItemExtendedHoe(alchemyID + (i - 17) * 5 + 4, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool4" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Hoe");

					MinecraftForge.setToolClass(item[2][i], "pickaxe", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[1][i], "shovel", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[3][i], "axe", sotool[i].getHarvestLevel());

					EWAPI.addRecipe(new ItemStack(item[0][i], 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[1][i], 1), new Object[] { " X ", " X ", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[2][i], 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[3][i], 1), new Object[] { "X  ", "XXX", "XY ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[4][i], 1), new Object[] { " X ", " XX", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });

					for (int j = 0; j < 5; j++)
						LanguageRegistry.addName(item[j][i], "Extended " + (toolmatNames[i]) + " " + (toolNames[j]));
				}
				for (int i = 20; i < 22; i++) {

					item[0][i] =
							new ItemExtendedSword(alchemyID + 15 + (i - 20) * 4, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool0" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Sword");
					item[1][i] =
							new ItemExtendedShovel(alchemyID + 15 + (i - 20) * 4 + 1, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool1" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Shovel");
					item[2][i] =
							new ItemExtendedPickaxe(alchemyID + 15 + (i - 20) * 4 + 2, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool2" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Pickaxe");
					item[3][i] =
							new ItemExtendedAxe(alchemyID + 15 + (i - 20) * 4 + 3, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool3" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Axe");

					MinecraftForge.setToolClass(item[2][i], "pickaxe", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[1][i], "shovel", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[3][i], "axe", sotool[i].getHarvestLevel());

					EWAPI.addRecipe(new ItemStack(item[0][i], 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[1][i], 1), new Object[] { " X ", " X ", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[2][i], 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[3][i], 1), new Object[] { "X  ", "XXX", "XY ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });

					for (int j = 0; j < 4; j++)
						LanguageRegistry.addName(item[j][i], "Extended " + (toolmatNames[i]) + " " + (toolNames[j]));
				}

			}

			{
				Object[] material =
						new Object[] { Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.stannumIngot,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.cuprumIngot,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.pyropusBronzeIngot,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.tombBronzeIngot, };
				EnumArmorMaterial[] soarmor =
						new EnumArmorMaterial[] { EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.armorStannum,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.armorCuprum,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.armorPyropusBronze,
								SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.armorTombBronze };

				for (int i = 16; i < 20; i++) {
					for (int j = 0; j < 4; j++) {
						armor[i][j] =
								(ItemArmor) new ItemExtendedArmor(alchemyID + 23 + (i - 16) * 4 + j, soarmor[i],
										armorRenderer[i], j, armormatNames[i]).setUnlocalizedName(
										"extendedWorkbenchso:armor" + i + j).setTextureName(
										"SimpleOresEW:armorextended" + armormatNames[i] + armorNames[j]);
						LanguageRegistry.addName(armor[i][j], "Extended " + armormatNames[i] + " " + armorNames[j]);
					}

					EWAPI.addRecipe(new ItemStack(armor[i][3], 1), new Object[] { "X X", "X X", "X X", ('X'), material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][2], 1), new Object[] { "XXX", "XXX", "X X", "X X", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][1], 1), new Object[] { "X X", "XXX", "XXX", "XXX", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][0], 1), new Object[] { "XXX", "XXX", "X X", ('X'), material[i] });
				}
			}
		}
		if (PluginChecks.getCthonInstalled()) {
			item[0][22] =
					new ItemExtendedSword(cthonID + 0, SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.toolCthon)
							.setUnlocalizedName("extendedWorkbenchnr:tool022").setTextureName("SimpleOresEW:toolCthonSword");
			item[1][22] =
					new ItemExtendedShovel(cthonID + 1, SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.toolCthon)
							.setUnlocalizedName("extendedWorkbenchnr:tool122").setTextureName("SimpleOresEW:toolCthonShovel");
			item[2][22] =
					new ItemExtendedPickaxe(cthonID + 2, SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.toolCthon)
							.setUnlocalizedName("extendedWorkbenchnr:tool222").setTextureName("SimpleOresEW:toolCthonPickaxe");
			item[3][22] =
					new ItemExtendedAxe(cthonID + 3, SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.toolCthon)
							.setUnlocalizedName("extendedWorkbenchnr:tool322").setTextureName("SimpleOresEW:toolCthonAxe");
			item[4][22] =
					new ItemExtendedHoe(cthonID + 4, SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.toolCthon)
							.setUnlocalizedName("extendedWorkbenchnr:tool422").setTextureName("SimpleOresEW:toolCthonHoe");

			MinecraftForge.setToolClass(item[2][22], "pickaxe",
					SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.toolCthon.getHarvestLevel());
			MinecraftForge.setToolClass(item[1][22], "shovel",
					SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.toolCthon.getHarvestLevel());
			MinecraftForge.setToolClass(item[3][22], "axe",
					SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.toolCthon.getHarvestLevel());

			EWAPI.addRecipe(new ItemStack(item[0][22], 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ", ('X'),
					SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.cthonIngot, ('Y'), Item.ingotIron });
			EWAPI.addRecipe(new ItemStack(item[1][22], 1), new Object[] { " X ", " X ", " Y ", " Y ", " Y ", " Y ", ('X'),
					SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.cthonIngot, ('Y'), Item.ingotIron });
			EWAPI.addRecipe(new ItemStack(item[2][22], 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ", " Y ", ('X'),
					SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.cthonIngot, ('Y'), Item.ingotIron });
			EWAPI.addRecipe(new ItemStack(item[3][22], 1), new Object[] { "X  ", "XXX", "XY ", " Y ", " Y ", " Y ", ('X'),
					SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.cthonIngot, ('Y'), Item.ingotIron });
			EWAPI.addRecipe(new ItemStack(item[4][22], 1), new Object[] { " X ", " XX", " Y ", " Y ", " Y ", " Y ", ('X'),
					SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.cthonIngot, ('Y'), Item.ingotIron });

			for (int j = 0; j < 5; j++)
				LanguageRegistry.addName(item[j][22], "Extended Cthon" + " " + (toolNames[j]));

			extendedcthonHelm =
					new ItemExtendedArmor(cthonID + 5, SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.armorCthon,
							armorRenderer[20], 0, "Cthon").setUnlocalizedName("extendedWorkbenchnr:armorCthonHelmet")
							.setTextureName("SimpleOresEW:armorextendedCthonHelmet");
			extendedcthonChest =
					new ItemExtendedArmor(cthonID + 6, SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.armorCthon,
							armorRenderer[20], 1, "Cthon").setUnlocalizedName("extendedWorkbenchnr:armorCthonChestplate")
							.setTextureName("SimpleOresEW:armorextendedCthonChestplate");
			extendedcthonLegs =
					new ItemExtendedArmor(cthonID + 7, SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.armorCthon,
							armorRenderer[20], 2, "Cthon").setUnlocalizedName("extendedWorkbenchnr:armorCthonLeggings")
							.setTextureName("SimpleOresEW:armorextendedCthonLeggings");
			extendedcthonBoots =
					new ItemExtendedArmor(cthonID + 8, SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.armorCthon,
							armorRenderer[20], 3, "Cthon").setUnlocalizedName("extendedWorkbenchnr:armorCthonBoots")
							.setTextureName("SimpleOresEW:armorextendedCthonBoots");

			EWAPI.addRecipe(new ItemStack(extendedcthonHelm, 1), new Object[] { "X X", "X X", "X X", ('X'),
					SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.cthonIngot });
			EWAPI.addRecipe(new ItemStack(extendedcthonChest, 1), new Object[] { "XXX", "XXX", "X X", "X X", ('X'),
					SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.cthonIngot });
			EWAPI.addRecipe(new ItemStack(extendedcthonLegs, 1), new Object[] { "X X", "XXX", "XXX", "XXX", ('X'),
					SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.cthonIngot });
			EWAPI.addRecipe(new ItemStack(extendedcthonBoots, 1), new Object[] { "XXX", "XXX", "X X", ('X'),
					SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.cthonIngot });

			LanguageRegistry.addName(extendedcthonHelm, "Extended Cthon Helmet");
			LanguageRegistry.addName(extendedcthonChest, "Extended Cthon Chestplate");
			LanguageRegistry.addName(extendedcthonLegs, "Extended Cthon Leggings");
			LanguageRegistry.addName(extendedcthonBoots, "Extended Cthon Boots");
		}
		if (PluginChecks.getGlitterInstalled()) {
			{
				Object[] material =
						new Object[] { Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								SimpleOres.plugins.akkamaddi.goldenglitter.code.GoldenGlitterCore.roseGoldIngot,
								SimpleOres.plugins.akkamaddi.goldenglitter.code.GoldenGlitterCore.erubescentGoldIngot,
								SimpleOres.plugins.akkamaddi.goldenglitter.code.GoldenGlitterCore.scarlatiteGoldIngot,
								SimpleOres.plugins.akkamaddi.goldenglitter.code.GoldenGlitterCore.hephaestanGoldIngot };
				EnumToolMaterial[] sotool =
						new EnumToolMaterial[] { EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								SimpleOres.plugins.akkamaddi.goldenglitter.code.GoldenGlitterCore.toolRoseGold,
								SimpleOres.plugins.akkamaddi.goldenglitter.code.GoldenGlitterCore.toolErubescentGold,
								SimpleOres.plugins.akkamaddi.goldenglitter.code.GoldenGlitterCore.toolScarlatiteGold,
								SimpleOres.plugins.akkamaddi.goldenglitter.code.GoldenGlitterCore.toolHephaestanGold };
				Object[] handle =
						new Object[] { Block.planks, Block.planks, Item.ingotIron, Item.ingotIron, Item.diamond,
								Block.cobblestone, Item.ingotIron, Item.diamond, Item.ingotIron, Item.ingotIron, Item.diamond,
								Item.ingotIron, Item.ingotIron, Block.cobblestone, Block.cobblestone, Block.cobblestone,
								Item.ingotIron, SimpleOres.core.Items.tinIngot, SimpleOres.core.Items.copperIngot,
								SimpleOres.plugins.fusion.Content.bronzeIngot, SimpleOres.plugins.fusion.Content.bronzeIngot,
								SimpleOres.plugins.fusion.Content.bronzeIngot, SimpleOres.plugins.fusion.Content.bronzeIngot,
								SimpleOres.core.Items.copperIngot, Item.ingotGold, Item.ingotGold, Item.ingotGold };

				for (int i = 23; i < 24; i++) {

					item[0][i] =
							new ItemExtendedSword(glitterID + (i - 23) * 5, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool0" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Sword");
					item[1][i] =
							new ItemExtendedShovel(glitterID + (i - 23) * 5 + 1, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool1" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Shovel");
					item[2][i] =
							new ItemExtendedPickaxe(glitterID + (i - 23) * 5 + 2, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool2" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Pickaxe");
					item[3][i] =
							new ItemExtendedAxe(glitterID + (i - 23) * 5 + 3, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool3" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Axe");
					item[4][i] =
							new ItemExtendedHoe(glitterID + (i - 23) * 5 + 4, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool4" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Hoe");

					MinecraftForge.setToolClass(item[2][i], "pickaxe", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[1][i], "shovel", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[3][i], "axe", sotool[i].getHarvestLevel());

					EWAPI.addRecipe(new ItemStack(item[0][i], 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[1][i], 1), new Object[] { " X ", " X ", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[2][i], 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[3][i], 1), new Object[] { "X  ", "XXX", "XY ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[4][i], 1), new Object[] { " X ", " XX", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });

					for (int j = 0; j < 5; j++)
						LanguageRegistry.addName(item[j][i], "Extended " + (toolmatNames[i]) + " " + (toolNames[j]));
				}
				for (int i = 24; i < 27; i++) {

					item[0][i] =
							new ItemExtendedSword(glitterID + (i - 24) * 4 + 5, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool0" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Sword");
					item[1][i] =
							new ItemExtendedShovel(glitterID + (i - 24) * 4 + 6, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool1" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Shovel");
					item[2][i] =
							new ItemExtendedPickaxe(glitterID + (i - 24) * 4 + 7, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool2" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Pickaxe");
					item[3][i] =
							new ItemExtendedAxe(glitterID + (i - 24) * 4 + 8, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool3" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Axe");

					MinecraftForge.setToolClass(item[2][i], "pickaxe", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[1][i], "shovel", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[3][i], "axe", sotool[i].getHarvestLevel());

					EWAPI.addRecipe(new ItemStack(item[0][i], 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[1][i], 1), new Object[] { " X ", " X ", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[2][i], 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[3][i], 1), new Object[] { "X  ", "XXX", "XY ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });

					for (int j = 0; j < 4; j++)
						LanguageRegistry.addName(item[j][i], "Extended " + (toolmatNames[i]) + " " + (toolNames[j]));
				}
			}

			{
				Object[] material =
						new Object[] { Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								SimpleOres.plugins.akkamaddi.goldenglitter.code.GoldenGlitterCore.roseGoldIngot };
				EnumArmorMaterial[] soarmor =
						new EnumArmorMaterial[] { EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								SimpleOres.plugins.akkamaddi.goldenglitter.code.GoldenGlitterCore.armorRoseGold };

				for (int i = 21; i < 22; i++) {
					for (int j = 0; j < 4; j++) {
						armor[i][j] =
								(ItemArmor) new ItemExtendedArmor(glitterID + 17 + (i - 21) * 4 + j, soarmor[i],
										armorRenderer[i], j, armormatNames[i]).setUnlocalizedName(
										"extendedWorkbenchso:armor" + i + j).setTextureName(
										"SimpleOresEW:armorextended" + armormatNames[i] + armorNames[j]);
						LanguageRegistry.addName(armor[i][j], "Extended " + armormatNames[i] + " " + armorNames[j]);
					}

					EWAPI.addRecipe(new ItemStack(armor[i][3], 1), new Object[] { "X X", "X X", "X X", ('X'), material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][2], 1), new Object[] { "XXX", "XXX", "X X", "X X", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][1], 1), new Object[] { "X X", "XXX", "XXX", "XXX", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][0], 1), new Object[] { "XXX", "XXX", "X X", ('X'), material[i] });
				}
			}
			if (SimpleOres.plugins.akkamaddi.goldenglitter.code.GoldenGlitterCore.werewolfEffectiveness)
				try {
					MinecraftForge.EVENT_BUS.register(new WerewolfHandler());
				} catch (Exception ignored) {
				}

		}
		if (PluginChecks.getHaditeInstalled()) {

			{
				Object[] material =
						new Object[] { Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								SimpleOres.plugins.akkamaddi.hadite.code.HaditeCoalCore.haditeSteelIngot,
								SimpleOres.plugins.akkamaddi.hadite.code.HaditeCoalCore.gestankenzinnIngot };
				EnumToolMaterial[] sotool =
						new EnumToolMaterial[] { EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								SimpleOres.plugins.akkamaddi.hadite.code.HaditeCoalCore.toolHaditeSteel,
								SimpleOres.plugins.akkamaddi.hadite.code.HaditeCoalCore.toolGestankenzinn };
				Object[] handle =
						new Object[] { Block.planks, Block.planks, Item.ingotIron, Item.ingotIron, Item.diamond,
								Block.cobblestone, Item.ingotIron, Item.diamond, Item.ingotIron, Item.ingotIron, Item.diamond,
								Item.ingotIron, Item.ingotIron, Block.cobblestone, Block.cobblestone, Block.cobblestone,
								Item.ingotIron, SimpleOres.core.Items.tinIngot, SimpleOres.core.Items.copperIngot,
								SimpleOres.plugins.fusion.Content.bronzeIngot, SimpleOres.plugins.fusion.Content.bronzeIngot,
								SimpleOres.plugins.fusion.Content.bronzeIngot, SimpleOres.plugins.fusion.Content.bronzeIngot,
								SimpleOres.core.Items.copperIngot, Item.ingotGold, Item.ingotGold, Item.ingotGold,
								Block.cobblestone, Block.cobblestone };

				for (int i = 27; i < 29; i++) {

					item[0][i] =
							new ItemExtendedSword(haditeID + (i - 27) * 4, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool0" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Sword");
					item[1][i] =
							new ItemExtendedShovel(haditeID + (i - 27) * 4 + 1, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool1" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Shovel");
					item[2][i] =
							new ItemExtendedPickaxe(haditeID + (i - 27) * 4 + 2, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool2" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Pickaxe");
					item[3][i] =
							new ItemExtendedAxe(haditeID + (i - 27) * 4 + 3, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool3" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Axe");

					MinecraftForge.setToolClass(item[2][i], "pickaxe", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[1][i], "shovel", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[3][i], "axe", sotool[i].getHarvestLevel());

					EWAPI.addRecipe(new ItemStack(item[0][i], 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[1][i], 1), new Object[] { " X ", " X ", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[2][i], 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[3][i], 1), new Object[] { "X  ", "XXX", "XY ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });

					for (int j = 0; j < 4; j++)
						LanguageRegistry.addName(item[j][i], "Extended " + (toolmatNames[i]) + " " + (toolNames[j]));
				}
			}

		}
		if (PluginChecks.getCobaltInstalled()) {
			{
				Object[] material =
						new Object[] { Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.cobaltIngot,
								SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.blueDriftSteelIngot,
								SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.blueCeladonIngot,
								SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.greenCeladonIngot };
				EnumToolMaterial[] sotool =
						new EnumToolMaterial[] { EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.toolCobalt,
								SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.toolBlueDriftSteel,
								SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.toolBlueCeladon,
								SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.toolGreenCeladon };
				Object[] handle =
						new Object[] { Block.planks, Block.planks, Item.ingotIron, Item.ingotIron, Item.diamond,
								Block.cobblestone, Item.ingotIron, Item.diamond, Item.ingotIron, Item.ingotIron, Item.diamond,
								Item.ingotIron, Item.ingotIron, Block.cobblestone, Block.cobblestone, Block.cobblestone,
								Item.ingotIron, SimpleOres.core.Items.tinIngot, SimpleOres.core.Items.copperIngot,
								SimpleOres.plugins.fusion.Content.bronzeIngot, SimpleOres.plugins.fusion.Content.bronzeIngot,
								SimpleOres.plugins.fusion.Content.bronzeIngot, SimpleOres.plugins.fusion.Content.bronzeIngot,
								SimpleOres.core.Items.copperIngot, Item.ingotGold, Item.ingotGold, Item.ingotGold,
								Block.cobblestone, Block.cobblestone, Item.ingotIron, Item.ingotIron,
								SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.cobaltIngot,
								SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.cobaltIngot };

				for (int i = 29; i < 33; i++) {

					item[0][i] =
							new ItemExtendedSword(cobaltID + (i - 29) * 5 + 0, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool0" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Sword");
					item[1][i] =
							new ItemExtendedShovel(cobaltID + (i - 29) * 5 + 1, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool1" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Shovel");
					item[2][i] =
							new ItemExtendedPickaxe(cobaltID + (i - 29) * 5 + 2, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool2" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Pickaxe");
					item[3][i] =
							new ItemExtendedAxe(cobaltID + (i - 29) * 5 + 3, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool3" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Axe");
					item[4][i] =
							new ItemExtendedHoe(cobaltID + (i - 29) * 5 + 4, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool4" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Hoe");

					MinecraftForge.setToolClass(item[2][i], "pickaxe", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[1][i], "shovel", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[3][i], "axe", sotool[i].getHarvestLevel());

					EWAPI.addRecipe(new ItemStack(item[0][i], 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[1][i], 1), new Object[] { " X ", " X ", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[2][i], 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[3][i], 1), new Object[] { "X  ", "XXX", "XY ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[4][i], 1), new Object[] { " X ", " XX", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });

					for (int j = 0; j < 5; j++)
						LanguageRegistry.addName(item[j][i], "Extended " + (toolmatNames[i]) + " " + (toolNames[j]));
				}
			}

			{
				Object[] material =
						new Object[] { Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.cobaltIngot,
								SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.blueDriftSteelIngot,
								SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.blueCeladonIngot,
								SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.greenCeladonIngot };
				EnumArmorMaterial[] soarmor =
						new EnumArmorMaterial[] { EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.armorCobalt,
								SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.armorBlueDriftSteel,
								SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.armorBlueCeladon,
								SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.armorGreenCeladon };

				for (int i = 22; i < 26; i++) {
					for (int j = 0; j < 4; j++) {
						armor[i][j] =
								(ItemArmor) new ItemExtendedArmor(cobaltID + 20 + (i - 22) * 4 + j, soarmor[i],
										armorRenderer[i], j, armormatNames[i]).setUnlocalizedName(
										"extendedWorkbenchso:armor" + i + j).setTextureName(
										"SimpleOresEW:armorextended" + armormatNames[i] + armorNames[j]);
						LanguageRegistry.addName(armor[i][j], "Extended " + armormatNames[i] + " " + armorNames[j]);
					}

					EWAPI.addRecipe(new ItemStack(armor[i][3], 1), new Object[] { "X X", "X X", "X X", ('X'), material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][2], 1), new Object[] { "XXX", "XXX", "X X", "X X", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][1], 1), new Object[] { "X X", "XXX", "XXX", "XXX", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][0], 1), new Object[] { "XXX", "XXX", "X X", ('X'), material[i] });
				}
			}
		}
		if (PluginChecks.getTungstenInstalled()) {
			{
				Object[] material =
						new Object[] { Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.tungstenIngot,
								SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.tungstenCarbideIngot,
								SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.valframIngot, SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.tungstenSteelIngot, SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.prasinosIngot };
				EnumToolMaterial[] sotool =
						new EnumToolMaterial[] { EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.toolTungsten,
								SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.toolTungstenCarbide,
								SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.toolValfram, SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.toolTungstenSteel, SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.toolPrasinos };
				Object[] handle =
						new Object[] { Block.planks, Block.planks, Item.ingotIron, Item.ingotIron, Item.diamond,
								Block.cobblestone, Item.ingotIron, Item.diamond, Item.ingotIron, Item.ingotIron, Item.diamond,
								Item.ingotIron, Item.ingotIron, Block.cobblestone, Block.cobblestone, Block.cobblestone,
								Item.ingotIron, SimpleOres.core.Items.tinIngot, SimpleOres.core.Items.copperIngot,
								SimpleOres.plugins.fusion.Content.bronzeIngot, SimpleOres.plugins.fusion.Content.bronzeIngot,
								SimpleOres.plugins.fusion.Content.bronzeIngot, SimpleOres.plugins.fusion.Content.bronzeIngot,
								SimpleOres.core.Items.copperIngot, Item.ingotGold, Item.ingotGold, Item.ingotGold,
								Block.cobblestone, Block.cobblestone, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron };

				for (int i = 33; i < 38; i++) {

					item[0][i] =
							new ItemExtendedSword(tungstenID + (i - 33) * 5 + 0, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool0" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Sword");
					item[1][i] =
							new ItemExtendedShovel(tungstenID + (i - 33) * 5 + 1, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool1" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Shovel");
					item[2][i] =
							new ItemExtendedPickaxe(tungstenID + (i - 33) * 5 + 2, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool2" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Pickaxe");
					item[3][i] =
							new ItemExtendedAxe(tungstenID + (i - 33) * 5 + 3, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool3" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Axe");
					item[4][i] =
							new ItemExtendedHoe(tungstenID + (i - 33) * 5 + 4, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool4" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Hoe");

					MinecraftForge.setToolClass(item[2][i], "pickaxe", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[1][i], "shovel", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[3][i], "axe", sotool[i].getHarvestLevel());

					EWAPI.addRecipe(new ItemStack(item[0][i], 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[1][i], 1), new Object[] { " X ", " X ", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[2][i], 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[3][i], 1), new Object[] { "X  ", "XXX", "XY ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[4][i], 1), new Object[] { " X ", " XX", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });

					for (int j = 0; j < 5; j++)
						LanguageRegistry.addName(item[j][i], "Extended " + (toolmatNames[i]) + " " + (toolNames[j]));
				}
			}

			{
				Object[] material =
						new Object[] { Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.tungstenIngot,
								SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.tungstenCarbideIngot,
								SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.valframIngot, SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.tungstenSteelIngot, SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.prasinosIngot };
				EnumArmorMaterial[] soarmor =
						new EnumArmorMaterial[] { EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON,
								SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.armorTungsten,
								SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.armorTungstenCarbide,
								SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.armorValfram, SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.armorTungstenSteel, SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.armorPrasinos };

				for (int i = 26; i < 31; i++) {
					for (int j = 0; j < 4; j++) {
						armor[i][j] =
								(ItemArmor) new ItemExtendedArmor(tungstenID + 25 + (i - 26) * 4 + j, soarmor[i],
										armorRenderer[i], j, armormatNames[i]).setUnlocalizedName(
										"extendedWorkbenchso:armor" + i + j).setTextureName(
										"SimpleOresEW:armorextended" + armormatNames[i] + armorNames[j]);
						LanguageRegistry.addName(armor[i][j], "Extended " + armormatNames[i] + " " + armorNames[j]);
					}

					EWAPI.addRecipe(new ItemStack(armor[i][3], 1), new Object[] { "X X", "X X", "X X", ('X'), material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][2], 1), new Object[] { "XXX", "XXX", "X X", "X X", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][1], 1), new Object[] { "X X", "XXX", "XXX", "XXX", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][0], 1), new Object[] { "XXX", "XXX", "X X", ('X'), material[i] });
				}
			}
		}
		if (PluginChecks.getSterlingInstalled()) {
			{
				Object[] material =
						new Object[] { Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron,
								SimpleOres.plugins.akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.sterlingSteelIngot,
								SimpleOres.plugins.akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.blackSilverIngot };
				EnumToolMaterial[] sotool =
						new EnumToolMaterial[] { EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								EnumToolMaterial.WOOD, EnumToolMaterial.WOOD, EnumToolMaterial.WOOD,
								SimpleOres.plugins.akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.toolSterlingSteel,
								SimpleOres.plugins.akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.toolBlackSilver };
				Object[] handle =
						new Object[] { Block.planks, Block.planks, Item.ingotIron, Item.ingotIron, Item.diamond,
								Block.cobblestone, Item.ingotIron, Item.diamond, Item.ingotIron, Item.ingotIron, Item.diamond,
								Item.ingotIron, Item.ingotIron, Block.cobblestone, Block.cobblestone, Block.cobblestone,
								Item.ingotIron, SimpleOres.core.Items.tinIngot, SimpleOres.core.Items.copperIngot,
								SimpleOres.plugins.fusion.Content.bronzeIngot, SimpleOres.plugins.fusion.Content.bronzeIngot,
								SimpleOres.plugins.fusion.Content.bronzeIngot, SimpleOres.plugins.fusion.Content.bronzeIngot,
								SimpleOres.core.Items.copperIngot, Item.ingotGold, Item.ingotGold, Item.ingotGold,
								Block.cobblestone, Block.cobblestone, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								OnlySilver.code.api.OnlySilverAPI.silverIngot.get(),
								OnlySilver.code.api.OnlySilverAPI.silverIngot.get() };

				for (int i = 38; i < 40; i++) {

					item[0][i] =
							new ItemExtendedSword(sterlingID + (i - 38) * 5 + 0, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool0" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Sword");
					item[1][i] =
							new ItemExtendedShovel(sterlingID + (i - 38) * 5 + 1, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool1" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Shovel");
					item[2][i] =
							new ItemExtendedPickaxe(sterlingID + (i - 38) * 5 + 2, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool2" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Pickaxe");
					item[3][i] =
							new ItemExtendedAxe(sterlingID + (i - 38) * 5 + 3, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool3" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Axe");
					item[4][i] =
							new ItemExtendedHoe(sterlingID + (i - 38) * 5 + 4, sotool[i]).setUnlocalizedName(
									"extendedWorkbenchso:tool4" + i).setTextureName(
									"SimpleOresEW:tool" + toolmatNames[i] + "Hoe");

					MinecraftForge.setToolClass(item[2][i], "pickaxe", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[1][i], "shovel", sotool[i].getHarvestLevel());
					MinecraftForge.setToolClass(item[3][i], "axe", sotool[i].getHarvestLevel());

					EWAPI.addRecipe(new ItemStack(item[0][i], 1), new Object[] { " X ", " X ", " X ", " X ", "YXY", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[1][i], 1), new Object[] { " X ", " X ", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[2][i], 1), new Object[] { "XX ", " XX", " YX", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[3][i], 1), new Object[] { "X  ", "XXX", "XY ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });
					EWAPI.addRecipe(new ItemStack(item[4][i], 1), new Object[] { " X ", " XX", " Y ", " Y ", " Y ", " Y ",
							('X'), material[i], ('Y'), handle[i] });

					for (int j = 0; j < 5; j++)
						LanguageRegistry.addName(item[j][i], "Extended " + (toolmatNames[i]) + " " + (toolNames[j]));
				}
			}

			{
				Object[] material =
						new Object[] { Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron,
								SimpleOres.plugins.akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.sterlingSteelIngot,
								SimpleOres.plugins.akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.blackSilverIngot };
				EnumArmorMaterial[] soarmor =
						new EnumArmorMaterial[] { EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON, EnumArmorMaterial.IRON,
								SimpleOres.plugins.akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.armorSterlingSteel,
								SimpleOres.plugins.akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.armorBlackSilver };

				for (int i = 31; i < 33; i++) {
					for (int j = 0; j < 4; j++) {
						armor[i][j] =
								(ItemArmor) new ItemExtendedArmor(sterlingID + 10 + (i - 29) * 4 + j, soarmor[i],
										armorRenderer[i], j, armormatNames[i]).setUnlocalizedName(
										"extendedWorkbenchso:armor" + i + j).setTextureName(
										"SimpleOresEW:armorextended" + armormatNames[i] + armorNames[j]);
						LanguageRegistry.addName(armor[i][j], "Extended " + armormatNames[i] + " " + armorNames[j]);
					}

					EWAPI.addRecipe(new ItemStack(armor[i][3], 1), new Object[] { "X X", "X X", "X X", ('X'), material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][2], 1), new Object[] { "XXX", "XXX", "X X", "X X", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][1], 1), new Object[] { "X X", "XXX", "XXX", "XXX", ('X'),
							material[i] });
					EWAPI.addRecipe(new ItemStack(armor[i][0], 1), new Object[] { "XXX", "XXX", "X X", ('X'), material[i] });
				}
			}
			if (SimpleOres.plugins.akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.werewolfEffectiveness)
				try {
					MinecraftForge.EVENT_BUS.register(new WerewolfHandler());
				} catch (Exception ignored) {
				}

		}

		proxy.registerRenderInformation();

	}
}
