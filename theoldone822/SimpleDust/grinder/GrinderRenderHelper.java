package theoldone822.SimpleDust.grinder;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

import java.util.HashMap;

import theoldone822.SimpleDust.SimpleDust;

public class GrinderRenderHelper implements ISimpleBlockRenderingHandler
{
    private static HashMap<Integer, TileEntityGrinder> tileEntity;

    @Override
    public int getRenderId()
    {
        return SimpleDust.grinder.getRenderType();
    }

    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer)
    {

        if(tileEntity == null)
        {
            tileEntity = new HashMap<Integer, TileEntityGrinder>();
        }

        TileEntityGrinder grinder = tileEntity.get(metadata);

        if(grinder == null)
        {
            grinder = new TileEntityGrinder();
            grinder.setType(metadata);
            tileEntity.put(metadata, grinder);
        }

        TileEntityRenderer.instance.renderTileEntityAt(grinder, 0D, -0.1D, 0D, 0F);
    }

    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer)
    {
        return false;
    }

    @Override
    public boolean shouldRender3DInInventory()
    {
        return true;
    }
}
