package com.deextinction.deextinction.init;

import java.util.ArrayList;
import java.util.List;

import com.deextinction.deextinction.items.ItemBase;
import com.deextinction.deextinction.items.ItemChisel;
import com.deextinction.deextinction.items.ItemCustomFood;
import com.deextinction.deextinction.items.ItemData;
import com.deextinction.deextinction.items.ItemFossil;
import com.deextinction.deextinction.items.ItemGrindingstone;
import com.deextinction.deextinction.items.ItemSyringe;
import com.deextinction.deextinction.items.ItemVial;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class DeexItem {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	///Material
	public static final ToolMaterial TOOL_ARCHEOLOGY = EnumHelper.addToolMaterial("tool_archeology", 2, 5, 5.0F, 1F, 0);
	public static final ToolMaterial TOOL_GRIND = EnumHelper.addToolMaterial("tool_grind", 0, 5, 0.5F, 0F, 0);

	
	//Fossils
	public static final Item CENOZOIC_FOSSIL_CLEAN = new ItemFossil("cenozoic_fossil_clean");
	public static final Item CENOZOIC_FOSSIL_DIRTY = new ItemFossil("cenozoic_fossil_dirty");
	public static final Item MESOZOIC_FOSSIL_CLEAN = new ItemFossil("mesozoic_fossil_clean");
	public static final Item MESOZOIC_FOSSIL_DIRTY = new ItemFossil("mesozoic_fossil_dirty");
	public static final Item PALEOZOIC_FOSSIL_CLEAN = new ItemFossil("paleozoic_fossil_clean");
	public static final Item PALEOZOIC_FOSSIL_DIRTY = new ItemFossil("paleozoic_fossil_dirty");

	
	//Drops
	public static final Item KELENKEN_FEATHER = new ItemBase("kelenken_feather");
	
	
	//Items
	public static final Item DIAMOND_SHARD = new ItemBase("diamond_shard");
	public static final Item ELECTRONIC = new ItemBase("electronic");
	public static final Item GRINDINGSTONE = new ItemGrindingstone("grindingstone", TOOL_GRIND);
	public static final Item GEAR = new ItemBase("gear");
	
	//Tools
	public static final Item BRUSH = new ItemBase("brush");	
	public static final Item CHISEL = new ItemChisel("chisel", TOOL_ARCHEOLOGY);
	
	//Foods
	public static final Item VILLAGER_MEAT_RAW = new ItemCustomFood("villager_meat_raw", 2, true);
	public static final Item VILLAGER_MEAT_COOKED = new ItemCustomFood("villager_meat_cooked", 5, true);
	public static final Item KELENKEN_MEAT_RAW = new ItemCustomFood("kelenken_meat_raw", 2, true); 
	public static final Item KELENKEN_MEAT_COOKED = new ItemCustomFood("kelenken_meat_cooked", 5, true);


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
	////DUST////
	public static final Item VIALDUST_KELENKEN = new ItemVial("vialdust_kelenken");
	public static final Item VIALDUST_SMILODON = new ItemVial("vialdust_smilodon");
	public static final Item VIALDUST_SEBECUS = new ItemVial("vialdust_sebecus");
	public static final Item VIALDUST_GLYPTODON = new ItemVial("vialdust_glyptodon");
	public static final Item VIALDUST_ARCTHO = new ItemVial("vialdust_arctho");
	public static final Item VIALDUST_CANIS = new ItemVial("vialdust_canis");
	public static final Item VIALDUST_CUVIER = new ItemVial("vialdust_cuvier");
	public static final Item VIALDUST_MACRA = new ItemVial("vialdust_macra");
	public static final Item VIALDUST_THERIO = new ItemVial("vialdust_therio");
	public static final Item VIALDUST_TOXODON = new ItemVial("vialdust_toxodon");
	////CENTRIFUGED////
	public static final Item VIALCENT_KELENKEN = new ItemVial("vialcent_kelenken");
	public static final Item VIALCENT_SMILODON = new ItemVial("vialcent_smilodon");
	public static final Item VIALCENT_SEBECUS = new ItemVial("vialcent_sebecus");
	public static final Item VIALCENT_GLYPTODON = new ItemVial("vialcent_glyptodon");
	public static final Item VIALCENT_ARCTHO = new ItemVial("vialcent_arctho");
	public static final Item VIALCENT_CANIS = new ItemVial("vialcent_canis");
	public static final Item VIALCENT_CUVIER = new ItemVial("vialcent_cuvier");
	public static final Item VIALCENT_MACRA = new ItemVial("vialcent_macra");
	public static final Item VIALCENT_THERIO = new ItemVial("vialcent_therio");
	public static final Item VIALCENT_TOXODON = new ItemVial("vialcent_toxodon");
	

	//List of Fossils/////////////////////////////////////////////
	public static final Item Fossil_KELENKEN = new ItemFossil("fossil_kelenken");
	public static final Item Fossil_SMILODON = new ItemFossil("fossil_smilodon");
	public static final Item Fossil_SEBECUS = new ItemFossil("fossil_sebecus");
	public static final Item Fossil_GLYPTODON = new ItemFossil("fossil_glyptodon");
	public static final Item Fossil_ARCTHO = new ItemFossil("fossil_arctho");
	public static final Item Fossil_CANIS = new ItemFossil("fossil_canis");
	public static final Item Fossil_CUVIER = new ItemFossil("fossil_cuvier");
	public static final Item Fossil_MACRA = new ItemFossil("fossil_macra");
	public static final Item Fossil_THERIO = new ItemFossil("fossil_therio");
	public static final Item Fossil_TOXODON = new ItemFossil("fossil_toxodon");
	
	
	//Data
	public static final Item DATA_EMPTY = new ItemData("data_empty");
	//List of Data////////////////////////////////////////////////
	public static final Item DATA_KELENKEN = new ItemData("data_kelenken");
	public static final Item DATA_SMILODON = new ItemData("data_smilodon");
	public static final Item DATA_SEBECUS = new ItemData("data_sebecus");
	public static final Item DATA_GLYPTODON = new ItemData("data_glyptodon");
	public static final Item DATA_ARCTHO = new ItemData("data_arctho");
	public static final Item DATA_CANIS = new ItemData("data_canis");
	public static final Item DATA_CUVIER = new ItemData("data_cuvier");
	public static final Item DATA_MACRA = new ItemData("data_macra");
	public static final Item DATA_THERIO = new ItemData("data_therio");
	public static final Item DATA_TOXODON = new ItemData("data_toxodon");






}
