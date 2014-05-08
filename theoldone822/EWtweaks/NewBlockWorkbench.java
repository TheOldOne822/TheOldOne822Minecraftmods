package theoldone822.EWtweaks;

import theoldone822.EWtweaks.gui.TweakGuiHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class NewBlockWorkbench extends BlockWorkbench
{
    @SideOnly(Side.CLIENT)
    private IIcon workbenchIconTop;
    @SideOnly(Side.CLIENT)
    private IIcon workbenchIconFront;

    protected NewBlockWorkbench()
    {
        super();
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        if (world.isRemote)
        {
            return true;
        }
        else
        {
            System.out.println("Workbench");
            player.openGui(EWtweaks.instance, TweakGuiHandler.craftingGui, world, x, y, z);
            //player.displayGUIWorkbench(par2, par3, par4);
            return true;
        }
    }
}
