package theoldone822.RoughStart;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * This is based on the simpleores axe API.
 */
public class BasicAxe extends ItemAxe
{
	private final ToolMaterial material;
	private String modName = "roughstart";
	private String infoString;
	private boolean infoAdded = false;

	public BasicAxe(ToolMaterial toolmaterial) 
	{
		super(toolmaterial);
		this.material = toolmaterial;
		this.setHarvestLevel("axe", material.getHarvestLevel());
	}
	
	/**
	 * Adds a tooltip to the item. Must be unlocalised, so you need to have it somewhere in your lang files.
	 * @param info A String normally in format modId.theItem.info.
	 */
	public BasicAxe addInfo(String info)
	{
		infoString = info;
		infoAdded = true;
		return this;
	}
	
	/**
	 * Registers the item in the GameRegistry, with the name given, and sends the name through to setUnlocalizedName in the super class.
	 */
	public BasicAxe setUnlocalizedName(String unlocalizedName)
	{
		super.setUnlocalizedName(unlocalizedName);
		GameRegistry.registerItem(this, unlocalizedName);
		return this;
	}
	
	/**
	 * Registers the textures for the items.
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon(modName + ":" + (this.getUnlocalizedName().substring(5)));
	}
	
	/**
	 * Determines if the tool is repairable and gets the item which can be used to repair it. 
	 */
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return this.material.customCraftingMaterial == par2ItemStack.getItem() ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		if(infoAdded)
		{
			par3List.add(StatCollector.translateToLocal(infoString));
		}
	}
}
