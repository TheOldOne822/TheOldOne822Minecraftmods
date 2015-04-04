package theoldone822.WootzPignGray.Items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HardenedHoe extends ItemHoe
{
	/**
	 * The EnumToolMaterial for the tool. This is used to set what item can be used to repair it.
	 */
    @SuppressWarnings("unused")
    private final ToolMaterial material;
    private String modName;
    
    /**
     * Main constructor for the hoes added by SimpleOres.
     * 
     * @param i = the items ID
     * @param enumtoolmaterial = the material of the tool. Determines speed, number of uses, etc.
     */
	public HardenedHoe(ToolMaterial enumtoolmaterial, String mod) 
	{
		super(enumtoolmaterial);
		material = enumtoolmaterial;
		modName = mod;
		
	}
	
	public HardenedHoe setUnlocalizedName(String unlocalizedName)
	{
		super.setUnlocalizedName(unlocalizedName);
		GameRegistry.registerItem(this, unlocalizedName);
		return this;
	}

	/**
     * Sets the icon for the item. 
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) 
    {
    	 this.itemIcon = iconRegister.registerIcon(modName + ":" + (this.getUnlocalizedName().substring(5)));
    }
    
	/**
	 * Determines if the tool is repairable, and gets the item which can be used to repair it depending on the material of the tool.
	 * 
	 * For example, a copper hoe can be repaired with a copper ingot, a mythril hoe with a mythril ingot.
	 */
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return false;
    }
}
