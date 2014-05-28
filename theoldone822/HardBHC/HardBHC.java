package theoldone822.HardBHC;

import java.io.File;

import mods.immibis.tubestuff.TubeStuff;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.ironchest.IronChest;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(
		modid = "hardbhc",
		name = "Harder Black ",
		version = "1.0",
		dependencies = "required-after:ThermalExpansion; required-after:Tubestuff; required-after:IronChest")
public class HardBHC {
	ItemStack tesseract;
	ItemStack cellResonant;
	ItemStack ObsidianChest;

	public static Configuration config;

    public static boolean harder;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		config = new Configuration(new File("config", "hardbhc.cfg"));
		config.load();

		harder = config.get("Harder", "require Netherstar", true).getBoolean(true);

		config.save();
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
//		tesseract = new ItemStack(GameRegistry.findBlock("ThermalExpansion", "Tesseract"));
		tesseract = GameRegistry.findItemStack("ThermalExpansion", "tesseractFrameFull", 1);
		cellResonant = GameRegistry.findItemStack("ThermalExpansion", "cellResonant", 1);
		ObsidianChest = new ItemStack(IronChest.ironChestBlock, 1, 6);

		if(harder)
			CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(TubeStuff.block, 1, 2), true, new Object[]{"XAX", "ZWZ", "XYX", Character.valueOf('A'), Item.netherStar, Character.valueOf('X'), tesseract, Character.valueOf('Y'), Block.blockDiamond, Character.valueOf('Z'), cellResonant, Character.valueOf('W'), ObsidianChest}));

		if(!harder)
			CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(TubeStuff.block, 1, 2), true, new Object[]{"XYX", "ZWZ", "XYX", Character.valueOf('X'), tesseract, Character.valueOf('Y'), Block.blockDiamond, Character.valueOf('Z'), cellResonant, Character.valueOf('W'), ObsidianChest}));
	}
}