package theoldone822.McoEW.Items;

import static naruto1310.extendedWorkbench.mod_ExtendedWorkbench.extendedValues.increaseHoeDurability;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemExtendedHoe extends ItemHoe
{
    public ItemExtendedHoe(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.setMaxDamage((int)(getMaxDamage() * increaseHoeDurability));
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int i, int j, int k, int l, float f0, float f1, float f2)
    {
        if(super.onItemUse(stack, player, world, i, j, k, l, f0, f1, f2))
        	return world.setBlock(i, j, k, world.getBlockId(i, j, k), 15, 3);
        return false;
    }
}
