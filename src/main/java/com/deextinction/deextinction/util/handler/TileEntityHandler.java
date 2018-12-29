package com.deextinction.deextinction.util.handler;

import com.deextinction.deextinction.blocks.machine.tileentities.TileEntityCentrifuge;
import com.deextinction.deextinction.blocks.machine.tileentities.TileEntityCleaningTable;
import com.deextinction.deextinction.blocks.machine.tileentities.TileEntityEggMachine;
import com.deextinction.deextinction.blocks.machine.tileentities.TileEntityEmbryonicMachine;
import com.deextinction.deextinction.blocks.machine.tileentities.TileEntityEstorage;
import com.deextinction.deextinction.blocks.machine.tileentities.TileEntityGenerator;
import com.deextinction.deextinction.blocks.machine.tileentities.TileEntityGrinder;
import com.deextinction.deextinction.blocks.machine.tileentities.TileEntityMicroscope;
import com.deextinction.deextinction.blocks.machine.tileentities.TileEntitySolar;
import com.deextinction.deextinction.blocks.machine.tileentities.TileEntityWaterGenerator;
import com.deextinction.deextinction.client.Deextinction;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
	
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityCleaningTable.class, new ResourceLocation(Deextinction.MODID +":cleaning_table"));
		GameRegistry.registerTileEntity(TileEntityEstorage.class, new ResourceLocation(Deextinction.MODID +":estorage"));
		GameRegistry.registerTileEntity(TileEntityGenerator.class, new ResourceLocation(Deextinction.MODID +":generator"));
		GameRegistry.registerTileEntity(TileEntitySolar.class, new ResourceLocation(Deextinction.MODID +":solar"));
		GameRegistry.registerTileEntity(TileEntityWaterGenerator.class, new ResourceLocation(Deextinction.MODID +":watergenerator"));
		GameRegistry.registerTileEntity(TileEntityCentrifuge.class, new ResourceLocation(Deextinction.MODID +":centrifuge"));
		GameRegistry.registerTileEntity(TileEntityEggMachine.class, new ResourceLocation(Deextinction.MODID +":eggmachine"));
		GameRegistry.registerTileEntity(TileEntityEmbryonicMachine.class, new ResourceLocation(Deextinction.MODID +":embryonicmachine"));
		GameRegistry.registerTileEntity(TileEntityMicroscope.class, new ResourceLocation(Deextinction.MODID +":microscope"));
		GameRegistry.registerTileEntity(TileEntityGrinder.class, new ResourceLocation(Deextinction.MODID +":grinder"));
	}

}