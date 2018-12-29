package com.deextinction.deextinction.tab;

import com.deextinction.deextinction.init.DeexItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTabFossil  extends CreativeTabs
{
	public ModTabFossil(String label) { super("modtabfossil");}
	public ItemStack getTabIconItem() { return new ItemStack(DeexItem.PALEOZOIC_FOSSIL_CLEAN);}
}