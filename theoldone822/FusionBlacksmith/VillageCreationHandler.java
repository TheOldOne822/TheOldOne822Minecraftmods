package theoldone822.FusionBlacksmith;

import java.util.List;
import java.util.Random;

import net.minecraft.world.gen.structure.ComponentVillageStartPiece;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraft.world.gen.structure.StructureVillagePieceWeight;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageCreationHandler;

public class VillageCreationHandler implements IVillageCreationHandler {
	 @Override
	    public StructureVillagePieceWeight getVillagePieceWeight (Random random, int i)
	    {
	        return new StructureVillagePieceWeight(ComponentVillageFusionBlacksmith.class, 9, i + random.nextInt(10) >= 6 ? 1 : 0);
	    }

	    @Override
	    public Class<?> getComponentClass ()
	    {
	        return ComponentVillageFusionBlacksmith.class;
	    }

	    @Override
	    public Object buildComponent (StructureVillagePieceWeight villagePiece, ComponentVillageStartPiece startPiece, List pieces, Random random, int p1, int p2, int p3, int p4, int p5)
	    {
	        return ComponentVillageFusionBlacksmith.buildComponent(startPiece, pieces, random, p1, p2, p3, p4, p5);
	    }
	    }