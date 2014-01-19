package theoldone822.SimpleOresEW.Items;

import static theoldone822.SimpleOresEW.SimpleOresEW.extendedValues.increaseToolAttackDamage;
import static theoldone822.SimpleOresEW.SimpleOresEW.extendedValues.increaseToolDurability;
import static theoldone822.SimpleOresEW.SimpleOresEW.extendedValues.increaseToolPower;
import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemExtendedAxe extends ItemAxe
{
    public ItemExtendedAxe(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        setMaxDamage((int)(getMaxDamage() * increaseToolDurability));
        this.damageVsEntity *= increaseToolAttackDamage;
    }

    @Override
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        return super.getStrVsBlock(par1ItemStack, par2Block) * increaseToolPower;
    }
}
