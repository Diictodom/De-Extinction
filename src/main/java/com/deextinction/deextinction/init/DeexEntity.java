package com.deextinction.deextinction.init;

import com.deextinction.deextinction.client.Deextinction;
import com.deextinction.deextinction.entity.creature.cenozoic.CarnivoresMammals.EntityArctotherium;
import com.deextinction.deextinction.entity.creature.cenozoic.CarnivoresMammals.EntityCanisNehringi;
import com.deextinction.deextinction.entity.creature.cenozoic.CarnivoresMammals.EntitySmilodon;
import com.deextinction.deextinction.entity.creature.cenozoic.CarnivoresMammals.EntityTheriodictis;
import com.deextinction.deextinction.entity.creature.cenozoic.CarnivorousBirds.EntityKelenken;
import com.deextinction.deextinction.entity.creature.cenozoic.HerbMammals.EntityCuvieronius;
import com.deextinction.deextinction.entity.creature.cenozoic.HerbMammals.EntityGlyptodon;
import com.deextinction.deextinction.entity.creature.cenozoic.HerbMammals.EntityMacrauchenia;
import com.deextinction.deextinction.entity.creature.cenozoic.HerbMammals.EntityToxodon;
import com.deextinction.deextinction.entity.creature.cenozoic.Reptiles.EntitySebecus;
import com.deextinction.deextinction.entity.creature.defectum.EntityCreepy;
import com.deextinction.deextinction.entity.creature.defectum.EntityFisko;
import com.deextinction.deextinction.entity.creature.defectum.EntityJai;
import com.deextinction.deextinction.entity.creature.defectum.EntityJohn;
import com.deextinction.deextinction.entity.creature.defectum.EntityLucas;
import com.deextinction.deextinction.entity.creature.defectum.EntityRafa;
import com.deextinction.deextinction.entity.creature.defectum.EntityRuroni;
import com.deextinction.deextinction.entity.creature.defectum.EntityZeinner;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class DeexEntity 
{
	
	public static void registerEntities()
	{
		//Argentina
		registerEntity ("arctotherium", EntityArctotherium.class, Deextinction.ENTITY_ARCTOTHERIUM, 32, 8415811, 15062167);
		registerEntity ("canisnehringi", EntityCanisNehringi.class, Deextinction.ENTITY_CANISNEHRINGI, 32, 8415811, 15062167);
		registerEntity ("cuvieronius", EntityCuvieronius.class, Deextinction.ENTITY_CUVIERONIUS, 32, 8415811, 15062167);
		registerEntity ("glyptodon", EntityGlyptodon.class, Deextinction.ENTITY_GLYPTODON, 32, 8415811, 15062167);
		registerEntity ("kelenken", EntityKelenken.class, Deextinction.ENTITY_KELENKEN, 32, 8415811, 15062167);
		registerEntity ("macrauchenia", EntityMacrauchenia.class, Deextinction.ENTITY_MACRAUCHENIA, 32, 8415811, 15062167);
		registerEntity ("sebecus", EntitySebecus.class, Deextinction.ENTITY_SEBECUS, 32, 8415811, 15062167);
		registerEntity ("smilodon", EntitySmilodon.class, Deextinction.ENTITY_SMILODON, 32, 8415811, 15062167);
		registerEntity ("theriodictis", EntityTheriodictis.class, Deextinction.ENTITY_THERIODICTIS, 32, 8415811, 15062167);
		registerEntity ("toxodon", EntityToxodon.class, Deextinction.ENTITY_TOXODON, 32, 8415811, 15062167);
		//Errors
		registerEntity ("fisko", EntityFisko.class, Deextinction.ENTITY_FISKO, 32, 7387457, 15699291);
		registerEntity ("jai", EntityJai.class, Deextinction.ENTITY_JAI, 32, 7387457, 15699291);
		registerEntity ("lucas", EntityLucas.class, Deextinction.ENTITY_LUCAS, 32, 7387457, 15699291);
		registerEntity ("rafa", EntityRafa.class, Deextinction.ENTITY_RAFA, 32, 7387457, 15699291);
		registerEntity ("zeinner", EntityZeinner.class, Deextinction.ENTITY_ZEINNER, 32, 7387457, 15699291);
		registerEntity ("john", EntityJohn.class, Deextinction.ENTITY_JOHN, 32, 7387457, 15699291);
		registerEntity ("creepy", EntityCreepy.class, Deextinction.ENTITY_CREEPY, 32, 7387457, 15699291);
		registerEntity ("ruroni", EntityRuroni.class, Deextinction.ENTITY_RURONI, 32, 7387457, 15699291);
		
	}
	
	
	private static void registerEntity(String name, Class <? extends Entity> entity, int id, int range, int color1, int color2 )
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Deextinction.MODID + ":" + name), entity, name, id, Deextinction.modInstance, range, 1, true, color1, color2);
	}
}
