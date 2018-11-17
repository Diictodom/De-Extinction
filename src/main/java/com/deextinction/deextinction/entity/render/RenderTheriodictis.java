package com.deextinction.deextinction.entity.render;

import com.deextinction.deextinction.client.Deextinction;
import com.deextinction.deextinction.entity.creature.cenozoic.CarnivoresMammals.EntityTheriodictis;
import com.deextinction.deextinction.entity.creature.cenozoic.CarnivorousBirds.EntityKelenken;
import com.deextinction.deextinction.entity.model.cenozoic.ModelKelenken;
import com.deextinction.deextinction.entity.model.cenozoic.ModelTheriodictis;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTheriodictis extends RenderLiving<EntityTheriodictis>

{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Deextinction.MODID + ":" + "textures/entity/theriodictis.png");
	
	public RenderTheriodictis(RenderManager manager)
	{
		super(manager, new ModelTheriodictis(), 0.5F);
	
	}

	@Override 
	protected ResourceLocation getEntityTexture(EntityTheriodictis entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityTheriodictis entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	
}
