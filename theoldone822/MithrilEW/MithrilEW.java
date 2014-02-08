package theoldone822.MithrilEW;

import static naruto1310.extendedWorkbench.EWConfig.biggerTools;
import mithril.mod_Mithril;
import naruto1310.extendedWorkbench.item.ItemExtendedArmor;
import naruto1310.extendedWorkbench.item.ItemExtendedAxe;
import naruto1310.extendedWorkbench.item.ItemExtendedHoe;
import naruto1310.extendedWorkbench.item.ItemExtendedPickaxe;
import naruto1310.extendedWorkbench.item.ItemExtendedShovel;
import naruto1310.extendedWorkbench.item.ItemExtendedSword;
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
		modid = "mithrilew",
		name = "Mithril Extended Work Bench Plugin",
		version = "1.0",
		dependencies = "required-after:extendedWorkbench; required-after:mod_Mithril")
public class MithrilEW {

    public static int ID;

	public static Item[][] item = new Item[5][2];
	public static ItemArmor[][] armor = new ItemArmor[2][4];

	@SidedProxy(serverSide="theoldone822.MithrilEW.CommonProxy", clientSide="theoldone822.MithrilEW.ClientProxy")
	public static CommonProxy proxy;
	
	@Instance("mithrilew")
	public static MithrilEW instance;

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        // Stub Method
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        ID = config.getItem("ID", "ID", 31000).getInt();
        config.save();
    }
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
	{
		String[] matNames = new String[] {"Bronze", "Mithril"};
		String[] toolNames = new String[] {"Sword", "Shovel", "Pickaxe", "Axe", "Hoe"};
		EnumToolMaterial[] Enumtool = new EnumToolMaterial[] { mod_Mithril.ToolBronze, mod_Mithril.ToolMithril };
		Object[] material = new Object [] {mod_Mithril.ingotSbBronze, mod_Mithril.ingotMithril};
		Object[] handle = new Object[] {Block.cobblestone, Item.ingotIron};
		String s = "extendedWorkbenchmi:tool" + (biggerTools == 0 ? "" : "b");
		
		for(int i = 0; i < 2; i++)
		{
			item[0][i] = new ItemExtendedSword	(ID + i * 5 + 0, Enumtool[i]).setUnlocalizedName(s + "0" + i).setTextureName("mithrilew:tool" + "0" + i);
			item[1][i] = new ItemExtendedShovel	(ID + i * 5 + 1, Enumtool[i]).setUnlocalizedName(s + "1" + i).setTextureName("mithrilew:tool" + "1" + i);
			item[2][i] = new ItemExtendedPickaxe(ID + i * 5 + 2, Enumtool[i]).setUnlocalizedName(s + "2" + i).setTextureName("mithrilew:tool" + "2" + i);
			item[3][i] = new ItemExtendedAxe	(ID + i * 5 + 3, Enumtool[i]).setUnlocalizedName(s + "3" + i).setTextureName("mithrilew:tool" + "3" + i);
			item[4][i] = new ItemExtendedHoe	(ID + i * 5 + 4, Enumtool[i]).setUnlocalizedName(s + "4" + i).setTextureName("mithrilew:tool" + "4" + i);

			EWAPI.addRecipe(new ItemStack(item[0][i], 1), new Object[] {" X ", " X ", " X ", " X ", "YXY", " Y ", ('X'), material[i], ('Y'), handle[i]});
			EWAPI.addRecipe(new ItemStack(item[1][i], 1), new Object[] {" X ", " X ", " Y ", " Y ", " Y ", " Y ", ('X'), material[i], ('Y'), handle[i]});
			EWAPI.addRecipe(new ItemStack(item[2][i], 1), new Object[] {"XX ", " XX", " YX", " Y ", " Y ", " Y ", ('X'), material[i], ('Y'), handle[i]});
			EWAPI.addRecipe(new ItemStack(item[3][i], 1), new Object[] {"X  ", "XXX", "XY ", " Y ", " Y ", " Y ", ('X'), material[i], ('Y'), handle[i]});
			EWAPI.addRecipe(new ItemStack(item[4][i], 1), new Object[] {" X ", " XX", " Y ", " Y ", " Y ", " Y ", ('X'), material[i], ('Y'), handle[i]});

			for(int j = 0; j < 5; j++)
				LanguageRegistry.addName(item[j][i], "Extended " + (matNames[i]) + " " + (toolNames[j]));
		}
	}

	int armorRenderer[] = new int[2];
	
	if(FMLCommonHandler.instance().getEffectiveSide().isClient())
		armorRenderer =	new int[]	{	RenderingRegistry.addNewArmourRendererPrefix("extendedBronze"),
										RenderingRegistry.addNewArmourRendererPrefix("extendedMithril")
									};

	{
		Object[] material = new Object[] {mod_Mithril.ingotAsBronze, mod_Mithril.ingotMithril};
		String[] matNames = new String[] {"Bronze", "Mithril"};
		EnumArmorMaterial[] Enumarmor = new EnumArmorMaterial[] { mod_Mithril.ArmorBronze, mod_Mithril.ArmorMithril };
		String[] armorNames = new String[] {"Helmet", "Chestplate", "Pants", "Boots"};
		
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				armor[i][j] = (ItemArmor) new ItemExtendedArmor(ID + 31 + i * 4 + j, Enumarmor[i], armorRenderer[i], j).setUnlocalizedName("extendedWorkbenchmi:armor" + i + j).setTextureName("mithrilew:armor" + i + j);
				LanguageRegistry.addName(armor[i][j], "Extended " + matNames[i] + " " + armorNames[j]);
			}

			EWAPI.addRecipe(new ItemStack(armor[i][3], 1), new Object[] {"X X", "X X", "X X",			('X'), material[i]});
			EWAPI.addRecipe(new ItemStack(armor[i][2], 1), new Object[] {"XXX", "XXX", "X X", "X X",	('X'), material[i]});
			EWAPI.addRecipe(new ItemStack(armor[i][1], 1), new Object[] {"X X", "XXX", "XXX", "XXX",	('X'), material[i]});
			EWAPI.addRecipe(new ItemStack(armor[i][0], 1), new Object[] {"XXX", "XXX", "X X",			('X'), material[i]});
		}
	}		proxy.registerRenderInformation();
}}
