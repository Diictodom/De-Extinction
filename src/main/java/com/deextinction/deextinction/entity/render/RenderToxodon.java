package com.deextinction.deextinction.entity.render;

import com.deextinction.deextinction.client.Deextinction;
import com.deextinction.deextinction.entity.creature.cenozoic.HerbMammals.EntityToxodon;
import com.deextinction.deextinction.entity.model.cenozoic.ModelToxodon;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderToxodon extends RenderLiving<EntityToxodon>

{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Deextinction.MODID + ":" + "textures/entity/toxodon.png");
	
	public RenderToxodon(RenderManager manager)
	{
		super(manager, new ModelToxodon(), 0.5F);
	
	}

	@Override 
	protected ResourceLocation getEntityTexture(EntityToxodon entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityToxodon entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	
}
