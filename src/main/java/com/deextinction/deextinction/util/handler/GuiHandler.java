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
import com.deextinction.deextinction.container.ContainerCentrifuge;
import com.deextinction.deextinction.container.ContainerCleaningTable;
import com.deextinction.deextinction.container.ContainerEggMachine;
import com.deextinction.deextinction.container.ContainerEmbryonicMachine;
import com.deextinction.deextinction.container.ContainerEstorage;
import com.deextinction.deextinction.container.ContainerGenerator;
import com.deextinction.deextinction.container.ContainerGrinder;
import com.deextinction.deextinction.container.ContainerMicroscope;
import com.deextinction.deextinction.container.ContainerSolar;
import com.deextinction.deextinction.container.ContainerWaterGenerator;
import com.deextinction.deextinction.gui.GuiCentrifuge;
import com.deextinction.deextinction.gui.GuiCleaningTable;
import com.deextinction.deextinction.gui.GuiEggMachine;
import com.deextinction.deextinction.gui.GuiEmbryonicMachine;
import com.deextinction.deextinction.gui.GuiEstorage;
import com.deextinction.deextinction.gui.GuiGenerator;
import com.deextinction.deextinction.gui.GuiGrinder;
import com.deextinction.deextinction.gui.GuiMicroscope;
import com.deextinction.deextinction.gui.GuiSolar;
import com.deextinction.deextinction.gui.GuiWaterGenerator;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Deextinction.GUI_CLEANING_TABLE) return new ContainerCleaningTable(player.inventory, (TileEntityCleaningTable)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_ESTORAGE) return new ContainerEstorage(player.inventory, (TileEntityEstorage)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_GENERATOR) return new ContainerGenerator(player.inventory, (TileEntityGenerator)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_SOLAR) return new ContainerSolar(player.inventory, (TileEntitySolar)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_WATERGENERATOR) return new ContainerWaterGenerator(player.inventory, (TileEntityWaterGenerator)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_CENTRIFUGE) return new ContainerCentrifuge(player.inventory, (TileEntityCentrifuge)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_EGGMACHINE) return new ContainerEggMachine(player.inventory, (TileEntityEggMachine)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_EMBRYONICMACHINE) return new ContainerEmbryonicMachine(player.inventory, (TileEntityEmbryonicMachine)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_GRINDER) return new ContainerGrinder(player.inventory, (TileEntityGrinder)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_MICROSCOPE) return new ContainerMicroscope(player.inventory, (TileEntityMicroscope)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
		
	}
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Deextinction.GUI_CLEANING_TABLE) return new GuiCleaningTable(player.inventory, (TileEntityCleaningTable)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_ESTORAGE) return new GuiEstorage(player.inventory, (TileEntityEstorage)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_GENERATOR) return new GuiGenerator(player.inventory, (TileEntityGenerator)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_SOLAR) return new GuiSolar(player.inventory, (TileEntitySolar)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_WATERGENERATOR) return new GuiWaterGenerator(player.inventory, (TileEntityWaterGenerator)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_CENTRIFUGE) return new GuiCentrifuge(player.inventory, (TileEntityCentrifuge)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_EGGMACHINE) return new GuiEggMachine(player.inventory, (TileEntityEggMachine)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_EMBRYONICMACHINE) return new GuiEmbryonicMachine(player.inventory, (TileEntityEmbryonicMachine)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_GRINDER) return new GuiGrinder(player.inventory, (TileEntityGrinder)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Deextinction.GUI_MICROSCOPE) return new GuiMicroscope(player.inventory, (TileEntityMicroscope)world.getTileEntity(new BlockPos(x,y,z)));
		
		return null;
	}

}