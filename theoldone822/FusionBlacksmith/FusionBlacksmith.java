package theoldone822.FusionBlacksmith;

import net.minecraft.world.gen.structure.MapGenStructureIO;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.VillagerRegistry;

@Mod(modid = "fusionblacksmith", name = "Fusion Blacksmith", version = "1.0", dependencies = "required-after:simpleores; required-after:simpleoresfusion")
public class FusionBlacksmith {

	@Instance("FusionBlacksmith")
	public static FusionBlacksmith instance = new FusionBlacksmith();

	@EventHandler
    public void load(FMLInitializationEvent event)
	{
		MapGenStructureIO.func_143031_a(ComponentVillageFusionBlacksmith.class, "FusionBlacksmith"); 

		VillagerRegistry.instance().registerVillageCreationHandler(new VillageCreationHandler()); 
	}
}
