package theoldone822.ArmorDamageRecalc;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import theoldone822.ArmorDamageRecalc.API.ExtendedHandler;
import theoldone822.ArmorDamageRecalc.API.IExtendedArmor;
import travellersgear.api.TravellersGearAPI;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHandlers {

	@SubscribeEvent(priority = EventPriority.LOWEST)
	public void HurtEvent(LivingHurtEvent event) {
		if (!event.source.isUnblockable()) {
			event.source.setDamageBypassesArmor();

			float i = (float) ArmorDamageRecalc.maxArmor - ExtendedHandler.getExtendedArmorValue(event.entityLiving);
			float f1 = event.ammount * i;
			if (event.entityLiving instanceof EntityPlayer) {
				((EntityPlayer) event.entityLiving).inventory.damageArmor(event.ammount);
				if (Loader.isModLoaded("TravellersGear")) {
					ItemStack[] titemstack = TravellersGearAPI.getExtendedInventory((EntityPlayer) event.entityLiving);
					int j = titemstack.length - 1;
					for (int k = 0; k < j; ++k) {
						ItemStack itemstack = titemstack[k];
						if (itemstack != null) {
							if (itemstack.getItem() instanceof IExtendedArmor) {
								//TODO make it damage damageable extra armor slots TravellersGear does not make that easy
								
							}
						}
					}
				}
			}
			event.ammount = f1 / (float) ArmorDamageRecalc.maxArmor;
		}

		/*
		 * if (!event.source.isUnblockable() && ArmorDamageRecalc.reduction) {
		 * if (event.entityLiving.getTotalArmorValue() > 20){
		 * event.source.setDamageBypassesArmor(); float RecalcDamage =
		 * event.ammount * 5F / 25.0F; float d = ArmorDamageRecalc.maxArmor -
		 * event.entityLiving.getTotalArmorValue();
		 * 
		 * if (event.entityLiving instanceof EntityPlayer) ((EntityPlayer)
		 * event.entityLiving).inventory.damageArmor(event.ammount);
		 * 
		 * event.ammount = RecalcDamage * d / (ArmorDamageRecalc.maxArmor - 20);
		 * } }
		 */ }
}
