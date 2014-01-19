package theoldone822.CraftableChain;

import java.util.Arrays;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = "craftablechain", name = "Craftable Chain", version = "1.1")
public class CraftableChain {

	public static Item chainLinks;

	public static Configuration config;

	@Instance("CraftableChain")
	public static CraftableChain instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModMetadata metadata = event.getModMetadata();
		metadata.autogenerated = false;

		metadata.authorList = Arrays.asList("theoldone822");
		metadata.description = "Adds craftable chain links that can be used to make chain armor.";
		
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

		chainLinks = new Item((config.getItem("ID", 2500)).getInt()).setUnlocalizedName("craftableChain:ChainLinks").setTextureName("craftablechain:chainlinks");

		LanguageRegistry.addName(chainLinks, "Chain Links");

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(chainLinks, 6), true, new Object[]{" X ", "Y Y", " Y ", Character.valueOf('X'), "ingotTin", Character.valueOf('Y'), Item.ingotIron}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(chainLinks, 6), true, new Object[]{" Y ", "X Y", " Y ", Character.valueOf('X'), "ingotTin", Character.valueOf('Y'), Item.ingotIron}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(chainLinks, 6), true, new Object[]{" Y ", "Y X", " Y ", Character.valueOf('X'), "ingotTin", Character.valueOf('Y'), Item.ingotIron}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(chainLinks, 6), true, new Object[]{" Y ", "Y Y", " X ", Character.valueOf('X'), "ingotTin", Character.valueOf('Y'), Item.ingotIron}));
		GameRegistry.addRecipe(new ItemStack(chainLinks, 8), new Object[] { " X ", "X X", " X ", Character.valueOf('X'), Item.ingotIron});
		
		GameRegistry.addRecipe(new ItemStack(Item.helmetChain, 1), new Object[] { "XXX", "X X", Character.valueOf('X'), chainLinks });
		GameRegistry.addRecipe(new ItemStack(Item.plateChain, 1), new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), chainLinks });
		GameRegistry.addRecipe(new ItemStack(Item.legsChain, 1), new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), chainLinks });
		GameRegistry.addRecipe(new ItemStack(Item.bootsChain, 1), new Object[] { "X X", "X X", Character.valueOf('X'), chainLinks });

		config.save();
	}
}