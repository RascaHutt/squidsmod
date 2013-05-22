package mods.squidsmod.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="Squid_Squidsmod", name="Squidsmod", version="Alpha 1")
@NetworkMod(clientSideRequired=true, serverSideRequired=true)
public class Squidsmod {
@Instance("Squid_Squidsmod")
public static Squidsmod instance;

public static CreativeTabs SquidsModTab = new SquidsModTab(CreativeTabs.getNextID(), "SquidsModTab");

      //Blocks Register:
public static Block fengiteOre;

      //Items 
public static Item fengiteIngot;

//Item IDs:

   //Fengite Ingot
int fengiteIngotID = 201;

     //Block IDs:

//Fengite Ore
int fengiteOreID = 200;
@Init
public void load(FMLInitializationEvent event){
	fengiteOre = new BlockFengiteOre(fengiteOreID, Material.iron).setUnlocalizedName("tilefengiteore");
	fengiteIngot = new ItemFengiteIngot(fengiteIngotID).setUnlocalizedName("itemfengiteingot");
	gameRegisters();
 	languageRegisters();
 	
//Smelting Recipies:
 	
 	GameRegistry.addSmelting(fengiteOreID, new ItemStack(fengiteIngot, 1), 3F);
 	
}

//Game Registers:

private static void gameRegisters(){
	GameRegistry.registerBlock(fengiteOre, "fengiteore");
	GameRegistry.registerItem(fengiteIngot, "fengiteingot");
}

//Language Registers:

private static void languageRegisters(){
	LanguageRegistry.addName(fengiteOre, "Fengite Ore");
	LanguageRegistry.addName(fengiteIngot, "Fengite Ingot");
}
}
