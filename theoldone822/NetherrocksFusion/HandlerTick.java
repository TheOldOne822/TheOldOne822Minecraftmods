package theoldone822.NetherrocksFusion;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.RenderTickEvent;

public class HandlerTick 
{

    private static float zoomAmount;
	private static float fovModifierHand = 0F;
	
    //TODO check obfuscated field name (last check: 1.7.2)
	private static final String fovModifierHandName = "fovModifierHand"; 
	private static final String fovModifierHandNameObf = "field_78507_R";	//EntityRenderer.fovModifierHand 

	@SubscribeEvent
	public void tick(RenderTickEvent event)
    {
            EntityPlayer player = Minecraft.getMinecraft().thePlayer;
            
            if(event.type == TickEvent.Type.RENDER)
            {
                    if(player != null && player.getCurrentEquippedItem() != null && player.isUsingItem())
                    {
                            ItemStack item = player.getItemInUse();
                            if(item.getItem() == Content.dragonbezoarBow)
                            {
                            	float f = 1.0F;

                                if(player.capabilities.isFlying)
                                    f *= 1.1F;
                                
                                int i = player.getItemInUseDuration();
                                float f1 = i / 20F;

                                if(f1 > 1.0F)
                                    f1 = 1.0F;
                                else
                                    f1 *= f1;

                                f *= 1.0F - f1 * HandlerTick.zoomAmount;
                                HandlerTick.fovModifierHand = HandlerTick.fovModifierHand > 0.001F ? HandlerTick.fovModifierHand : (Float)ObfuscationReflectionHelper.getPrivateValue(EntityRenderer.class, Minecraft.getMinecraft().entityRenderer, fovModifierHandName, fovModifierHandNameObf);
                                HandlerTick.fovModifierHand += (f - HandlerTick.fovModifierHand) * 0.5F;

                                if(HandlerTick.fovModifierHand > 1.5F)
                                    HandlerTick.fovModifierHand = 1.5F;
                                if(HandlerTick.fovModifierHand < 0.1F)
                                	HandlerTick.fovModifierHand = 0.1F;
                                
                                ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, Minecraft.getMinecraft().entityRenderer, HandlerTick.fovModifierHand, fovModifierHandName, fovModifierHandNameObf);
                                HandlerTick.zoomAmount = new Float(Settings.dragonbezoarBowZoomModifier / new Float(100));
                            }
                    }
                    else
                    {
                    	HandlerTick.fovModifierHand = 0F;
                    }
            }
    }
}
