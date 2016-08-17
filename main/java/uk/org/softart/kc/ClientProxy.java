package uk.org.softart.kc;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import uk.org.softart.kc.common.blocks.KCBlockMeta;
import uk.org.softart.kc.common.init.KCBlocks;
import uk.org.softart.kc.common.init.KCItems;

public class ClientProxy extends CommonProxy {

	@Override
	public void init() {
		registerRendererInformation();
	}

	private void registerRendererInformation() {
		for (int i = 0; i < KCBlocks.blocks.size(); i++) {
			registerBlockRendererInfo(KCBlocks.blocks.get(i));
		}
		for (int i = 0; i < KCItems.items.size(); i++) {
			registerItemRendererInfo(KCItems.items.get(i));
		}
	}

	private void registerBlockRendererInfo(Block block) {
		ItemModelMesher modelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		Item item = Item.getItemFromBlock(block);
		if (block instanceof KCBlockMeta) {
			for (int i = 0; i < ((KCBlockMeta) block).variants; i++) {
				String path = KCMain.MOD_ID + ":metablock/" + ((KCBlockMeta)block).name + "/" + block.getUnlocalizedName().substring(5) + "_" + i;
				ModelBakery.registerItemVariants(item, new ResourceLocation(path));
				modelMesher.register(item, i, new ModelResourceLocation(path, "inventory"));
			}
		} else {
			modelMesher.register(item, 0, new ModelResourceLocation(KCMain.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
		}
	}
	
	private void registerItemRendererInfo(Item item) {
		ItemModelMesher modelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		modelMesher.register(item, 0, new ModelResourceLocation(KCMain.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
