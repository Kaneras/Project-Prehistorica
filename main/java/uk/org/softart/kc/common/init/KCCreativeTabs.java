package uk.org.softart.kc.common.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class KCCreativeTabs {

	public static CreativeTabs tabTools;
	public static CreativeTabs tabCollectables;
	public static CreativeTabs tabFoods;
	public static CreativeTabs tabBlocks;
	public static CreativeTabs tabClothing;

	public static void init() {
		tabTools = new CreativeTabs("kc_tools") {

			@Override
			public Item getTabIconItem() {
				return KCItems.amberTools[0];
			}
		};

		tabCollectables = new CreativeTabs("kc_collectables") {
			public Item getTabIconItem() {
				return KCItems.bacteria;
			}
		};

		tabFoods = new CreativeTabs("kc_foods") {
			@Override
			public Item getTabIconItem() {
				return KCItems.dinoMeat;
			}
		};

		tabBlocks = new CreativeTabs("kc_blocks") {

			@Override
			public Item getTabIconItem() {
				return Item.getItemFromBlock(KCBlocks.seaAmber);
			}
		};

		tabClothing = new CreativeTabs("kc_clothing") {

			@Override
			public Item getTabIconItem() {
				return KCItems.amberArmor[0];
			}
		};
	}

}
