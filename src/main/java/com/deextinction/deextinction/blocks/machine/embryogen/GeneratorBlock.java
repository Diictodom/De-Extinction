package com.deextinction.deextinction.blocks.machine.embryogen;

import com.deextinction.deextinction.blocks.BlockBase;
import com.deextinction.deextinction.client.Deextinction;
import com.deextinction.deextinction.init.DeexBlocks;
import com.deextinction.deextinction.tileentity.TileEntityGeneratorBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GeneratorBlock extends BlockBase{

	public static final AxisAlignedBB GENERATOR_BLOCK_AABB = new AxisAlignedBB (0, 0, 0, 1, 1.65D, 1);
		
	public GeneratorBlock(String name, Material material) {
super(name, material);
		
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
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hixX, float hitY, float hitZ)
	{
		if(!worldIn.isRemote)
		{
			playerIn.openGui(Deextinction.modInstance, Deextinction.GUI_GENERATOR, worldIn, pos.getX(), pos.getY(), pos.getZ());
			
		}
		return true;
	}
	
	@Override
	public boolean hasTileEntity(IBlockState stare)
	{
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state)
	{
		return new TileEntityGeneratorBlock();
	}
	
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
	{
		TileEntityGeneratorBlock tileentity = (TileEntityGeneratorBlock)worldIn.getTileEntity(pos);
		worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), tileentity.handler.getStackInSlot(0)));
		super.breakBlock(worldIn, pos, state);
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
		return GENERATOR_BLOCK_AABB;
	}

	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	{
	    this.setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH)); 
	}
	
	

	@Override
	public IBlockState getStateFromMeta(int meta) 
    	{
			EnumFacing facing = EnumFacing.getFront(meta);

			if(facing.getAxis()==EnumFacing.Axis.Y) 
			{
				facing=EnumFacing.NORTH;
			}
			return getDefaultState().withProperty(FACING, facing);
    	}

	  @Override
	  public int getMetaFromState(IBlockState state) 
               {
	       	   		return ((EnumFacing) state.getValue(FACING)).getIndex();
               }
	    
	   @Override
	   protected BlockStateContainer createBlockState() 
               {
	           		return new BlockStateContainer(this, new IProperty[]{FACING});
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
	            InventoryHelper.spawnItemStack(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(DeexBlocks.GENERATOR_BLOCK, 1));
	        }      
	    }

	    private boolean canBlockStay(World worldIn, BlockPos pos)
	    {
	        return worldIn.getBlockState(pos.down()).isSideSolid(worldIn, pos, EnumFacing.UP);
	    }
}


