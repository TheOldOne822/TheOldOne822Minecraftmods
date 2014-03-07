package theoldone822.Tennantite;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

import alexndr.SimpleOres.api.helpers.WorldGenHelper;

public class TennantiteGenerator implements IWorldGenerator {
    /**
    * Generates the ores in the world. Depending on which 'world' the player is in (ie. Nether or Surface), different methods are called.
    * These two methods are generateSurface and generateNether, which are below.
    */

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
                         IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
        }
    }


    /**
     * Sets the details for how the blocks should spawn on the surface world.
     *
     * Configurable options are spawn rate, spawn height, vein size, and the block which spawns.
     * Lowest and highest spawn heights can be set.
     *
     *
     * WorldGenMinable determines which block the ores generate in.
     *
     * WorldGenMinable will generate in stone, ie. for surface ores.
     */
    private void generateSurface(World world, Random random, int blockX, int blockZ)
    {
        for (int x = 0; x < Tennantite.tennantiteSpawnRate; x++)
        {
            int Xcoord = blockX + random.nextInt(16);
            int Ycoord = random.nextInt(Tennantite.tennantiteSpawnHeight - Tennantite.tennantiteMinSpawnHeight);
            int Zcoord = blockZ + random.nextInt(16);
            new WorldGenHelper(Tennantite.oreTennantite.blockID, Tennantite.tennantiteVeinSize, Block.stone).generate(world, random, Xcoord, Ycoord + Tennantite.tennantiteMinSpawnHeight, Zcoord);
        }
    }
}