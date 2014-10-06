package theoldone822.RoughStart.CraftHandelers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class RepairStoneTools implements IRecipe {
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
                if(slotStack.getItem() == Items.stone_axe || slotStack.getItem() == Items.stone_shovel || slotStack.getItem() == Items.stone_hoe || slotStack.getItem() == Items.stone_pickaxe || slotStack.getItem() == Items.stone_sword) {
                    if(tool != null) {
                        return false;
                    }
                    tool = slotStack;
                } else if(slotStack.getItem() == slotStack.getItem().getItemFromBlock(Blocks.stone)) {
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