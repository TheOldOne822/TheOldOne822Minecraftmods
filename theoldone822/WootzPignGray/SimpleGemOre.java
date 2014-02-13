package theoldone822.WootzPignGray;

import java.util.Random;

import SimpleOres.core.Items;
import SimpleOres.core.Settings;
import SimpleOres.core.SimpleOres;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class SimpleGemOre extends Block
{
	private String modName;
	private int itemDrop;
	private int Amount;
	private int Extra;
	
	/**
	 * This allows you to easily create a new ore block that drops an item. Only supports one item drop though.
	 * 
	 * @param id = ID of the block.
	 * @param material = The material of the block. This sets what tools are effective against it, the sounds it makes, etc.
	 * @param itemToDrop = id of item To Drop
	 */
	public SimpleGemOre(int id, Material material, String mod, int itemToDrop, CreativeTabs tab)
	{
		super(id, material);
		this.modName = mod;
		this.itemDrop = itemToDrop + 256;
		
    	if(Settings.enableSeparateTabs == true)
    	{
            this.setCreativeTab(tab);
    	}
    	else this.setCreativeTab(SimpleOres.tabSimpleBlocks);
	}

	/**
	 * This allows you to easily create a new ore block that drops an item. Only supports one item drop though.
	 * 
	 * @param id = ID of the block.
	 * @param material = The material of the block. This sets what tools are effective against it, the sounds it makes, etc.
	 * @param itemToDrop = id of item To Drop
	 * @param minAmount = base amount to drop
	 * @param maxExtra = max random exrta to drop 
	 */
	public SimpleGemOre(int id, Material material, String mod, int itemToDrop, int minAmount, int maxExtra, CreativeTabs tab)
	{
		super(id, material);
		this.modName = mod;
		this.itemDrop = itemToDrop + 256;
		this.Amount = minAmount;
		this.Extra = maxExtra;
		
    	if(Settings.enableSeparateTabs == true)
    	{
            this.setCreativeTab(tab);
    	}
    	else this.setCreativeTab(SimpleOres.tabSimpleBlocks);
	}
	
	/**
	 * Sets the texture for the block.
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) 
	{
		 this.blockIcon = iconRegister.registerIcon(modName + ":" + (this.getUnlocalizedName().substring(5)));
	}
	
	/**
	 * Sets what item or block is dropped when the block is broken.
	 * For all the ores except onyx, they will drop themselves. Onyx will drop the gem item.
	 */
    public int idDropped(int i, Random random, int j)
    {
    	if(itemDrop != 0)
    	{
            return itemDrop; 
    	}
    	else return this.blockID;
    }
    
    public int quantityDropped(Random par1Random)
    {
        return Amount + par1Random.nextInt(Extra);
    }

    /**
     * Determines the quantity dropped when you use a Fortune pickaxe. Only applies to blocks that don't drop themselves (onyx ore).
     */
    public int quantityDroppedWithBonus(int par1, Random par2Random)
    {
        if (par1 > 0 && this.blockID != this.idDropped(0, par2Random, par1))
        {
            int var3 = par2Random.nextInt(par1 + 2) - 1;

            if (var3 < 0)
            {
                var3 = 0;
            }

            return this.quantityDropped(par2Random) * (var3 + 1);
        }
        else
        {
            return this.quantityDropped(par2Random);
        }
    }
    
    /**
     * Sets whether or not Silk Touch has an effect on this block. Returns true so that Onyx Ore will drop itself rather than the gem item.
     */
    protected boolean canSilkHarvest()
    {
        return true;
    }

}
