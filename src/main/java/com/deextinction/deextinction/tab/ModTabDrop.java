package com.deextinction.deextinction.tab;

import com.deextinction.deextinction.init.DeexItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModTabDrop  extends CreativeTabs
{
	public ModTabDrop(String label) { super("modtabdrop");}
	public ItemStack getTabIconItem() { return new ItemStack(DeexItem.KELENKEN_FEATHER);}
}