package mods.squidsmod.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid="Squid_Squidsmod", name="Squidsmod", version="Alpha 1")
@NetworkMod(clientSideRequired=true, serverSideRequired=true)
public class Squidsmod {
@Instance("Squid_Squidsmod")
public static Squidsmod instance;

public static CreativeTabs SquidsModTab = new SquidsModTab(CreativeTabs.getNextID(), "SquidsModTab");

//Tool Material
 public static EnumToolMaterial SQUIDSMOD = EnumHelper.addToolMaterial("SQUIDSMOD",3, 100, 7.0F, 3, 10);
 public static EnumToolMaterial SQUIDSMOD1 = EnumHelper.addToolMaterial("SQUIDSMOD",70, 100, 7.0F, 3, 10);

      //Blocks Register:
public static Block fengiteOre;
public static Block fengiteGlass;


      //Items 
public static Item fengiteIngot;
public static Item fengitePickaxe;
public static Item fengiteSword;
public static Item fengiteSpade;

//Item IDs:

int fengitePickaxeID = 202;
int fengiteSwordID = 203;
int fengiteIngotID = 201;
int fengiteSpadeID = 204;

     //Block IDs:

//Fengite Ore
int fengiteOreID = 200;
int fengiteGlassID = 205;
@Init
public void load(FMLInitializationEvent event){
	fengiteOre = new BlockFengiteOre(fengiteOreID, Material.iron).setUnlocalizedName("tilefengiteore").setHardness(5.0F);
	fengiteIngot = new ItemFengiteIngot(fengiteIngotID).setUnlocalizedName("itemfengiteingot");
	fengitePickaxe = new ItemFengitePickaxe(fengitePickaxeID, SQUIDSMOD).setUnlocalizedName("itemfengitepickaxe");
	fengiteSword = new ItemFengiteSword(fengiteSwordID, SQUIDSMOD1).setUnlocalizedName("itemfengitesword");
	fengiteSpade = new ItemFengiteSpade(fengiteSpadeID, SQUIDSMOD).setUnlocalizedName("itemfengitespade");
	fengiteGlass = new BlockFengiteGlass(fengiteGlassID, Material.glass).setUnlocalizedName("tilefengiteglass").setStepSound(Block.soundGlassFootstep).setHardness(5.0F);
	
	gameRegisters();
 	languageRegisters();
 	craftingRecipes();
 	

 	
 	//WorldGen
 	GameRegistry.registerWorldGenerator(new SquidsModOreGeneration());
 	
//Smelting Recipies:
 	
 	GameRegistry.addSmelting(fengiteOreID, new ItemStack(fengiteIngot, 1), 3F);
 	
 		//Tools Only
 	MinecraftForge.setToolClass(fengitePickaxe, "pickaxe", 3);
 	MinecraftForge.setToolClass(fengiteSword, "sword", 70);
 	MinecraftForge.setToolClass(fengiteSpade, "spade", 3);
 	
}

//Game Registers:

private static void gameRegisters(){
	GameRegistry.registerBlock(fengiteOre, "fengiteore");
	GameRegistry.registerItem(fengiteIngot, "fengiteingot");
	GameRegistry.registerItem(fengitePickaxe, "fengitepickaxe");
	GameRegistry.registerItem(fengiteSword, "fengitesword");
	GameRegistry.registerItem(fengiteSpade, "fengitespade");
	GameRegistry.registerBlock(fengiteGlass, "fengiteglass");
}

//Language Registers:

private static void languageRegisters(){
	LanguageRegistry.addName(fengiteOre, "Fengite Ore");
	LanguageRegistry.addName(fengiteIngot, "Fengite Ingot");
	LanguageRegistry.addName(fengitePickaxe, "Fengite Pickaxe");
	LanguageRegistry.addName(fengiteSword, "Fengite Sword");
	LanguageRegistry.addName(fengiteSpade, "Fengite Spade");
	LanguageRegistry.addName(fengiteGlass, "Fengite Glass");
}

//Crafting Recipes

public void craftingRecipes(){
	GameRegistry.addRecipe(new ItemStack(Squidsmod.fengitePickaxe), new Object[]{
		"III"," G "," T ",
		'G', Item.ingotGold,
		'I', Squidsmod.fengiteIngot,
		'T', Item.stick,
	});
	
		GameRegistry.addRecipe(new ItemStack(Squidsmod.fengiteSword), new Object[]{
			"GIG","NIN","OTO",
			'I', Squidsmod.fengiteIngot,
			'T', Item.stick,
			'G', Item.goldNugget,
			'O', Block.obsidian,
			'N', Item.spiderEye,
		});
		
		GameRegistry.addRecipe(new ItemStack(Squidsmod.fengiteSpade), new Object[]{
			"OIO","GTG"," N ",
			'I', Squidsmod.fengiteIngot,
			'T', Item.stick,
			'N', Item.spiderEye,
			'G', Item.goldNugget,
			'O', Block.obsidian,
		});
		
		GameRegistry.addRecipe(new ItemStack(Squidsmod.fengiteGlass), new Object[]{
			"GIG","I I","GIG",
			'I', Squidsmod.fengiteIngot,
			'G', Block.glass,
		});
		
	}
}
