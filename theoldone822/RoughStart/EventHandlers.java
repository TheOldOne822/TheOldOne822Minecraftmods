package theoldone822.RoughStart;

import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EventHandlers {


	@SubscribeEvent
	 public void onBlockBreak(BreakEvent event){
		Random rand = new Random();
		World w = event.world;
		
		if (RoughStart.noTreePunching){
		if (event.block == Blocks.log || event.block == Blocks.log2){
			if(event.getPlayer() != null){
				if(event.getPlayer().getCurrentEquippedItem() != null){
					ItemStack tool = new ItemStack(event.getPlayer().getCurrentEquippedItem().getItem());
					int level = -1;
					level = event.getPlayer().getCurrentEquippedItem().getItem().getHarvestLevel(event.getPlayer().getCurrentEquippedItem(), "axe");
					if(level == -1){
						event.setCanceled(true);
					}
					
				} else {event.setCanceled(true);}
			}
		}
		}
		if (RoughStart.naturalSticks){
		if (event.block == Blocks.leaves || event.block == Blocks.leaves2){
			if(rand.nextInt(100) <= 10){
				ItemStack stick = new ItemStack(Items.stick);
				EntityItem entityitem = new EntityItem(w, event.x, event.y, event.z, stick);
				w.spawnEntityInWorld(entityitem);
			}
		} else if (event.block == Blocks.deadbush){
			if(rand.nextInt(5) < 3){
				ItemStack stick = new ItemStack(Items.stick);
				EntityItem entityitem = new EntityItem(w, event.x, event.y, event.z, stick);
				w.spawnEntityInWorld(entityitem);
			} else {
				ItemStack stick = new ItemStack(Items.stick, 2);
				EntityItem entityitem = new EntityItem(w, event.x, event.y, event.z, stick);
				w.spawnEntityInWorld(entityitem);
			}
		}}
	}
	
	@SubscribeEvent
	public void DropEvent(LivingDropsEvent event){
		if (RoughStart.noWoolDrop){
		if (event.entity instanceof EntitySheep){
			event.setCanceled(true);
		}}
	}
	
	@SubscribeEvent
	public void DeathEvent(LivingDeathEvent event){
		Random rand = new Random();
		World w = event.entity.worldObj;
		
		if (event.entity instanceof EntityPig){
			if(rand.nextInt(5) < 2){
				ItemStack leather = new ItemStack(Items.leather);
				EntityItem entityitem = new EntityItem(w, event.entity.posX, event.entity.posY, event.entity.posZ, leather);
				w.spawnEntityInWorld(entityitem);
		}
			}
	}
}
