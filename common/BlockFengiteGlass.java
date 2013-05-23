package mods.squidsmod.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockFengiteGlass extends Block {
	  
	 public BlockFengiteGlass(int id, Material mat){
	 	super(id, mat);
	 	this.setCreativeTab(Squidsmod.SquidsModTab);
	 }
	  
	 @Override
	 public void registerIcons(IconRegister reg){
	 	 
	 	this.blockIcon = reg.registerIcon("squidsmod:fengiteglass");
	 	

	 	 
	 }
	 
	 //Transparent
	 public boolean isOpaqueCube(){
		 return false;
	 }
	 public boolean renderAsNormalBlock(){
			return false;
	
}
}
