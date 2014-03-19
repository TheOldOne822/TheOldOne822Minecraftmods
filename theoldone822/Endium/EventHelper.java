package theoldone822.Endium;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;

public class EventHelper 
{
	@ForgeSubscribe
	public void onDamage(LivingAttackEvent event)
	{   	
		if(event.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)event.entity;
			
			ItemStack helmet = player.getCurrentItemOrArmor(4);
			ItemStack chest = player.getCurrentItemOrArmor(3);
			ItemStack legs = player.getCurrentItemOrArmor(2);
			ItemStack boots = player.getCurrentItemOrArmor(1);
			
	        if(helmet != null && chest != null && legs != null && boots != null)
	        {
	        	if(helmet.getItem() == Content.SunteleiaHelm && chest.getItem() == Content.SunteleiaChest && legs.getItem() == Content.SunteleiaLegs && boots.getItem() == Content.SunteleiaBoots)
	        	{
					if (!event.source.equals(DamageSource.outOfWorld) && !event.source.equals(DamageSource.starve)) {
	    	        	event.setCanceled(true);
	    	        	player.extinguish();
					}
	        	}
	        }
		}
	}
	
	@ForgeSubscribe
	public void onFallDamage(LivingFallEvent event)
	{  	
		if(event.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)event.entity;
			
			ItemStack helmet = player.getCurrentItemOrArmor(4);
			ItemStack chest = player.getCurrentItemOrArmor(3);
			ItemStack legs = player.getCurrentItemOrArmor(2);
			ItemStack boots = player.getCurrentItemOrArmor(1);
			
	        
			if(helmet != null && chest != null && legs != null && boots != null)
			{
				if(helmet.getItem() == Content.TelosHelm && chest.getItem() == Content.TelosChest && legs.getItem() == Content.TelosLegs && boots.getItem() == Content.TelosBoots)
				{	
							event.distance = event.distance - Settings.TelosArmorMinFallHeight;
				}
			}
		}
	}
	
	@ForgeSubscribe
	public void onPlayerJump(LivingJumpEvent event)
	{
		if(event.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)event.entity;
			
			ItemStack helmet = player.getCurrentItemOrArmor(4);
			ItemStack chest = player.getCurrentItemOrArmor(3);
			ItemStack legs = player.getCurrentItemOrArmor(2);
			ItemStack boots = player.getCurrentItemOrArmor(1);
			
			if(helmet != null && chest != null && legs != null && boots != null)
			{
				if(helmet.getItem() == Content.TelosHelm && chest.getItem() == Content.TelosChest && legs.getItem() == Content.TelosLegs && boots.getItem() == Content.TelosBoots)
				{	
					if(!player.isSneaking())
					{
						player.motionY += Settings.TelosArmorJumpBoostAmount;
					}
				}
			}
		}
	}
	
}
