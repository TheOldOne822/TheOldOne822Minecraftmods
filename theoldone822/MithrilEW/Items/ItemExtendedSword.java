package theoldone822.MithrilEW.Items;

import static naruto1310.extendedWorkbench.mod_ExtendedWorkbench.extendedValues.increaseSwordDurability;
import static naruto1310.extendedWorkbench.mod_ExtendedWorkbench.extendedValues.increaseSwordDamage;
import static naruto1310.extendedWorkbench.mod_ExtendedWorkbench.extendedValues.increaseSwordMiningSpeed;

import java.lang.reflect.Field;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemExtendedSword extends ItemSword
{
	protected EnumToolMaterial ewToolMaterial;
	protected float exWeaponDamage;
	
    public ItemExtendedSword(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.ewToolMaterial = par2EnumToolMaterial;
        setMaxDamage((int)(getMaxDamage() * increaseSwordDurability));
        exWeaponDamage = 5 + par2EnumToolMaterial.getDamageVsEntity() * 2;
    }
    
    @Override
    public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = HashMultimap.create();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.exWeaponDamage, 0));
        return multimap;
    }

    @Override
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        return (int)(super.getStrVsBlock(par1ItemStack, par2Block) * increaseSwordMiningSpeed);
    }
}