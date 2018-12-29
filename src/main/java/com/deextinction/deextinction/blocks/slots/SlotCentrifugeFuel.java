package com.deextinction.deextinction.blocks.slots;

import com.deextinction.deextinction.blocks.machine.tileentities.TileEntityCentrifuge;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotCentrifugeFuel extends Slot{
	public SlotCentrifugeFuel(IInventory inventory, int index, int x, int y) 
	{
		super(inventory,  index,  x,  y);
	}
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntityCentrifuge.isItemFuel(stack);
	}
	@Override
	public int getItemStackLimit(ItemStack stack) {
		return super.getItemStackLimit(stack);
	}

}
