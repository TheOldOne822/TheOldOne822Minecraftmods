package theoldone822.crudeaxe;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = "crudeaxe", name = "Crude Axe", version = "1.0")
public class crudeaxe {
	public static EnumToolMaterial toolCrude;
    public static Configuration config;
    public static int axeID;

    public static Item crudeAxe;
    
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        axeID = config.getItem("Crude", "Axe", 4097).getInt();

        toolCrude = EnumHelper.addToolMaterial("CRUDE", 0, 28, 1.1F, -1.0F, 1);

        config.save();

        crudeAxe = new ItemAxe(axeID, toolCrude).setUnlocalizedName("crudeaxe").setTextureName("crudeaxe:crudeaxe");

        LanguageRegistry.addName(crudeAxe, "Crude Axe");

		GameRegistry.addShapelessRecipe(new ItemStack(crudeAxe, 1), new Object[] { Item.stick, Item.flint });
		GameRegistry.addShapelessRecipe(new ItemStack(crudeAxe, 1), new Object[] { Item.bone, Item.flint });
		GameRegistry.addShapelessRecipe(new ItemStack(crudeAxe, 1), new Object[] { Item.stick, Item.bone });
		GameRegistry.addShapelessRecipe(new ItemStack(crudeAxe, 1), new Object[] { Item.bone, Item.bone });
		GameRegistry.addShapelessRecipe(new ItemStack(Item.stick, 1), new Object[] { Block.sapling });

		MinecraftForge.setToolClass(crudeAxe, "axe", 0);
    	MinecraftForge.setBlockHarvestLevel(Block.wood, "axe", 0);
}


}
