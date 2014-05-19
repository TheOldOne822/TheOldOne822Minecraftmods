package theoldone822.McoEW.Items;

import static naruto1310.extendedWorkbench.mod_ExtendedWorkbench.extendedValues.increaseToolAttackDamage;
import static naruto1310.extendedWorkbench.mod_ExtendedWorkbench.extendedValues.increaseToolDurability;
import static naruto1310.extendedWorkbench.mod_ExtendedWorkbench.extendedValues.increaseToolPower;
import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemExtendedPickaxe extends ItemPickaxe
{
    public ItemExtendedPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial)
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
