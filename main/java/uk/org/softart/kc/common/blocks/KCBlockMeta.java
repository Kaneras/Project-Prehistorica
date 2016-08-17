package uk.org.softart.kc.common.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class KCBlockMeta extends Block {

	public static final PropertyInteger VARIANT = PropertyInteger.create("variant", 0, 15);
	public int variants;
	public String name;

	public KCBlockMeta(Material materialIn, int variants, String name) {
		super(materialIn);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, Integer.valueOf(0)));
		this.variants = variants;
		this.name = name;
	}

	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
		for (int i = 0; i < this.variants; ++i) {
			list.add(new ItemStack(itemIn, 1, i));
		}
	}

	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
		return this.getDefaultState().withProperty(VARIANT, Integer.valueOf(meta));
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos) {
		return new ItemStack(world.getBlockState(pos).getBlock(), 1, this.getMetaFromState(world.getBlockState(pos)));
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(VARIANT, Integer.valueOf(meta));
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((Integer) state.getValue(VARIANT)).intValue();
	}

	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] { VARIANT });
	}

}
