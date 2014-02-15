package theoldone822.WootzPignGray.Furnaces;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GrayFurnaceGUI extends GuiContainer {
	private GrayFurnaceTileEntity furnaceInventory;

	private static final ResourceLocation field_110410_t = new ResourceLocation("textures/gui/container/furnace.png");

	public GrayFurnaceGUI(InventoryPlayer par1InventoryPlayer, GrayFurnaceTileEntity par2TileEntityFurnace) {
		super(new GrayFurnaceContainer(par1InventoryPlayer, par2TileEntityFurnace));
		this.furnaceInventory = par2TileEntityFurnace;
	}

	/**
	 * Draw the foreground layer for the GuiContainer (everything in front of the items)
	 */
	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		this.fontRenderer.drawString(StatCollector.translateToLocal("Gray Furnace"),
				this.xSize / 2 - this.fontRenderer.getStringWidth(StatCollector.translateToLocal("Gray Furnace")) / 2, 6, 4210752);
	}

	/**
	 * Draw the background layer for the GuiContainer (everything behind the items)
	 */
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(field_110410_t);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
		int i1;

		if (this.furnaceInventory.isBurning()) {
			i1 = this.furnaceInventory.getBurnTimeRemainingScaled(12);
			this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
		}

		i1 = this.furnaceInventory.getCookProgressScaled(24);
		this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
	}
}
