package theoldone822.ArmorDamageRecalc;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.CombatRules;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandlers {

	@SubscribeEvent(priority = EventPriority.LOWEST)
	public void HurtEvent(LivingHurtEvent event) {
		if (!event.source.isUnblockable() && event.entityLiving instanceof EntityPlayer) {

			float armF = (float) event.entityLiving.getEntityAttribute(SharedMonsterAttributes.ARMOR).getAttributeValue();
			if (armF > 0) {
				if (armF < 1) {
					event.ammount = CombatRules.func_188402_a(event.ammount, armF);
				} else {
					if (armF != (float) event.entityLiving.getTotalArmorValue()) {
						float vaDam = CombatRules.func_188402_a(event.ammount, (float) event.entityLiving.getTotalArmorValue());
						float waDam = CombatRules.func_188402_a(event.ammount, armF);

						if ((float) event.entityLiving.getTotalArmorValue() - event.ammount * 0.5F < (float) event.entityLiving.getTotalArmorValue() * 0.2F) {
							event.ammount = (1 - (float) event.entityLiving.getTotalArmorValue() * 0.2F) * waDam;
						} else if ((float) event.entityLiving.getTotalArmorValue() - event.ammount * 0.5f > 20.0F) {
							event.ammount = (1 - 20.0F / 25) * waDam;
						} else {
							event.ammount = (1 - ((float) event.entityLiving.getTotalArmorValue() - event.ammount * 0.5F) / 25) * waDam;
						}
					}
				}
			}
		}
	}
}
