package theoldone822.Endium;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import alexndr.api.content.items.SimpleArmor;

public class SimpleArmorPlus extends SimpleArmor {

	private static int speed = 0;

	public SimpleArmorPlus(ArmorMaterial armormaterial, int renderer,
			int slotnumber) {
		super(armormaterial, renderer, slotnumber);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player,
			ItemStack itemStack) {
		ItemStack chest = null, legs = null, boots = null, helm = null;

		// search armor list for the different pieces.
		for (int i = 0; i < 4; i++) {
			if (player.getCurrentArmor(i) == null) {
				continue;
			}
			ItemArmor armorPiece = (ItemArmor) player.getCurrentArmor(i)
					.getItem();
			if (armorPiece.armorType == 0) {
				helm = player.getCurrentArmor(i);
			} else if (armorPiece.armorType == 1) {
				chest = player.getCurrentArmor(i);
			} else if (armorPiece.armorType == 2) {
				legs = player.getCurrentArmor(i);
			} else if (armorPiece.armorType == 3) {
				boots = player.getCurrentArmor(i);
			}
		} // end-for

		if (helm != null && boots != null && legs != null && chest != null) {

			if ((helm.getItem() == Content.EndiumHelm)
					&& (chest.getItem() == Content.EndiumChest)
					&& (legs.getItem() == Content.EndiumLegs)
					&& (boots.getItem() == Content.EndiumBoots)) {
                player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 40, 1));
/*				if (speed != 1) {
					speed = 1;
					player.capabilities.setPlayerWalkSpeed(0.2F);
				}
*/			} else if (helm.getItem() == Content.TelosHelm
					&& chest.getItem() == Content.TelosChest
					&& legs.getItem() == Content.TelosLegs
					&& boots.getItem() == Content.TelosBoots) {
    player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 40, 2));
/*				if (speed != 2) {
					speed = 2;
					player.capabilities.setPlayerWalkSpeed(0.35F);

				}
			} else if (speed != 0) {
				speed = 0;
				player.capabilities.setPlayerWalkSpeed(0.1F);
			}
*/		} //else if (speed != 0) {
//			speed = 0;
//			player.capabilities.setPlayerWalkSpeed(0.1F);
		}
	} // end onArmorTick

}
