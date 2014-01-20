package theoldone822.NetherrocksFusion;

import java.util.Random;

import Netherrocks.core.Armor;
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
					if ((helmet.getItem() == Armor.fyriteHelm || helmet.getItem() == Content.cinderstoneHelm || helmet.getItem() == Content.dragonbezoarHelm || helmet.getItem() == Content.dragonbezoarChainHelm || (EWAPI.getEWInstalled() && (helmet.getItem() == Content.extendedcinderstoneHelm || helmet.getItem() == Content.extendeddragonbezoarHelm)))
							&& (chest.getItem() == Armor.fyriteChest || chest.getItem() == Content.cinderstoneChest || chest.getItem() == Content.dragonbezoarChest || chest.getItem() == Content.dragonbezoarChainChest || (EWAPI.getEWInstalled() && ( chest.getItem() == Content.extendedcinderstoneChest || chest.getItem() == Content.extendeddragonbezoarChest)))
							&& (legs.getItem() == Armor.fyriteLegs || legs.getItem() == Content.cinderstoneLegs || legs.getItem() == Content.dragonbezoarLegs || legs.getItem() == Content.dragonbezoarChainLegs || (EWAPI.getEWInstalled() && ( legs.getItem() == Content.extendedcinderstoneLegs || legs.getItem() == Content.extendeddragonbezoarLegs)))
							&& (boots.getItem() == Armor.fyriteBoots || boots.getItem() == Content.cinderstoneBoots || boots.getItem() == Content.dragonbezoarBoots || boots.getItem() == Content.dragonbezoarChainBoots || (EWAPI.getEWInstalled() && ( boots.getItem() == Content.extendedcinderstoneBoots || boots.getItem() == Content.extendeddragonbezoarBoots)))) {
						if (event.source.equals(DamageSource.lava) || event.source.equals(DamageSource.inFire) || event.source.equals(DamageSource.onFire)) {
							event.setCanceled(true);
						}
					}
				}
			}
		}
	}

	@ForgeSubscribe
	public void onWitherDamage(LivingAttackEvent event) {
		if (event.entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.entity;

			ItemStack helmet = player.getCurrentItemOrArmor(4);
			ItemStack chest = player.getCurrentItemOrArmor(3);
			ItemStack legs = player.getCurrentItemOrArmor(2);
			ItemStack boots = player.getCurrentItemOrArmor(1);
			if (event.entity instanceof EntityPlayer) {
				EntityPlayer eventPlayer = (EntityPlayer) event.entity;

				if (helmet != null && chest != null && legs != null && boots != null) {
					if ((helmet.getItem() == Content.dragonbezoarHelm || (EWAPI.getEWInstalled() && helmet.getItem() == Content.extendeddragonbezoarHelm))
							&& (chest.getItem() == Content.dragonbezoarChest || (EWAPI.getEWInstalled() && chest.getItem() == Content.extendeddragonbezoarChest))
							&& (legs.getItem() == Content.dragonbezoarLegs || (EWAPI.getEWInstalled() && legs.getItem() == Content.extendeddragonbezoarLegs))
							&& (boots.getItem() == Content.dragonbezoarBoots || (EWAPI.getEWInstalled() && boots.getItem() == Content.extendeddragonbezoarBoots))) {
						if (event.source.equals(DamageSource.wither)) {
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
					if ((helmet.getItem() == Armor.illumeniteHelm || helmet.getItem() == Content.cinderstoneHelm || helmet.getItem() == Content.dragonbezoarHelm || helmet.getItem() == Content.dragonbezoarChainHelm || (EWAPI.getEWInstalled() && (helmet.getItem() == Content.extendedcinderstoneHelm || helmet.getItem() == Content.extendeddragonbezoarHelm)))
							&& (chest.getItem() == Armor.illumeniteChest || chest.getItem() == Content.cinderstoneChest || chest.getItem() == Content.dragonbezoarChest || chest.getItem() == Content.dragonbezoarChainChest || (EWAPI.getEWInstalled() && ( chest.getItem() == Content.extendedcinderstoneChest || chest.getItem() == Content.extendeddragonbezoarChest)))
							&& (legs.getItem() == Armor.illumeniteLegs || legs.getItem() == Content.cinderstoneLegs || legs.getItem() == Content.dragonbezoarLegs || legs.getItem() == Content.dragonbezoarChainLegs || (EWAPI.getEWInstalled() && ( legs.getItem() == Content.extendedcinderstoneLegs || legs.getItem() == Content.extendeddragonbezoarLegs)))
							&& (boots.getItem() == Armor.illumeniteBoots || boots.getItem() == Content.cinderstoneBoots || boots.getItem() == Content.dragonbezoarBoots || boots.getItem() == Content.dragonbezoarChainBoots || (EWAPI.getEWInstalled() && ( boots.getItem() == Content.extendedcinderstoneBoots || boots.getItem() == Content.extendeddragonbezoarBoots)))) {
						if (event.source.equals(DamageSource.fall)) {
							event.setCanceled(true);
						}
					}
				}
			}
		}
	}

	Random generator = new Random();

	public void onMostDamage(LivingAttackEvent event) {
		if (event.entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.entity;

			ItemStack helmet = player.getCurrentItemOrArmor(4);
			ItemStack chest = player.getCurrentItemOrArmor(3);
			ItemStack legs = player.getCurrentItemOrArmor(2);
			ItemStack boots = player.getCurrentItemOrArmor(1);
			if (event.entity instanceof EntityPlayer) {
				EntityPlayer eventPlayer = (EntityPlayer) event.entity;

				if (helmet != null && chest != null && legs != null && boots != null) {
					if ((helmet.getItem() == Content.pyralisHelm || helmet.getItem() == Content.pyralisChainHelm || (EWAPI.getEWInstalled() && helmet.getItem() == Content.extendedpyralisHelm))
							&& (chest.getItem() == Content.pyralisChest || chest.getItem() == Content.pyralisChainChest || (EWAPI.getEWInstalled() && chest.getItem() == Content.extendedpyralisChest))
							&& (legs.getItem() == Content.pyralisLegs || legs.getItem() == Content.pyralisChainLegs || (EWAPI.getEWInstalled() && legs.getItem() == Content.extendedpyralisLegs))
							&& (boots.getItem() == Content.pyralisBoots || boots.getItem() == Content.pyralisChainBoots || (EWAPI.getEWInstalled() && boots.getItem() == Content.extendedpyralisBoots))) {
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
