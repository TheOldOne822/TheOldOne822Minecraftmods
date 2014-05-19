package theoldone822.Endium;

import java.util.EnumSet;

//import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.Loader;
//import cpw.mods.fml.common.TickType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class TickHandler/* implements ITickHandler */{
	private static int speed = 0;

	// effects
	@SubscribeEvent
	private void onPlayerTick(EntityPlayer player) {
		ItemStack helmet = player.getCurrentArmor(3);
		ItemStack chest = player.getCurrentArmor(2);
		ItemStack legs = player.getCurrentArmor(1);
		ItemStack boots = player.getCurrentArmor(0);
		if (helmet != null && chest != null && legs != null
				&& boots != null) {

			if ((helmet.getItem() == Content.EndiumHelm/* || (Loader.isModLoaded("simpleoresew") && helmet.getItem() == theoldone822.SimpleOresEW.SimpleOresEW.armor[34][0])*/)
					&& (chest.getItem() == Content.EndiumChest/* || (Loader.isModLoaded("simpleoresew") && chest.getItem() == theoldone822.SimpleOresEW.SimpleOresEW.armor[34][1])*/)
					&& (legs.getItem() == Content.EndiumLegs/* || (Loader.isModLoaded("simpleoresew") && legs.getItem() == theoldone822.SimpleOresEW.SimpleOresEW.armor[34][2])*/)
					&& (boots.getItem() == Content.EndiumBoots/* || (Loader.isModLoaded("simpleoresew") && boots.getItem() == theoldone822.SimpleOresEW.SimpleOresEW.armor[34][3])*/)) {
				if (speed != 1) {
					speed = 1;
					player.capabilities.setPlayerWalkSpeed(0.12F);
				}
			} else if ((helmet.getItem() == Content.TelosHelm/* || (Loader.isModLoaded("simpleoresew") && helmet.getItem() == theoldone822.SimpleOresEW.SimpleOresEW.armor[35][0])*/)
					&& (chest.getItem() == Content.TelosChest/* || (Loader.isModLoaded("simpleoresew") && chest.getItem() == theoldone822.SimpleOresEW.SimpleOresEW.armor[35][1])*/)
					&& (legs.getItem() == Content.TelosLegs/* || (Loader.isModLoaded("simpleoresew") && legs.getItem() == theoldone822.SimpleOresEW.SimpleOresEW.armor[35][2])*/)
					&& (boots.getItem() == Content.TelosBoots/* || (Loader.isModLoaded("simpleoresew") && boots.getItem() == theoldone822.SimpleOresEW.SimpleOresEW.armor[35][3])*/)) {
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

/*	@Override
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
*/}
