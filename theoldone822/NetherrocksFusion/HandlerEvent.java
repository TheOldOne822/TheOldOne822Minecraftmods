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
					if ((helmet.getItem() == Armor.fyriteHelm || helmet.getItem() == Content.cinderstoneHelm || helmet.getItem() == Content.dragonbezoarHelm || helmet.getItem() == Content.dragonbezoarChainHelm || (PluginChecks.getTungstenInstalled() && helmet.getItem() ==  SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.valframHelm))
							&& (chest.getItem() == Armor.fyriteChest || chest.getItem() == Content.cinderstoneChest || chest.getItem() == Content.dragonbezoarChest || chest.getItem() == Content.dragonbezoarChainChest || (PluginChecks.getTungstenInstalled() && chest.getItem() == SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.valframChest))
							&& (legs.getItem() == Armor.fyriteLegs || legs.getItem() == Content.cinderstoneLegs || legs.getItem() == Content.dragonbezoarLegs || legs.getItem() == Content.dragonbezoarChainLegs || (PluginChecks.getTungstenInstalled() && legs.getItem() == SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.valframLegs))
							&& (boots.getItem() == Armor.fyriteBoots || boots.getItem() == Content.cinderstoneBoots || boots.getItem() == Content.dragonbezoarBoots || boots.getItem() == Content.dragonbezoarChainBoots || (PluginChecks.getTungstenInstalled() && boots.getItem() == SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.valframBoots))) {
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
					if ((helmet.getItem() == Content.dragonbezoarHelm || (PluginChecks.getCthonInstalled() && helmet.getItem() == SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.cthonHelm))
							&& (chest.getItem() == Content.dragonbezoarChest || (PluginChecks.getCthonInstalled() && chest.getItem() == SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.cthonChest))
							&& (legs.getItem() == Content.dragonbezoarLegs || (PluginChecks.getCthonInstalled() && legs.getItem() == SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.cthonLegs))
							&& (boots.getItem() == Content.dragonbezoarBoots || (PluginChecks.getCthonInstalled() && boots.getItem() == SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.cthonBoots))) {
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
					if ((helmet.getItem() == Armor.illumeniteHelm || helmet.getItem() == Content.cinderstoneHelm || helmet.getItem() == Content.dragonbezoarHelm || helmet.getItem() == Content.dragonbezoarChainHelm || (PluginChecks.getCobaltInstalled() && helmet.getItem() == SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.blueDriftSteelHelm))
							&& (chest.getItem() == Armor.illumeniteChest || chest.getItem() == Content.cinderstoneChest || chest.getItem() == Content.dragonbezoarChest || chest.getItem() == Content.dragonbezoarChainChest || (PluginChecks.getCobaltInstalled() && chest.getItem() == SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.blueDriftSteelChest))
							&& (legs.getItem() == Armor.illumeniteLegs || legs.getItem() == Content.cinderstoneLegs || legs.getItem() == Content.dragonbezoarLegs || legs.getItem() == Content.dragonbezoarChainLegs || (PluginChecks.getCobaltInstalled() && legs.getItem() == SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.blueDriftSteelLegs))
							&& (boots.getItem() == Armor.illumeniteBoots || boots.getItem() == Content.cinderstoneBoots || boots.getItem() == Content.dragonbezoarBoots || boots.getItem() == Content.dragonbezoarChainBoots || (PluginChecks.getCobaltInstalled() && boots.getItem() == SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.blueDriftSteelBoots))) {
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
					if ((helmet.getItem() == Content.pyralisHelm || helmet.getItem() == Content.pyralisChainHelm)
							&& (chest.getItem() == Content.pyralisChest || chest.getItem() == Content.pyralisChainChest)
							&& (legs.getItem() == Content.pyralisLegs || legs.getItem() == Content.pyralisChainLegs)
							&& (boots.getItem() == Content.pyralisBoots || boots.getItem() == Content.pyralisChainBoots)) {
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
