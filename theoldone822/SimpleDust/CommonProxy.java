package theoldone822.SimpleDust;

import java.io.File;

import theoldone822.SimpleDust.grinder.ContainerGrinder;

public class CommonProxy
{

    public void registerGUIs()
    {
        GuiRegistry.registerGuiServer(ContainerGrinder.class, SimpleDust.instance, "Grinder");
    }

    public void registerTileEntitySpecialRenderer()
    {
    }
    

    public void registerItemHandler(int itemID, String texture)
    {
        // TODO Auto-generated method stub
        
    }
}
