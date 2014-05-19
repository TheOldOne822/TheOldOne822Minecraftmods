package theoldone822.McoEW.Items;

import static naruto1310.extendedWorkbench.mod_ExtendedWorkbench.extendedValues.increaseArmorDurability;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemExtendedArmor extends ItemArmor implements ISpecialArmor
{
	private String texturePath;
	/** Holds the 'base' maxDamage that each armorType have. */
    private static final int[] EWmaxDamageArray = new int[] {11, 16, 15, 13};

    /** Holds the amount of damage that the armor reduces at full durability. */
    public final int EWdamageReduceAmount;

    /** The EnumArmorMaterial used for this ItemArmor */
    private final EnumArmorMaterial material;

    public ItemExtendedArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String type)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
        this.material = par2EnumArmorMaterial;
        this.EWdamageReduceAmount = par2EnumArmorMaterial.getDamageReductionAmount(par4);
        this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
        this.maxStackSize = 1;
        this.setMaxDamage((int)(getMaxDamage() * increaseArmorDurability));
    	this.setArmorType(type, par4);
    }

    public void setArmorType(String type, int slotNumber)
    {
    	switch(slotNumber)
    	{  	
    		case 0:
    		{
    			this.texturePath = "mithrilew:textures/models/armor/extended" + type +"_layer_1.png";
    		}
    		break;
    		
    		case 1:
    		{
    			this.texturePath = "mithrilew:textures/models/armor/extended" + type +"_layer_1.png";
    		}
    		break;
    		
    		case 2:
    		{
    			this.texturePath = "mithrilew:textures/models/armor/extended" + type +"_layer_2.png";
    		}
    		break;
    		
    		case 3:
    		{
    			this.texturePath = "mithrilew:textures/models/armor/extended" + type +"_layer_1.png";
    		}
    		break;
    	}
    }
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
    	return this.texturePath;
    }

    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    @Override
	public int getItemEnchantability()
    {
        return this.material.getEnchantability();
    }

    /**
     * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
     * multiplied by armor material factor)
     */
    static int[] getMaxDamageArray()
    {
        return EWmaxDamageArray;
    }

    @Override
    public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot)
    {
        return new ArmorProperties(0, (this.EWdamageReduceAmount + 0.5D) / 25D , armor.getMaxDamage() + 1 - armor.getItemDamage());
    }

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot)
    {
        return this.EWdamageReduceAmount;
    }

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot)
    {
        stack.damageItem(damage, entity);
    }
    
    @Override
	@SideOnly(Side.CLIENT)
    public boolean requiresMultipleRenderPasses()
    {
    	return false;
    }
    
    @Override
    public int getColor(ItemStack stack)
    {
        if (this.material != EnumArmorMaterial.CLOTH)
            return -1;
        
        NBTTagCompound var2 = stack.getTagCompound();

        if (var2 == null)
    		return 0x632E1B;
        
        NBTTagCompound var3 = var2.getCompoundTag("display");
        return var3 == null ? 0x632E1B : (var3.hasKey("color") ? var3.getInteger("color") : 0x632E1B);
    }
}
