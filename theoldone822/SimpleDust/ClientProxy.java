package theoldone822.SimpleDust;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.MinecraftForgeClient;
import theoldone822.SimpleDust.grinder.ContainerGrinder;
import theoldone822.SimpleDust.grinder.GrinderRenderHelper;
import theoldone822.SimpleDust.grinder.GuiGrinder;
import theoldone822.SimpleDust.grinder.TileEntityGrinder;
import theoldone822.SimpleDust.grinder.TileEntityGrinderRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerGUIs()
    {
    		GuiRegistry.registerGuiClient(GuiGrinder.class, ContainerGrinder.class, SimpleDust.instance, "Grinder");
    	
    }

    @Override
    public void registerTileEntitySpecialRenderer()
    {
	        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrinder.class, new TileEntityGrinderRenderer());
	        RenderingRegistry.registerBlockHandler(new GrinderRenderHelper());

    }
    
    @Override
    public void registerItemHandler(int itemID, String texture)
    {
    }
}
