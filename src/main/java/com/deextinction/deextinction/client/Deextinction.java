package com.deextinction.deextinction.client;



import com.deextinction.deextinction.init.DeexItem;
import com.deextinction.deextinction.proxy.CommonProxy;
import com.deextinction.deextinction.tab.ModTab;
import com.deextinction.deextinction.tab.ModTabData;
import com.deextinction.deextinction.tab.ModTabFood;
import com.deextinction.deextinction.tab.ModTabFossil;
import com.deextinction.deextinction.tab.ModTabSyringe;
import com.deextinction.deextinction.tab.ModTabVial;
import com.deextinction.deextinction.util.handler.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Deextinction.MODID, name = Deextinction.MODNAME, version = Deextinction.MODVERSION)
public class Deextinction {
	
	//tab
	public static final CreativeTabs modtab = new ModTab("modtab");
	public static final CreativeTabs modtabsyringe = new ModTabSyringe("modtabsyringe");
	public static final CreativeTabs modtabfood = new ModTabFood("modtabfood");
	public static final CreativeTabs modtabvial = new ModTabVial("modtabvial");
	public static final CreativeTabs modtabfossil = new ModTabFossil("modtabfossil");
	public static final CreativeTabs modtabdata = new ModTabData("modtabdata");
	
	static { FluidRegistry.enableUniversalBucket(); }
	
	
    public static final String MODID = "deextinction";
    public static final String MODNAME = "De-Extinction Mod";

    public static final String MODVERSION = "0.0.3";


    
    //gui
    public static final int GUI_CLEANING_TABLE = 1;
    public static final int GUI_ESTORAGE = 2;
    public static final int GUI_GENERATOR = 3;
    public static final int GUI_SOLAR = 4;
    public static final int GUI_WATERGENERATOR = 5;
    public static final int GUI_CENTRIFUGE = 6;
    public static final int GUI_EGGMACHINE = 7;
    public static final int GUI_EMBRYONICMACHINE = 8;
    public static final int GUI_MICROSCOPE = 9;
    public static final int GUI_GRINDER = 10;
    
    
    //mobs
    public static final int ENTITY_KELENKEN = 250;
    public static final int ENTITY_SMILODON = 251;
    public static final int ENTITY_FISKO = 252;
    public static final int ENTITY_JAI = 253;
    public static final int ENTITY_LUCAS = 254;
    public static final int ENTITY_RAFA = 255;
    public static final int ENTITY_ZEINNER = 256;
    public static final int ENTITY_JOHN = 257;
    public static final int ENTITY_RURONI = 258;
    public static final int ENTITY_CREEPY = 259;
    public static final int ENTITY_ARCTOTHERIUM = 260;
    public static final int ENTITY_GLYPTODON = 261;
    public static final int ENTITY_SEBECUS = 262;
    public static final int ENTITY_THERIODICTIS = 263;
    public static final int ENTITY_CANISNEHRINGI = 264;
    public static final int ENTITY_CUVIERONIUS = 265;
    public static final int ENTITY_TOXODON = 266;
    public static final int ENTITY_MACRAUCHENIA = 267;
   
    
    

    @SidedProxy(clientSide = "com.deextinction.deextinction.proxy.ClientProxy", serverSide = "com.deextinction.deextinction.proxy.ServerProxy")
    public static CommonProxy proxy;

   
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	RegistryHandler.preInitRegistries();
    	OreDictionary.registerOre("toolChisel", new ItemStack(DeexItem.CHISEL, OreDictionary.WILDCARD_VALUE));
            
    }
    

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	
    	RegistryHandler.initRegistries();


    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
      
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
     
    }
    
    @Instance (Deextinction.MODID)
    public static Deextinction modInstance;
    
    
    
    
}