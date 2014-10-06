package theoldone822.RoughStart.CraftHandelers;

import theoldone822.RoughStart.RoughStart;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class EasyRepairLeather implements IRecipe {
    private ItemStack result;

    @Override
    public boolean matches(InventoryCrafting craftingGridInventory, World world) {
        result = null;
        ItemStack armor = null;
        boolean stone = false;

        ItemStack slotStack;
        for(int i = 0; i < craftingGridInventory.getSizeInventory(); i++) {
            slotStack = craftingGridInventory.getStackInSlot(i);

            if(slotStack != null) {
                if(slotStack.getItem() == Items.leather_boots || slotStack.getItem() == Items.leather_chestplate || slotStack.getItem() == Items.leather_helmet || slotStack.getItem() == Items.leather_leggings) {
                    if(armor != null) {
                        return false;
                    }
                    armor = slotStack;
                } else if(slotStack.getItem() == Items.leather) {
                    if(stone) {
                        return false;
                    }
                    stone = true;
                } else {
                    return false;
                }
            }
        }

        if(armor != null && stone) {
            result = armor.copy();
            result.setItemDamage(Math.max((result.getItemDamage() - 28), 0));
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