package theoldone822.NetherrocksFusion.Items;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class SimpleOre extends Block
{
	private String modName;
	/**
	 * The main constructor for the blocks. 
	 * 
	 * @param par1 = ID of the block.
	 * @param material = The material of the block. This sets what tools are effective against it, the sounds it makes, etc.
	 */
	public SimpleOre(int par1, Material material, String mod, CreativeTabs tab) 
	{
		super(par1, material);
		this.modName = mod;
		
	}
	
    /**
     * Sets whether or not Silk Touch has an effect on this block. Returns true so that Onyx Ore will drop itself rather than the gem item.
     */
    protected boolean canSilkHarvest()
    {
        return true;
    }
}
