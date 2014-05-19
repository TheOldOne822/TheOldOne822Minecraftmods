package theoldone822.SimpleDust.grinder;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

public class GuiGrinder extends GuiContainer
{
    private final TileEntityGrinder furnaceInventory;
    private final String[] names =
    { "Stone", "Copper", "Iron", "Mythril", "Adamantium" };
    private final int type;
    private final ResourceLocation background = new ResourceLocation("SimpleOresDust:textures/guis/grinder.png");

    public GuiGrinder(InventoryPlayer par1InventoryPlayer, TileEntity par2TileEntityGrinder)
    {
        super(new ContainerGrinder(par1InventoryPlayer, par2TileEntityGrinder));
        furnaceInventory = (TileEntityGrinder) par2TileEntityGrinder;
        type = furnaceInventory.getType();
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the
     * items)
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.getTextureManager().bindTexture(background);
        final int var5 = (width - xSize) / 2;
        final int var6 = (height - ySize) / 2;
        drawTexturedModalRect(var5, var6, 0, 0, xSize, ySize);
        int var7;

        if (furnaceInventory.isBurning())
        {
            var7 = furnaceInventory.getBurnTimeRemainingScaled(12);
            drawTexturedModalRect(var5 + 56, var6 + 36 + 12 - var7, 176, 12 - var7, 14, var7 + 2);
        }

        var7 = furnaceInventory.getCookProgressScaled(24);
        drawTexturedModalRect(var5 + 79, var6 + 34, 176, 14, var7 + 1, 16);
    }

    /**
     * Draw the foreground layer for the GuiContainer (everythin in front of the
     * items)
     */
    @Override
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        fontRenderer.drawString(StatCollector.translateToLocal(names[type] + " Grinder"), xSize / 2 - (names[type] + " Grinder").length() * 5 / 2, 6, 4210752);
        fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 4210752);
    }
}
