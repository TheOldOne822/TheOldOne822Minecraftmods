package theoldone822.NetherrocksFusion;

import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

public class EWAPI
{
        private static final Class ecm = getECM();

        private static Class getECM()
        {
                try
                {
                        return Class.forName("naruto1310.extendedWorkbench.ExtendedCraftingManager");
                }
                catch(ClassNotFoundException e)
                {
                        return null;
                }
        }

        private static void addRecipe(ItemStack stack, Object[] input, boolean shapeless)
        {
                try
                {
                        ecm.getMethod("add" + (shapeless ? "Shapeless" : "") + "Recipe", new Class[] {ItemStack.class, Object[].class}).invoke(null, stack, input);
                }
                catch(Exception e)
                {
                        e.printStackTrace();
                }
        }


        public static boolean getEWInstalled()
        {
                return ecm != null;
        }

        public static void addRecipe(ItemStack stack, Object[] input)
        {
                addRecipe(stack, input, false);
        }

        public static void addShaplessRecipe(ItemStack stack, Object[] input)
        {
                addRecipe(stack, input, true);
        }

        public static List<IRecipe> getRecipeList()
        {
                try
                {
                        return (List<IRecipe>)ecm.getMethod("getRecipeList").invoke(null);
                }
                catch(Exception e)
                {
                        e.printStackTrace();
                        return null;
                }
        }
}
