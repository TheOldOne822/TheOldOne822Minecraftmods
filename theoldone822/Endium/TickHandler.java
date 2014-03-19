package theoldone822.Endium;

import java.util.EnumSet;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;

public class TickHandler implements ITickHandler {
	private static int speed = 0;

	// effects
	private void onPlayerTick(EntityPlayer player) {
		if (player.getCurrentItemOrArmor(4) != null && player.getCurrentItemOrArmor(3) != null && player.getCurrentItemOrArmor(2) != null
				&& player.getCurrentItemOrArmor(1) != null) {
			ItemStack helmet = player.getCurrentItemOrArmor(4);
			ItemStack chest = player.getCurrentItemOrArmor(3);
			ItemStack legs = player.getCurrentItemOrArmor(2);
			ItemStack boots = player.getCurrentItemOrArmor(1);

			if ((helmet.getItem() == Content.EndiumHelm || (Loader.isModLoaded("simpleoresew") && helmet.getItem() == theoldone822.SimpleOresEW.SimpleOresEW.armor[34][0]))
					&& (chest.getItem() == Content.EndiumChest || (Loader.isModLoaded("simpleoresew") && chest.getItem() == theoldone822.SimpleOresEW.SimpleOresEW.armor[34][1]))
					&& (legs.getItem() == Content.EndiumLegs || (Loader.isModLoaded("simpleoresew") && legs.getItem() == theoldone822.SimpleOresEW.SimpleOresEW.armor[34][2]))
					&& (boots.getItem() == Content.EndiumBoots || (Loader.isModLoaded("simpleoresew") && boots.getItem() == theoldone822.SimpleOresEW.SimpleOresEW.armor[34][3]))) {
				if (speed != 1) {
					speed = 1;
					player.capabilities.setPlayerWalkSpeed(0.12F);
				}
			} else if ((helmet.getItem() == Content.TelosHelm || (Loader.isModLoaded("simpleoresew") && helmet.getItem() == theoldone822.SimpleOresEW.SimpleOresEW.armor[35][0]))
					&& (chest.getItem() == Content.TelosChest || (Loader.isModLoaded("simpleoresew") && chest.getItem() == theoldone822.SimpleOresEW.SimpleOresEW.armor[35][1]))
					&& (legs.getItem() == Content.TelosLegs || (Loader.isModLoaded("simpleoresew") && legs.getItem() == theoldone822.SimpleOresEW.SimpleOresEW.armor[35][2]))
					&& (boots.getItem() == Content.TelosBoots || (Loader.isModLoaded("simpleoresew") && boots.getItem() == theoldone822.SimpleOresEW.SimpleOresEW.armor[35][3]))) {
				if (speed != 2) {
					speed = 2;
					player.capabilities.setPlayerWalkSpeed(0.15F);
				}
			} else if (speed != 0) {
				speed = 0;
				player.capabilities.setPlayerWalkSpeed(0.1F);
			}
		} else if (speed != 0) {
			speed = 0;
			player.capabilities.setPlayerWalkSpeed(0.1F);
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
