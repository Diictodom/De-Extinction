package com.deextinction.deextinction.init;

import java.util.ArrayList;
import java.util.List;

import com.deextinction.deextinction.items.ItemBase;
import com.deextinction.deextinction.items.ItemCustomFood;

import net.minecraft.item.Item;

public class DeexItem {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	
	public static final Item CENOZOIC_FOSSIL_CLEAN = new ItemBase("cenozoic_fossil_clean");
	public static final Item CENOZOIC_FOSSIL_DIRTY = new ItemBase("cenozoic_fossil_dirty");
	public static final Item MESOZOIC_FOSSIL_CLEAN = new ItemBase("mesozoic_fossil_clean");
	public static final Item MESOZOIC_FOSSIL_DIRTY = new ItemBase("mesozoic_fossil_dirty");
	public static final Item PALEOZOIC_FOSSIL_CLEAN = new ItemBase("paleozoic_fossil_clean");
	public static final Item PALEOZOIC_FOSSIL_DIRTY = new ItemBase("paleozoic_fossil_dirty");
	public static final Item KELENKEN_FEATHER = new ItemBase("kelenken_feather");
	public static final Item BRUSH = new ItemBase("brush");
	public static final Item CHISEL = new ItemBase("chisel");
	public static final Item SYRINGE = new ItemBase("syringe");
	public static final Item SYRINGEBLOOD = new ItemBase("syringeblood");
	public static final Item VIAL = new ItemBase("vial");
	public static final Item VIALBLOOD = new ItemBase("vialblood");
	public static final Item VIALBLOODDEFECTED = new ItemBase("vialblooddefected");
	public static final Item VIALCENTRIFUGE = new ItemBase("vialcentrifuge");
	public static final Item VIALFOSSIL = new ItemBase("vialfossil");
	public static final Item DIAMOND_SHARD = new ItemBase("diamond_shard");
	public static final Item ELECTRONIC = new ItemBase("electronic");
	public static final Item GRINDINGSTONE = new ItemBase("grindingstone");
	public static final Item GEAR = new ItemBase("gear");




	//Foods
	public static final Item VILLAGER_MEAT_RAW = new ItemCustomFood("villager_meat_raw", 2, true);
	public static final Item VILLAGER_MEAT_COOKED = new ItemCustomFood("villager_meat_cooked", 5, true);
	public static final Item KELENKEN_MEAT_RAW = new ItemCustomFood("kelenken_meat_raw", 2, true); 
	public static final Item KELENKEN_MEAT_COOKED = new ItemCustomFood("kelenken_meat_cooked", 5, true);






}
