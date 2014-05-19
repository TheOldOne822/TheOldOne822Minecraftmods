package theoldone822.SimpleDust.grinder;

import java.util.List;
import java.util.Map;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

public class GrinderRecipes
{
    private static final GrinderRecipes smeltingBase = new GrinderRecipes();

    /** The list of smelting results. */
    private static Map<Integer, ItemStack> smeltingList = Maps.newHashMap();
    private static Table<Integer, Integer, ItemStack> metaSmeltingList = HashBasedTable.create();

    /**
     * Add a metadata-sensitive furnace recipe
     * 
     * @param itemID
     *            The Item ID
     * @param metadata
     *            The Item Metadata
     * @param itemstack
     *            The ItemStack for the result
     */
    public static void addGrinding(int itemID, int metadata, ItemStack itemstack)
    {
        metaSmeltingList.put(itemID, metadata, itemstack);
    }

    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
    public static final GrinderRecipes smelting()
    {
        return smeltingBase;
    }

    private GrinderRecipes()
    {
    }

    /**
     * Adds a smelting recipe.
     */
    public void addGrinding(int par1, ItemStack par2ItemStack)
    {
        smeltingList.put(Integer.valueOf(par1), par2ItemStack);
    }

    public Map<Integer, ItemStack> getGrindingList()
    {
        return smeltingList;
    }

    /**
     * Returns the smelting result of an item. Deprecated in favor of a metadata
     * sensitive version
     */
    @Deprecated
    public ItemStack getGrindingResult(int par1)
    {
        return smeltingList.get(Integer.valueOf(par1));
    }

    /**
     * Used to get the resulting ItemStack form a source ItemStack
     * 
     * @param item
     *            The Source ItemStack
     * @return The result ItemStack
     */
    public ItemStack getGrindingResult(ItemStack item)
    {
        if (item == null)
        {
            return null;
        }

        ItemStack ret = metaSmeltingList.get(item.itemID, item.getItemDamage());

        if (ret != null)
        {
            return ret;
        }

        ret = smeltingList.get(Integer.valueOf(item.itemID));
        if (ret != null)
        {
            return ret;
        }

        if (item.itemID == Item.netherQuartz.itemID)
        {
            final List<ItemStack> dust = OreDictionary.getOres("dustNetherQuartz");
            if (dust.size() > 0)
            {
                return dust.get(0);
            }
        }

        for (String name : OreDictionary.getOreNames())
        {
            for (final ItemStack oreItem : OreDictionary.getOres(name))
            {
                if (oreItem.itemID == item.itemID && oreItem.getItemDamage() == item.getItemDamage())
                {
                    String replacement = "";
                    replacement = name.contains("ore") ? "ore" : replacement;
                    replacement = name.contains("ingot") ? "ingot" : replacement;
                    replacement = name.contains("item") ? "item" : replacement;
                    if (name.contains("dust"))
                    {
                        return null;
                    }
                    name = name.replace(replacement, "dust");

                    if (ret != null)
                    {
                        if (replacement.equals("ore"))
                        {
                            ret.stackSize = 2;
                        }
                        return ret;
                    }

                    final List<ItemStack> retList = OreDictionary.getOres(name);
                    if (retList.size() > 0)
                    {
                        ret = retList.get(0).copy();
                        if (replacement.equals("ore"))
                        {
                            ret.stackSize = 2;
                        }
                        return ret;
                    }
                }
                
            }
        }

        return null;
    }
}
