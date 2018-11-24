package com.deextinction.deextinction.tab;

import com.deextinction.deextinction.init.DeexItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModTabFood  extends CreativeTabs
{
	public ModTabFood(String label) { super("modtabfood");}
	public ItemStack getTabIconItem() { return new ItemStack(DeexItem.KELENKEN_MEAT_RAW);}
}