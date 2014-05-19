package theoldone822.NetherrocksFusion;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
//import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

public class HandlerEvent {
	@SubscribeEvent
	public void onBurnDamage(LivingAttackEvent event) {
		if (event.entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.entity;

			ItemStack helmet = player.getCurrentArmor(3);
			ItemStack chest = player.getCurrentArmor(2);
			ItemStack legs = player.getCurrentArmor(1);
			ItemStack boots = player.getCurrentArmor(0);

			if (event.entity instanceof EntityPlayer) {
				EntityPlayer eventPlayer = (EntityPlayer) event.entity;

				if (helmet != null && chest != null && legs != null && boots != null) {
					if ((helmet.getItem() == alexndr.SimpleOres.plugins.netherrocks.Content.fyrite_helmet || helmet.getItem() == Content.cinderstoneHelm || helmet.getItem() == Content.dragonbezoarHelm || helmet.getItem() == Content.dragonbezoarChainHelm /*|| (PluginChecks.getTungstenInstalled() && helmet.getItem() ==  akkamaddi.simpletungsten.code.SimpleTungstenCore.valframHelm)*/)
							&& (chest.getItem() == alexndr.SimpleOres.plugins.netherrocks.Content.fyrite_chestplate || chest.getItem() == Content.cinderstoneChest || chest.getItem() == Content.dragonbezoarChest || chest.getItem() == Content.dragonbezoarChainChest /*|| (PluginChecks.getTungstenInstalled() && chest.getItem() == akkamaddi.simpletungsten.code.SimpleTungstenCore.valframChest)*/)
							&& (legs.getItem() == alexndr.SimpleOres.plugins.netherrocks.Content.fyrite_leggings || legs.getItem() == Content.cinderstoneLegs || legs.getItem() == Content.dragonbezoarLegs || legs.getItem() == Content.dragonbezoarChainLegs /*|| (PluginChecks.getTungstenInstalled() && legs.getItem() == akkamaddi.simpletungsten.code.SimpleTungstenCore.valframLegs)*/)
							&& (boots.getItem() == alexndr.SimpleOres.plugins.netherrocks.Content.fyrite_boots || boots.getItem() == Content.cinderstoneBoots || boots.getItem() == Content.dragonbezoarBoots || boots.getItem() == Content.dragonbezoarChainBoots /*|| (PluginChecks.getTungstenInstalled() && boots.getItem() == akkamaddi.simpletungsten.code.SimpleTungstenCore.valframBoots)*/)) {
						if (event.source.equals(DamageSource.lava) || event.source.equals(DamageSource.inFire) || event.source.equals(DamageSource.onFire)) {
							event.setCanceled(true);
		    	        	player.extinguish();
						}
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onWitherDamage(LivingAttackEvent event) {
		if (event.entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.entity;

			ItemStack helmet = player.getCurrentArmor(3);
			ItemStack chest = player.getCurrentArmor(2);
			ItemStack legs = player.getCurrentArmor(1);
			ItemStack boots = player.getCurrentArmor(0);
			if (event.entity instanceof EntityPlayer) {
				EntityPlayer eventPlayer = (EntityPlayer) event.entity;

				if (helmet != null && chest != null && legs != null && boots != null) {
					if ((helmet.getItem() == Content.dragonbezoarHelm /*|| (PluginChecks.getCthonInstalled() && helmet.getItem() == akkamaddi.cthon.core.SimpleCthonCore.cthonHelm)*/)
							&& (chest.getItem() == Content.dragonbezoarChest /*|| (PluginChecks.getCthonInstalled() && chest.getItem() == akkamaddi.cthon.core.SimpleCthonCore.cthonChest)*/)
							&& (legs.getItem() == Content.dragonbezoarLegs /*|| (PluginChecks.getCthonInstalled() && legs.getItem() == akkamaddi.cthon.core.SimpleCthonCore.cthonLegs)*/)
							&& (boots.getItem() == Content.dragonbezoarBoots /*|| (PluginChecks.getCthonInstalled() && boots.getItem() == akkamaddi.cthon.core.SimpleCthonCore.cthonBoots)*/)) {
						if (event.source.equals(DamageSource.wither)) {
							event.setCanceled(true);
						}
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onFallDamage(LivingAttackEvent event) {
		if (event.entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.entity;

			ItemStack helmet = player.getCurrentArmor(3);
			ItemStack chest = player.getCurrentArmor(2);
			ItemStack legs = player.getCurrentArmor(1);
			ItemStack boots = player.getCurrentArmor(0);

			if (event.entity instanceof EntityPlayer) {
				EntityPlayer eventPlayer = (EntityPlayer) event.entity;

				if (helmet != null && chest != null && legs != null && boots != null) {
					if ((helmet.getItem() == alexndr.SimpleOres.plugins.netherrocks.Content.illumenite_helmet || helmet.getItem() == Content.cinderstoneHelm || helmet.getItem() == Content.dragonbezoarHelm || helmet.getItem() == Content.dragonbezoarChainHelm /*|| (PluginChecks.getCobaltInstalled() && helmet.getItem() == akkamaddi.simplecobalt.code.SimpleCobaltCore.blueDriftSteelHelm)*/)
							&& (chest.getItem() == alexndr.SimpleOres.plugins.netherrocks.Content.illumenite_chestplate || chest.getItem() == Content.cinderstoneChest || chest.getItem() == Content.dragonbezoarChest || chest.getItem() == Content.dragonbezoarChainChest /*|| (PluginChecks.getCobaltInstalled() && chest.getItem() == akkamaddi.simplecobalt.code.SimpleCobaltCore.blueDriftSteelChest)*/)
							&& (legs.getItem() == alexndr.SimpleOres.plugins.netherrocks.Content.illumenite_leggings || legs.getItem() == Content.cinderstoneLegs || legs.getItem() == Content.dragonbezoarLegs || legs.getItem() == Content.dragonbezoarChainLegs /*|| (PluginChecks.getCobaltInstalled() && legs.getItem() == akkamaddi.simplecobalt.code.SimpleCobaltCore.blueDriftSteelLegs)*/)
							&& (boots.getItem() == alexndr.SimpleOres.plugins.netherrocks.Content.illumenite_boots || boots.getItem() == Content.cinderstoneBoots || boots.getItem() == Content.dragonbezoarBoots || boots.getItem() == Content.dragonbezoarChainBoots /*|| (PluginChecks.getCobaltInstalled() && boots.getItem() == akkamaddi.simplecobalt.code.SimpleCobaltCore.blueDriftSteelBoots)*/)) {
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

			ItemStack helmet = player.getCurrentArmor(3);
			ItemStack chest = player.getCurrentArmor(2);
			ItemStack legs = player.getCurrentArmor(1);
			ItemStack boots = player.getCurrentArmor(0);
			if (event.entity instanceof EntityPlayer) {
				EntityPlayer eventPlayer = (EntityPlayer) event.entity;

				if (helmet != null && chest != null && legs != null && boots != null) {
					if ((helmet.getItem() == Content.pyralisHelm || helmet.getItem() == Content.pyralisChainHelm)
							&& (chest.getItem() == Content.pyralisChest || chest.getItem() == Content.pyralisChainChest)
							&& (legs.getItem() == Content.pyralisLegs || legs.getItem() == Content.pyralisChainLegs)
							&& (boots.getItem() == Content.pyralisBoots || boots.getItem() == Content.pyralisChainBoots)) {
						int r = generator.nextInt(100);
						if ((r <= Settings.pyralischainArmorResistance) || (r <= Settings.pyralisArmorResistance && helmet.getItem() == Content.pyralisHelm && chest.getItem() == Content.pyralisChest && legs.getItem() == Content.pyralisLegs && boots.getItem() == Content.pyralisBoots)) {
							if (event.source.equals(DamageSource.wither) || event.source.equals(DamageSource.lava) || event.source.equals(DamageSource.inFire)
									|| event.source.equals(DamageSource.onFire) || event.source.equals(DamageSource.fall)) {
								event.setCanceled(true);
			    	        	player.extinguish();
							}
						}
					}
				}
			}
		}
	}
}
