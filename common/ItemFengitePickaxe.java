package mods.squidsmod.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemFengitePickaxe extends ItemPickaxe{

	public ItemFengitePickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		setMaxStackSize(1);
	     setCreativeTab(Squidsmod.SquidsModTab);
	
	}

	@Override
	public void registerIcons(IconRegister iconRegister){
		itemIcon = iconRegister.registerIcon("squidsmod:fengitepickaxe");
	}
	
}

