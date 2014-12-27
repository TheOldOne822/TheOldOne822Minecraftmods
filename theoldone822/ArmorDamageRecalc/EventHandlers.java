package theoldone822.ArmorDamageRecalc;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHandlers {

	@SubscribeEvent(priority = EventPriority.LOWEST)
	public void HurtEvent(LivingHurtEvent event) {
        if (!event.source.isUnblockable())
        {
        	float baseDamage = 0;
        	int i = 25 - event.entityLiving.getTotalArmorValue();
            if (i > 0){
            float f1 = event.ammount * (float)i;
            baseDamage = f1 / 25.0F;
            }
            
            //new armer = 2.6*old
            float d = 65 - event.entityLiving.getTotalArmorValue();
            float f2 = event.ammount * (float)d;
            if (f2 < 0)
            	f2 = 0;
            float extraDamage = (f2 / 65F) - baseDamage;
            event.entityLiving.setHealth(event.entityLiving.getHealth() - extraDamage);
        }
	}
}
