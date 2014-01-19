package theoldone822.SimpleOresEW;

import theoldone822.SimpleOresEW.SimpleOresEW;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

public class HandlerEvent {
	@ForgeSubscribe
	public void onBurnDamage(LivingAttackEvent event) {
		if (event.entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.entity;

			ItemStack helmet = player.getCurrentItemOrArmor(4);
			ItemStack chest = player.getCurrentItemOrArmor(3);
			ItemStack legs = player.getCurrentItemOrArmor(2);
			ItemStack boots = player.getCurrentItemOrArmor(1);

			if (event.entity instanceof EntityPlayer) {
				EntityPlayer eventPlayer = (EntityPlayer) event.entity;

				if (helmet != null && chest != null && legs != null && boots != null) {
					if (PluginChecks.getNetherInstalled()) {
						if ((helmet.getItem() == Netherrocks.core.Armor.fyriteHelm || helmet.getItem() == SimpleOresEW.extendedfyriteHelm)
								&& (chest.getItem() == Netherrocks.core.Armor.fyriteChest || chest.getItem() == SimpleOresEW.extendedfyriteChest)
								&& (legs.getItem() == Netherrocks.core.Armor.fyriteLegs || legs.getItem() == SimpleOresEW.extendedfyriteLegs)
								&& (boots.getItem() == Netherrocks.core.Armor.fyriteBoots || boots.getItem() == SimpleOresEW.extendedfyriteBoots)) {
							if (event.source.equals(DamageSource.lava) || event.source.equals(DamageSource.inFire) || event.source.equals(DamageSource.onFire)) {
								event.setCanceled(true);
							}
						}
					}
				}
			}
		}
	}

	@ForgeSubscribe
	public void onFallDamage(LivingAttackEvent event) {
		if (event.entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.entity;

			ItemStack helmet = player.getCurrentItemOrArmor(4);
			ItemStack chest = player.getCurrentItemOrArmor(3);
			ItemStack legs = player.getCurrentItemOrArmor(2);
			ItemStack boots = player.getCurrentItemOrArmor(1);
			if (event.entity instanceof EntityPlayer) {
				EntityPlayer eventPlayer = (EntityPlayer) event.entity;

				if (helmet != null && chest != null && legs != null && boots != null) {
					if (PluginChecks.getNetherInstalled()) {
						if ((helmet.getItem() == Netherrocks.core.Armor.illumeniteHelm || helmet.getItem() == SimpleOresEW.extendedillumeniteHelm)
								&& (chest.getItem() == Netherrocks.core.Armor.illumeniteChest || chest.getItem() == SimpleOresEW.extendedillumeniteChest)
								&& (legs.getItem() == Netherrocks.core.Armor.illumeniteLegs || legs.getItem() == SimpleOresEW.extendedillumeniteLegs)
								&& (boots.getItem() == Netherrocks.core.Armor.illumeniteBoots || boots.getItem() == SimpleOresEW.extendedillumeniteBoots)) {
							if (event.source.equals(DamageSource.fall)) {
								event.setCanceled(true);
							}
						}
					}
				}
			}
		}
	}
}
