package theoldone822.WootzPignGray.Items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HardenedSword extends ItemSword
{
	/**
	 * The EnumToolMaterial for the tool. This is used to set what item can be used to repair it.
	 */
    @SuppressWarnings("unused")
    private final ToolMaterial material;
    private String modName;
	  
	public HardenedSword(ToolMaterial enumtoolmaterial, String mod)
	{
		super(enumtoolmaterial);
		material = enumtoolmaterial;
		modName = mod;
		
	}
	
	public HardenedSword setUnlocalizedName(String unlocalizedName)
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
	 * For example, a copper sword can be repaired with a copper ingot, a mythril sword with a mythril ingot.
	 */
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return false;
    }
}
