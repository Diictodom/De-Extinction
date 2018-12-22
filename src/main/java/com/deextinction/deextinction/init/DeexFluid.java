package com.deextinction.deextinction.init;

import com.deextinction.deextinction.fluids.FluidLiquid;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class DeexFluid {
	
	public static final Fluid TAR_FLUID = new FluidLiquid("tar", new ResourceLocation("deextinction:block/tar_still"), new ResourceLocation("deextinction:block/tar_flow"));

	public static void registerFluids()
	{
		registerFluid(TAR_FLUID);
	}
	
	public static void registerFluid(Fluid fluid)
	{
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
}
