package theoldone822.Endium;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;

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
	    	        	event.setCanceled(true);
	    	        	player.extinguish();
	                	player.capabilities.setPlayerWalkSpeed(0.1F);
	        	}
	        }
		}
	}
	
	@ForgeSubscribe
	public void onFallDamage(LivingAttackEvent event)
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
					if(event.source.equals(DamageSource.fall))
					{
						if(player.fallDistance < Settings.TelosArmorMinFallHeight)
						{
							event.setCanceled(true);
						}
					}
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
