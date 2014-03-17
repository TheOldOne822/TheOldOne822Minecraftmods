package theoldone822.SimpleDust;

import java.io.File;

import alexndr.SimpleOres.api.content.SimpleIngot;
import alexndr.SimpleOres.api.helpers.FreeIdHelper;
import alexndr.SimpleOres.api.helpers.CoreHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(
		modid = "simpleoresdust",
		name = "Simple Ores Dust",
		version = "1.0",
		dependencies = "required-after:simpleores; after:ThermalExpansion; after:simpleoresfusion; after:SimpleArsenic; after:netherrocksfusion; after:netherrocks; after:classicalalchemy; after:simplecthon; after:goldenglitter; after:haditecoal; after:simplecobalt; after:simpletungsten; after:sterlingandblack; after:wootzpigngray; after:classicalalchemyores; after:TungstenOres; after:Tennantite; after:Glaucodot")
public class SimpleDust {

	public static int copperDustID;
	public static int tinDustID;
	public static int mythrilDustID;
	public static int adamantiumDustID;
	public static int bronzeDustID;
	public static int thyriumDustID;
	public static int sinisiteDustID;
	public static int fyriteDustID;
	public static int malachiteDustID;
	public static int illumeniteDustID;
	public static int argoniteDustID;
	public static int arsenicDustID;
	public static int arsenideBronzeDustID;
	public static int arsenideGoldDustID;
	public static int tenebriumDustID;
	public static int sterlingSteelDustID;
	public static int blackSilverDustID;
	public static int haditeSteelDustID;
	public static int gestankenzinnDustID;
	public static int roseGoldDustID;
	public static int erubescentGoldDustID;
	public static int scarlatiteGoldDustID;
	public static int hephaestanGoldDustID;
	public static int cobaltDustID;
	public static int blueDriftSteelDustID;
	public static int blueCeladonDustID;
	public static int greenCeladonDustID;
	public static int tungstenDustID;
	public static int tungstenCarbideDustID;
	public static int valframDustID;
	public static int tungstenSteelDustID;
	public static int prasinosDustID;
	public static int cthonDustID;
	public static int stannumDustID;
	public static int cuprumDustID;
	public static int pyropusBronzeDustID;
	public static int pulchrumBronzeDustID;
	public static int tombBronzeDustID;
	public static int cinderstoneDustID;
	public static int thrakaDustID;
	public static int pyralisDustID;
	public static int dragonBezoarDustID;
	public static int wootzDustID;

	public static Item copperDust;
	public static Item tinDust;
	public static Item mythrilDust;
	public static Item adamantiumDust;
	public static Item bronzeDust;
	public static Item thyriumDust;
	public static Item sinisiteDust;
	public static Item fyriteDust;
	public static Item malachiteDust;
	public static Item illumeniteDust;
	public static Item argoniteDust;
	public static Item arsenicDust;
	public static Item arsenideBronzeDust;
	public static Item arsenideGoldDust;
	public static Item tenebriumDust;
	public static Item sterlingSteelDust;
	public static Item blackSilverDust;
	public static Item haditeSteelDust;
	public static Item gestankenzinnDust;
	public static Item roseGoldDust;
	public static Item erubescentGoldDust;
	public static Item scarlatiteGoldDust;
	public static Item hephaestanGoldDust;
	public static Item cobaltDust;
	public static Item blueDriftSteelDust;
	public static Item blueCeladonDust;
	public static Item greenCeladonDust;
	public static Item tungstenDust;
	public static Item tungstenCarbideDust;
	public static Item valframDust;
	public static Item tungstenSteelDust;
	public static Item prasinosDust;
	public static Item cthonDust;
	public static Item stannumDust;
	public static Item cuprumDust;
	public static Item pyropusBronzeDust;
	public static Item pulchrumBronzeDust;
	public static Item tombBronzeDust;
	public static Item cinderstoneDust;
	public static Item thrakaDust;
	public static Item pyralisDust;
	public static Item dragonBezoarDust;
	public static Item wootzDust;

	@Instance("SimpleDust")
	public static SimpleDust instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		File installDir = event.getModConfigurationDirectory();
		File configDir = new File(installDir, "SimpleOres/Plugins");
		Configuration config = new Configuration(new File(configDir, "SimpleDust.cfg"));

		config.load();

		FreeIdHelper.compileIdList();

		copperDustID = config.getItem("Items", "Copper Dust", FreeIdHelper.freeItem()).getInt();
		tinDustID = config.getItem("Items", "Tin Dust", FreeIdHelper.freeItem()).getInt();
		mythrilDustID = config.getItem("Items", "mythril Dust", FreeIdHelper.freeItem()).getInt();
		adamantiumDustID = config.getItem("Items", "adamantium Dust", FreeIdHelper.freeItem()).getInt();
		bronzeDustID = config.getItem("Items", "bronze Dust", FreeIdHelper.freeItem()).getInt();
		thyriumDustID = config.getItem("Items", "thyrium Dust", FreeIdHelper.freeItem()).getInt();
		sinisiteDustID = config.getItem("Items", "sinisite Dust", FreeIdHelper.freeItem()).getInt();
		fyriteDustID = config.getItem("Items", "fyrite Dust", FreeIdHelper.freeItem()).getInt();
		malachiteDustID = config.getItem("Items", "malachite Dust", FreeIdHelper.freeItem()).getInt();
		illumeniteDustID = config.getItem("Items", "illumenite Dust", FreeIdHelper.freeItem()).getInt();
		argoniteDustID = config.getItem("Items", "argonite Dust", FreeIdHelper.freeItem()).getInt();
		arsenicDustID = config.getItem("Items", "arsenic Dust", FreeIdHelper.freeItem()).getInt();
		arsenideBronzeDustID = config.getItem("Items", "arsenide Bronze Dust", FreeIdHelper.freeItem()).getInt();
		arsenideGoldDustID = config.getItem("Items", "arsenide Gold Dust", FreeIdHelper.freeItem()).getInt();
		tenebriumDustID = config.getItem("Items", "tenebrium Dust", FreeIdHelper.freeItem()).getInt();
		sterlingSteelDustID = config.getItem("Items", "sterling Steel Dust", FreeIdHelper.freeItem()).getInt();
		blackSilverDustID = config.getItem("Items", "black Silver Dust", FreeIdHelper.freeItem()).getInt();
		haditeSteelDustID = config.getItem("Items", "hadite Steel Dust", FreeIdHelper.freeItem()).getInt();
		gestankenzinnDustID = config.getItem("Items", "gestankenzinn Dust", FreeIdHelper.freeItem()).getInt();
		roseGoldDustID = config.getItem("Items", "rose Gold Dust", FreeIdHelper.freeItem()).getInt();
		erubescentGoldDustID = config.getItem("Items", "erubescent Gold Dust", FreeIdHelper.freeItem()).getInt();
		scarlatiteGoldDustID = config.getItem("Items", "scarlatite Gold Dust", FreeIdHelper.freeItem()).getInt();
		hephaestanGoldDustID = config.getItem("Items", "hephaestan Gold Dust", FreeIdHelper.freeItem()).getInt();
		cobaltDustID = config.getItem("Items", "cobalt Dust", FreeIdHelper.freeItem()).getInt();
		blueDriftSteelDustID = config.getItem("Items", "blue Drift Steel Dust", FreeIdHelper.freeItem()).getInt();
		blueCeladonDustID = config.getItem("Items", "blue Celadon Dust", FreeIdHelper.freeItem()).getInt();
		greenCeladonDustID = config.getItem("Items", "green Celadon Dust", FreeIdHelper.freeItem()).getInt();
		tungstenDustID = config.getItem("Items", "tungsten Dust", FreeIdHelper.freeItem()).getInt();
		tungstenCarbideDustID = config.getItem("Items", "tungsten Carbide Dust", FreeIdHelper.freeItem()).getInt();
		valframDustID = config.getItem("Items", "valfram Dust", FreeIdHelper.freeItem()).getInt();
		tungstenSteelDustID = config.getItem("Items", "tungsten Steel Dust", FreeIdHelper.freeItem()).getInt();
		prasinosDustID = config.getItem("Items", "prasinos Dust", FreeIdHelper.freeItem()).getInt();
		cthonDustID = config.getItem("Items", "cthon Dust", FreeIdHelper.freeItem()).getInt();
		stannumDustID = config.getItem("Items", "stannum Dust", FreeIdHelper.freeItem()).getInt();
		cuprumDustID = config.getItem("Items", "cuprum Dust", FreeIdHelper.freeItem()).getInt();
		pyropusBronzeDustID = config.getItem("Items", "pyropus Bronze Dust", FreeIdHelper.freeItem()).getInt();
		pulchrumBronzeDustID = config.getItem("Items", "pulchrum Bronze Dust", FreeIdHelper.freeItem()).getInt();
		tombBronzeDustID = config.getItem("Items", "tomb Bronze Dust", FreeIdHelper.freeItem()).getInt();
		cinderstoneDustID = config.getItem("Items", "cinderstone Dust", FreeIdHelper.freeItem()).getInt();
		thrakaDustID = config.getItem("Items", "thraka Dust", FreeIdHelper.freeItem()).getInt();
		pyralisDustID = config.getItem("Items", "pyralis Dust", FreeIdHelper.freeItem()).getInt();
		dragonBezoarDustID = config.getItem("Items", "dragon Bezoar Dust", FreeIdHelper.freeItem()).getInt();
		wootzDustID = config.getItem("Items", "wootz Dust", FreeIdHelper.freeItem()).getInt();

		config.save();

		copperDust = new SimpleIngot(copperDustID).modId("simpleoresdust").setUnlocalizedName("copperDust").setTextureName("SimpleDust:copperDust");
		tinDust = new SimpleIngot(tinDustID).modId("simpleoresdust").setUnlocalizedName("tinDust").setTextureName("SimpleDust:tinDust");
		mythrilDust = new SimpleIngot(mythrilDustID).modId("simpleoresdust").setUnlocalizedName("mythrilDust").setTextureName("SimpleDust:mythrilDust");
		adamantiumDust = new SimpleIngot(adamantiumDustID).modId("simpleoresdust").setUnlocalizedName("adamantiumDust").setTextureName("SimpleDust:adamantiumDust");
		
		OreDictionary.registerOre("dustCopper", new ItemStack(copperDust));
		OreDictionary.registerOre("dustTin", new ItemStack(tinDust));
		OreDictionary.registerOre("dustMythril", new ItemStack(mythrilDust));
		OreDictionary.registerOre("dustMithril", new ItemStack(mythrilDust));
		OreDictionary.registerOre("dustAdamantium", new ItemStack(adamantiumDust));
		OreDictionary.registerOre("dustAdamantite", new ItemStack(adamantiumDust));
		OreDictionary.registerOre("dustAdamantine", new ItemStack(adamantiumDust));

		LanguageRegistry.addName(copperDust, "Copper Dust");
		LanguageRegistry.addName(tinDust, "Tin Dust");
		LanguageRegistry.addName(mythrilDust, "Mythril Dust");
		LanguageRegistry.addName(adamantiumDust, "Adamantium Dust");

		GameRegistry.addSmelting(copperDust.itemID, new ItemStack(CoreHelper.coreContent.copperIngot, 1, 0), 0.7F);
		GameRegistry.addSmelting(tinDust.itemID, new ItemStack(CoreHelper.coreContent.tinIngot, 1, 0), 0.7F);
		GameRegistry.addSmelting(mythrilDust.itemID, new ItemStack(CoreHelper.coreContent.mythrilIngot, 1, 0), 0.9F);
		GameRegistry.addSmelting(adamantiumDust.itemID, new ItemStack(CoreHelper.coreContent.adamantiumIngot, 1, 0), 1.0F);

		if (Loader.isModLoaded("ThermalExpansion")) {
/*			NBTTagCompound toSendCopperore = new NBTTagCompound();
			toSendCopperore.setInteger("energy", 4000);
			toSendCopperore.setCompoundTag("input", new NBTTagCompound());
			toSendCopperore.setCompoundTag("primaryOutput", new NBTTagCompound());
			toSendCopperore.setCompoundTag("secondaryOutput", new NBTTagCompound());
			new ItemStack(CoreHelper.coreContent.copperOre).writeToNBT(toSendCopperore.getCompoundTag("input"));
			new ItemStack(copperDust, 2).writeToNBT(toSendCopperore.getCompoundTag("primaryOutput"));
			(OreDictionary.getOres("dustGold").get(0)).writeToNBT(toSendCopperore.getCompoundTag("secondaryOutput"));
			toSendCopperore.setInteger("secondaryChance", 10);
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendCopperore);
*/		
			NBTTagCompound toSendcopperIngot = new NBTTagCompound();
			toSendcopperIngot.setInteger("energy", 2400);
			toSendcopperIngot.setCompoundTag("input", new NBTTagCompound());
			toSendcopperIngot.setCompoundTag("primaryOutput", new NBTTagCompound());
			new ItemStack(CoreHelper.coreContent.copperIngot).writeToNBT(toSendcopperIngot.getCompoundTag("input"));
			new ItemStack(copperDust).writeToNBT(toSendcopperIngot.getCompoundTag("primaryOutput"));
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendcopperIngot);

/*			NBTTagCompound toSendTinore = new NBTTagCompound();
			toSendTinore.setInteger("energy", 4000);
			toSendTinore.setCompoundTag("input", new NBTTagCompound());
			toSendTinore.setCompoundTag("primaryOutput", new NBTTagCompound());
			toSendTinore.setCompoundTag("secondaryOutput", new NBTTagCompound());
			new ItemStack(CoreHelper.coreContent.tinOre).writeToNBT(toSendTinore.getCompoundTag("input"));
			new ItemStack(tinDust, 2).writeToNBT(toSendTinore.getCompoundTag("primaryOutput"));
			(OreDictionary.getOres("dustIron").get(0)).writeToNBT(toSendTinore.getCompoundTag("secondaryOutput"));
			toSendTinore.setInteger("secondaryChance", 10);
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendTinore);
*/		
			NBTTagCompound toSendTinIngot = new NBTTagCompound();
			toSendTinIngot.setInteger("energy", 2400);
			toSendTinIngot.setCompoundTag("input", new NBTTagCompound());
			toSendTinIngot.setCompoundTag("primaryOutput", new NBTTagCompound());
			new ItemStack(CoreHelper.coreContent.tinIngot).writeToNBT(toSendTinIngot.getCompoundTag("input"));
			new ItemStack(tinDust).writeToNBT(toSendTinIngot.getCompoundTag("primaryOutput"));
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendTinIngot);

			NBTTagCompound toSend1ore = new NBTTagCompound();
			toSend1ore.setInteger("energy", 4000);
			toSend1ore.setCompoundTag("input", new NBTTagCompound());
			toSend1ore.setCompoundTag("primaryOutput", new NBTTagCompound());
			new ItemStack(CoreHelper.coreContent.mythrilOre).writeToNBT(toSend1ore.getCompoundTag("input"));
			new ItemStack(mythrilDust, 2).writeToNBT(toSend1ore.getCompoundTag("primaryOutput"));
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1ore);
		
			NBTTagCompound toSend1Ingot = new NBTTagCompound();
			toSend1Ingot.setInteger("energy", 2400);
			toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
			toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
			new ItemStack(CoreHelper.coreContent.mythrilIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
			new ItemStack(mythrilDust).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

			NBTTagCompound toSend2ore = new NBTTagCompound();
			toSend2ore.setInteger("energy", 4000);
			toSend2ore.setCompoundTag("input", new NBTTagCompound());
			toSend2ore.setCompoundTag("primaryOutput", new NBTTagCompound());
			new ItemStack(CoreHelper.coreContent.adamantiumOre).writeToNBT(toSend2ore.getCompoundTag("input"));
			new ItemStack(adamantiumDust, 2).writeToNBT(toSend2ore.getCompoundTag("primaryOutput"));
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2ore);

			NBTTagCompound toSend2Ingot = new NBTTagCompound();
			toSend2Ingot.setInteger("energy", 2400);
			toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
			toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
			new ItemStack(CoreHelper.coreContent.adamantiumIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
			new ItemStack(adamantiumDust).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);

			NBTTagCompound toSend3ore = new NBTTagCompound();
			toSend3ore.setInteger("energy", 4000);
			toSend3ore.setCompoundTag("input", new NBTTagCompound());
			toSend3ore.setCompoundTag("primaryOutput", new NBTTagCompound());
			new ItemStack(CoreHelper.coreContent.onyxOre).writeToNBT(toSend3ore.getCompoundTag("input"));
			new ItemStack(CoreHelper.coreContent.onyxGem, 2).writeToNBT(toSend3ore.getCompoundTag("primaryOutput"));
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3ore);
		}

		if (Loader.isModLoaded("simpleoresfusion")) {
			bronzeDust = new SimpleIngot(bronzeDustID).modId("simpleoresdust").setUnlocalizedName("bronzeDust").setTextureName("SimpleDust:bronzeDust");
			thyriumDust = new SimpleIngot(thyriumDustID).modId("simpleoresdust").setUnlocalizedName("thyriumDust").setTextureName("SimpleDust:thyriumDust");
			sinisiteDust = new SimpleIngot(sinisiteDustID).modId("simpleoresdust").setUnlocalizedName("sinisiteDust").setTextureName("SimpleDust:sinisiteDust");

			OreDictionary.registerOre("dustBronze", new ItemStack(bronzeDust));
			OreDictionary.registerOre("dustThyrium", new ItemStack(thyriumDust));
			OreDictionary.registerOre("dustSinisite", new ItemStack(sinisiteDust));

			LanguageRegistry.addName(bronzeDust, "Bronze Dust");
			LanguageRegistry.addName(thyriumDust, "Thyrium Dust");
			LanguageRegistry.addName(sinisiteDust, "Sinisite Dust");

			GameRegistry.addSmelting(bronzeDust.itemID, new ItemStack(alexndr.SimpleOres.plugins.fusion.FusionHelper.fusionContent.bronzeIngot, 1, 0), 0.3F);
			GameRegistry.addSmelting(thyriumDust.itemID, new ItemStack(alexndr.SimpleOres.plugins.fusion.FusionHelper.fusionContent.thyriumIngot, 1, 0), 0.6F);
			GameRegistry.addSmelting(sinisiteDust.itemID, new ItemStack(alexndr.SimpleOres.plugins.fusion.FusionHelper.fusionContent.sinisiteIngot, 1, 0), 1.0F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend0Ingot = new NBTTagCompound();
				toSend0Ingot.setInteger("energy", 2400);
				toSend0Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend0Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.fusion.FusionHelper.fusionContent.bronzeIngot).writeToNBT(toSend0Ingot.getCompoundTag("input"));
				new ItemStack(bronzeDust).writeToNBT(toSend0Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend0Ingot);

				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.fusion.FusionHelper.fusionContent.thyriumIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(thyriumDust).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(CoreHelper.coreContent.adamantiumOre).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(sinisiteDust).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);
			}
		}

		if (Loader.isModLoaded("netherrocks")) {
			fyriteDust = new SimpleIngot(fyriteDustID).modId("simpleoresdust").setUnlocalizedName("fyriteDust").setTextureName("SimpleDust:fyriteDust");
			malachiteDust = new SimpleIngot(malachiteDustID).modId("simpleoresdust").setUnlocalizedName("malachiteDust").setTextureName("SimpleDust:malachiteDust");
			illumeniteDust = new SimpleIngot(illumeniteDustID).modId("simpleoresdust").setUnlocalizedName("illumeniteDust").setTextureName("SimpleDust:illumeniteDust");
			argoniteDust = new SimpleIngot(argoniteDustID).modId("simpleoresdust").setUnlocalizedName("argoniteDust").setTextureName("SimpleDust:argoniteDust");
			
			OreDictionary.registerOre("dustFyrite", new ItemStack(fyriteDust));
			OreDictionary.registerOre("dustMalachite", new ItemStack(malachiteDust));
			OreDictionary.registerOre("dustIllumenite", new ItemStack(illumeniteDust));
			OreDictionary.registerOre("dustArgonite", new ItemStack(argoniteDust));

			LanguageRegistry.addName(fyriteDust, "Fyrite Dust");
			LanguageRegistry.addName(malachiteDust, "Malachite Dust");
			LanguageRegistry.addName(illumeniteDust, "Illumenite Dust");
			LanguageRegistry.addName(argoniteDust, "Argonite Dust");

			GameRegistry.addSmelting(fyriteDust.itemID, new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.fyriteIngot, 1, 0), 0.8F);
			GameRegistry.addSmelting(malachiteDust.itemID, new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.malachiteIngot, 1, 0), 0.5F);
			GameRegistry.addSmelting(illumeniteDust.itemID, new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.illumeniteIngot, 1, 0), 0.8F);
			GameRegistry.addSmelting(argoniteDust.itemID, new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.argoniteIngot, 1, 0), 0.7F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1ore = new NBTTagCompound();
				toSend1ore.setInteger("energy", 4000);
				toSend1ore.setCompoundTag("input", new NBTTagCompound());
				toSend1ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.fyriteOre).writeToNBT(toSend1ore.getCompoundTag("input"));
				new ItemStack(fyriteDust, 2).writeToNBT(toSend1ore.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1ore);
			
				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.fyriteIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(fyriteDust).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2ore = new NBTTagCompound();
				toSend2ore.setInteger("energy", 4000);
				toSend2ore.setCompoundTag("input", new NBTTagCompound());
				toSend2ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.malachiteOre).writeToNBT(toSend2ore.getCompoundTag("input"));
				new ItemStack(malachiteDust, 2).writeToNBT(toSend2ore.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2ore);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.malachiteIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(malachiteDust).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);

				NBTTagCompound toSend3ore = new NBTTagCompound();
				toSend3ore.setInteger("energy", 4000);
				toSend3ore.setCompoundTag("input", new NBTTagCompound());
				toSend3ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				toSend3ore.setCompoundTag("secondaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.illumeniteOre).writeToNBT(toSend3ore.getCompoundTag("input"));
				new ItemStack(illumeniteDust, 2).writeToNBT(toSend3ore.getCompoundTag("primaryOutput"));
				new ItemStack(Item.glowstone).writeToNBT(toSend3ore.getCompoundTag("secondaryOutput"));
				toSend3ore.setInteger("secondaryChance", 15);
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3ore);

				NBTTagCompound toSend3Ingot = new NBTTagCompound();
				toSend3Ingot.setInteger("energy", 2400);
				toSend3Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend3Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.illumeniteIngot).writeToNBT(toSend3Ingot.getCompoundTag("input"));
				new ItemStack(illumeniteDust).writeToNBT(toSend3Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3Ingot);

				NBTTagCompound toSend4ore = new NBTTagCompound();
				toSend4ore.setInteger("energy", 4000);
				toSend4ore.setCompoundTag("input", new NBTTagCompound());
				toSend4ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.argoniteOre).writeToNBT(toSend4ore.getCompoundTag("input"));
				new ItemStack(argoniteDust, 2).writeToNBT(toSend4ore.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend4ore);

				NBTTagCompound toSend4Ingot = new NBTTagCompound();
				toSend4Ingot.setInteger("energy", 2400);
				toSend4Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend4Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.argoniteIngot).writeToNBT(toSend4Ingot.getCompoundTag("input"));
				new ItemStack(argoniteDust).writeToNBT(toSend4Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend4Ingot);

				NBTTagCompound toSend5ore = new NBTTagCompound();
				toSend5ore.setInteger("energy", 4000);
				toSend5ore.setCompoundTag("input", new NBTTagCompound());
				toSend5ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.ashstoneOre).writeToNBT(toSend5ore.getCompoundTag("input"));
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.ashstoneGem, 2).writeToNBT(toSend5ore.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend5ore);

				NBTTagCompound toSend6ore = new NBTTagCompound();
				toSend6ore.setInteger("energy", 4000);
				toSend6ore.setCompoundTag("input", new NBTTagCompound());
				toSend6ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.dragonstoneOre).writeToNBT(toSend6ore.getCompoundTag("input"));
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.dragonstoneGem, 2).writeToNBT(toSend6ore.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend6ore);
			}
		}

		if (Loader.isModLoaded("SimpleArsenic")) {
			arsenicDust = new SimpleIngot(arsenicDustID).modId("simpleoresdust").setUnlocalizedName("arsenicDust").setTextureName("SimpleDust:arsenicDust");
			arsenideBronzeDust = new SimpleIngot(arsenideBronzeDustID).modId("simpleoresdust").setUnlocalizedName("arsenideBronzeDust").setTextureName("SimpleDust:arsenideBronzeDust");
			arsenideGoldDust = new SimpleIngot(arsenideGoldDustID).modId("simpleoresdust").setUnlocalizedName("arsenideGoldDust").setTextureName("SimpleDust:arsenideGoldDust");
			tenebriumDust = new SimpleIngot(tenebriumDustID).modId("simpleoresdust").setUnlocalizedName("tenebriumDust").setTextureName("SimpleDust:tenebriumDust");

	        OreDictionary.registerOre("dustArsenic", new ItemStack(arsenicDust));
	        OreDictionary.registerOre("dustArsenideBronze", new ItemStack(arsenideBronzeDust));
	        OreDictionary.registerOre("dustArsenideGold", new ItemStack(arsenideGoldDust));
	        OreDictionary.registerOre("dustTenebrium", new ItemStack(tenebriumDust));

			LanguageRegistry.addName(arsenicDust, "Arsenic Dust");
			LanguageRegistry.addName(arsenideBronzeDust, "Arsenide Bronze Dust");
			LanguageRegistry.addName(arsenideGoldDust, "Arsenide Gold Dust");
			LanguageRegistry.addName(tenebriumDust, "Tenebrium Dust");

			GameRegistry.addSmelting(arsenicDust.itemID, new ItemStack(akkamaddi.arsenic.code.ArsenicAndLace.arsenicIngot), 4.0F);
	        GameRegistry.addSmelting(arsenideBronzeDust.itemID, new ItemStack(akkamaddi.arsenic.code.ArsenicAndLace.arsenideBronzeIngot), 5.0F);
	        GameRegistry.addSmelting(arsenideGoldDust.itemID, new ItemStack(akkamaddi.arsenic.code.ArsenicAndLace.arsenideGoldIngot), 6.0F);
	        GameRegistry.addSmelting(tenebriumDust.itemID, new ItemStack(akkamaddi.arsenic.code.ArsenicAndLace.tenebriumIngot), 6.0F);

	        if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.arsenic.code.ArsenicAndLace.arsenicIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(arsenicDust).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.arsenic.code.ArsenicAndLace.arsenideBronzeIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(arsenideBronzeDust).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);

				NBTTagCompound toSend3Ingot = new NBTTagCompound();
				toSend3Ingot.setInteger("energy", 2400);
				toSend3Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend3Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.arsenic.code.ArsenicAndLace.arsenideGoldIngot).writeToNBT(toSend3Ingot.getCompoundTag("input"));
				new ItemStack(arsenideGoldDust).writeToNBT(toSend3Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3Ingot);

				NBTTagCompound toSend4Ingot = new NBTTagCompound();
				toSend4Ingot.setInteger("energy", 2400);
				toSend4Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend4Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.arsenic.code.ArsenicAndLace.tenebriumIngot).writeToNBT(toSend4Ingot.getCompoundTag("input"));
				new ItemStack(tenebriumDust).writeToNBT(toSend4Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend4Ingot);

				if (Loader.isModLoaded("Tennantite")) {
				NBTTagCompound toSend1ore = new NBTTagCompound();
				toSend1ore.setInteger("energy", 4000);
				toSend1ore.setCompoundTag("input", new NBTTagCompound());
				toSend1ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				toSend1ore.setCompoundTag("secondaryOutput", new NBTTagCompound());
				new ItemStack(theoldone822.Tennantite.Tennantite.oreTennantite).writeToNBT(toSend1ore.getCompoundTag("input"));
				new ItemStack(arsenideBronzeDust, 2).writeToNBT(toSend1ore.getCompoundTag("primaryOutput"));
				new ItemStack(copperDust).writeToNBT(toSend1ore.getCompoundTag("secondaryOutput"));
				toSend1ore.setInteger("secondaryChance", 15);
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1ore);
				}
			}
		}

		if (Loader.isModLoaded("sterlingandblack")) {
			sterlingSteelDust = new SimpleIngot(sterlingSteelDustID).modId("simpleoresdust").setUnlocalizedName("sterlingSteelDust").setTextureName("SimpleDust:sterlingSteelDust");
			blackSilverDust = new SimpleIngot(blackSilverDustID).modId("simpleoresdust").setUnlocalizedName("blackSilverDust").setTextureName("SimpleDust:blackSilverDust");

	        OreDictionary.registerOre("dustSterlingSteel", new ItemStack(sterlingSteelDust));
	        OreDictionary.registerOre("dustBlackSilver", new ItemStack(blackSilverDust));

			LanguageRegistry.addName(sterlingSteelDust, "Sterling Steel Dust");
			LanguageRegistry.addName(blackSilverDust, "Black Silver Dust");
			
			GameRegistry.addSmelting(sterlingSteelDust.itemID, new ItemStack(akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.sterlingSteelIngot), 6.0F);
	        GameRegistry.addSmelting(blackSilverDust.itemID, new ItemStack(akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.blackSilverIngot), 9.0F);

	        if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.sterlingSteelIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(sterlingSteelDust).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.blackSilverIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(blackSilverDust).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);
			}
		}

		if (Loader.isModLoaded("haditecoal")) {
			haditeSteelDust = new SimpleIngot(haditeSteelDustID).modId("simpleoresdust").setUnlocalizedName("haditeSteelDust").setTextureName("SimpleDust:haditeSteelDust");
			gestankenzinnDust = new SimpleIngot(gestankenzinnDustID).modId("simpleoresdust").setUnlocalizedName("gestankenzinnDust").setTextureName("SimpleDust:gestankenzinnDust");

	        OreDictionary.registerOre("dustHaditeSteel", new ItemStack(haditeSteelDust));
	        OreDictionary.registerOre("dustGestankenzinn", new ItemStack(gestankenzinnDust));

			LanguageRegistry.addName(haditeSteelDust, "Hadite Steel Dust");
			LanguageRegistry.addName(gestankenzinnDust, "Gestankenzinn Dust");

			GameRegistry.addSmelting(haditeSteelDust.itemID, new ItemStack(akkamaddi.hadite.code.HaditeCoalCore.haditeSteelIngot), 6.0F);
	        GameRegistry.addSmelting(gestankenzinnDust.itemID, new ItemStack(akkamaddi.hadite.code.HaditeCoalCore.gestankenzinnIngot), 9.0F);

	        if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.hadite.code.HaditeCoalCore.haditeSteelIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(haditeSteelDust).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.hadite.code.HaditeCoalCore.gestankenzinnIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(gestankenzinnDust).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);
			}
		}

		if (Loader.isModLoaded("goldenglitter")) {
			roseGoldDust = new SimpleIngot(roseGoldDustID).modId("simpleoresdust").setUnlocalizedName("roseGoldDust").setTextureName("SimpleDust:roseGoldDust");
			erubescentGoldDust = new SimpleIngot(erubescentGoldDustID).modId("simpleoresdust").setUnlocalizedName("erubescentGoldDust").setTextureName("SimpleDust:erubescentGoldDust");
			scarlatiteGoldDust = new SimpleIngot(scarlatiteGoldDustID).modId("simpleoresdust").setUnlocalizedName("scarlatiteGoldDust").setTextureName("SimpleDust:scarlatiteGoldDust");
			hephaestanGoldDust = new SimpleIngot(hephaestanGoldDustID).modId("simpleoresdust").setUnlocalizedName("hephaestanGoldDust").setTextureName("SimpleDust:hephaestanGoldDust");

	        OreDictionary.registerOre("dustRoseGold", new ItemStack(roseGoldDust));
	        OreDictionary.registerOre("dustErubescentGold", new ItemStack(erubescentGoldDust));
	        OreDictionary.registerOre("dustScarlatiteGold", new ItemStack(scarlatiteGoldDust));
	        OreDictionary.registerOre("dustHephaestanGold", new ItemStack(hephaestanGoldDust));

			LanguageRegistry.addName(roseGoldDust, "Rose Gold Dust");
			LanguageRegistry.addName(erubescentGoldDust, "Erubescent Gold Dust");
			LanguageRegistry.addName(scarlatiteGoldDust, "Scarlatite Gold Dust");
			LanguageRegistry.addName(hephaestanGoldDust, "Hephaestan Gold Dust");

			GameRegistry.addSmelting(roseGoldDust.itemID, new ItemStack(akkamaddi.goldenglitter.code.GoldenGlitterCore.roseGoldIngot), 0.8F);
	        GameRegistry.addSmelting(erubescentGoldDust.itemID, new ItemStack(akkamaddi.goldenglitter.code.GoldenGlitterCore.erubescentGoldIngot), 3.0F);
	        GameRegistry.addSmelting(scarlatiteGoldDust.itemID, new ItemStack(akkamaddi.goldenglitter.code.GoldenGlitterCore.scarlatiteGoldIngot), 6.0F);
	        GameRegistry.addSmelting(hephaestanGoldDust.itemID, new ItemStack(akkamaddi.goldenglitter.code.GoldenGlitterCore.hephaestanGoldIngot), 9.0F);
			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.goldenglitter.code.GoldenGlitterCore.roseGoldIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(roseGoldDust).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.goldenglitter.code.GoldenGlitterCore.erubescentGoldIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(erubescentGoldDust).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);

				NBTTagCompound toSend3Ingot = new NBTTagCompound();
				toSend3Ingot.setInteger("energy", 2400);
				toSend3Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend3Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.goldenglitter.code.GoldenGlitterCore.scarlatiteGoldIngot).writeToNBT(toSend3Ingot.getCompoundTag("input"));
				new ItemStack(scarlatiteGoldDust).writeToNBT(toSend3Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3Ingot);

				NBTTagCompound toSend4Ingot = new NBTTagCompound();
				toSend4Ingot.setInteger("energy", 2400);
				toSend4Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend4Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.goldenglitter.code.GoldenGlitterCore.hephaestanGoldIngot).writeToNBT(toSend4Ingot.getCompoundTag("input"));
				new ItemStack(hephaestanGoldDust).writeToNBT(toSend4Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend4Ingot);
			}
		}

		if (Loader.isModLoaded("simplecobalt")) {
			cobaltDust = new SimpleIngot(cobaltDustID).modId("simpleoresdust").setUnlocalizedName("cobaltDust").setTextureName("SimpleDust:cobaltDust");
			blueDriftSteelDust = new SimpleIngot(blueDriftSteelDustID).modId("simpleoresdust").setUnlocalizedName("blueDriftSteelDust").setTextureName("SimpleDust:blueDriftSteelDust");
			blueCeladonDust = new SimpleIngot(blueCeladonDustID).modId("simpleoresdust").setUnlocalizedName("blueCeladonDust").setTextureName("SimpleDust:blueCeladonDust");
			greenCeladonDust = new SimpleIngot(greenCeladonDustID).modId("simpleoresdust").setUnlocalizedName("greenCeladonDust").setTextureName("SimpleDust:greenCeladonDust");

	        OreDictionary.registerOre("dustCobalt", new ItemStack(cobaltDust));
	        OreDictionary.registerOre("dustBlueDriftSteel", new ItemStack(blueDriftSteelDust));
	        OreDictionary.registerOre("dustBlueCeladon", new ItemStack(blueCeladonDust));
	        OreDictionary.registerOre("dustGreenCeladon", new ItemStack(greenCeladonDust));

			LanguageRegistry.addName(cobaltDust, "Cobalt Dust");
			LanguageRegistry.addName(blueDriftSteelDust, "Blue Drift Steel Dust");
			LanguageRegistry.addName(blueCeladonDust, "Blue Celadon Dust");
			LanguageRegistry.addName(greenCeladonDust, "Green Celadon Dust");

	        GameRegistry.addSmelting(cobaltDust.itemID, new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.cobaltIngot), 0.8F);
	        GameRegistry.addSmelting(blueDriftSteelDust.itemID, new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.blueDriftSteelIngot), 0.9F);
	        GameRegistry.addSmelting(blueCeladonDust.itemID, new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.blueCeladonIngot), 1.0F);
	        GameRegistry.addSmelting(greenCeladonDust.itemID, new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.greenCeladonIngot), 1.4F);

	        if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1ore = new NBTTagCompound();
				toSend1ore.setInteger("energy", 4000);
				toSend1ore.setCompoundTag("input", new NBTTagCompound());
				toSend1ore.setCompoundTag("primaryOutput", new NBTTagCompound());
//				toSend1ore.setCompoundTag("secondaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.oreCobalt).writeToNBT(toSend1ore.getCompoundTag("input"));
				new ItemStack(cobaltDust, 2).writeToNBT(toSend1ore.getCompoundTag("primaryOutput"));
//				new ItemStack(cobaltBlue).writeToNBT(toSend1ore.getCompoundTag("secondaryOutput"));
//				toSend1ore.setInteger("secondaryChance", 15);
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1ore);

				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.cobaltIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(cobaltDust).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.blueDriftSteelIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(blueDriftSteelDust).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);

				NBTTagCompound toSend3Ingot = new NBTTagCompound();
				toSend3Ingot.setInteger("energy", 2400);
				toSend3Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend3Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.blueCeladonIngot).writeToNBT(toSend3Ingot.getCompoundTag("input"));
				new ItemStack(blueCeladonDust).writeToNBT(toSend3Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3Ingot);

				NBTTagCompound toSend4Ingot = new NBTTagCompound();
				toSend4Ingot.setInteger("energy", 2400);
				toSend4Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend4Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.greenCeladonIngot).writeToNBT(toSend4Ingot.getCompoundTag("input"));
				new ItemStack(greenCeladonDust).writeToNBT(toSend4Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend4Ingot);
				
				if (Loader.isModLoaded("Glaucodot")) {
					NBTTagCompound toSend2ore = new NBTTagCompound();
					toSend2ore.setInteger("energy", 4000);
					toSend2ore.setCompoundTag("input", new NBTTagCompound());
					toSend2ore.setCompoundTag("primaryOutput", new NBTTagCompound());
					toSend2ore.setCompoundTag("secondaryOutput", new NBTTagCompound());
					new ItemStack(theoldone822.Glaucodot.Glaucodot.oreGlaucodot).writeToNBT(toSend2ore.getCompoundTag("input"));
					new ItemStack(blueDriftSteelDust, 2).writeToNBT(toSend2ore.getCompoundTag("primaryOutput"));
					new ItemStack(cobaltDust).writeToNBT(toSend2ore.getCompoundTag("secondaryOutput"));
					toSend2ore.setInteger("secondaryChance", 15);
					FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2ore);
				}
			}
		}

		if (Loader.isModLoaded("simpletungsten")) {
			tungstenDust = new SimpleIngot(tungstenDustID).modId("simpleoresdust").setUnlocalizedName("tungstenDust").setTextureName("SimpleDust:tungstenDust");
			tungstenCarbideDust = new SimpleIngot(tungstenCarbideDustID).modId("simpleoresdust").setUnlocalizedName("tungstenCarbideDust").setTextureName("SimpleDust:tungstenCarbideDust");
			valframDust = new SimpleIngot(valframDustID).modId("simpleoresdust").setUnlocalizedName("valframDust").setTextureName("SimpleDust:valframDust");
			tungstenSteelDust = new SimpleIngot(tungstenSteelDustID).modId("simpleoresdust").setUnlocalizedName("tungstenSteelDust").setTextureName("SimpleDust:tungstenSteelDust");
			prasinosDust = new SimpleIngot(prasinosDustID).modId("simpleoresdust").setUnlocalizedName("prasinosDust").setTextureName("SimpleDust:prasinosDust");

	    	OreDictionary.registerOre("dustTungsten", new ItemStack(tungstenDust));
	        OreDictionary.registerOre("dustTungstenCarbide", new ItemStack(tungstenCarbideDust));
	        OreDictionary.registerOre("dustValfram", new ItemStack(valframDust));
	        OreDictionary.registerOre("dustTungstenSteel", new ItemStack(tungstenSteelDust));
	        OreDictionary.registerOre("dustPrasinos", new ItemStack(prasinosDust));

			LanguageRegistry.addName(tungstenDust, "Tungsten Dust");
			LanguageRegistry.addName(tungstenCarbideDust, "Tungsten Carbide Dust");
			LanguageRegistry.addName(valframDust, "Valfram Dust");
			LanguageRegistry.addName(tungstenSteelDust, "Tungsten Steel Dust");
			LanguageRegistry.addName(prasinosDust, "Prasinos Dust");

	        GameRegistry.addSmelting(tungstenDust.itemID, new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenIngot), 0.8F);
	        GameRegistry.addSmelting(tungstenCarbideDust.itemID, new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenCarbideIngot), 1.0F);
	        GameRegistry.addSmelting(valframDust.itemID, new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.valframIngot), 1.4F);
	        GameRegistry.addSmelting(tungstenSteelDust.itemID, new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenSteelIngot), 1.2F);
	        GameRegistry.addSmelting(prasinosDust.itemID, new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.prasinosIngot), 1.6F);

	        if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1ore = new NBTTagCompound();
				toSend1ore.setInteger("energy", 4000);
				toSend1ore.setCompoundTag("input", new NBTTagCompound());
				toSend1ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.oreTungsten).writeToNBT(toSend1ore.getCompoundTag("input"));
				new ItemStack(tungstenDust, 2).writeToNBT(toSend1ore.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1ore);

				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(tungstenDust).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenCarbideIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(tungstenCarbideDust).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);

				NBTTagCompound toSend3Ingot = new NBTTagCompound();
				toSend3Ingot.setInteger("energy", 2400);
				toSend3Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend3Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.valframIngot).writeToNBT(toSend3Ingot.getCompoundTag("input"));
				new ItemStack(valframDust).writeToNBT(toSend3Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3Ingot);

				NBTTagCompound toSend4Ingot = new NBTTagCompound();
				toSend4Ingot.setInteger("energy", 2400);
				toSend4Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend4Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenSteelIngot).writeToNBT(toSend4Ingot.getCompoundTag("input"));
				new ItemStack(tungstenSteelDust).writeToNBT(toSend4Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend4Ingot);

				NBTTagCompound toSend5Ingot = new NBTTagCompound();
				toSend5Ingot.setInteger("energy", 2400);
				toSend5Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend5Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.prasinosIngot).writeToNBT(toSend5Ingot.getCompoundTag("input"));
				new ItemStack(prasinosDust).writeToNBT(toSend5Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend5Ingot);

				if (Loader.isModLoaded("TungstenOres")) {
					NBTTagCompound toSend2ore = new NBTTagCompound();
					toSend2ore.setInteger("energy", 4000);
					toSend2ore.setCompoundTag("input", new NBTTagCompound());
					toSend2ore.setCompoundTag("primaryOutput", new NBTTagCompound());
					toSend2ore.setCompoundTag("secondaryOutput", new NBTTagCompound());
					new ItemStack(theoldone822.TungstenOres.TungstenOres.oreWolframite).writeToNBT(toSend2ore.getCompoundTag("input"));
					new ItemStack(tungstenSteelDust, 2).writeToNBT(toSend2ore.getCompoundTag("primaryOutput"));
					new ItemStack(tungstenDust).writeToNBT(toSend2ore.getCompoundTag("secondaryOutput"));
					toSend2ore.setInteger("secondaryChance", 15);
					FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2ore);
				}
			}
		}

		if (Loader.isModLoaded("simplecthon")) {
			cthonDust = new SimpleIngot(cthonDustID).modId("simpleoresdust").setUnlocalizedName("cthonDust").setTextureName("SimpleDust:cthonDust");

			OreDictionary.registerOre("dustCthon", new ItemStack(cthonDust));

			LanguageRegistry.addName(cthonDust, "Cthon Dust");

			GameRegistry.addSmelting(cthonDust.itemID, new ItemStack(akkamaddi.cthon.core.SimpleCthonCore.cthonIngot), 1.0F);

	        if (Loader.isModLoaded("ThermalExpansion")) {
	        	NBTTagCompound toSend1Ingot = new NBTTagCompound();
	        	toSend1Ingot.setInteger("energy", 2400);
	        	toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
	        	toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
	        	new ItemStack(akkamaddi.cthon.core.SimpleCthonCore.cthonIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
	        	new ItemStack(cthonDust).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
	        	FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);
			}
		}

		if (Loader.isModLoaded("classicalalchemy")) {
			stannumDust = new SimpleIngot(stannumDustID).modId("simpleoresdust").setUnlocalizedName("stannumDust").setTextureName("SimpleDust:stannumDust");
			cuprumDust = new SimpleIngot(cuprumDustID).modId("simpleoresdust").setUnlocalizedName("cuprumDust").setTextureName("SimpleDust:cuprumDust");
			pyropusBronzeDust = new SimpleIngot(pyropusBronzeDustID).modId("simpleoresdust").setUnlocalizedName("pyropusBronzeDust").setTextureName("SimpleDust:pyropusBronzeDust");
			pulchrumBronzeDust = new SimpleIngot(pulchrumBronzeDustID).modId("simpleoresdust").setUnlocalizedName("pulchrumBronzeDust").setTextureName("SimpleDust:pulchrumBronzeDust");
			tombBronzeDust = new SimpleIngot(tombBronzeDustID).modId("simpleoresdust").setUnlocalizedName("tombBronzeDust").setTextureName("SimpleDust:tombBronzeDust");

	    	OreDictionary.registerOre("dustStannum", new ItemStack(stannumDust));
	    	OreDictionary.registerOre("dustCuprum", new ItemStack(cuprumDust));
	    	OreDictionary.registerOre("dustPyropusBronze", new ItemStack(pyropusBronzeDust));
	    	OreDictionary.registerOre("dustPulchrumBronze", new ItemStack(pulchrumBronzeDust));
	    	OreDictionary.registerOre("dustTombBronze", new ItemStack(tombBronzeDust));

			LanguageRegistry.addName(stannumDust, "Stannum Dust");
			LanguageRegistry.addName(cuprumDust, "Cuprum Dust");
			LanguageRegistry.addName(pyropusBronzeDust, "Pyropus Bronze Dust");
			LanguageRegistry.addName(pulchrumBronzeDust, "Pulchrum Bronze Dust");
			LanguageRegistry.addName(tombBronzeDust, "Tomb Bronze Dust");

	    	GameRegistry.addSmelting(stannumDust.itemID, new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.stannumIngot), 1.0F);
	        GameRegistry.addSmelting(cuprumDust.itemID, new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.cuprumIngot), 1.0F);
	        GameRegistry.addSmelting(pyropusBronzeDust.itemID, new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.pyropusBronzeIngot), 1.4F);
	        GameRegistry.addSmelting(pulchrumBronzeDust.itemID, new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.pulchrumBronzeIngot), 2.0F);
	        GameRegistry.addSmelting(tombBronzeDust.itemID, new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.tombBronzeIngot), 3.0F);

	        if (Loader.isModLoaded("ThermalExpansion")) {
	        	NBTTagCompound toSend1Ingot = new NBTTagCompound();
	        	toSend1Ingot.setInteger("energy", 2400);
	        	toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
	        	toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
	        	new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.stannumIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
	        	new ItemStack(stannumDust).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
	        	FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

	        	NBTTagCompound toSend2Ingot = new NBTTagCompound();
	        	toSend2Ingot.setInteger("energy", 2400);
	        	toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
	        	toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
	        	new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.cuprumIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
	        	new ItemStack(cuprumDust).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
	        	FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);

	        	NBTTagCompound toSend3Ingot = new NBTTagCompound();
	        	toSend3Ingot.setInteger("energy", 2400);
	        	toSend3Ingot.setCompoundTag("input", new NBTTagCompound());
	        	toSend3Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
	        	new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.pyropusBronzeIngot).writeToNBT(toSend3Ingot.getCompoundTag("input"));
	        	new ItemStack(pyropusBronzeDust).writeToNBT(toSend3Ingot.getCompoundTag("primaryOutput"));
	        	FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3Ingot);

	        	NBTTagCompound toSend4Ingot = new NBTTagCompound();
	        	toSend4Ingot.setInteger("energy", 2400);
	        	toSend4Ingot.setCompoundTag("input", new NBTTagCompound());
	        	toSend4Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
	        	new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.pulchrumBronzeIngot).writeToNBT(toSend4Ingot.getCompoundTag("input"));
	        	new ItemStack(pulchrumBronzeDust).writeToNBT(toSend4Ingot.getCompoundTag("primaryOutput"));
	        	FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend4Ingot);

	        	NBTTagCompound toSend5Ingot = new NBTTagCompound();
	        	toSend5Ingot.setInteger("energy", 2400);
	        	toSend5Ingot.setCompoundTag("input", new NBTTagCompound());
	        	toSend5Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
	        	new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.tombBronzeIngot).writeToNBT(toSend5Ingot.getCompoundTag("input"));
	        	new ItemStack(tombBronzeDust).writeToNBT(toSend5Ingot.getCompoundTag("primaryOutput"));
	        	FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend5Ingot);

				if (Loader.isModLoaded("classicalalchemyores")) {
					NBTTagCompound toSend1ore = new NBTTagCompound();
					toSend1ore.setInteger("energy", 4000);
					toSend1ore.setCompoundTag("input", new NBTTagCompound());
					toSend1ore.setCompoundTag("primaryOutput", new NBTTagCompound());
					toSend1ore.setCompoundTag("secondaryOutput", new NBTTagCompound());
					new ItemStack(theoldone822.classicalalchemyores.ClassicalAlchemyOresCore.cassiteriteOre).writeToNBT(toSend1ore.getCompoundTag("input"));
					new ItemStack(stannumDust, 2).writeToNBT(toSend1ore.getCompoundTag("primaryOutput"));
					new ItemStack(tinDust).writeToNBT(toSend1ore.getCompoundTag("secondaryOutput"));
					toSend1ore.setInteger("secondaryChance", 15);
					FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1ore);
					
					NBTTagCompound toSend2ore = new NBTTagCompound();
					toSend2ore.setInteger("energy", 4000);
					toSend2ore.setCompoundTag("input", new NBTTagCompound());
					toSend2ore.setCompoundTag("primaryOutput", new NBTTagCompound());
					toSend2ore.setCompoundTag("secondaryOutput", new NBTTagCompound());
					new ItemStack(theoldone822.classicalalchemyores.ClassicalAlchemyOresCore.borniteOre).writeToNBT(toSend2ore.getCompoundTag("input"));
					new ItemStack(cuprumDust, 2).writeToNBT(toSend2ore.getCompoundTag("primaryOutput"));
					new ItemStack(copperDust).writeToNBT(toSend2ore.getCompoundTag("secondaryOutput"));
					toSend2ore.setInteger("secondaryChance", 15);
					FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2ore);
					}
			}
		}

		if (Loader.isModLoaded("netherrocksfusion")) {
			cinderstoneDust = new SimpleIngot(cinderstoneDustID).modId("simpleoresdust").setUnlocalizedName("cinderstoneDust").setTextureName("SimpleDust:cinderstoneDust");
			thrakaDust = new SimpleIngot(thrakaDustID).modId("simpleoresdust").setUnlocalizedName("thrakaDust").setTextureName("SimpleDust:thrakaDust");
			pyralisDust = new SimpleIngot(pyralisDustID).modId("simpleoresdust").setUnlocalizedName("pyralisDust").setTextureName("SimpleDust:pyralisDust");
			dragonBezoarDust = new SimpleIngot(dragonBezoarDustID).modId("simpleoresdust").setUnlocalizedName("dragonBezoarDust").setTextureName("SimpleDust:dragonBezoarDust");
			
			OreDictionary.registerOre("dustCinderstone", new ItemStack(cinderstoneDust));
			OreDictionary.registerOre("dustThraka", new ItemStack(thrakaDust));
			OreDictionary.registerOre("dustPyralis", new ItemStack(pyralisDust));
			OreDictionary.registerOre("dustDragonBezoar", new ItemStack(dragonBezoarDust));

			LanguageRegistry.addName(cinderstoneDust, "Cinderstone Dust");
			LanguageRegistry.addName(thrakaDust, "Thraka Dust");
			LanguageRegistry.addName(pyralisDust, "Pyralis Dust");
			LanguageRegistry.addName(dragonBezoarDust, "Dragon Bezoar Dust");

			GameRegistry.addSmelting(cinderstoneDust.itemID, new ItemStack(theoldone822.NetherrocksFusion.Content.cinderstoneIngot, 1, 0), 0.3F);
			GameRegistry.addSmelting(thrakaDust.itemID, new ItemStack(theoldone822.NetherrocksFusion.Content.thrakaIngot, 1, 0), 0.6F);
			GameRegistry.addSmelting(pyralisDust.itemID, new ItemStack(theoldone822.NetherrocksFusion.Content.pyralisIngot, 1, 0), 0.6F);
			GameRegistry.addSmelting(dragonBezoarDust.itemID, new ItemStack(theoldone822.NetherrocksFusion.Content.dragonbezoarIngot, 1, 0), 1.0F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(theoldone822.NetherrocksFusion.Content.cinderstoneIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(cinderstoneDust).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(theoldone822.NetherrocksFusion.Content.thrakaIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(thrakaDust).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);

				NBTTagCompound toSend3Ingot = new NBTTagCompound();
				toSend3Ingot.setInteger("energy", 2400);
				toSend3Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend3Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(theoldone822.NetherrocksFusion.Content.pyralisIngot).writeToNBT(toSend3Ingot.getCompoundTag("input"));
				new ItemStack(pyralisDust).writeToNBT(toSend3Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3Ingot);

				NBTTagCompound toSend4Ingot = new NBTTagCompound();
				toSend4Ingot.setInteger("energy", 2400);
				toSend4Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend4Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(theoldone822.NetherrocksFusion.Content.dragonbezoarIngot).writeToNBT(toSend4Ingot.getCompoundTag("input"));
				new ItemStack(dragonBezoarDust).writeToNBT(toSend4Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend4Ingot);
			}
		}

		if (Loader.isModLoaded("wootzpigngray")) {
			wootzDust = new SimpleIngot(wootzDustID).modId("simpleoresdust").setUnlocalizedName("wootzDust").setTextureName("SimpleDust:wootzDust");

			OreDictionary.registerOre("dustWootz", new ItemStack(wootzDust));
			OreDictionary.registerOre("dustWootzsteel", new ItemStack(wootzDust));
			OreDictionary.registerOre("dustWootzSteel", new ItemStack(wootzDust));

			LanguageRegistry.addName(wootzDust, "Wootz Steel Dust");

			GameRegistry.addSmelting(wootzDust.itemID, new ItemStack(theoldone822.WootzPignGray.Content.wootzIngot, 1, 0), 0.8F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(theoldone822.WootzPignGray.Content.wootzIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(wootzDust).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(theoldone822.WootzPignGray.Content.grayIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(theoldone822.WootzPignGray.Content.graphite).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);
			}
		}

	}
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		if (Loader.isModLoaded("ThermalExpansion")) {
			NBTTagCompound toSendCopperore = new NBTTagCompound();
			toSendCopperore.setInteger("energy", 4000);
			toSendCopperore.setCompoundTag("input", new NBTTagCompound());
			toSendCopperore.setCompoundTag("primaryOutput", new NBTTagCompound());
			toSendCopperore.setCompoundTag("secondaryOutput", new NBTTagCompound());
			new ItemStack(CoreHelper.coreContent.copperOre).writeToNBT(toSendCopperore.getCompoundTag("input"));
			new ItemStack(copperDust, 2).writeToNBT(toSendCopperore.getCompoundTag("primaryOutput"));
			(OreDictionary.getOres("dustGold").get(0)).writeToNBT(toSendCopperore.getCompoundTag("secondaryOutput"));
			toSendCopperore.setInteger("secondaryChance", 10);
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendCopperore);
		
			NBTTagCompound toSendTinore = new NBTTagCompound();
			toSendTinore.setInteger("energy", 4000);
			toSendTinore.setCompoundTag("input", new NBTTagCompound());
			toSendTinore.setCompoundTag("primaryOutput", new NBTTagCompound());
			toSendTinore.setCompoundTag("secondaryOutput", new NBTTagCompound());
			new ItemStack(CoreHelper.coreContent.tinOre).writeToNBT(toSendTinore.getCompoundTag("input"));
			new ItemStack(tinDust, 2).writeToNBT(toSendTinore.getCompoundTag("primaryOutput"));
			(OreDictionary.getOres("dustIron").get(0)).writeToNBT(toSendTinore.getCompoundTag("secondaryOutput"));
			toSendTinore.setInteger("secondaryChance", 10);
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendTinore);
			}
		}
}