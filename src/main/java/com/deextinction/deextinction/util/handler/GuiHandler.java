package com.deextinction.deextinction.util.handler;

import com.deextinction.deextinction.blocks.machine.tileentities.TileEntityCleaningTable;
import com.deextinction.deextinction.client.Deextinction;
import com.deextinction.deextinction.container.ContainerCleaningTable;
import com.deextinction.deextinction.gui.GuiCleaningTable;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Deextinction.GUI_CLEANING_TABLE) return new ContainerCleaningTable(player.inventory, (TileEntityCleaningTable)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
		
	}
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Deextinction.GUI_CLEANING_TABLE) return new GuiCleaningTable(player.inventory, (TileEntityCleaningTable)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

}