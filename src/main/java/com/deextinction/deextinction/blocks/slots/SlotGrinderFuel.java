package com.deextinction.deextinction.blocks.slots;

import com.deextinction.deextinction.blocks.machine.tileentities.TileEntityGrinder;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotGrinderFuel extends Slot{
	public SlotGrinderFuel(IInventory inventory, int index, int x, int y) 
	{
		super(inventory,  index,  x,  y);
	}
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntityGrinder.isItemFuel(stack);
	}
	@Override
	public int getItemStackLimit(ItemStack stack) {
		return super.getItemStackLimit(stack);
	}

}
