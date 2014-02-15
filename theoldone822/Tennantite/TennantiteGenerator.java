package theoldone822.Tennantite;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class TennantiteGenerator implements IWorldGenerator {
    /**
    * Generates the ores in the world. Depending on which 'world' the player is in (ie. Nether or Surface), different methods are called.
    * These two methods are generateSurface and generateNether, which are below.
    */

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
                         IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        if (world.provider.dimensionId == 0)
        {
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
        }
        else if (Tennantite.dimensionIDsArray.length >= 1)
        {
            for (int i = 0; i < Tennantite.dimensionIDsArray.length; i++)
            {
                if (world.provider.dimensionId == Tennantite.dimensionIDsArray[i])
                {
                    generateHigher(world, random, chunkX * 16, chunkZ * 16, Tennantite.dimensionIDsArray[i]);
                }
            }
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
            new WorldGenMinable(Tennantite.oreTennantite.blockID, Tennantite.tennantiteVeinSize).generate(world, random, Xcoord, Ycoord + Tennantite.tennantiteMinSpawnHeight , Zcoord);
        }
    }

    /**
     * Generates the main surface ores in dimensions other than the vanilla ones. Based on code by AleXndrTheGr8st
     * This is all configurable through the settings file, and is classified as "Advanced".
     *
     * Each different dimension can have different spawn rates, with support for up to ~30000 dimensions (I think).
     */

    private void generateHigher(World world, Random random, int blockX, int blockZ, int dimensionID)
    {
        if (Tennantite.enableHigherDimensionGen)
        {
            for (int i = 0; i < Tennantite.dimensionIDsArray.length; i++)
            {
                int tennantiteRate = Tennantite.config.get("Higher Dimension ID: " + dimensionID, "Tennantite Spawn Rate", 6).getInt();

                for (int x = 0; x < tennantiteRate; x++)
                {
                    int maxHeight = Tennantite.config.get("Higher Dimension ID: " + dimensionID, "Tennantite Maximum Spawn Height", 32).getInt();
                    int minHeight = Tennantite.config.get("Higher Dimension ID: " + dimensionID, "Tennantite Minimum Spawn Height", 0).getInt();
                    int veinSize = Tennantite.config.get("Higher Dimension ID: " + dimensionID, "Tennantite Vein Size", 6).getInt();
                    int Xcoord = blockX + random.nextInt(16);
                    int Ycoord = random.nextInt(maxHeight - minHeight);
                    int Zcoord = blockZ + random.nextInt(16);
                    new WorldGenMinable(Tennantite.oreTennantite.blockID, veinSize).generate(world, random, Xcoord, Ycoord + minHeight, Zcoord);
                }
            }
        }
    }
}
