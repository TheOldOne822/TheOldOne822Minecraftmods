package theoldone822.NetherrocksFusion;

import java.util.Random;

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
					if ((helmet.getItem() == Content.cinderstoneHelm || helmet.getItem() == Content.dragonbezoarHelm || helmet.getItem() == Content.extendedcinderstoneHelm || helmet.getItem() == Content.extendeddragonbezoarHelm)
							&& (chest.getItem() == Content.cinderstoneChest || chest.getItem() == Content.dragonbezoarChest || chest.getItem() == Content.extendedcinderstoneChest || chest.getItem() == Content.extendeddragonbezoarChest)
							&& (legs.getItem() == Content.cinderstoneLegs || legs.getItem() == Content.dragonbezoarLegs || legs.getItem() == Content.extendedcinderstoneLegs || legs.getItem() == Content.extendeddragonbezoarLegs)
							&& (boots.getItem() == Content.cinderstoneBoots || boots.getItem() == Content.dragonbezoarBoots || boots.getItem() == Content.extendedcinderstoneBoots || boots.getItem() == Content.extendeddragonbezoarBoots)) {
						if (event.source.equals(DamageSource.lava) || event.source.equals(DamageSource.inFire) || event.source.equals(DamageSource.onFire)
								|| event.source.equals(DamageSource.fall)) {
							event.setCanceled(true);
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
					if ((helmet.getItem() == Content.dragonbezoarHelm || helmet.getItem() == Content.extendeddragonbezoarHelm)
							&& (chest.getItem() == Content.dragonbezoarChest || chest.getItem() == Content.extendeddragonbezoarChest)
							&& (legs.getItem() == Content.dragonbezoarLegs || legs.getItem() == Content.extendeddragonbezoarLegs)
							&& (boots.getItem() == Content.dragonbezoarBoots || boots.getItem() == Content.extendeddragonbezoarBoots)) {
						if (event.source.equals(DamageSource.wither)) {
							event.setCanceled(true);
						}
					}
				}
			}
		}
	}

	Random generator = new Random();

	public void onFallDamage1(LivingAttackEvent event) {
		if (event.entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.entity;

			ItemStack helmet = player.getCurrentItemOrArmor(4);
			ItemStack chest = player.getCurrentItemOrArmor(3);
			ItemStack legs = player.getCurrentItemOrArmor(2);
			ItemStack boots = player.getCurrentItemOrArmor(1);
			if (event.entity instanceof EntityPlayer) {
				EntityPlayer eventPlayer = (EntityPlayer) event.entity;

				if (helmet != null && chest != null && legs != null && boots != null) {
					if ((helmet.getItem() == Content.pyralisHelm || helmet.getItem() == Content.extendedpyralisHelm)
							&& (chest.getItem() == Content.pyralisChest || chest.getItem() == Content.extendedpyralisChest)
							&& (legs.getItem() == Content.pyralisLegs || legs.getItem() == Content.extendedpyralisLegs)
							&& (boots.getItem() == Content.pyralisBoots || boots.getItem() == Content.extendedpyralisBoots)) {
						int r = generator.nextInt(100);
						if (r <= Settings.pyralisArmorResistance) {
							if (event.source.equals(DamageSource.wither) || event.source.equals(DamageSource.lava) || event.source.equals(DamageSource.inFire)
									|| event.source.equals(DamageSource.onFire) || event.source.equals(DamageSource.fall)) {
								event.setCanceled(true);
							}
						}
					}
				}
			}
		}
	}
}
