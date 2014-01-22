package theoldone822.SimpleOresEW;

import java.lang.reflect.Method;
import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EntityDamageSource;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class WerewolfHandler {
	private final Class werewolf;
	private Method isHumanForm;

	public WerewolfHandler() throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		werewolf = Class.forName("drzhark.mocreatures.entity.monster.MoCEntityWerewolf");
		isHumanForm = werewolf.getMethod("getIsHumanForm");
	}

	private boolean isWerewolfInWolfForm(EntityLivingBase entityLiving) {
		try {
			return werewolf.isInstance(entityLiving) && !(Boolean) isHumanForm.invoke(entityLiving);
		} catch (Exception e) {
			return false;
		}
	}

	private Random rand = new Random();

	@ForgeSubscribe
	public void onLivingHurt(LivingHurtEvent event) {
		if (!isWerewolfInWolfForm(event.entityLiving))
			return;

		Entity entity;
		if (!(event.source instanceof EntityDamageSource && (entity = ((EntityDamageSource) event.source).getEntity()) instanceof EntityLivingBase))
			return;

		ItemStack stack = ((EntityLivingBase) entity).getHeldItem();
		if (stack == null)
			return;

		if ((PluginChecks.getSilverInstalled() && OnlySilver.code.conf.Config.werewolfEffectiveness.get() && (stack.getItem().itemID == SimpleOresEW.item[0][12].itemID
				|| stack.getItem().itemID == SimpleOresEW.item[1][12].itemID
				|| stack.getItem().itemID == SimpleOresEW.item[2][12].itemID || stack.getItem().itemID == SimpleOresEW.item[3][12].itemID))
				|| (PluginChecks.getArsenicInstalled()
						&& SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace.werewolfEffectiveness && (stack.getItem().itemID == SimpleOresEW.item[2][15].itemID
						|| stack.getItem().itemID == SimpleOresEW.item[0][15].itemID
						|| stack.getItem().itemID == SimpleOresEW.item[1][15].itemID || stack.getItem().itemID == SimpleOresEW.item[3][15].itemID))
				|| (PluginChecks.getGlitterInstalled() && (stack.getItem().itemID == SimpleOresEW.item[0][24].itemID
						|| stack.getItem().itemID == SimpleOresEW.item[1][24].itemID
						|| stack.getItem().itemID == SimpleOresEW.item[2][24].itemID
						|| stack.getItem().itemID == SimpleOresEW.item[3][24].itemID
						|| stack.getItem().itemID == SimpleOresEW.item[0][25].itemID
						|| stack.getItem().itemID == SimpleOresEW.item[1][25].itemID
						|| stack.getItem().itemID == SimpleOresEW.item[2][25].itemID
						|| stack.getItem().itemID == SimpleOresEW.item[3][25].itemID
						|| stack.getItem().itemID == SimpleOresEW.item[0][26].itemID
						|| stack.getItem().itemID == SimpleOresEW.item[1][26].itemID
						|| stack.getItem().itemID == SimpleOresEW.item[2][26].itemID || stack.getItem().itemID == SimpleOresEW.item[3][26].itemID))
				|| (PluginChecks.getSterlingInstalled() && (stack.getItem().itemID == SimpleOresEW.item[0][37].itemID
						|| stack.getItem().itemID == SimpleOresEW.item[1][37].itemID
						|| stack.getItem().itemID == SimpleOresEW.item[2][37].itemID || stack.getItem().itemID == SimpleOresEW.item[3][37].itemID)))
			event.ammount += 5;

	}
}
