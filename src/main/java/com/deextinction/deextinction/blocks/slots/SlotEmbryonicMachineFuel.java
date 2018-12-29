package com.deextinction.deextinction.blocks.slots;

import com.deextinction.deextinction.blocks.machine.tileentities.TileEntityEmbryonicMachine;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotEmbryonicMachineFuel extends Slot{
	public SlotEmbryonicMachineFuel(IInventory inventory, int index, int x, int y) 
	{
		super(inventory,  index,  x,  y);
	}
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntityEmbryonicMachine.isItemFuel(stack);
	}
	@Override
	public int getItemStackLimit(ItemStack stack) {
		return super.getItemStackLimit(stack);
	}

}
