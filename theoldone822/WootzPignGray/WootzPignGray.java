package theoldone822.WootzPignGray;

import java.util.Arrays;

import theoldone822.WootzPignGray.Furnaces.GrayFurnaceTileEntity;
import theoldone822.WootzPignGray.Furnaces.GrayFusionFurnaceTileEntity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = "wootzpigngray", name = "Wootz Pig and Gray", version = "2.0", dependencies = "required-after:simpleores; required-after:simpleoresfusion; after:haditecoal; after:sterlingandblack")
public class WootzPignGray {
	@SidedProxy(clientSide = "theoldone822.WootzPignGray.ProxyClient", serverSide = "theoldone822.WootzPignGray.ProxyCommon")	
	public static ProxyCommon proxy;

	public static EnumToolMaterial toolWootz;
	public static EnumToolMaterial toolHardenedsteel;

	public static EnumArmorMaterial armorWootz;

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
	
		IDs.doConfig(event);
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
		NetworkRegistry.instance().registerGuiHandler(instance, proxy);
		GameRegistry.registerTileEntity(GrayFurnaceTileEntity.class, "grayFurnace");
		GameRegistry.registerTileEntity(GrayFusionFurnaceTileEntity.class, "grayFusionFurnace");

		if (Loader.isModLoaded("TreeCapitator")) {
			NBTTagCompound c = new NBTTagCompound();
			c.setString("modID", "wootzpigngray");
			c.setString("axeIDList", String.valueOf(Content.wootzAxe.itemID) + "; " + String.valueOf(Content.hardenedsteelAxe.itemID));
			FMLInterModComms.sendMessage("TreeCapitator", "ThirdPartyModConfig", c);
		}
		toolWootz.customCraftingMaterial = Content.wootzIngot;
		armorWootz.customCraftingMaterial = Content.wootzIngot;
}
}
