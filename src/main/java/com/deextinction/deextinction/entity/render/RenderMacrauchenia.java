package com.deextinction.deextinction.entity.render;

import com.deextinction.deextinction.client.Deextinction;
import com.deextinction.deextinction.entity.creature.cenozoic.HerbMammals.EntityMacrauchenia;
import com.deextinction.deextinction.entity.model.cenozoic.ModelMacrauchenia;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMacrauchenia extends RenderLiving<EntityMacrauchenia>

{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Deextinction.MODID + ":" + "textures/entity/macrauchenia.png");
	
	public RenderMacrauchenia(RenderManager manager)
	{
		super(manager, new ModelMacrauchenia(), 0.5F);
	
	}

	@Override 
	protected ResourceLocation getEntityTexture(EntityMacrauchenia entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityMacrauchenia entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	
}
