package com.deextinction.deextinction.blocks;

import com.deextinction.deextinction.init.DeexBlocks;
import com.deextinction.deextinction.init.DeexItem;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockFluid extends BlockFluidClassic {
	
	public BlockFluid(String name, Fluid fluid, Material material)
	{
		super(fluid, material);
		setUnlocalizedName(name);
		setRegistryName(name);
		
		DeexBlocks.BLOCKS.add(this);
		DeexItem.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public EnumBlockRenderType getRenderType(IBlockState state)
	{
		return EnumBlockRenderType.MODEL;
	}

}
