package mods.squidsmod.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemFengiteIngot extends Item{

	public ItemFengiteIngot(int par1) {
		super(par1);
		setMaxStackSize(64);
		setCreativeTab(Squidsmod.SquidsModTab);	
	}
	 @Override
	 public void registerIcons(IconRegister reg){
	 	 
	 	this.itemIcon = reg.registerIcon("squidsmod:fengiteingot");
	 	 
	 }
}
