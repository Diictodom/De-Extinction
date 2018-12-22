package com.deextinction.deextinction.init;

import java.util.ArrayList;
import java.util.List;

import com.deextinction.deextinction.items.ItemBase;
import com.deextinction.deextinction.items.ItemCustomFood;
import com.deextinction.deextinction.items.ItemSyringe;
import com.deextinction.deextinction.items.ItemVial;

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
	
	public static final Item DIAMOND_SHARD = new ItemBase("diamond_shard");
	public static final Item ELECTRONIC = new ItemBase("electronic");
	public static final Item GRINDINGSTONE = new ItemBase("grindingstone");
	public static final Item GEAR = new ItemBase("gear");

	//Syringes
	public static final Item SYRINGE = new ItemSyringe("syringe");
	public static final Item SYRINGEBLOOD = new ItemSyringe("syringeblood");
	//List of Syringes////////////////////////////////////////////
	public static final Item SYRINGEBLOOD_KELENKEN = new ItemSyringe("syringeblood_kelenken");
	public static final Item SYRINGEBLOOD_SMILODON = new ItemSyringe("syringeblood_smilodon");
	public static final Item SYRINGEBLOOD_SEBECUS = new ItemSyringe("syringeblood_sebecus");
	public static final Item SYRINGEBLOOD_GLYPTODON = new ItemSyringe("syringeblood_glyptodon");
	public static final Item SYRINGEBLOOD_ARCTHO = new ItemSyringe("syringeblood_arctho");
	public static final Item SYRINGEBLOOD_CANIS = new ItemSyringe("syringeblood_canis");
	public static final Item SYRINGEBLOOD_CUVIER = new ItemSyringe("syringeblood_cuvier");
	public static final Item SYRINGEBLOOD_MACRA = new ItemSyringe("syringeblood_macra");
	public static final Item SYRINGEBLOOD_THERIO = new ItemSyringe("syringeblood_therio");
	public static final Item SYRINGEBLOOD_TOXODON = new ItemSyringe("syringeblood_toxodon");
	
	
	
	
	//Vials
	public static final Item VIAL = new ItemVial("vial");
	public static final Item VIALBLOOD = new ItemVial("vialblood");
	public static final Item VIALBLOODDEFECTED = new ItemVial("vialblooddefected");
	public static final Item VIALCENTRIFUGE = new ItemVial("vialcentrifuge");
	public static final Item VIALFOSSIL = new ItemVial("vialfossil");
	//List of Vials///////////////////////////////////////////////
	public static final Item VIALBLOOD_KELENKEN = new ItemVial("vialblood_kelenken");
	public static final Item VIALBLOOD_SMILODON = new ItemVial("vialblood_smilodon");
	public static final Item VIALBLOOD_SEBECUS = new ItemVial("vialblood_sebecus");
	public static final Item VIALBLOOD_GLYPTODON = new ItemVial("vialblood_glyptodon");
	public static final Item VIALBLOOD_ARCTHO = new ItemVial("vialblood_arctho");
	public static final Item VIALBLOOD_CANIS = new ItemVial("vialblood_canis");
	public static final Item VIALBLOOD_CUVIER = new ItemVial("vialblood_cuvier");
	public static final Item VIALBLOOD_MACRA = new ItemVial("vialblood_macra");
	public static final Item VIALBLOOD_THERIO = new ItemVial("vialblood_therio");
	public static final Item VIALBLOOD_TOXODON = new ItemVial("vialblood_toxodon");
	


	//Foods
	public static final Item VILLAGER_MEAT_RAW = new ItemCustomFood("villager_meat_raw", 2, true);
	public static final Item VILLAGER_MEAT_COOKED = new ItemCustomFood("villager_meat_cooked", 5, true);
	public static final Item KELENKEN_MEAT_RAW = new ItemCustomFood("kelenken_meat_raw", 2, true); 
	public static final Item KELENKEN_MEAT_COOKED = new ItemCustomFood("kelenken_meat_cooked", 5, true);






}
