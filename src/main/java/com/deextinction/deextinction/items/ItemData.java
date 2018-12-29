package com.deextinction.deextinction.items;

import com.deextinction.deextinction.client.Deextinction;
import com.deextinction.deextinction.init.DeexItem;
import com.deextinction.deextinction.util.IHasModel;

import net.minecraft.item.Item;

public class ItemData extends Item implements IHasModel {
	public ItemData (String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Deextinction.modtabdata);
		
		DeexItem.ITEMS.add(this);
		
	}
	
	@Override
	public  void registerModels()
	{
		Deextinction.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	
	
}
