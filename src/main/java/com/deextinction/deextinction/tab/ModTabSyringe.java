package com.deextinction.deextinction.tab;

import com.deextinction.deextinction.init.DeexItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModTabSyringe  extends CreativeTabs
{
	public ModTabSyringe(String label) { super("modtabsyringe");}
	public ItemStack getTabIconItem() { return new ItemStack(DeexItem.SYRINGEBLOOD);}
}