
package com.deextinction.deextinction.blocks.machine.embryogen;

import java.util.Random;

import com.deextinction.deextinction.blocks.BlockBase;
import com.deextinction.deextinction.blocks.machine.tileentities.TileEntityGrinder;
import com.deextinction.deextinction.client.Deextinction;
import com.deextinction.deextinction.init.DeexBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GrinderBlock extends BlockBase implements ITileEntityProvider{


	public static final AxisAlignedBB GRINDER_BLOCK_AABB = new AxisAlignedBB (0, 0, 0, 1, 1.0D, 1);
		
	public GrinderBlock(String name) 
	{
		super(name, Material.IRON);
		
		setSoundType(SoundType.METAL);
		setHardness(2.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		//setLightlevel();
		//setLightOpacity();
		//setBlockUnbreakable();
		
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}
	

	@Override 
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	@Override 
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return GRINDER_BLOCK_AABB;
	}
	//tutorial
	public static final PropertyDirection  FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	{
	    this.setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH)); 
	}
	public static final PropertyBool BURNING = PropertyBool.create("burning");
	{
	    this.setDefaultState(blockState.getBaseState().withProperty(BURNING, false)); 
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(DeexBlocks.GRINDER_BLOCK);
	}
	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
	{
		return new ItemStack(DeexBlocks.GRINDER_BLOCK);
	}
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if(!worldIn.isRemote)
		{
			playerIn.openGui(Deextinction.modInstance, Deextinction.GUI_GRINDER, worldIn, pos.getX(), pos.getY(), pos.getZ());
		}
		return true;
	}
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
	{
		if(!worldIn.isRemote)
		{
			IBlockState north = worldIn.getBlockState(pos.north());
			IBlockState south = worldIn.getBlockState(pos.south());
			IBlockState west = worldIn.getBlockState(pos.west());
			IBlockState east = worldIn.getBlockState(pos.east());
			EnumFacing face = (EnumFacing)state.getValue(FACING);
			
			if (face == EnumFacing.NORTH && north.isFullBlock() && !south.isFullBlock()) face = EnumFacing.SOUTH;
			else if (face == EnumFacing.SOUTH && south.isFullBlock() && !north.isFullBlock()) face = EnumFacing.NORTH;
			else if (face == EnumFacing.WEST && west.isFullBlock() && !east.isFullBlock()) face = EnumFacing.EAST;
			else if (face == EnumFacing.EAST && east.isFullBlock() && !west.isFullBlock()) face = EnumFacing.WEST;
			worldIn.setBlockState(pos, state.withProperty(FACING,face), 2);
		}
	}
	
	public static void setState(boolean active, World worldIn, BlockPos pos)
	{
		IBlockState state = worldIn.getBlockState(pos);
		TileEntity tileentity = worldIn.getTileEntity(pos);
		
		if(active) worldIn.setBlockState(pos, DeexBlocks.GRINDER_BLOCK.getDefaultState().withProperty(FACING, state.getValue(FACING)).withProperty(BURNING, true), 3);
		else worldIn.setBlockState(pos, DeexBlocks.GRINDER_BLOCK.getDefaultState().withProperty(FACING, state.getValue(FACING)).withProperty(BURNING, false), 3);
		
		if(tileentity != null)
		{
			tileentity.validate();
			worldIn.setTileEntity(pos, tileentity);
		}
	}
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityGrinder();
	}
	
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
	{
		worldIn.setBlockState(pos, this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state)
	{
		return EnumBlockRenderType.MODEL;
	}
	
	@Override
	public IBlockState withRotation(IBlockState state, Rotation rot)
	{
		return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
	}
	@Override
	public IBlockState withMirror(IBlockState state, Mirror mirrorIn)
	{
		return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
	}
	
	
	//tutorial
	

	@Override
	public IBlockState getStateFromMeta(int meta) 
    	{
			EnumFacing facing = EnumFacing.getFront(meta);

			if(facing.getAxis()==EnumFacing.Axis.Y) 
			{
				facing=EnumFacing.NORTH;
			}
			return this.getDefaultState().withProperty(FACING, facing);
    	}

	  @Override
	  public int getMetaFromState(IBlockState state) 
               {
	       	   		return ((EnumFacing) state.getValue(FACING)).getIndex();
               }
	    
	   @Override
	   protected BlockStateContainer createBlockState() 
               {
	           		return new BlockStateContainer(this, new IProperty[]{BURNING, FACING});
               }
	  @Override
	    public IBlockState getStateForPlacement(World worldIn, BlockPos pos,EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) 
	    {
		  return getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	    }
	  
	  public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	    {
	        return super.canPlaceBlockAt(worldIn, pos) ? this.canBlockStay(worldIn, pos) : false;       
	    }

	    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
	    {    
	        if (!this.canBlockStay(worldIn, pos))
	        {    
	            worldIn.setBlockToAir(pos);
	            InventoryHelper.spawnItemStack(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(DeexBlocks.GRINDER_BLOCK, 1));
	        }      
	    }

	    private boolean canBlockStay(World worldIn, BlockPos pos)
	    {
	        return worldIn.getBlockState(pos.down()).isSideSolid(worldIn, pos, EnumFacing.UP);
	    }
	
}









