package com.deextinction.deextinction.util.handler;

import com.deextinction.deextinction.blocks.machine.tileentities.TileEntityCleaningTable;
import com.deextinction.deextinction.client.Deextinction;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
	
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityCleaningTable.class, new ResourceLocation(Deextinction.MODID +":cleaning_table"));
	}

}