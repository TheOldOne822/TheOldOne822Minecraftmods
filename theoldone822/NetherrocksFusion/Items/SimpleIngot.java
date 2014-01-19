package theoldone822.NetherrocksFusion.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SimpleIngot extends Item
{	
	private String modName;
	
	public SimpleIngot(int i, String mod, CreativeTabs tab) 
	{
		super(i);
		modName = mod;
		
	}
	
}
