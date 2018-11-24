package com.deextinction.deextinction.tab;

import com.deextinction.deextinction.init.DeexItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModTabVial  extends CreativeTabs
{
	public ModTabVial(String label) { super("modtabvial");}
	public ItemStack getTabIconItem() { return new ItemStack(DeexItem.VIAL);}
}