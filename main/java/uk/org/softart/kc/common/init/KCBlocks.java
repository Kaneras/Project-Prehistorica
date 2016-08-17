package uk.org.softart.kc.common.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import uk.org.softart.kc.common.blocks.BlockStandard;
import uk.org.softart.kc.common.blocks.KCBlockMeta;
import uk.org.softart.kc.common.items.ItemBlockMeta;

public class KCBlocks {

	public static List<Block> blocks = new ArrayList<Block>();
	
	public static Block seaAmber;
	public static Block triassicStone;
	public static Block leaves;
	public static Block planks;
	public static Block triassicSand;
	public static Block hardstone;
	public static Block limestoneBlock;
	
	public static Block[] gravel = new Block[2];
	
	public static Block triassicSilt;
	
	public static void init() {
		seaAmber = addBlock(new BlockStandard(Material.rock).setCreativeTab(KCCreativeTabs.tabBlocks), "blockSeaAmber");
		triassicStone = addBlock(new KCBlockMeta(Material.rock, 2, "triassicStone").setCreativeTab(KCCreativeTabs.tabBlocks), "triassicStone");
		leaves = addBlock(new KCBlockMeta(Material.leaves, 8, "leaves").setCreativeTab(KCCreativeTabs.tabBlocks), "leaves");
		planks = addBlock(new KCBlockMeta(Material.wood, 8, "planks").setCreativeTab(KCCreativeTabs.tabBlocks), "planks");
		triassicSand = addBlock(new BlockFalling().setCreativeTab(KCCreativeTabs.tabBlocks), "triassicSand");
		hardstone = addBlock(new BlockStandard(Material.rock).setCreativeTab(KCCreativeTabs.tabBlocks), "hardstone");
		limestoneBlock = addBlock(new BlockStandard(Material.rock).setCreativeTab(KCCreativeTabs.tabBlocks), "limestoneBlock");
		
		gravel[0] = addBlock(new BlockFalling().setCreativeTab(KCCreativeTabs.tabBlocks), "triassicGravel");
		gravel[1] = addBlock(new BlockFalling().setCreativeTab(KCCreativeTabs.tabBlocks), "jurassicGravel");
		
		triassicSilt = addBlock(new KCBlockMeta(Material.clay, 3, "triassicSilt").setCreativeTab(KCCreativeTabs.tabBlocks), "triassicSilt");
		
	}

	private static Block addBlock(Block block, String unlocalizedName) {
		block.setUnlocalizedName(unlocalizedName);
		if (block instanceof KCBlockMeta)
			GameRegistry.registerBlock(block, ItemBlockMeta.class, unlocalizedName);
		else
			GameRegistry.registerBlock(block, unlocalizedName);
		blocks.add(block);
		return block;
	}
	
}
