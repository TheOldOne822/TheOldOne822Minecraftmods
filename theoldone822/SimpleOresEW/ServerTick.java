package theoldone822.SimpleOresEW;

import java.util.EnumSet;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;

public class ServerTick implements ITickHandler {

	// effects
	private void onPlayerTick(EntityPlayer player) {
		if (player.getCurrentItemOrArmor(3) != null && player.getCurrentItemOrArmor(2) != null
				&& player.getCurrentItemOrArmor(1) != null) {
			ItemStack chest = player.getCurrentItemOrArmor(3);
			ItemStack legs = player.getCurrentItemOrArmor(2);
			ItemStack boots = player.getCurrentItemOrArmor(1);

			if (PluginChecks.getSterlingInstalled()
					&& ((chest.getItem() == akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.sterlingSteelChest || chest
							.getItem() == SimpleOresEW.armor[31][1])
							&& (legs.getItem() == akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.sterlingSteelLegs || legs
									.getItem() == SimpleOresEW.armor[31][2]) && (boots.getItem() == akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.sterlingSteelBoots || boots
							.getItem() == SimpleOresEW.armor[31][3]))) {
				player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 40, 0));
			}
		}

		if (player.getCurrentItemOrArmor(4) != null && player.getCurrentItemOrArmor(3) != null
				&& player.getCurrentItemOrArmor(2) != null) {
			ItemStack helmet = player.getCurrentItemOrArmor(4);
			ItemStack chest = player.getCurrentItemOrArmor(3);
			ItemStack legs = player.getCurrentItemOrArmor(2);

			if (PluginChecks.getSterlingInstalled()
					&& ((helmet.getItem() == akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.sterlingSteelHelm || helmet
							.getItem() == SimpleOresEW.armor[31][0])
							&& (chest.getItem() == akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.sterlingSteelChest || chest
									.getItem() == SimpleOresEW.armor[31][1]) && (legs.getItem() == akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.sterlingSteelLegs || legs
							.getItem() == SimpleOresEW.armor[31][2]))) {
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 40, 0));
			}
		}

		if (player.getCurrentItemOrArmor(4) != null && player.getCurrentItemOrArmor(3) != null
				&& player.getCurrentItemOrArmor(2) != null && player.getCurrentItemOrArmor(1) != null) {
			ItemStack helmet = player.getCurrentItemOrArmor(4);
			ItemStack chest = player.getCurrentItemOrArmor(3);
			ItemStack legs = player.getCurrentItemOrArmor(2);
			ItemStack boots = player.getCurrentItemOrArmor(1);


			if (PluginChecks.getSterlingInstalled()
					&& ((helmet.getItem() == akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.blackSilverHelm || helmet
							.getItem() == SimpleOresEW.armor[32][0])
							&& (chest.getItem() == akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.blackSilverChest || chest
									.getItem() == SimpleOresEW.armor[32][1])
							&& (legs.getItem() == akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.blackSilverLegs || legs
									.getItem() == SimpleOresEW.armor[32][2]) && (boots.getItem() == akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore.blackSilverBoots || boots
							.getItem() == SimpleOresEW.armor[32][3]))) {
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 40, 0));
			}
		}
		
	}

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		if (type.equals(EnumSet.of(TickType.PLAYER))) {
			onPlayerTick((EntityPlayer) tickData[0]);
		}
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.PLAYER, TickType.SERVER);
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}
}
