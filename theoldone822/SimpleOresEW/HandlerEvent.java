package theoldone822.SimpleOresEW;

import java.util.Random;

import theoldone822.SimpleOresEW.SimpleOresEW;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

public class HandlerEvent {

	Random generator = new Random();

	@ForgeSubscribe
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

					// Pyralis Reduction
					if (PluginChecks.getNetherFusionInstalled()
							&& ((helmet.getItem() == theoldone822.NetherrocksFusion.Content.pyralisHelm
									|| helmet.getItem() == theoldone822.NetherrocksFusion.Content.pyralisChainHelm || helmet
									.getItem() == SimpleOresEW.extendedpyralisHelm)
									&& (chest.getItem() == theoldone822.NetherrocksFusion.Content.pyralisChest
											|| chest.getItem() == theoldone822.NetherrocksFusion.Content.pyralisChainChest || chest
											.getItem() == SimpleOresEW.extendedpyralisChest)
									&& (legs.getItem() == theoldone822.NetherrocksFusion.Content.pyralisLegs
											|| legs.getItem() == theoldone822.NetherrocksFusion.Content.pyralisChainLegs || legs
											.getItem() == SimpleOresEW.extendedpyralisLegs) && (boots.getItem() == theoldone822.NetherrocksFusion.Content.pyralisBoots
									|| boots.getItem() == theoldone822.NetherrocksFusion.Content.pyralisChainBoots || boots
									.getItem() == SimpleOresEW.extendedpyralisBoots))) {
						if (helmet.getItem() == SimpleOresEW.extendedpyralisHelm
								|| chest.getItem() == SimpleOresEW.extendedpyralisChest
								|| legs.getItem() == SimpleOresEW.extendedpyralisLegs
								|| boots.getItem() == SimpleOresEW.extendedpyralisBoots) {
							int r = generator.nextInt(100);
							if (r <= theoldone822.NetherrocksFusion.Settings.pyralisArmorResistance) {
								if (event.source.equals(DamageSource.wither) || event.source.equals(DamageSource.lava)
										|| event.source.equals(DamageSource.inFire) || event.source.equals(DamageSource.onFire)
										|| event.source.equals(DamageSource.fall)) {
									event.setCanceled(true);
								}
							}
						}
					}

					// Anvil
					if ((PluginChecks.getAlchemyInstalled() && (helmet.getItem() == SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.stannumHelm || helmet
							.getItem() == SimpleOresEW.armor[16][0]))
							&& (PluginChecks.getAlchemyInstalled() && (chest.getItem() == SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.stannumChest || chest
									.getItem() == SimpleOresEW.armor[16][1]))
							&& (PluginChecks.getAlchemyInstalled() && (legs.getItem() == SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.stannumLegs || legs
									.getItem() == SimpleOresEW.armor[16][2]))
							&& (PluginChecks.getAlchemyInstalled() && (boots.getItem() == SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.stannumBoots || boots
									.getItem() == SimpleOresEW.armor[16][3]))) {
						if (event.source.equals(DamageSource.anvil)) {
							event.setCanceled(true);
							// return;
						}
					}

					// Wither
					if ((PluginChecks.getCthonInstalled() && (helmet.getItem() == SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.cthonHelm || helmet
							.getItem() == SimpleOresEW.extendedcthonHelm))
							|| (PluginChecks.getNetherFusionInstalled() && (helmet.getItem() == SimpleOresEW.extendeddragonbezoarHelm
									|| helmet.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarHelm || helmet
									.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainHelm))
							&& (PluginChecks.getCthonInstalled() && (chest.getItem() == SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.cthonChest || chest
									.getItem() == SimpleOresEW.extendedcthonChest))
							|| (PluginChecks.getNetherFusionInstalled() && (chest.getItem() == SimpleOresEW.extendeddragonbezoarChest
									|| chest.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChest || chest
									.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainChest))
							&& (PluginChecks.getCthonInstalled() && (legs.getItem() == SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.cthonLegs || legs
									.getItem() == SimpleOresEW.extendedcthonLegs))
							|| (PluginChecks.getNetherFusionInstalled() && (legs.getItem() == SimpleOresEW.extendeddragonbezoarLegs
									|| legs.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarLegs || legs
									.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainLegs))
							&& (PluginChecks.getCthonInstalled() && (boots.getItem() == SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore.cthonBoots || boots
									.getItem() == SimpleOresEW.extendedcthonBoots))
							|| (PluginChecks.getNetherFusionInstalled() && (boots.getItem() == SimpleOresEW.extendeddragonbezoarBoots
									|| boots.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarBoots || boots
									.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainBoots))) {
						if (event.source.equals(DamageSource.wither)) {
							event.setCanceled(true);
							// return;
						}
					}

					// Fall
					if (((PluginChecks.getNetherInstalled() && (helmet.getItem() == Netherrocks.core.Armor.illumeniteHelm || helmet
							.getItem() == SimpleOresEW.extendedillumeniteHelm))

							|| (PluginChecks.getNetherFusionInstalled() && (helmet.getItem() == SimpleOresEW.extendedcinderstoneHelm
									|| helmet.getItem() == theoldone822.NetherrocksFusion.Content.cinderstoneHelm
									|| helmet.getItem() == SimpleOresEW.extendeddragonbezoarHelm
									|| helmet.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarHelm || helmet
									.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainHelm))

					|| (PluginChecks.getCobaltInstalled() && (helmet.getItem() == SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.blueDriftSteelHelm || helmet
							.getItem() == SimpleOresEW.armor[23][0])))

							&& ((PluginChecks.getNetherInstalled() && (chest.getItem() == Netherrocks.core.Armor.illumeniteChest || chest
									.getItem() == SimpleOresEW.extendedillumeniteChest))

									|| (PluginChecks.getNetherFusionInstalled() && (chest.getItem() == SimpleOresEW.extendedcinderstoneChest
											|| chest.getItem() == theoldone822.NetherrocksFusion.Content.cinderstoneChest
											|| chest.getItem() == SimpleOresEW.extendeddragonbezoarChest
											|| chest.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChest || chest
											.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainChest))

							|| (PluginChecks.getCobaltInstalled() && (chest.getItem() == SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.blueDriftSteelChest || chest
									.getItem() == SimpleOresEW.armor[23][1])))

							&& ((PluginChecks.getNetherInstalled() && (legs.getItem() == Netherrocks.core.Armor.illumeniteLegs || legs
									.getItem() == SimpleOresEW.extendedillumeniteLegs))

									|| (PluginChecks.getNetherFusionInstalled() && (legs.getItem() == SimpleOresEW.extendedcinderstoneLegs
											|| legs.getItem() == theoldone822.NetherrocksFusion.Content.cinderstoneLegs
											|| legs.getItem() == SimpleOresEW.extendeddragonbezoarLegs
											|| legs.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarLegs || legs
											.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainLegs))

							|| (PluginChecks.getCobaltInstalled() && (legs.getItem() == SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.blueDriftSteelLegs || legs
									.getItem() == SimpleOresEW.armor[23][3])))

							&& ((PluginChecks.getNetherInstalled() && (boots.getItem() == Netherrocks.core.Armor.illumeniteBoots || boots
									.getItem() == SimpleOresEW.extendedillumeniteBoots))

									|| (PluginChecks.getNetherFusionInstalled() && (boots.getItem() == SimpleOresEW.extendedcinderstoneBoots
											|| boots.getItem() == theoldone822.NetherrocksFusion.Content.cinderstoneBoots
											|| boots.getItem() == SimpleOresEW.extendeddragonbezoarBoots
											|| boots.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarBoots || boots
											.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainBoots))

							|| (PluginChecks.getCobaltInstalled() && (boots.getItem() == SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore.blueDriftSteelBoots || boots
									.getItem() == SimpleOresEW.armor[23][3])))) {
						if (event.source.equals(DamageSource.fall)) {
							event.setCanceled(true);
						}
					}

					// Fire
					if (((PluginChecks.getNetherInstalled() && (helmet.getItem() == Netherrocks.core.Armor.fyriteHelm || helmet
							.getItem() == SimpleOresEW.extendedfyriteHelm))
							|| (PluginChecks.getNetherFusionInstalled() && (helmet.getItem() == SimpleOresEW.extendedcinderstoneHelm
									|| helmet.getItem() == theoldone822.NetherrocksFusion.Content.cinderstoneHelm
									|| helmet.getItem() == SimpleOresEW.extendeddragonbezoarHelm
									|| helmet.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarHelm || helmet
									.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainHelm)) || (PluginChecks
							.getTungstenInstalled() && (helmet.getItem() == SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.valframHelm || helmet
							.getItem() == SimpleOresEW.armor[28][0])))
							&& ((PluginChecks.getNetherInstalled() && (chest.getItem() == Netherrocks.core.Armor.fyriteChest || chest
									.getItem() == SimpleOresEW.extendedfyriteChest))
									|| (PluginChecks.getNetherFusionInstalled() && (chest.getItem() == SimpleOresEW.extendedcinderstoneChest
											|| chest.getItem() == theoldone822.NetherrocksFusion.Content.cinderstoneChest
											|| chest.getItem() == SimpleOresEW.extendeddragonbezoarChest
											|| chest.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChest || chest
											.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainChest)) || (PluginChecks
									.getTungstenInstalled() && (chest.getItem() == SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.valframChest || helmet
									.getItem() == SimpleOresEW.armor[28][1])))
							&& ((PluginChecks.getNetherInstalled() && (legs.getItem() == Netherrocks.core.Armor.fyriteLegs || legs
									.getItem() == SimpleOresEW.extendedfyriteLegs))
									|| (PluginChecks.getNetherFusionInstalled() && (legs.getItem() == SimpleOresEW.extendedcinderstoneLegs
											|| legs.getItem() == theoldone822.NetherrocksFusion.Content.cinderstoneLegs
											|| legs.getItem() == SimpleOresEW.extendeddragonbezoarLegs
											|| legs.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarLegs || legs
											.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainLegs)) || (PluginChecks
									.getTungstenInstalled() && (legs.getItem() == SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.valframLegs || helmet
									.getItem() == SimpleOresEW.armor[28][2])))
							&& ((PluginChecks.getNetherInstalled() && (boots.getItem() == Netherrocks.core.Armor.fyriteBoots || boots
									.getItem() == SimpleOresEW.extendedfyriteBoots))
									|| (PluginChecks.getNetherFusionInstalled() && (boots.getItem() == SimpleOresEW.extendedcinderstoneBoots
											|| boots.getItem() == theoldone822.NetherrocksFusion.Content.cinderstoneBoots
											|| boots.getItem() == SimpleOresEW.extendeddragonbezoarBoots
											|| boots.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarBoots || boots
											.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainBoots)) || (PluginChecks
									.getTungstenInstalled() && (boots.getItem() == SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.valframBoots || helmet
									.getItem() == SimpleOresEW.armor[28][3])))) {
						if (event.source.equals(DamageSource.lava) || event.source.equals(DamageSource.inFire)
								|| event.source.equals(DamageSource.onFire)) {
							event.setCanceled(true);
						}
					}

					// Anvil+
					if (PluginChecks.getTungstenInstalled()
							&& ((helmet.getItem() == SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.tungstenCarbideHelm || helmet
									.getItem() == SimpleOresEW.armor[27][0])
									&& (chest.getItem() == SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.tungstenCarbideChest || chest
											.getItem() == SimpleOresEW.armor[27][1])
									&& (legs.getItem() == SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.tungstenCarbideLegs || legs
											.getItem() == SimpleOresEW.armor[27][2]) && (boots.getItem() == SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore.tungstenCarbideBoots || boots
									.getItem() == SimpleOresEW.armor[27][3]))) {
						if (event.source.equals(DamageSource.anvil) || event.source.equals(DamageSource.fallingBlock)
								|| event.source.equals(DamageSource.inWall)) {
							event.setCanceled(true);
							// return;
						}
					}

				}
			}
		}
	}
}
