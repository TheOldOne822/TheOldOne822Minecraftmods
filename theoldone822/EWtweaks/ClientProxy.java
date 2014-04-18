package theoldone822.EWtweaks;

import net.minecraft.client.Minecraft;
import theoldone822.EWtweaks.CommonProxy;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenderInformation() {
        Minecraft mc = Minecraft.getMinecraft();
	}
}
