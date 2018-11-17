package com.deextinction.deextinction.entity.render;

import com.deextinction.deextinction.client.Deextinction;
import com.deextinction.deextinction.entity.creature.cenozoic.HerbMammals.EntityCuvieronius;
import com.deextinction.deextinction.entity.model.cenozoic.ModelCuvieronius;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCuvieronius extends RenderLiving<EntityCuvieronius>

{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Deextinction.MODID + ":" + "textures/entity/cuvieronius.png");
	
	public RenderCuvieronius(RenderManager manager)
	{
		super(manager, new ModelCuvieronius(), 0.5F);
	
	}

	@Override 
	protected ResourceLocation getEntityTexture(EntityCuvieronius entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityCuvieronius entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	
}
