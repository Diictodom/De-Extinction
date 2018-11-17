package com.deextinction.deextinction.util.handler;

import com.deextinction.deextinction.client.Deextinction;
import com.deextinction.deextinction.tileentity.TileEntityGeneratorBlock;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
	
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityGeneratorBlock.class, new ResourceLocation(Deextinction.MODID +":generatorgui"));
	}

}