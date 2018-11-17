package com.deextinction.deextinction.entity.render;

import com.deextinction.deextinction.client.Deextinction;
import com.deextinction.deextinction.entity.creature.cenozoic.CarnivoresMammals.EntityCanisNehringi;
import com.deextinction.deextinction.entity.model.cenozoic.ModelCanisNehringi;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCanisNehringi extends RenderLiving<EntityCanisNehringi>

{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Deextinction.MODID + ":" + "textures/entity/canisnehringi.png");
	
	public RenderCanisNehringi(RenderManager manager)
	{
		super(manager, new ModelCanisNehringi(), 0.5F);
	
	}

	@Override 
	protected ResourceLocation getEntityTexture(EntityCanisNehringi entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityCanisNehringi entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	
}
