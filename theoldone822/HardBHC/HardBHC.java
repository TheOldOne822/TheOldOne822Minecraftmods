package theoldone822.HardBHC;

import mods.immibis.tubestuff.TubeStuff;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
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

	@EventHandler
	public void Init(FMLInitializationEvent event) {
//		tesseract = new ItemStack(GameRegistry.findBlock("ThermalExpansion", "Tesseract"));
		tesseract = GameRegistry.findItemStack("ThermalExpansion", "tesseractFrameFull", 1);
//		tesseract = new ItemStack(Block.blockDiamond);
		cellResonant = GameRegistry.findItemStack("ThermalExpansion", "cellResonant", 1);
//		cellResonant = new ItemStack(Block.blockDiamond);
		ObsidianChest = new ItemStack(IronChest.ironChestBlock, 1, 6);
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(TubeStuff.block, 1, 2), true, new Object[]{"XYX", "ZWZ", "XYX", Character.valueOf('X'), tesseract, Character.valueOf('Y'), Block.blockDiamond, Character.valueOf('Z'), cellResonant, Character.valueOf('W'), ObsidianChest}));

	}
}
