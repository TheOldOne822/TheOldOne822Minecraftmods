package theoldone822.WootzPignGray;

import java.util.Arrays;

import theoldone822.WootzPignGray.Furnaces.GrayFurnaceTileEntity;
import theoldone822.WootzPignGray.Furnaces.GrayFusionFurnaceTileEntity;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "wootzpigngray", name = "Wootz Pig and Gray", version = "2.4", dependencies = "required-after:simpleores; required-after:simpleoresfusion")
public class WootzPignGray {
	@SidedProxy(clientSide = "theoldone822.WootzPignGray.ProxyClient", serverSide = "theoldone822.WootzPignGray.ProxyCommon")	
	public static ProxyCommon proxy;

	public static ToolMaterial toolWootz;
	public static ToolMaterial toolHardenedsteel;

	public static ArmorMaterial armorWootz;

	public static int rendererWootz;
	public static int rendererHardenedsteel;
	
	@Instance("WootzPignGray")
	public static WootzPignGray instance = new WootzPignGray();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModMetadata metadata = event.getModMetadata();
		metadata.autogenerated = false;

		metadata.authorList = Arrays.asList("theoldone822");
		metadata.description = "Simpleores Fusions Wootz steel pack.";
	
		Settings.doSettings(event);

		toolWootz = EnumHelper.addToolMaterial("WOOTZ", Settings.wootzMiningLevel, Settings.wootzUsesNum, Settings.wootzMiningSpeed, Settings.wootzDamageVsEntity, Settings.wootzEnchantability);
		toolHardenedsteel = EnumHelper.addToolMaterial("HARDENEDSTEEL", Settings.hardenedsteelMiningLevel, Settings.hardenedsteelUsesNum, Settings.hardenedsteelMiningSpeed, Settings.hardenedsteelDamageVsEntity, Settings.hardenedsteelEnchantability);

		armorWootz = EnumHelper.addArmorMaterial("WOOTZ", Settings.wootzArmorDurability, Settings.wootzArmorDamageReduction, Settings.wootzArmorEnchantability);

		Content.doArmor();
		Content.doBlocks();
		Content.doItems();
		Content.doTools();
		Content.doLoot();
		Recipes.doRecipes();
	}
	
	@EventHandler
	public void InitiateWootzPignGray(FMLInitializationEvent initEvent) {
		instance = this;
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
		GameRegistry.registerTileEntity(GrayFurnaceTileEntity.class, "grayFurnace");
		GameRegistry.registerTileEntity(GrayFusionFurnaceTileEntity.class, "grayFusionFurnace");

		if (Loader.isModLoaded("TreeCapitator")) {
			NBTTagCompound c = new NBTTagCompound();
			c.setString("modID", "wootzpigngray");
			c.setString("axeIDList", String.valueOf(Content.wootzAxe) + "; " + String.valueOf(Content.hardenedsteelAxe));
			FMLInterModComms.sendMessage("TreeCapitator", "ThirdPartyModConfig", c);
		}
		toolWootz.customCraftingMaterial = Content.wootzIngot;
		armorWootz.customCraftingMaterial = Content.wootzIngot;
		Recipes.doPigiron();

	}
}
