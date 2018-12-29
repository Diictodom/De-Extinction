package com.deextinction.deextinction.items;

import com.deextinction.deextinction.client.Deextinction;
import com.deextinction.deextinction.init.DeexItem;
import com.deextinction.deextinction.util.IHasModel;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemGrindingstone extends ItemPickaxe implements IHasModel {

	public ItemGrindingstone(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Deextinction.modtab);
		
		DeexItem.ITEMS.add(this);
		
		setMaxStackSize(1);
		setMaxDamage(63);
	}
	@Override
	public ItemStack getContainerItem(ItemStack itemstack) 
	{
		ItemStack stack = itemstack.copy();
		stack.setItemDamage(stack.getItemDamage() + 1);
		stack.setCount(1);
		return stack;
	}

	@Override
	public boolean hasContainerItem(ItemStack itemstack) 
	{
		return true;
	}
	
	
	@Override
	public void registerModels() {
		Deextinction.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}