package theoldone822.RoughStart.CraftHandelers;

import theoldone822.RoughStart.RoughStart;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class CraftHandeler {

	@SubscribeEvent
	public void SomethingCrafted(ItemCraftedEvent event) {
		if (event.crafting.getItem() == Item.getItemFromBlock(Blocks.planks)) {
			int toolslot = -1;
			ItemStack tool = null;
			ItemStack slotStack;
			
			for (int i = 0; i < event.craftMatrix.getSizeInventory(); i++) {
				slotStack = event.craftMatrix.getStackInSlot(i);
				if (slotStack != null) {
					if (slotStack.getItem() instanceof ItemAxe) {
						tool = slotStack;
						toolslot = i;
					}
				}
			}

			if(tool != null && toolslot != -1) {
				event.craftMatrix.getStackInSlot(toolslot).setItemDamage(event.craftMatrix.getStackInSlot(toolslot).getItemDamage() + 1);
				if(event.craftMatrix.getStackInSlot(toolslot).getItemDamage() <= event.craftMatrix.getStackInSlot(toolslot).getMaxDamage())
					event.craftMatrix.getStackInSlot(toolslot).stackSize++;
			}


		}
		
		if (event.crafting.getItem() == Items.stick) {
			int toolslot = -1;
			ItemStack tool = null;
			ItemStack slotStack;
			
			for (int i = 0; i < event.craftMatrix.getSizeInventory(); i++) {
				slotStack = event.craftMatrix.getStackInSlot(i);
				if (slotStack != null) {
					if (slotStack.getItem() instanceof ItemAxe) {
						tool = slotStack;
						toolslot = i;
					}
				}
			}

			if(tool != null && toolslot != -1) {
				event.craftMatrix.getStackInSlot(toolslot).setItemDamage(event.craftMatrix.getStackInSlot(toolslot).getItemDamage() + 1);
				if(event.craftMatrix.getStackInSlot(toolslot).getItemDamage() <= event.craftMatrix.getStackInSlot(toolslot).getMaxDamage())
					event.craftMatrix.getStackInSlot(toolslot).stackSize++;
			}


		}
		if (event.crafting.getItem() == RoughStart.rock) {
			int toolslot = -1;
			ItemStack tool = null;
			ItemStack slotStack;
			
			for (int i = 0; i < event.craftMatrix.getSizeInventory(); i++) {
				slotStack = event.craftMatrix.getStackInSlot(i);
				if (slotStack != null) {
					if (slotStack.getItem() instanceof ItemPickaxe) {
						tool = slotStack;
						toolslot = i;
					}
				}
			}

			if(tool != null && toolslot != -1) {
				event.craftMatrix.getStackInSlot(toolslot).setItemDamage(event.craftMatrix.getStackInSlot(toolslot).getItemDamage() + 1);
				if(event.craftMatrix.getStackInSlot(toolslot).getItemDamage() <= event.craftMatrix.getStackInSlot(toolslot).getMaxDamage())
					event.craftMatrix.getStackInSlot(toolslot).stackSize++;
			}


		}	}
}
