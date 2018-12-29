package com.deextinction.deextinction.items;

import com.deextinction.deextinction.client.Deextinction;
import com.deextinction.deextinction.init.DeexItem;
import com.deextinction.deextinction.util.IHasModel;

import net.minecraft.item.Item;

public class ItemFossil extends Item implements IHasModel {
	public ItemFossil (String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Deextinction.modtabfossil);
		
		DeexItem.ITEMS.add(this);
		
	}
	
	@Override
	public  void registerModels()
	{
		Deextinction.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	
	
}
