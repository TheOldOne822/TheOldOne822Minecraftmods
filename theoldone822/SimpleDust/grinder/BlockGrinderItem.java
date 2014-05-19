package theoldone822.SimpleDust.grinder;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class BlockGrinderItem extends ItemBlock
{
    public BlockGrinderItem(int i)
    {
        super(i);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int i)
    {
        return i;
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        String name = "";
        switch (itemstack.getItemDamage())
        {
        case 0:
        {
            name = "StoneGrinder";
            break;
        }
        case 1:
        {
            name = "CopperGrinder";
            break;
        }
        case 2:
        {
            name = "IronGrinder";
            break;
        }
        case 3:
        {
            name = "MythrilGrinder";
            break;
        }
        case 4:
        {
            name = "AdamantiumGrinder";
            break;
        }
        default:
            name = "brick";
        }
        return getUnlocalizedName() + "." + name;
    }
}
