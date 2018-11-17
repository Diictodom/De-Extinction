package com.deextinction.deextinction.util.handler;

import com.deextinction.deextinction.client.Deextinction;
import com.deextinction.deextinction.container.ContainerGenerator;
import com.deextinction.deextinction.gui.GuiGenerator;
import com.deextinction.deextinction.tileentity.TileEntityGeneratorBlock;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Deextinction.GUI_GENERATOR) return new ContainerGenerator(player.inventory, (TileEntityGeneratorBlock)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
		
	}
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Deextinction.GUI_GENERATOR) return new GuiGenerator(player.inventory, (TileEntityGeneratorBlock)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

}