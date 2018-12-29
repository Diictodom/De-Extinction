package com.deextinction.deextinction.tab;

import com.deextinction.deextinction.init.DeexItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModTabData  extends CreativeTabs
{
	public ModTabData(String label) { super("modtabdata");}
	public ItemStack getTabIconItem() { return new ItemStack(DeexItem.DATA_EMPTY);}
}