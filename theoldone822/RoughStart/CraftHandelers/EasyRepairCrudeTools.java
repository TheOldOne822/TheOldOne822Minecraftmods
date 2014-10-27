package theoldone822.RoughStart.CraftHandelers;

import theoldone822.RoughStart.RoughStart;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class EasyRepairCrudeTools implements IRecipe {
    private ItemStack result;

    @Override
    public boolean matches(InventoryCrafting craftingGridInventory, World world) {
        result = null;
        ItemStack tool = null;
        boolean stone = false;

        ItemStack slotStack;
        for(int i = 0; i < craftingGridInventory.getSizeInventory(); i++) {
            slotStack = craftingGridInventory.getStackInSlot(i);

            if(slotStack != null) {
                if(slotStack.getItem() == RoughStart.crudeAxe) {
                    if(tool != null) {
                        return false;
                    }
                    tool = slotStack;
                } else if(slotStack.getItem() == RoughStart.rock) {
                    if(stone) {
                        return false;
                    }
                    stone = true;
                } else {
                    return false;
                }
            }
        }

        if(tool != null && stone) {
            result = tool.copy();
            result.setItemDamage(Math.max((result.getItemDamage() - 66), 0));
        }

        return result != null;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting craftingGridInventory) {
        return result.copy();
    }

    @Override
    public int getRecipeSize() {
        return 2;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return result;
    }
}