package mods.squidsmod.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockFengiteOre extends Block {
	  
	 public BlockFengiteOre(int id, Material mat){
	 	super(id, mat);
	 	this.setCreativeTab(Squidsmod.SquidsModTab);
	 }
	  
	 @Override
	 public void registerIcons(IconRegister reg){
	 	 
	 	this.blockIcon = reg.registerIcon("squidsmod:fengiteore");
	 	 
	 }

	}
