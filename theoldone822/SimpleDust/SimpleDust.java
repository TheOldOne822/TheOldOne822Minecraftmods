package theoldone822.SimpleDust;

import java.io.File;

import alexndr.SimpleOres.api.helpers.FreeIdHelper;
import alexndr.SimpleOres.api.helpers.CoreHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
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
		version = "2.3",
		dependencies = "required-after:simpleores; after:onlysilver; after:ThermalExpansion; after:simpleoresfusion; after:SimpleArsenic; after:netherrocksfusion; after:netherrocks; after:classicalalchemy; after:simplecthon; after:goldenglitter; after:haditecoal; after:simplecobalt; after:simpletungsten; after:sterlingandblack; after:wootzpigngray; after:classicalalchemyores; after:TungstenOres; after:Tennantite; after:Glaucodot; after:steelyglint")
public class SimpleDust {

	public static int ID;

	public static Item dust;

	@Instance("SimpleDust")
	public static SimpleDust instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		File installDir = event.getModConfigurationDirectory();
		File configDir = new File(installDir, "SimpleOres/Plugins");
		Configuration config = new Configuration(new File(configDir, "SimpleDust.cfg"));

		config.load();

		FreeIdHelper.compileIdList();

		ID = config.getItem("Items", "ID", FreeIdHelper.freeItem()).getInt();

		config.save();

		dust = new ItemDust(ID).setUnlocalizedName("dust");

		OreDictionary.registerOre("dustIron", new ItemStack(dust, 1, 0));
		OreDictionary.registerOre("dustGold", new ItemStack(dust, 1, 1));
		OreDictionary.registerOre("dustDiamond", new ItemStack(dust, 1, 2));
		OreDictionary.registerOre("dustEmerald", new ItemStack(dust, 1, 3));
		OreDictionary.registerOre("dustCopper", new ItemStack(dust, 1, 4));
		OreDictionary.registerOre("dustTin", new ItemStack(dust, 1, 5));
		OreDictionary.registerOre("dustMythril", new ItemStack(dust, 1, 6));
		OreDictionary.registerOre("dustMithril", new ItemStack(dust, 1, 6));
		OreDictionary.registerOre("dustAdamantium", new ItemStack(dust, 1, 7));
		OreDictionary.registerOre("dustAdamantite", new ItemStack(dust, 1, 7));
		OreDictionary.registerOre("dustAdamantine", new ItemStack(dust, 1, 7));
		OreDictionary.registerOre("dustOnyx", new ItemStack(dust, 1, 8));
		OreDictionary.registerOre("dustBronze", new ItemStack(dust, 1, 9));
		OreDictionary.registerOre("dustThyrium", new ItemStack(dust, 1, 10));
		OreDictionary.registerOre("dustSinisite", new ItemStack(dust, 1, 11));
		OreDictionary.registerOre("dustFyrite", new ItemStack(dust, 1, 12));
		OreDictionary.registerOre("dustMalachite", new ItemStack(dust, 1, 13));
		OreDictionary.registerOre("dustIllumenite", new ItemStack(dust, 1, 14));
		OreDictionary.registerOre("dustArgonite", new ItemStack(dust, 1, 15));
		OreDictionary.registerOre("dustAshstone", new ItemStack(dust, 1, 16));
		OreDictionary.registerOre("dustDragonstone", new ItemStack(dust, 1, 17));
		OreDictionary.registerOre("dustArsenic", new ItemStack(dust, 1, 18));
		OreDictionary.registerOre("dustArsenideBronze", new ItemStack(dust, 1, 19));
		OreDictionary.registerOre("dustArsenideGold", new ItemStack(dust, 1, 20));
		OreDictionary.registerOre("dustTenebrium", new ItemStack(dust, 1, 21));
		OreDictionary.registerOre("dustSterlingSteel", new ItemStack(dust, 1, 22));
		OreDictionary.registerOre("dustBlackSilver", new ItemStack(dust, 1, 23));
		OreDictionary.registerOre("dustHaditeSteel", new ItemStack(dust, 1, 24));
		OreDictionary.registerOre("dustGestankenzinn", new ItemStack(dust, 1, 25));
		OreDictionary.registerOre("dustRoseGold", new ItemStack(dust, 1, 26));
		OreDictionary.registerOre("dustErubescentGold", new ItemStack(dust, 1, 27));
		OreDictionary.registerOre("dustScarlatiteGold", new ItemStack(dust, 1, 28));
		OreDictionary.registerOre("dustHephaestanGold", new ItemStack(dust, 1, 29));
		OreDictionary.registerOre("dustCobalt", new ItemStack(dust, 1, 30));
		OreDictionary.registerOre("dustBlueDriftSteel", new ItemStack(dust, 1, 31));
		OreDictionary.registerOre("dustBlueCeladon", new ItemStack(dust, 1, 32));
		OreDictionary.registerOre("dustGreenCeladon", new ItemStack(dust, 1, 33));
		OreDictionary.registerOre("dustTungsten", new ItemStack(dust, 1, 34));
		OreDictionary.registerOre("dustTungstenCarbide", new ItemStack(dust, 1, 35));
		OreDictionary.registerOre("dustValfram", new ItemStack(dust, 1, 36));
		OreDictionary.registerOre("dustTungstenSteel", new ItemStack(dust, 1, 37));
		OreDictionary.registerOre("dustPrasinos", new ItemStack(dust, 1, 38));
		OreDictionary.registerOre("dustCthon", new ItemStack(dust, 1, 39));
		OreDictionary.registerOre("dustStannum", new ItemStack(dust, 1, 40));
		OreDictionary.registerOre("dustCuprum", new ItemStack(dust, 1, 41));
		OreDictionary.registerOre("dustPyropusBronze", new ItemStack(dust, 1, 42));
		OreDictionary.registerOre("dustPulchrumBronze", new ItemStack(dust, 1, 43));
		OreDictionary.registerOre("dustTombBronze", new ItemStack(dust, 1, 44));
		OreDictionary.registerOre("dustCinderstone", new ItemStack(dust, 1, 45));
		OreDictionary.registerOre("dustThraka", new ItemStack(dust, 1, 46));
		OreDictionary.registerOre("dustPyralis", new ItemStack(dust, 1, 47));
		OreDictionary.registerOre("dustDragonBezoar", new ItemStack(dust, 1, 48));
		OreDictionary.registerOre("dustWootz", new ItemStack(dust, 1, 49));
		OreDictionary.registerOre("dustWootzsteel", new ItemStack(dust, 1, 49));
		OreDictionary.registerOre("dustWootzSteel", new ItemStack(dust, 1, 49));
		OreDictionary.registerOre("dustSilver", new ItemStack(dust, 1, 50));
		OreDictionary.registerOre("dustEndium", new ItemStack(dust, 1, 51));
		OreDictionary.registerOre("dustTelos", new ItemStack(dust, 1, 52));
		OreDictionary.registerOre("dustSunteleia", new ItemStack(dust, 1, 53));
		OreDictionary.registerOre("dustRefinedIron", new ItemStack(dust, 1, 54));
		OreDictionary.registerOre("dustCarbonizedIron", new ItemStack(dust, 1, 55));
		OreDictionary.registerOre("dustHighSteel", new ItemStack(dust, 1, 56));
		OreDictionary.registerOre("dustLowSteel", new ItemStack(dust, 1, 57));

		LanguageRegistry.addName(new ItemStack(dust, 1, 0), "Iron Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 1), "Gold Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 2), "Diamond Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 3), "Emerald Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 4), "Copper Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 5), "Tin Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 6), "Mythril Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 7), "Adamantium Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 8), "Onyx Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 9), "Bronze Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 10), "Thyrium Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 11), "Sinisite Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 12), "Fyrite Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 13), "Malachite Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 14), "Illumenite Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 15), "Argonite Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 16), "Ashstone Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 17), "Dragonstone Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 18), "Arsenic Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 19), "Arsenide Bronze Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 20), "Arsenide Gold Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 21), "Tenebrium Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 22), "Sterling Steel Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 23), "Black Silver Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 24), "Hadite Steel Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 25), "Gestankenzinn Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 26), "Rose Gold Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 27), "Erubescent Gold Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 28), "Scarlatite Gold Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 29), "Hephaestan Gold Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 30), "Cobalt Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 31), "Blue Drift Steel Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 32), "Blue Celadon Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 33), "Green Celadon Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 34), "Tungsten Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 35), "Tungsten Carbide Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 36), "Valfram Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 37), "Tungsten Steel Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 38), "Prasinos Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 39), "Cthon Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 40), "Stannum Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 41), "Cuprum Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 42), "Pyropus Bronze Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 43), "Pulchrum Bronze Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 44), "Tomb Bronze Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 45), "Cinderstone Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 46), "Thraka Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 47), "Pyralis Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 48), "Dragon Bezoar Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 49), "Wootz Steel Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 50), "Silver Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 51), "Endium Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 52), "Telos Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 53), "Sunteleia Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 54), "Refined Iron Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 55), "Carbonized Iron Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 56), "High Steel Dust");
		LanguageRegistry.addName(new ItemStack(dust, 1, 57), "Low Steel Dust");

		FurnaceRecipes.smelting().addSmelting(dust.itemID, 0, new ItemStack(Item.ingotIron, 1, 0), 0.7F);
		FurnaceRecipes.smelting().addSmelting(dust.itemID, 1, new ItemStack(Item.ingotGold, 1, 0), 0.7F);
		FurnaceRecipes.smelting().addSmelting(dust.itemID, 2, new ItemStack(Item.diamond, 1, 0), 0.7F);
		FurnaceRecipes.smelting().addSmelting(dust.itemID, 3, new ItemStack(Item.emerald, 1, 0), 0.7F);

		if (Loader.isModLoaded("ThermalExpansion")) {
			NBTTagCompound toSendGoldore = new NBTTagCompound();
			toSendGoldore.setInteger("energy", 4000);
			toSendGoldore.setCompoundTag("input", new NBTTagCompound());
			toSendGoldore.setCompoundTag("primaryOutput", new NBTTagCompound());
			new ItemStack(Block.oreGold).writeToNBT(toSendGoldore.getCompoundTag("input"));
			new ItemStack(dust, 2, 1).writeToNBT(toSendGoldore.getCompoundTag("primaryOutput"));
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendGoldore);

			NBTTagCompound toSendironIngot = new NBTTagCompound();
			toSendironIngot.setInteger("energy", 2400);
			toSendironIngot.setCompoundTag("input", new NBTTagCompound());
			toSendironIngot.setCompoundTag("primaryOutput", new NBTTagCompound());
			new ItemStack(Item.ingotIron).writeToNBT(toSendironIngot.getCompoundTag("input"));
			new ItemStack(dust, 1, 0).writeToNBT(toSendironIngot.getCompoundTag("primaryOutput"));
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendironIngot);

			NBTTagCompound toSendgoldIngot = new NBTTagCompound();
			toSendgoldIngot.setInteger("energy", 2400);
			toSendgoldIngot.setCompoundTag("input", new NBTTagCompound());
			toSendgoldIngot.setCompoundTag("primaryOutput", new NBTTagCompound());
			new ItemStack(Item.ingotGold).writeToNBT(toSendgoldIngot.getCompoundTag("input"));
			new ItemStack(dust, 1, 1).writeToNBT(toSendgoldIngot.getCompoundTag("primaryOutput"));
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendgoldIngot);

			NBTTagCompound toSenddiamondIngot = new NBTTagCompound();
			toSenddiamondIngot.setInteger("energy", 2400);
			toSenddiamondIngot.setCompoundTag("input", new NBTTagCompound());
			toSenddiamondIngot.setCompoundTag("primaryOutput", new NBTTagCompound());
			new ItemStack(Item.diamond).writeToNBT(toSenddiamondIngot.getCompoundTag("input"));
			new ItemStack(dust, 1, 2).writeToNBT(toSenddiamondIngot.getCompoundTag("primaryOutput"));
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSenddiamondIngot);

			NBTTagCompound toSendemeraldIngot = new NBTTagCompound();
			toSendemeraldIngot.setInteger("energy", 2400);
			toSendemeraldIngot.setCompoundTag("input", new NBTTagCompound());
			toSendemeraldIngot.setCompoundTag("primaryOutput", new NBTTagCompound());
			new ItemStack(Item.emerald).writeToNBT(toSendemeraldIngot.getCompoundTag("input"));
			new ItemStack(dust, 1, 3).writeToNBT(toSendemeraldIngot.getCompoundTag("primaryOutput"));
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendemeraldIngot);
		}

		if (Loader.isModLoaded("simpleores")) {
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 4, new ItemStack(CoreHelper.coreContent.copperIngot, 1, 0), 0.7F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 5, new ItemStack(CoreHelper.coreContent.tinIngot, 1, 0), 0.7F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 6, new ItemStack(CoreHelper.coreContent.mythrilIngot, 1, 0), 0.9F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 7, new ItemStack(CoreHelper.coreContent.adamantiumIngot, 1, 0), 1.0F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 8, new ItemStack(CoreHelper.coreContent.onyxGem, 1, 0), 1.0F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSendCopperore = new NBTTagCompound();
				toSendCopperore.setInteger("energy", 4000);
				toSendCopperore.setCompoundTag("input", new NBTTagCompound());
				toSendCopperore.setCompoundTag("primaryOutput", new NBTTagCompound());
				toSendCopperore.setCompoundTag("secondaryOutput", new NBTTagCompound());
				new ItemStack(CoreHelper.coreContent.copperOre).writeToNBT(toSendCopperore.getCompoundTag("input"));
				new ItemStack(dust, 2, 4).writeToNBT(toSendCopperore.getCompoundTag("primaryOutput"));
				new ItemStack(dust, 1, 1).writeToNBT(toSendCopperore.getCompoundTag("secondaryOutput"));
				toSendCopperore.setInteger("secondaryChance", 10);
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendCopperore);

				NBTTagCompound toSendTinore = new NBTTagCompound();
				toSendTinore.setInteger("energy", 4000);
				toSendTinore.setCompoundTag("input", new NBTTagCompound());
				toSendTinore.setCompoundTag("primaryOutput", new NBTTagCompound());
				toSendTinore.setCompoundTag("secondaryOutput", new NBTTagCompound());
				new ItemStack(CoreHelper.coreContent.tinOre).writeToNBT(toSendTinore.getCompoundTag("input"));
				new ItemStack(dust, 2, 5).writeToNBT(toSendTinore.getCompoundTag("primaryOutput"));
				new ItemStack(dust, 1, 0).writeToNBT(toSendTinore.getCompoundTag("secondaryOutput"));
				toSendTinore.setInteger("secondaryChance", 10);
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendTinore);

				NBTTagCompound toSendcopperIngot = new NBTTagCompound();
				toSendcopperIngot.setInteger("energy", 2400);
				toSendcopperIngot.setCompoundTag("input", new NBTTagCompound());
				toSendcopperIngot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(CoreHelper.coreContent.copperIngot).writeToNBT(toSendcopperIngot.getCompoundTag("input"));
				new ItemStack(dust, 1, 4).writeToNBT(toSendcopperIngot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendcopperIngot);

				NBTTagCompound toSendTinIngot = new NBTTagCompound();
				toSendTinIngot.setInteger("energy", 2400);
				toSendTinIngot.setCompoundTag("input", new NBTTagCompound());
				toSendTinIngot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(CoreHelper.coreContent.tinIngot).writeToNBT(toSendTinIngot.getCompoundTag("input"));
				new ItemStack(dust, 1, 5).writeToNBT(toSendTinIngot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendTinIngot);

				NBTTagCompound toSend1ore = new NBTTagCompound();
				toSend1ore.setInteger("energy", 4000);
				toSend1ore.setCompoundTag("input", new NBTTagCompound());
				toSend1ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(CoreHelper.coreContent.mythrilOre).writeToNBT(toSend1ore.getCompoundTag("input"));
				new ItemStack(dust, 2, 6).writeToNBT(toSend1ore.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1ore);

				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(CoreHelper.coreContent.mythrilIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 6).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2ore = new NBTTagCompound();
				toSend2ore.setInteger("energy", 4000);
				toSend2ore.setCompoundTag("input", new NBTTagCompound());
				toSend2ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(CoreHelper.coreContent.adamantiumOre).writeToNBT(toSend2ore.getCompoundTag("input"));
				new ItemStack(dust, 2, 7).writeToNBT(toSend2ore.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2ore);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(CoreHelper.coreContent.adamantiumIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 7).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);

				NBTTagCompound toSend3ore = new NBTTagCompound();
				toSend3ore.setInteger("energy", 4000);
				toSend3ore.setCompoundTag("input", new NBTTagCompound());
				toSend3ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(CoreHelper.coreContent.onyxOre).writeToNBT(toSend3ore.getCompoundTag("input"));
				new ItemStack(CoreHelper.coreContent.onyxGem, 2).writeToNBT(toSend3ore.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3ore);

				NBTTagCompound toSend3Ingot = new NBTTagCompound();
				toSend3Ingot.setInteger("energy", 2400);
				toSend3Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend3Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(CoreHelper.coreContent.onyxGem).writeToNBT(toSend3Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 8).writeToNBT(toSend3Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3Ingot);
			}
		}
		if (Loader.isModLoaded("simpleoresfusion")) {
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 9,
					new ItemStack(alexndr.SimpleOres.plugins.fusion.FusionHelper.fusionContent.bronzeIngot, 1, 0), 0.3F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 10,
					new ItemStack(alexndr.SimpleOres.plugins.fusion.FusionHelper.fusionContent.thyriumIngot, 1, 0), 0.6F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 11,
					new ItemStack(alexndr.SimpleOres.plugins.fusion.FusionHelper.fusionContent.sinisiteIngot, 1, 0), 1.0F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend0Ingot = new NBTTagCompound();
				toSend0Ingot.setInteger("energy", 2400);
				toSend0Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend0Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.fusion.FusionHelper.fusionContent.bronzeIngot).writeToNBT(toSend0Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 9).writeToNBT(toSend0Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend0Ingot);

				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.fusion.FusionHelper.fusionContent.thyriumIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 10).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.fusion.FusionHelper.fusionContent.sinisiteIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 11).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);
			}
		}

		if (Loader.isModLoaded("netherrocks")) {

			FurnaceRecipes.smelting().addSmelting(dust.itemID, 12, new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.fyriteIngot, 1, 0), 0.8F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 13, new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.malachiteIngot, 1, 0), 0.5F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 14, new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.illumeniteIngot, 1, 0), 0.8F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 15, new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.argoniteIngot, 1, 0), 0.7F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 16, new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.ashstoneGem, 1, 0), 0.7F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 17, new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.dragonstoneGem, 1, 0), 0.7F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1ore = new NBTTagCompound();
				toSend1ore.setInteger("energy", 4000);
				toSend1ore.setCompoundTag("input", new NBTTagCompound());
				toSend1ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.fyriteOre).writeToNBT(toSend1ore.getCompoundTag("input"));
				new ItemStack(dust, 2, 12).writeToNBT(toSend1ore.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1ore);

				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.fyriteIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 12).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2ore = new NBTTagCompound();
				toSend2ore.setInteger("energy", 4000);
				toSend2ore.setCompoundTag("input", new NBTTagCompound());
				toSend2ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				toSend2ore.setCompoundTag("secondaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.malachiteOre).writeToNBT(toSend2ore.getCompoundTag("input"));
				new ItemStack(dust, 2, 13).writeToNBT(toSend2ore.getCompoundTag("primaryOutput"));
				new ItemStack(dust, 1, 4).writeToNBT(toSend2ore.getCompoundTag("secondaryOutput"));
				toSend2ore.setInteger("secondaryChance", 10);
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2ore);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.malachiteIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 13).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);

				NBTTagCompound toSend3ore = new NBTTagCompound();
				toSend3ore.setInteger("energy", 4000);
				toSend3ore.setCompoundTag("input", new NBTTagCompound());
				toSend3ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				toSend3ore.setCompoundTag("secondaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.illumeniteOre).writeToNBT(toSend3ore.getCompoundTag("input"));
				new ItemStack(dust, 2, 14).writeToNBT(toSend3ore.getCompoundTag("primaryOutput"));
				new ItemStack(Item.glowstone).writeToNBT(toSend3ore.getCompoundTag("secondaryOutput"));
				toSend3ore.setInteger("secondaryChance", 15);
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3ore);

				NBTTagCompound toSend3Ingot = new NBTTagCompound();
				toSend3Ingot.setInteger("energy", 2400);
				toSend3Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend3Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.illumeniteIngot).writeToNBT(toSend3Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 14).writeToNBT(toSend3Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3Ingot);

				NBTTagCompound toSend4ore = new NBTTagCompound();
				toSend4ore.setInteger("energy", 4000);
				toSend4ore.setCompoundTag("input", new NBTTagCompound());
				toSend4ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				toSend4ore.setCompoundTag("secondaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.argoniteOre).writeToNBT(toSend4ore.getCompoundTag("input"));
				new ItemStack(dust, 2, 15).writeToNBT(toSend4ore.getCompoundTag("primaryOutput"));
				new ItemStack(Item.dyePowder, 1, 15).writeToNBT(toSend4ore.getCompoundTag("secondaryOutput"));
				toSend4ore.setInteger("secondaryChance", 15);
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend4ore);

				NBTTagCompound toSend4Ingot = new NBTTagCompound();
				toSend4Ingot.setInteger("energy", 2400);
				toSend4Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend4Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.argoniteIngot).writeToNBT(toSend4Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 15).writeToNBT(toSend4Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend4Ingot);

				NBTTagCompound toSend5ore = new NBTTagCompound();
				toSend5ore.setInteger("energy", 4000);
				toSend5ore.setCompoundTag("input", new NBTTagCompound());
				toSend5ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.ashstoneOre).writeToNBT(toSend5ore.getCompoundTag("input"));
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.ashstoneGem, 2).writeToNBT(toSend5ore.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend5ore);

				NBTTagCompound toSend5Ingot = new NBTTagCompound();
				toSend5Ingot.setInteger("energy", 2400);
				toSend5Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend5Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.ashstoneGem).writeToNBT(toSend5Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 16).writeToNBT(toSend5Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend5Ingot);

				NBTTagCompound toSend6ore = new NBTTagCompound();
				toSend6ore.setInteger("energy", 4000);
				toSend6ore.setCompoundTag("input", new NBTTagCompound());
				toSend6ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.dragonstoneOre).writeToNBT(toSend6ore.getCompoundTag("input"));
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.dragonstoneGem, 2).writeToNBT(toSend6ore.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend6ore);

				NBTTagCompound toSend6Ingot = new NBTTagCompound();
				toSend6Ingot.setInteger("energy", 2400);
				toSend6Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend6Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(alexndr.SimpleOres.plugins.netherrocks.Content.dragonstoneGem).writeToNBT(toSend6Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 17).writeToNBT(toSend6Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend6Ingot);
			}
		}

		if (Loader.isModLoaded("SimpleArsenic")) {

			FurnaceRecipes.smelting().addSmelting(dust.itemID, 18, new ItemStack(akkamaddi.arsenic.code.ArsenicAndLace.arsenicIngot), 4.0F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 19, new ItemStack(akkamaddi.arsenic.code.ArsenicAndLace.arsenideBronzeIngot), 5.0F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 20, new ItemStack(akkamaddi.arsenic.code.ArsenicAndLace.arsenideGoldIngot), 6.0F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 21, new ItemStack(akkamaddi.arsenic.code.ArsenicAndLace.tenebriumIngot), 6.0F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.arsenic.code.ArsenicAndLace.arsenicIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 18).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.arsenic.code.ArsenicAndLace.arsenideBronzeIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 19).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);

				NBTTagCompound toSend3Ingot = new NBTTagCompound();
				toSend3Ingot.setInteger("energy", 2400);
				toSend3Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend3Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.arsenic.code.ArsenicAndLace.arsenideGoldIngot).writeToNBT(toSend3Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 20).writeToNBT(toSend3Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3Ingot);

				NBTTagCompound toSend4Ingot = new NBTTagCompound();
				toSend4Ingot.setInteger("energy", 2400);
				toSend4Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend4Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.arsenic.code.ArsenicAndLace.tenebriumIngot).writeToNBT(toSend4Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 21).writeToNBT(toSend4Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend4Ingot);

				if (Loader.isModLoaded("Tennantite")) {
					NBTTagCompound toSend1ore = new NBTTagCompound();
					toSend1ore.setInteger("energy", 4000);
					toSend1ore.setCompoundTag("input", new NBTTagCompound());
					toSend1ore.setCompoundTag("primaryOutput", new NBTTagCompound());
					toSend1ore.setCompoundTag("secondaryOutput", new NBTTagCompound());
					new ItemStack(theoldone822.Tennantite.Tennantite.oreTennantite).writeToNBT(toSend1ore.getCompoundTag("input"));
					new ItemStack(dust, 2, 19).writeToNBT(toSend1ore.getCompoundTag("primaryOutput"));
					new ItemStack(dust, 1, 4).writeToNBT(toSend1ore.getCompoundTag("secondaryOutput"));
					toSend1ore.setInteger("secondaryChance", 15);
					FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1ore);
				}
			}
		}

		if (Loader.isModLoaded("sterlingandblack")) {

			FurnaceRecipes.smelting()
					.addSmelting(dust.itemID, 22, new ItemStack(akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.sterlingSteelIngot), 6.0F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 23, new ItemStack(akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.blackSilverIngot), 9.0F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.sterlingSteelIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 22).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.blackSilverIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 23).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);
			}
		}

		if (Loader.isModLoaded("haditecoal")) {

			FurnaceRecipes.smelting().addSmelting(dust.itemID, 24, new ItemStack(akkamaddi.hadite.code.HaditeCoalCore.haditeSteelIngot), 6.0F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 25, new ItemStack(akkamaddi.hadite.code.HaditeCoalCore.gestankenzinnIngot), 9.0F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.hadite.code.HaditeCoalCore.haditeSteelIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 24).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.hadite.code.HaditeCoalCore.gestankenzinnIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 25).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);
			}
		}

		if (Loader.isModLoaded("goldenglitter")) {

			FurnaceRecipes.smelting().addSmelting(dust.itemID, 26, new ItemStack(akkamaddi.goldenglitter.code.GoldenGlitterCore.roseGoldIngot), 0.8F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 27, new ItemStack(akkamaddi.goldenglitter.code.GoldenGlitterCore.erubescentGoldIngot), 3.0F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 28, new ItemStack(akkamaddi.goldenglitter.code.GoldenGlitterCore.scarlatiteGoldIngot), 6.0F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 29, new ItemStack(akkamaddi.goldenglitter.code.GoldenGlitterCore.hephaestanGoldIngot), 9.0F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.goldenglitter.code.GoldenGlitterCore.roseGoldIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 26).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.goldenglitter.code.GoldenGlitterCore.erubescentGoldIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 27).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);

				NBTTagCompound toSend3Ingot = new NBTTagCompound();
				toSend3Ingot.setInteger("energy", 2400);
				toSend3Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend3Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.goldenglitter.code.GoldenGlitterCore.scarlatiteGoldIngot).writeToNBT(toSend3Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 28).writeToNBT(toSend3Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3Ingot);

				NBTTagCompound toSend4Ingot = new NBTTagCompound();
				toSend4Ingot.setInteger("energy", 2400);
				toSend4Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend4Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.goldenglitter.code.GoldenGlitterCore.hephaestanGoldIngot).writeToNBT(toSend4Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 29).writeToNBT(toSend4Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend4Ingot);
			}
		}

		if (Loader.isModLoaded("simplecobalt")) {

			FurnaceRecipes.smelting().addSmelting(dust.itemID, 30, new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.cobaltIngot), 0.8F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 31, new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.blueDriftSteelIngot), 0.9F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 32, new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.blueCeladonIngot), 1.0F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 33, new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.greenCeladonIngot), 1.4F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1ore = new NBTTagCompound();
				toSend1ore.setInteger("energy", 4000);
				toSend1ore.setCompoundTag("input", new NBTTagCompound());
				toSend1ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				toSend1ore.setCompoundTag("secondaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.oreCobalt).writeToNBT(toSend1ore.getCompoundTag("input"));
				new ItemStack(dust, 2, 30).writeToNBT(toSend1ore.getCompoundTag("primaryOutput"));
				new ItemStack(dust, 1, 18).writeToNBT(toSend1ore.getCompoundTag("secondaryOutput"));
				toSend1ore.setInteger("secondaryChance", 10);
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1ore);

				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.cobaltIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 30).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.blueDriftSteelIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 31).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);

				NBTTagCompound toSend3Ingot = new NBTTagCompound();
				toSend3Ingot.setInteger("energy", 2400);
				toSend3Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend3Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.blueCeladonIngot).writeToNBT(toSend3Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 32).writeToNBT(toSend3Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3Ingot);

				NBTTagCompound toSend4Ingot = new NBTTagCompound();
				toSend4Ingot.setInteger("energy", 2400);
				toSend4Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend4Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simplecobalt.code.SimpleCobaltCore.greenCeladonIngot).writeToNBT(toSend4Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 33).writeToNBT(toSend4Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend4Ingot);

				if (Loader.isModLoaded("Glaucodot")) {
					NBTTagCompound toSend2ore = new NBTTagCompound();
					toSend2ore.setInteger("energy", 4000);
					toSend2ore.setCompoundTag("input", new NBTTagCompound());
					toSend2ore.setCompoundTag("primaryOutput", new NBTTagCompound());
					toSend2ore.setCompoundTag("secondaryOutput", new NBTTagCompound());
					new ItemStack(theoldone822.Glaucodot.Glaucodot.oreGlaucodot).writeToNBT(toSend2ore.getCompoundTag("input"));
					new ItemStack(dust, 2, 31).writeToNBT(toSend2ore.getCompoundTag("primaryOutput"));
					new ItemStack(dust, 1, 30).writeToNBT(toSend2ore.getCompoundTag("secondaryOutput"));
					toSend2ore.setInteger("secondaryChance", 15);
					FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2ore);
				}
			}
		}

		if (Loader.isModLoaded("simpletungsten")) {

			FurnaceRecipes.smelting().addSmelting(dust.itemID, 34, new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenIngot), 0.8F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 35, new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenCarbideIngot), 1.0F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 36, new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.valframIngot), 1.4F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 37, new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenSteelIngot), 1.2F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 38, new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.prasinosIngot), 1.6F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1ore = new NBTTagCompound();
				toSend1ore.setInteger("energy", 4000);
				toSend1ore.setCompoundTag("input", new NBTTagCompound());
				toSend1ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				toSend1ore.setCompoundTag("secondaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.oreTungsten).writeToNBT(toSend1ore.getCompoundTag("input"));
				new ItemStack(dust, 2, 34).writeToNBT(toSend1ore.getCompoundTag("primaryOutput"));
				new ItemStack(dust, 1, 30).writeToNBT(toSend1ore.getCompoundTag("secondaryOutput"));
				toSend1ore.setInteger("secondaryChance", 10);
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1ore);

				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 34).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenCarbideIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 35).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);

				NBTTagCompound toSend3Ingot = new NBTTagCompound();
				toSend3Ingot.setInteger("energy", 2400);
				toSend3Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend3Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.valframIngot).writeToNBT(toSend3Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 36).writeToNBT(toSend3Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3Ingot);

				NBTTagCompound toSend4Ingot = new NBTTagCompound();
				toSend4Ingot.setInteger("energy", 2400);
				toSend4Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend4Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenSteelIngot).writeToNBT(toSend4Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 37).writeToNBT(toSend4Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend4Ingot);

				NBTTagCompound toSend5Ingot = new NBTTagCompound();
				toSend5Ingot.setInteger("energy", 2400);
				toSend5Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend5Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.simpletungsten.code.SimpleTungstenCore.prasinosIngot).writeToNBT(toSend5Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 38).writeToNBT(toSend5Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend5Ingot);

				if (Loader.isModLoaded("TungstenOres")) {
					NBTTagCompound toSend2ore = new NBTTagCompound();
					toSend2ore.setInteger("energy", 4000);
					toSend2ore.setCompoundTag("input", new NBTTagCompound());
					toSend2ore.setCompoundTag("primaryOutput", new NBTTagCompound());
					toSend2ore.setCompoundTag("secondaryOutput", new NBTTagCompound());
					new ItemStack(theoldone822.TungstenOres.TungstenOres.oreWolframite).writeToNBT(toSend2ore.getCompoundTag("input"));
					new ItemStack(dust, 2, 37).writeToNBT(toSend2ore.getCompoundTag("primaryOutput"));
					new ItemStack(dust, 1, 34).writeToNBT(toSend2ore.getCompoundTag("secondaryOutput"));
					toSend2ore.setInteger("secondaryChance", 15);
					FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2ore);
				}
			}
		}

		if (Loader.isModLoaded("simplecthon")) {

			FurnaceRecipes.smelting().addSmelting(dust.itemID, 39, new ItemStack(akkamaddi.cthon.core.SimpleCthonCore.cthonIngot), 1.0F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.cthon.core.SimpleCthonCore.cthonIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 39).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);
			}
		}

		if (Loader.isModLoaded("classicalalchemy")) {

			FurnaceRecipes.smelting().addSmelting(dust.itemID, 40, new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.stannumIngot), 1.0F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 41, new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.cuprumIngot), 1.0F);
			FurnaceRecipes.smelting()
					.addSmelting(dust.itemID, 42, new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.pyropusBronzeIngot), 1.4F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 43, new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.pulchrumBronzeIngot),
					2.0F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 44, new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.tombBronzeIngot), 3.0F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.stannumIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 40).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.cuprumIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 41).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);

				NBTTagCompound toSend3Ingot = new NBTTagCompound();
				toSend3Ingot.setInteger("energy", 2400);
				toSend3Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend3Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.pyropusBronzeIngot).writeToNBT(toSend3Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 42).writeToNBT(toSend3Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3Ingot);

				NBTTagCompound toSend4Ingot = new NBTTagCompound();
				toSend4Ingot.setInteger("energy", 2400);
				toSend4Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend4Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.pulchrumBronzeIngot).writeToNBT(toSend4Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 43).writeToNBT(toSend4Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend4Ingot);

				NBTTagCompound toSend5Ingot = new NBTTagCompound();
				toSend5Ingot.setInteger("energy", 2400);
				toSend5Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend5Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.tombBronzeIngot).writeToNBT(toSend5Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 44).writeToNBT(toSend5Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend5Ingot);

				if (Loader.isModLoaded("classicalalchemyores")) {
					NBTTagCompound toSend1ore = new NBTTagCompound();
					toSend1ore.setInteger("energy", 4000);
					toSend1ore.setCompoundTag("input", new NBTTagCompound());
					toSend1ore.setCompoundTag("primaryOutput", new NBTTagCompound());
					toSend1ore.setCompoundTag("secondaryOutput", new NBTTagCompound());
					new ItemStack(theoldone822.classicalalchemyores.ClassicalAlchemyOresCore.cassiteriteOre).writeToNBT(toSend1ore.getCompoundTag("input"));
					new ItemStack(dust, 2, 40).writeToNBT(toSend1ore.getCompoundTag("primaryOutput"));
					new ItemStack(dust, 1, 5).writeToNBT(toSend1ore.getCompoundTag("secondaryOutput"));
					toSend1ore.setInteger("secondaryChance", 15);
					FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1ore);

					NBTTagCompound toSend2ore = new NBTTagCompound();
					toSend2ore.setInteger("energy", 4000);
					toSend2ore.setCompoundTag("input", new NBTTagCompound());
					toSend2ore.setCompoundTag("primaryOutput", new NBTTagCompound());
					toSend2ore.setCompoundTag("secondaryOutput", new NBTTagCompound());
					new ItemStack(theoldone822.classicalalchemyores.ClassicalAlchemyOresCore.borniteOre).writeToNBT(toSend2ore.getCompoundTag("input"));
					new ItemStack(dust, 2, 41).writeToNBT(toSend2ore.getCompoundTag("primaryOutput"));
					new ItemStack(dust, 1, 4).writeToNBT(toSend2ore.getCompoundTag("secondaryOutput"));
					toSend2ore.setInteger("secondaryChance", 15);
					FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2ore);
				}
			}
		}

		if (Loader.isModLoaded("netherrocksfusion")) {

			FurnaceRecipes.smelting().addSmelting(dust.itemID, 45, new ItemStack(theoldone822.NetherrocksFusion.Content.cinderstoneIngot, 1, 0), 0.3F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 46, new ItemStack(theoldone822.NetherrocksFusion.Content.thrakaIngot, 1, 0), 0.6F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 47, new ItemStack(theoldone822.NetherrocksFusion.Content.pyralisIngot, 1, 0), 0.6F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 48, new ItemStack(theoldone822.NetherrocksFusion.Content.dragonbezoarIngot, 1, 0), 1.0F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(theoldone822.NetherrocksFusion.Content.cinderstoneIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 45).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(theoldone822.NetherrocksFusion.Content.thrakaIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 46).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);

				NBTTagCompound toSend3Ingot = new NBTTagCompound();
				toSend3Ingot.setInteger("energy", 2400);
				toSend3Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend3Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(theoldone822.NetherrocksFusion.Content.pyralisIngot).writeToNBT(toSend3Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 47).writeToNBT(toSend3Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3Ingot);

				NBTTagCompound toSend4Ingot = new NBTTagCompound();
				toSend4Ingot.setInteger("energy", 2400);
				toSend4Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend4Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(theoldone822.NetherrocksFusion.Content.dragonbezoarIngot).writeToNBT(toSend4Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 48).writeToNBT(toSend4Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend4Ingot);
			}
		}

		if (Loader.isModLoaded("wootzpigngray")) {

			FurnaceRecipes.smelting().addSmelting(dust.itemID, 49, new ItemStack(theoldone822.WootzPignGray.Content.wootzIngot, 1, 0), 0.8F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(theoldone822.WootzPignGray.Content.wootzIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 49).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
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

		if (Loader.isModLoaded("onlysilver")) {

			FurnaceRecipes.smelting().addSmelting(dust.itemID, 50, new ItemStack(zotmc.onlysilver.api.OnlySilverAPI.silverIngot.get(), 1, 0), 0.8F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(zotmc.onlysilver.api.OnlySilverAPI.silverIngot.get()).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 50).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);
			}
		}

		if (Loader.isModLoaded("endium")) {

			FurnaceRecipes.smelting().addSmelting(dust.itemID, 51, new ItemStack(theoldone822.Endium.Content.EndiumIngot, 1, 0), 0.3F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 52, new ItemStack(theoldone822.Endium.Content.TelosIngot, 1, 0), 0.6F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 53, new ItemStack(theoldone822.Endium.Content.SunteleiaIngot, 1, 0), 1.0F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1ore = new NBTTagCompound();
				toSend1ore.setInteger("energy", 4000);
				toSend1ore.setCompoundTag("input", new NBTTagCompound());
				toSend1ore.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(theoldone822.Endium.Content.EndiumOre).writeToNBT(toSend1ore.getCompoundTag("input"));
				new ItemStack(dust, 2, 51).writeToNBT(toSend1ore.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1ore);

				NBTTagCompound toSend0Ingot = new NBTTagCompound();
				toSend0Ingot.setInteger("energy", 2400);
				toSend0Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend0Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(theoldone822.Endium.Content.EndiumIngot).writeToNBT(toSend0Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 51).writeToNBT(toSend0Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend0Ingot);

				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(theoldone822.Endium.Content.TelosIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 52).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(theoldone822.Endium.Content.SunteleiaIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 53).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);
			}
		}

		if (Loader.isModLoaded("steelyglint")) {

			FurnaceRecipes.smelting().addSmelting(dust.itemID, 54, new ItemStack(akkamaddi.SteelyGlint.code.SteelyGlintCore.refinedIronIngot, 1, 0), 0.8F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 55, new ItemStack(akkamaddi.SteelyGlint.code.SteelyGlintCore.carbonizedIronIngot, 1, 0), 0.8F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 56, new ItemStack(akkamaddi.SteelyGlint.code.SteelyGlintCore.highSteelIngot, 1, 0), 0.8F);
			FurnaceRecipes.smelting().addSmelting(dust.itemID, 57, new ItemStack(akkamaddi.SteelyGlint.code.SteelyGlintCore.lowSteelIngot, 1, 0), 0.8F);

			if (Loader.isModLoaded("ThermalExpansion")) {
				NBTTagCompound toSend1Ingot = new NBTTagCompound();
				toSend1Ingot.setInteger("energy", 2400);
				toSend1Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend1Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.SteelyGlint.code.SteelyGlintCore.refinedIronIngot).writeToNBT(toSend1Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 54).writeToNBT(toSend1Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend1Ingot);

				NBTTagCompound toSend2Ingot = new NBTTagCompound();
				toSend2Ingot.setInteger("energy", 2400);
				toSend2Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend2Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.SteelyGlint.code.SteelyGlintCore.carbonizedIronIngot).writeToNBT(toSend2Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 55).writeToNBT(toSend2Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend2Ingot);

				NBTTagCompound toSend3Ingot = new NBTTagCompound();
				toSend3Ingot.setInteger("energy", 2400);
				toSend3Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend3Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.SteelyGlint.code.SteelyGlintCore.highSteelIngot).writeToNBT(toSend3Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 56).writeToNBT(toSend3Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend3Ingot);

				NBTTagCompound toSend4Ingot = new NBTTagCompound();
				toSend4Ingot.setInteger("energy", 2400);
				toSend4Ingot.setCompoundTag("input", new NBTTagCompound());
				toSend4Ingot.setCompoundTag("primaryOutput", new NBTTagCompound());
				new ItemStack(akkamaddi.SteelyGlint.code.SteelyGlintCore.lowSteelIngot).writeToNBT(toSend4Ingot.getCompoundTag("input"));
				new ItemStack(dust, 1, 57).writeToNBT(toSend4Ingot.getCompoundTag("primaryOutput"));
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend4Ingot);
			}
		}
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		if (Loader.isModLoaded("ThermalExpansion")) {
			NBTTagCompound toSendIronore = new NBTTagCompound();
			toSendIronore.setInteger("energy", 4000);
			toSendIronore.setCompoundTag("input", new NBTTagCompound());
			toSendIronore.setCompoundTag("primaryOutput", new NBTTagCompound());
			toSendIronore.setCompoundTag("secondaryOutput", new NBTTagCompound());
			new ItemStack(Block.oreIron).writeToNBT(toSendIronore.getCompoundTag("input"));
			new ItemStack(dust, 2, 0).writeToNBT(toSendIronore.getCompoundTag("primaryOutput"));
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendIronore);
			(OreDictionary.getOres("dustNickel").get(0)).writeToNBT(toSendIronore.getCompoundTag("secondaryOutput"));
			toSendIronore.setInteger("secondaryChance", 10);
			if (Loader.isModLoaded("simpleores")) {

			}

/*			if (!Loader.isModLoaded("simpleores")) {

				NBTTagCompound toSendCopperore = new NBTTagCompound();
				toSendCopperore.setInteger("energy", 4000);
				toSendCopperore.setCompoundTag("input", new NBTTagCompound());
				toSendCopperore.setCompoundTag("primaryOutput", new NBTTagCompound());
				toSendCopperore.setCompoundTag("secondaryOutput", new NBTTagCompound());
				new ItemStack(CoreHelper.coreContent.copperOre).writeToNBT(toSendCopperore.getCompoundTag("input"));
				new ItemStack(dust, 2, 4).writeToNBT(toSendCopperore.getCompoundTag("primaryOutput"));
				(OreDictionary.getOres("dustGold").get(0)).writeToNBT(toSendCopperore.getCompoundTag("secondaryOutput"));
				toSendCopperore.setInteger("secondaryChance", 10);
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendCopperore);

				NBTTagCompound toSendTinore = new NBTTagCompound();
				toSendTinore.setInteger("energy", 4000);
				toSendTinore.setCompoundTag("input", new NBTTagCompound());
				toSendTinore.setCompoundTag("primaryOutput", new NBTTagCompound());
				toSendTinore.setCompoundTag("secondaryOutput", new NBTTagCompound());
				new ItemStack(CoreHelper.coreContent.tinOre).writeToNBT(toSendTinore.getCompoundTag("input"));
				new ItemStack(dust, 2, 5).writeToNBT(toSendTinore.getCompoundTag("primaryOutput"));
				(OreDictionary.getOres("dustIron").get(0)).writeToNBT(toSendTinore.getCompoundTag("secondaryOutput"));
				toSendTinore.setInteger("secondaryChance", 10);
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendTinore);
			}
*/
			if (Loader.isModLoaded("onlysilver")) {
				NBTTagCompound toSendSilverrore = new NBTTagCompound();
				toSendSilverrore.setInteger("energy", 4000);
				toSendSilverrore.setCompoundTag("input", new NBTTagCompound());
				toSendSilverrore.setCompoundTag("primaryOutput", new NBTTagCompound());
				toSendSilverrore.setCompoundTag("secondaryOutput", new NBTTagCompound());
				new ItemStack(zotmc.onlysilver.api.OnlySilverAPI.silverOre.get()).writeToNBT(toSendSilverrore.getCompoundTag("input"));
				new ItemStack(dust, 2, 50).writeToNBT(toSendSilverrore.getCompoundTag("primaryOutput"));
				(OreDictionary.getOres("dustLead").get(0)).writeToNBT(toSendSilverrore.getCompoundTag("secondaryOutput"));
				toSendSilverrore.setInteger("secondaryChance", 10);
				FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSendSilverrore);
			}
		}
	}
}