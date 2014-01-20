package theoldone822.SimpleOresEW.client;

import java.util.EnumSet;

import theoldone822.SimpleOresEW.PluginChecks;
import theoldone822.SimpleOresEW.SimpleOresEW;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class HandlerTick implements ITickHandler {
	public static float zoomAmount;

	/**
	 * Checks each tick to see if the player is using (right click) the
	 * specified items. If returns true (player IS using the item), it calls a
	 * certain method. If it returns false, it calls a seperate method.
	 * 
	 * In the case of the bows, if it returns true, it calls the zoom method
	 * (onBowUse) in ProxyCommon (which is overridden by ProxyClient). If it
	 * returns false, it calls the reset zoom method (resetSavedFOV) in
	 * ProxyCommon (which is also overridden by ProxyClient).
	 */
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		if (PluginChecks.getFusionInstalled()) {
			float zoomAmount = new Float(SimpleOres.plugins.fusion.Settings.thyriumBowZoomModifier / new Float(100));
		}
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;

		if (type.equals(EnumSet.of(TickType.RENDER))) {
			if (player != null && player.isUsingItem()) {
				int itemID = player.getItemInUse().itemID;
				if (PluginChecks.getSimpleInstalled()) {
					if (itemID == SimpleOresEW.extendedmythrilBow.itemID || itemID == SimpleOresEW.extendedonyxBow.itemID) {
						SimpleOresEW.proxy.onBowUse(player.getItemInUse(), player);
						this.zoomAmount = 0.25F;
					}
				}
				if (PluginChecks.getFusionInstalled()) {
					if (itemID == SimpleOresEW.extendedsinisiteBow.itemID || itemID == SimpleOresEW.extendedthyriumBow.itemID) {
						SimpleOresEW.proxy.onBowUse(player.getItemInUse(), player);
						if (itemID == SimpleOresEW.extendedthyriumBow.itemID) {
							this.zoomAmount = (float) zoomAmount;
						} else {
							this.zoomAmount = 0.25F;
						}
					}
				}		if (PluginChecks.getSilverInstalled() && itemID == SimpleOresEW.extendedsilverBow.itemID){
					SimpleOresEW.proxy.onBowUse(player.getItemInUse(), player);
					this.zoomAmount = 0.25F;
				}

			}

			else {
				SimpleOresEW.proxy.resetSavedFOV();
			}
		}
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {

	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.RENDER);
	}

	@Override
	public String getLabel() {
		return null;
	}
}