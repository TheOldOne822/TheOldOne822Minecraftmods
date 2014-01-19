package theoldone822.NetherrocksFusion;

import theoldone822.NetherrocksFusion.HandlerTick;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ProxyClient extends ProxyCommon
{   
/**
 * Some very messy code to determine the zooming of the bows when you draw them back. Most of this is copy paste so I won't attempt to explain it. 
 * It is fairly straight forward if you actually look at it though.
 */
public float fovModifierHand = 0F;  
protected float speedOnGround = 0.1F;

@Override
public void onBowUse(ItemStack stack, EntityPlayer player) 
{	    	
	float f = 1.0F;

    if (player.capabilities.isFlying)
    {
        f *= 1.1F;
    }
    
    float speedOnGround = 0.1F;
    int i = player.getItemInUseDuration();
    float f1 = (float)i / 20.0F;

    if (f1 > 1.0F)
    {
        f1 = 1.0F;
    }
    
    else
    {
        f1 *= f1;
    }

    f *= 1.0F - f1 * HandlerTick.zoomAmount;     
    fovModifierHand = fovModifierHand > 0.001F ? fovModifierHand : (Float)ObfuscationReflectionHelper.getPrivateValue(EntityRenderer.class, Minecraft.getMinecraft().entityRenderer, "fovModifierHand", "field_78507_R");
    fovModifierHand += (f - fovModifierHand) * 0.5F;

    if (fovModifierHand > 1.5F)
    {
        fovModifierHand = 1.5F;
    }

    if (fovModifierHand < 0.1F)
    {
        fovModifierHand = 0.1F;
    }
    
    ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, Minecraft.getMinecraft().entityRenderer, fovModifierHand, "fovModifierHand", "field_78507_R");
}

@Override
public void resetSavedFOV() 
{
 this.fovModifierHand = 0F;
}

 @Override
 public void registerClientTickHandler()
 {
	 TickRegistry.registerTickHandler(new HandlerTick(), Side.CLIENT);
 }

	@Override
	public void registerRenderInformation() {
		if (EWAPI.getEWInstalled()) {
			naruto1310.extendedWorkbench.item.RenderExtendedTool render = new naruto1310.extendedWorkbench.item.RenderExtendedTool();
			MinecraftForgeClient.registerItemRenderer(Content.extendedcinderstoneSword.itemID, render);
			MinecraftForgeClient.registerItemRenderer(Content.extendedthrakaPick.itemID, render);
			MinecraftForgeClient.registerItemRenderer(Content.extendedthrakaAxe.itemID, render);
			MinecraftForgeClient.registerItemRenderer(Content.extendedthrakaShovel.itemID, render);
			MinecraftForgeClient.registerItemRenderer(Content.extendedthrakaSword.itemID, render);
			MinecraftForgeClient.registerItemRenderer(Content.extendedthrakaHoe.itemID, render);
			MinecraftForgeClient.registerItemRenderer(Content.extendedpyralisPick.itemID, render);
			MinecraftForgeClient.registerItemRenderer(Content.extendedpyralisAxe.itemID, render);
			MinecraftForgeClient.registerItemRenderer(Content.extendedpyralisShovel.itemID, render);
			MinecraftForgeClient.registerItemRenderer(Content.extendedpyralisSword.itemID, render);
			MinecraftForgeClient.registerItemRenderer(Content.extendedpyralisHoe.itemID, render);
			MinecraftForgeClient.registerItemRenderer(Content.extendeddragonbezoarPick.itemID, render);
			MinecraftForgeClient.registerItemRenderer(Content.extendeddragonbezoarAxe.itemID, render);
			MinecraftForgeClient.registerItemRenderer(Content.extendeddragonbezoarShovel.itemID, render);
			MinecraftForgeClient.registerItemRenderer(Content.extendeddragonbezoarSword.itemID, render);
			MinecraftForgeClient.registerItemRenderer(Content.extendeddragonbezoarHoe.itemID, render);
			}}
}
