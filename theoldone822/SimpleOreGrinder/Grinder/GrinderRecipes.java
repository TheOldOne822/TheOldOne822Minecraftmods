package theoldone822.SimpleOreGrinder.Grinder;

import java.util.List;
import java.util.Map;

import net.minecraft.init.Items;
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
    private static Map<Item, ItemStack> smeltingList = Maps.newHashMap();
    private static Table<Item, Integer, ItemStack> metaSmeltingList = HashBasedTable.create();

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
    public static void addGrinding(Item item, int metadata, ItemStack itemstack)
    {
        metaSmeltingList.put(item, metadata, itemstack);
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
    public void addGrinding(Item par1, ItemStack par2ItemStack)
    {
        smeltingList.put(par1, par2ItemStack);
    }

    public Map<Item, ItemStack> getGrindingList()
    {
        return smeltingList;
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

        ItemStack ret = metaSmeltingList.get(item.getItem(), item.getItemDamage());

        if (ret != null)
        {
            return ret;
        }

        ret = smeltingList.get(item.getItem());
        if (ret != null)
        {
            return ret;
        }

        if (item.getItem() == Items.quartz)
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
                if (oreItem.getItem() == item.getItem() && oreItem.getItemDamage() == item.getItemDamage())
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
