package com.deextinction.deextinction.tileentity;

import com.deextinction.deextinction.energy.CustomEnergyStorage;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;

public class TileEntityEnergy  extends TileEntity implements ITickable{

	private CustomEnergyStorage storage = new CustomEnergyStorage(100);
	
	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing)
	{
		if(capability == CapabilityEnergy.ENERGY) return (T)this.storage;
		return super.getCapability(capability, facing);
	}
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing)
	{
		if(capability == CapabilityEnergy.ENERGY) return true;
		return super.hasCapability(capability, facing);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.storage.receiveEnergy(5, false);
		this.storage.extractEnergy(10, false);
	}

}