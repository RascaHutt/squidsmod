package mods.squidsmod.common;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class SquidsModOreGeneration implements IWorldGenerator{

	//Chunk Generation - Tells Minecraft What To Generate
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case 1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case -1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	
	private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
		
	}

	private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
	    /**
	     * Fengite Spawn
	     */
		// i < how-common. 15 = coal 
		for(int i = 0; i < 15; i++){
			//Leave as 16
			int xCoord = chunkX + random.nextInt(16);
			//Number = Layer and below where it spawns
			int yCoord = random.nextInt(18);
			//Leave as 16
			int zCoord = chunkZ + random.nextInt(16);
			// Number = Maximum size of vein
			(new WorldGenMinable(Squidsmod.fengiteOre.blockID, 8)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

	private void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

	
}
