package mods.squidsmod.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class SquidsModTab extends CreativeTabs {

	public SquidsModTab(int position, String tabId){
		super(position, tabId);
	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex(){
		return Squidsmod.fengiteOre.blockID;
	}
	public String getTranslatedTabLabel(){
		return "Squids Mod";
	}
}
