package theoldone822.MoreFusionFurnaces.Furnaces;

import alexndr.SimpleOres.api.helpers.CoreHelper;
import alexndr.SimpleOres.plugins.fusion.FusionRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;

public class MythrilFusionFurnaceTileEntity extends TileEntity implements ISidedInventory
{
    private static final int[] slots_input1 = new int[] {0};
    private static final int[] slots_input2 = new int[] {3};
    private static final int[] slots_catalyst = new int[] {4};
    private static final int[] slots_output = new int[] {2, 1}; 
    private static final int[] slots_fuel = new int[] {1}; 

    /**
     * The ItemStacks that hold the items currently being used in the furnace
     */
    private ItemStack[] furnaceItemStacks = new ItemStack[5];

    /** The number of ticks that the furnace will keep burning */
    public int furnaceBurnTime = 0;

    /**
     * The number of ticks that a fresh copy of the currently-burning item would keep the furnace burning for
     */
    public int currentItemBurnTime = 0;

    /** The number of ticks that the current item has been cooking for */
    public int furnaceCookTime = 0;
    private String field_94130_e;

    /**
     * Returns the number of slots in the inventory.
     */
    public int getSizeInventory()
    {
        return this.furnaceItemStacks.length;
    }

    /**
     * Returns the stack in slot i
     */
    public ItemStack getStackInSlot(int par1)
    {
        return this.furnaceItemStacks[par1];
    }

    /**
     * Removes from an inventory slot (first arg) up to a specified number (second arg) of items and returns them in a
     * new stack.
     */
    public ItemStack decrStackSize(int par1, int par2)
    {
        if (this.furnaceItemStacks[par1] != null)
        {
            ItemStack itemstack;

            if (this.furnaceItemStacks[par1].stackSize <= par2)
            {
                itemstack = this.furnaceItemStacks[par1];
                this.furnaceItemStacks[par1] = null;
                return itemstack;
            }
            else
            {
                itemstack = this.furnaceItemStacks[par1].splitStack(par2);

                if (this.furnaceItemStacks[par1].stackSize == 0)
                {
                    this.furnaceItemStacks[par1] = null;
                }

                return itemstack;
            }
        }
        else
        {
            return null;
        }
    }

    /**
     * When some containers are closed they call this on each slot, then drop whatever it returns as an EntityItem -
     * like when you close a workbench GUI.
     */
    public ItemStack getStackInSlotOnClosing(int par1)
    {
        if (this.furnaceItemStacks[par1] != null)
        {
            ItemStack itemstack = this.furnaceItemStacks[par1];
            this.furnaceItemStacks[par1] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }

    /**
     * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
     */
    public void setInventorySlotContents(int par1, ItemStack par2ItemStack)
    {
        this.furnaceItemStacks[par1] = par2ItemStack;

        if (par2ItemStack != null && par2ItemStack.stackSize > this.getInventoryStackLimit())
        {
            par2ItemStack.stackSize = this.getInventoryStackLimit();
        }
    }

    /**
     * Returns the name of the inventory.
     */
    public String getInvName()
    {
        return this.isInvNameLocalized() ? this.field_94130_e : "container.furnace";
    }

    /**
     * If this returns false, the inventory name will be used as an unlocalized name, and translated into the player's
     * language. Otherwise it will be used directly.
     */
    public boolean isInvNameLocalized()
    {
        return this.field_94130_e != null && this.field_94130_e.length() > 0;
    }

    public void func_94129_a(String par1Str)
    {
        this.field_94130_e = par1Str;
    }

    /**
     * Reads a tile entity from NBT.
     */
    public void readFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readFromNBT(par1NBTTagCompound);
        NBTTagList nbttaglist = par1NBTTagCompound.getTagList("Items");
        this.furnaceItemStacks = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < nbttaglist.tagCount(); ++i)
        {
            NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.tagAt(i);
            byte b0 = nbttagcompound1.getByte("Slot");

            if (b0 >= 0 && b0 < this.furnaceItemStacks.length)
            {
                this.furnaceItemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }

        this.furnaceBurnTime = par1NBTTagCompound.getShort("BurnTime");
        this.furnaceCookTime = par1NBTTagCompound.getShort("CookTime");
        this.currentItemBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);

        if (par1NBTTagCompound.hasKey("CustomName"))
        {
            this.field_94130_e = par1NBTTagCompound.getString("CustomName");
        }
    }

    /**
     * Writes a tile entity to NBT.
     */
    public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("BurnTime", (short)this.furnaceBurnTime);
        par1NBTTagCompound.setShort("CookTime", (short)this.furnaceCookTime);
        NBTTagList nbttaglist = new NBTTagList();

        for (int i = 0; i < this.furnaceItemStacks.length; ++i)
        {
            if (this.furnaceItemStacks[i] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                this.furnaceItemStacks[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }

        par1NBTTagCompound.setTag("Items", nbttaglist);

        if (this.isInvNameLocalized())
        {
            par1NBTTagCompound.setString("CustomName", this.field_94130_e);
        }
    }

    /**
     * Returns the maximum stack size for a inventory slot. Seems to always be 64, possibly will be extended. *Isn't
     * this more of a set than a get?*
     */
    public int getInventoryStackLimit()
    {
        return 64;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns an integer between 0 and the passed value representing how close the current item is to being completely
     * cooked
     */
    public int getCookProgressScaled(int par1)
    {
        return this.furnaceCookTime * par1 / 600;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns an integer between 0 and the passed value representing how much burn time is left on the current fuel
     * item, where 0 means that the item is exhausted and the passed value means that the item is fresh
     */
    public int getBurnTimeRemainingScaled(int par1)
    {
        if (this.currentItemBurnTime == 0)
        {
            this.currentItemBurnTime = 600;
        }

        return this.furnaceBurnTime * par1 / this.currentItemBurnTime;
    }

    /**
     * Returns true if the furnace is currently burning
     */
    public boolean isBurning()
    {
        return this.furnaceBurnTime > 0;
    }

    /**
     * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
     * ticks and creates a new spawn inside its implementation.
     */
    public void updateEntity()
    {
        boolean flag = this.furnaceBurnTime > 0;
        boolean flag1 = false;

        if (this.furnaceBurnTime > 0)
        {
            --this.furnaceBurnTime;
        }

        if (!this.worldObj.isRemote)
        {
            if (this.furnaceBurnTime == 0 && this.canSmelt())
            {
                this.currentItemBurnTime = this.furnaceBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);

                if (this.furnaceBurnTime > 0)
                {
                    flag1 = true;

                    if (this.furnaceItemStacks[1] != null)
                    {
                        --this.furnaceItemStacks[1].stackSize;

                        if (this.furnaceItemStacks[1].stackSize == 0)
                        {
                            this.furnaceItemStacks[1] = this.furnaceItemStacks[1].getItem().getContainerItemStack(furnaceItemStacks[1]);
                        }
                    }
                }
            }

            if (this.isBurning() && this.canSmelt())
            {
                ++this.furnaceCookTime;

                if (this.furnaceCookTime == 600)
                {
                    this.furnaceCookTime = 0;
                    this.smeltItem();
                    flag1 = true;
                }
            }
            else
            {
                this.furnaceCookTime = 0;
            }

            if (flag != this.furnaceBurnTime > 0)
            {
                flag1 = true;
                MythrilFusionFurnace.updateFurnaceBlockState(this.furnaceBurnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if (flag1)
        {
            this.onInventoryChanged();
        }
    }

    /**
     * Returns true if the furnace can smelt an item, i.e. has a source item, destination stack isn't full, etc.
     */    
    private boolean canSmelt()
    {
        if(this.furnaceItemStacks[0] != null && this.furnaceItemStacks[3] != null && this.furnaceItemStacks[4] != null)
        {
        	ItemStack itemstack = FusionRecipes.smelting().getSmeltingResult(this.furnaceItemStacks[0], this.furnaceItemStacks[3], this.furnaceItemStacks[4]);
       		if (itemstack == null) return false;
       		if(FusionRecipes.smelting().isStackBigEnough() == false) return false;
    		if (this.furnaceItemStacks[2] == null) return true;
    		if (!this.furnaceItemStacks[2].isItemEqual(itemstack)) return false;
    		int result = furnaceItemStacks[2].stackSize + itemstack.stackSize;
    		return (result <= getInventoryStackLimit() && result <= itemstack.getMaxStackSize());
        }
		return false;
    }
    

    /**
     * Turn one item from the furnace source stack into the appropriate smelted item in the furnace result stack
     */
    public void smeltItem()
    {
        if (this.canSmelt())
        {
        	ItemStack itemstack = FusionRecipes.smelting().getSmeltingResult(this.furnaceItemStacks[0], this.furnaceItemStacks[3], this.furnaceItemStacks[4]);

            if (this.furnaceItemStacks[2] == null)
            {
                this.furnaceItemStacks[2] = itemstack.copy();
            }
            
            else if (this.furnaceItemStacks[2].isItemEqual(itemstack))
            {
                furnaceItemStacks[2].stackSize += itemstack.stackSize;
            }
            
            this.furnaceItemStacks[0].stackSize = this.furnaceItemStacks[0].stackSize - FusionRecipes.smelting().decreaseStackBy(0);            
            this.furnaceItemStacks[3].stackSize = this.furnaceItemStacks[3].stackSize - FusionRecipes.smelting().decreaseStackBy(1);           
            this.furnaceItemStacks[4].stackSize = this.furnaceItemStacks[4].stackSize - FusionRecipes.smelting().decreaseStackBy(2);  

            if (furnaceItemStacks[0] != null && this.furnaceItemStacks[0].stackSize <= 0)
            {
                furnaceItemStacks[0] = furnaceItemStacks[0].getItem().getContainerItemStack(furnaceItemStacks[0]);
            }
            
            if (furnaceItemStacks[3] != null && this.furnaceItemStacks[3].stackSize <= 0)
            {
            	furnaceItemStacks[3] = furnaceItemStacks[3].getItem().getContainerItemStack(furnaceItemStacks[3]);
            }
            
            if (furnaceItemStacks[4] != null && this.furnaceItemStacks[4].stackSize <= 0)
            {
            	furnaceItemStacks[4] = furnaceItemStacks[4].getItem().getContainerItemStack(furnaceItemStacks[4]);
            }
        }
    }

    /**
     * Returns the number of ticks that the supplied fuel item will keep the furnace burning, or 0 if the item isn't
     * fuel
     */
    public static int getItemBurnTime(ItemStack par0ItemStack)
    {
        if (par0ItemStack == null)
        {
            return 0;
        }
        else
        {
            int i = par0ItemStack.getItem().itemID;
            Item item = par0ItemStack.getItem();

            if (par0ItemStack.getItem() instanceof ItemBlock && Block.blocksList[i] != null)
            {
                Block block = Block.blocksList[i];

                if (block == Block.woodSingleSlab)
                {
                    return 1125 / 4 * CoreHelper.coreSettings.mythrilFurnaceMultiplier;
                }

                if (block.blockMaterial == Material.wood)
                {
                    return 1125 / 2 * CoreHelper.coreSettings.mythrilFurnaceMultiplier;
                }
                
                if (block == Block.coalBlock)
                {
                    return 30000 * CoreHelper.coreSettings.mythrilFurnaceMultiplier;
                }
            }

            if (item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("WOOD")) return 375 * CoreHelper.coreSettings.mythrilFurnaceMultiplier;
            if (item instanceof ItemSword && ((ItemSword) item).getToolMaterialName().equals("WOOD")) return 375 * CoreHelper.coreSettings.mythrilFurnaceMultiplier;
            if (item instanceof ItemHoe && ((ItemHoe) item).getMaterialName().equals("WOOD")) return 375 * CoreHelper.coreSettings.mythrilFurnaceMultiplier;
            if (i == Item.stick.itemID) return 375 / 2 * CoreHelper.coreSettings.mythrilFurnaceMultiplier;
            if (i == Item.coal.itemID) return 3000 * CoreHelper.coreSettings.mythrilFurnaceMultiplier;
            if (i == Item.bucketLava.itemID) return 37500 * CoreHelper.coreSettings.mythrilFurnaceMultiplier;
            if (i == Block.sapling.blockID) return 375 / 2 * CoreHelper.coreSettings.mythrilFurnaceMultiplier;
            if (i == Item.blazeRod.itemID) return 4500 * CoreHelper.coreSettings.mythrilFurnaceMultiplier;
            return GameRegistry.getFuelValue(par0ItemStack) * 1875 / 1000 * CoreHelper.coreSettings.mythrilFurnaceMultiplier;
        }
    }

    /**
     * Return true if item is a fuel source (getItemBurnTime() > 0).
     */
    public static boolean isItemFuel(ItemStack par0ItemStack)
    {
        return getItemBurnTime(par0ItemStack) > 0;
    }

    /**
     * Do not make give this method the name canInteractWith because it clashes with Container
     */
    public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer)
    {
        return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : par1EntityPlayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
    }

    public void openChest() {}

    public void closeChest() {}

    /**
     * Returns true if automation is allowed to insert the given stack (ignoring stack size) into the given slot.
     */
    public boolean isStackValidForSlot(int par1, ItemStack par2ItemStack)
    {
        return par1 == 2 ? false : (par1 == 1 ? isItemFuel(par2ItemStack) : true );
    }

    /**
     * Returns an array containing the indices of the slots that can be accessed by automation on the given side of this
     * block.
     */
    public int[] getAccessibleSlotsFromSide(int side)
    {
    	if(side == 0) //Bottom
    	{
    		return slots_output;
    	}
    	
    	if(side == 1) //Top
    	{
    		return slots_catalyst;
    	}
    	
    	ForgeDirection blockOrientation = ForgeDirection.getOrientation(worldObj.getBlockMetadata(xCoord, yCoord, zCoord));
    	if(blockOrientation.getRotation(ForgeDirection.UP).equals(ForgeDirection.getOrientation(side))) //Left
    	{
    		return slots_input1;
    	}
    	if(blockOrientation.getRotation(ForgeDirection.DOWN).equals(ForgeDirection.getOrientation(side))) //Right
    	{
    		return slots_input2;
    	}
    	
    	return slots_fuel;
    }

    /**
     * Returns true if automation can insert the given item in the given slot from the given side. Args: Slot, item,
     * side
     */
    public boolean canInsertItem(int par1, ItemStack par2ItemStack, int par3)
    {
        return this.isStackValidForSlot(par1, par2ItemStack);
    }

    /**
     * Returns true if automation can extract the given item in the given slot from the given side. Args: Slot, item,
     * side
     */
    public boolean canExtractItem(int par1, ItemStack par2ItemStack, int par3)
    {
        return par3 != 0 || par1 != 1 || par2ItemStack.itemID == Item.bucketEmpty.itemID;
    }

    /**
     * Returns true if automation is allowed to insert the given stack (ignoring stack size) into the given slot.
     */
	@Override
    public boolean isItemValidForSlot(int slot, ItemStack item)
    {
        switch(slot)
        {
        	case 1: return isItemFuel(item);
        	case 2: return false;
        	default: return true;
        }
    }
}
