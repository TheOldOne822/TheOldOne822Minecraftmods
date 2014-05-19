package theoldone822.SimpleDust.grinder;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class TileEntityGrinderRenderer extends TileEntitySpecialRenderer
{
    /** The normal small chest model. */
    private final ModelGrinder grinderModel = new ModelGrinder();

    @Override
    public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8)
    {
        renderTileEntityGrinderAt((TileEntityGrinder) par1TileEntity, par2, par4, par6, par8);
    }

    /**
     * Renders the TileEntity for the chest at a position.
     */
    public void renderTileEntityGrinderAt(TileEntityGrinder par1TileEntityGrinder, double par2, double par4, double par6, float par8)
    {
        int var9;
        float offset = 0;

        if (par1TileEntityGrinder.worldObj == null)
        {
            var9 = 5;
            offset = 0.1f;
        }
        else
        {
            var9 = par1TileEntityGrinder.direction;
        }

        //grinderModel.spin(par1TileEntityGrinder.getGrinderAngles());

        String type = "";
        if (par1TileEntityGrinder.getType() == 0)
        {
            type = "Stone";
        }
        else if (par1TileEntityGrinder.getType() == 1)
        {
            type = "Copper";
        }
        else if (par1TileEntityGrinder.getType() == 2)
        {
            type = "Iron";
        }
        else if (par1TileEntityGrinder.getType() == 3)
        {
            type = "Mythril";
        }
        else if (par1TileEntityGrinder.getType() == 4)
        {
            type = "Adamantium";
        }

        ResourceLocation texture = new ResourceLocation("SimpleOresDust:textures/blocks/ModelGrinder" + type + ".png");

        if (par1TileEntityGrinder.isBurning())
        {
        	texture = new ResourceLocation("SimpleOresDust:textures/blocks/ModelGrinder" + type + "Burning.png");
        }

        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);

        GL11.glPushMatrix();
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glTranslatef((float) par2, (float) par4, (float) par6 + 1.0F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        short var11 = 0;
        if (var9 == 2)
        {
            var11 = 180;
            GL11.glTranslatef(1F, -1.0F, 1F);
        }

        if (var9 == 3)
        {
            var11 = 0;
            GL11.glTranslatef(0F, -1.0F, 0.0F);
        }

        if (var9 == 4)
        {
            var11 = 90;
            GL11.glTranslatef(0F, -1.0F, 1F);
        }

        if (var9 == 5)
        {
            var11 = -90;
            GL11.glTranslatef(1F, -1.0F, 0.0F);
        }

        GL11.glRotatef(var11, 0.0F, 1.0F, 0.0F);
        grinderModel.renderAll();
        GL11.glPopMatrix();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }
}
