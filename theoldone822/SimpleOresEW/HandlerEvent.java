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
					if ((PluginChecks.getAlchemyInstalled() && (helmet.getItem() == akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.stannumHelm || helmet
							.getItem() == SimpleOresEW.armor[16][0]))
							&& (PluginChecks.getAlchemyInstalled() && (chest.getItem() == akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.stannumChest || chest
									.getItem() == SimpleOresEW.armor[16][1]))
							&& (PluginChecks.getAlchemyInstalled() && (legs.getItem() == akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.stannumLegs || legs
									.getItem() == SimpleOresEW.armor[16][2]))
							&& (PluginChecks.getAlchemyInstalled() && (boots.getItem() == akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore.stannumBoots || boots
									.getItem() == SimpleOresEW.armor[16][3]))) {
						if (event.source.equals(DamageSource.anvil)) {
							event.setCanceled(true);
							// return;
						}
					}

					// Wither
					if ((PluginChecks.getCthonInstalled() && (helmet.getItem() == akkamaddi.cthon.core.SimpleCthonCore.cthonHelm || helmet
							.getItem() == SimpleOresEW.extendedcthonHelm))
							|| (PluginChecks.getNetherFusionInstalled() && (helmet.getItem() == SimpleOresEW.extendeddragonbezoarHelm
									|| helmet.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarHelm || helmet
									.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainHelm))
							&& (PluginChecks.getCthonInstalled() && (chest.getItem() == akkamaddi.cthon.core.SimpleCthonCore.cthonChest || chest
									.getItem() == SimpleOresEW.extendedcthonChest))
							|| (PluginChecks.getNetherFusionInstalled() && (chest.getItem() == SimpleOresEW.extendeddragonbezoarChest
									|| chest.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChest || chest
									.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainChest))
							&& (PluginChecks.getCthonInstalled() && (legs.getItem() == akkamaddi.cthon.core.SimpleCthonCore.cthonLegs || legs
									.getItem() == SimpleOresEW.extendedcthonLegs))
							|| (PluginChecks.getNetherFusionInstalled() && (legs.getItem() == SimpleOresEW.extendeddragonbezoarLegs
									|| legs.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarLegs || legs
									.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainLegs))
							&& (PluginChecks.getCthonInstalled() && (boots.getItem() == akkamaddi.cthon.core.SimpleCthonCore.cthonBoots || boots
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
					if (((PluginChecks.getNetherInstalled() && (helmet.getItem() == alexndr.SimpleOres.plugins.netherrocks.Content.illumeniteHelm || helmet
							.getItem() == SimpleOresEW.extendedillumeniteHelm))

							|| (PluginChecks.getNetherFusionInstalled() && (helmet.getItem() == SimpleOresEW.extendedcinderstoneHelm
									|| helmet.getItem() == theoldone822.NetherrocksFusion.Content.cinderstoneHelm
									|| helmet.getItem() == SimpleOresEW.extendeddragonbezoarHelm
									|| helmet.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarHelm || helmet
									.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainHelm))

					|| (PluginChecks.getCobaltInstalled() && (helmet.getItem() == akkamaddi.simplecobalt.code.SimpleCobaltCore.blueDriftSteelHelm || helmet
							.getItem() == SimpleOresEW.armor[23][0])))

							&& ((PluginChecks.getNetherInstalled() && (chest.getItem() == alexndr.SimpleOres.plugins.netherrocks.Content.illumeniteChest || chest
									.getItem() == SimpleOresEW.extendedillumeniteChest))

									|| (PluginChecks.getNetherFusionInstalled() && (chest.getItem() == SimpleOresEW.extendedcinderstoneChest
											|| chest.getItem() == theoldone822.NetherrocksFusion.Content.cinderstoneChest
											|| chest.getItem() == SimpleOresEW.extendeddragonbezoarChest
											|| chest.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChest || chest
											.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainChest))

							|| (PluginChecks.getCobaltInstalled() && (chest.getItem() == akkamaddi.simplecobalt.code.SimpleCobaltCore.blueDriftSteelChest || chest
									.getItem() == SimpleOresEW.armor[23][1])))

							&& ((PluginChecks.getNetherInstalled() && (legs.getItem() == alexndr.SimpleOres.plugins.netherrocks.Content.illumeniteLegs || legs
									.getItem() == SimpleOresEW.extendedillumeniteLegs))

									|| (PluginChecks.getNetherFusionInstalled() && (legs.getItem() == SimpleOresEW.extendedcinderstoneLegs
											|| legs.getItem() == theoldone822.NetherrocksFusion.Content.cinderstoneLegs
											|| legs.getItem() == SimpleOresEW.extendeddragonbezoarLegs
											|| legs.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarLegs || legs
											.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainLegs))

							|| (PluginChecks.getCobaltInstalled() && (legs.getItem() == akkamaddi.simplecobalt.code.SimpleCobaltCore.blueDriftSteelLegs || legs
									.getItem() == SimpleOresEW.armor[23][3])))

							&& ((PluginChecks.getNetherInstalled() && (boots.getItem() == alexndr.SimpleOres.plugins.netherrocks.Content.illumeniteBoots || boots
									.getItem() == SimpleOresEW.extendedillumeniteBoots))

									|| (PluginChecks.getNetherFusionInstalled() && (boots.getItem() == SimpleOresEW.extendedcinderstoneBoots
											|| boots.getItem() == theoldone822.NetherrocksFusion.Content.cinderstoneBoots
											|| boots.getItem() == SimpleOresEW.extendeddragonbezoarBoots
											|| boots.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarBoots || boots
											.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainBoots))

							|| (PluginChecks.getCobaltInstalled() && (boots.getItem() == akkamaddi.simplecobalt.code.SimpleCobaltCore.blueDriftSteelBoots || boots
									.getItem() == SimpleOresEW.armor[23][3])))) {
						if (event.source.equals(DamageSource.fall)) {
							event.setCanceled(true);
						}
					}

					// Fire
					if (((PluginChecks.getNetherInstalled() && (helmet.getItem() == alexndr.SimpleOres.plugins.netherrocks.Content.fyriteHelm || helmet
							.getItem() == SimpleOresEW.extendedfyriteHelm))
							|| (PluginChecks.getNetherFusionInstalled() && (helmet.getItem() == SimpleOresEW.extendedcinderstoneHelm
									|| helmet.getItem() == theoldone822.NetherrocksFusion.Content.cinderstoneHelm
									|| helmet.getItem() == SimpleOresEW.extendeddragonbezoarHelm
									|| helmet.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarHelm || helmet
									.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainHelm)) || (PluginChecks
							.getTungstenInstalled() && (helmet.getItem() == akkamaddi.simpletungsten.code.SimpleTungstenCore.valframHelm || helmet
							.getItem() == SimpleOresEW.armor[28][0])))
							&& ((PluginChecks.getNetherInstalled() && (chest.getItem() == alexndr.SimpleOres.plugins.netherrocks.Content.fyriteChest || chest
									.getItem() == SimpleOresEW.extendedfyriteChest))
									|| (PluginChecks.getNetherFusionInstalled() && (chest.getItem() == SimpleOresEW.extendedcinderstoneChest
											|| chest.getItem() == theoldone822.NetherrocksFusion.Content.cinderstoneChest
											|| chest.getItem() == SimpleOresEW.extendeddragonbezoarChest
											|| chest.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChest || chest
											.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainChest)) || (PluginChecks
									.getTungstenInstalled() && (chest.getItem() == akkamaddi.simpletungsten.code.SimpleTungstenCore.valframChest || helmet
									.getItem() == SimpleOresEW.armor[28][1])))
							&& ((PluginChecks.getNetherInstalled() && (legs.getItem() == alexndr.SimpleOres.plugins.netherrocks.Content.fyriteLegs || legs
									.getItem() == SimpleOresEW.extendedfyriteLegs))
									|| (PluginChecks.getNetherFusionInstalled() && (legs.getItem() == SimpleOresEW.extendedcinderstoneLegs
											|| legs.getItem() == theoldone822.NetherrocksFusion.Content.cinderstoneLegs
											|| legs.getItem() == SimpleOresEW.extendeddragonbezoarLegs
											|| legs.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarLegs || legs
											.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainLegs)) || (PluginChecks
									.getTungstenInstalled() && (legs.getItem() == akkamaddi.simpletungsten.code.SimpleTungstenCore.valframLegs || helmet
									.getItem() == SimpleOresEW.armor[28][2])))
							&& ((PluginChecks.getNetherInstalled() && (boots.getItem() == alexndr.SimpleOres.plugins.netherrocks.Content.fyriteBoots || boots
									.getItem() == SimpleOresEW.extendedfyriteBoots))
									|| (PluginChecks.getNetherFusionInstalled() && (boots.getItem() == SimpleOresEW.extendedcinderstoneBoots
											|| boots.getItem() == theoldone822.NetherrocksFusion.Content.cinderstoneBoots
											|| boots.getItem() == SimpleOresEW.extendeddragonbezoarBoots
											|| boots.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarBoots || boots
											.getItem() == theoldone822.NetherrocksFusion.Content.dragonbezoarChainBoots)) || (PluginChecks
									.getTungstenInstalled() && (boots.getItem() == akkamaddi.simpletungsten.code.SimpleTungstenCore.valframBoots || helmet
									.getItem() == SimpleOresEW.armor[28][3])))) {
						if (event.source.equals(DamageSource.lava) || event.source.equals(DamageSource.inFire)
								|| event.source.equals(DamageSource.onFire)) {
							event.setCanceled(true);
						}
					}

					// Anvil+
					if (PluginChecks.getTungstenInstalled()
							&& ((helmet.getItem() == akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenCarbideHelm || helmet
									.getItem() == SimpleOresEW.armor[27][0])
									&& (chest.getItem() == akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenCarbideChest || chest
											.getItem() == SimpleOresEW.armor[27][1])
									&& (legs.getItem() == akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenCarbideLegs || legs
											.getItem() == SimpleOresEW.armor[27][2]) && (boots.getItem() == akkamaddi.simpletungsten.code.SimpleTungstenCore.tungstenCarbideBoots || boots
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
