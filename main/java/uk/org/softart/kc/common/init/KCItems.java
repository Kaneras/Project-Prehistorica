package uk.org.softart.kc.common.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import uk.org.softart.kc.common.items.ItemKCArmor;
import uk.org.softart.kc.common.items.ItemKCPickaxe;

public class KCItems {

	public static List<Item> items = new ArrayList<Item>();
	
	public static Item[] amberTools;
	public static Item[] boneTools;
	
	public static Item[] amberArmor;
	public static Item[] boneArmor;
	
	public static Item bacteria;
	
	public static Item dinoMeat;
	public static Item cookedDinoMeat;
	public static Item embroidery;
	public static Item cookedEmbroidery;
	public static Item meat;
	
	public static Item dna;
	public static Item dinoCell;
	public static Item fernItem;
	public static Item insect;
	public static Item protein;
	public static Item seaAmber;
	public static Item shell;
	public static Item tooth;
	
	public static ArmorMaterial amberArmorMaterial = EnumHelper.addArmorMaterial("amber", "none", 33, new int[]{3, 8, 6, 3}, 10);
	public static ArmorMaterial boneArmorMaterial = EnumHelper.addArmorMaterial("bone", "none", 10, new int[]{1, 4, 3, 2}, 10);
	
	public static void init() {
		amberTools = new Item[4];
		amberTools[0] = addItem(new ItemHoe(ToolMaterial.EMERALD).setCreativeTab(KCCreativeTabs.tabTools), "amberHoe");
		amberTools[1] = addItem(new ItemKCPickaxe(ToolMaterial.EMERALD).setCreativeTab(KCCreativeTabs.tabTools), "amberPickaxe");
		amberTools[2] = addItem(new ItemSpade(ToolMaterial.EMERALD).setCreativeTab(KCCreativeTabs.tabTools), "amberSpade");
		amberTools[3] = addItem(new ItemSword(ToolMaterial.EMERALD).setCreativeTab(KCCreativeTabs.tabTools), "amberSword");
		
		boneTools = new Item[4];
		boneTools[0] = addItem(new ItemHoe(ToolMaterial.IRON).setCreativeTab(KCCreativeTabs.tabTools), "boneHoe");
		boneTools[1] = addItem(new ItemKCPickaxe(ToolMaterial.IRON).setCreativeTab(KCCreativeTabs.tabTools), "bonePickaxe");
		boneTools[2] = addItem(new ItemSpade(ToolMaterial.IRON).setCreativeTab(KCCreativeTabs.tabTools), "boneSpade");
		boneTools[3] = addItem(new ItemSword(ToolMaterial.IRON).setCreativeTab(KCCreativeTabs.tabTools), "boneSword");

		amberArmor = new Item[4];
		amberArmor[0] = addItem(new ItemKCArmor(ArmorMaterial.DIAMOND, 0, 0, "amber_armor_1.jpg").setCreativeTab(KCCreativeTabs.tabClothing), "amberArmor_0");
		amberArmor[1] = addItem(new ItemKCArmor(ArmorMaterial.DIAMOND, 0, 1, "amber_armor_1.jpg").setCreativeTab(KCCreativeTabs.tabClothing), "amberArmor_1");
		amberArmor[2] = addItem(new ItemKCArmor(ArmorMaterial.DIAMOND, 0, 2, "amber_armor_2.jpg").setCreativeTab(KCCreativeTabs.tabClothing), "amberArmor_2");
		amberArmor[3] = addItem(new ItemKCArmor(ArmorMaterial.DIAMOND, 0, 3, "amber_armor_1.jpg").setCreativeTab(KCCreativeTabs.tabClothing), "amberArmor_3");
		
		boneArmor = new Item[4];
		boneArmor[0] = addItem(new ItemKCArmor(ArmorMaterial.DIAMOND, 0, 0, "bone_armor_1.png").setCreativeTab(KCCreativeTabs.tabClothing), "boneArmor_0"); // helmet
		boneArmor[1] = addItem(new ItemKCArmor(ArmorMaterial.DIAMOND, 0, 1, "bone_armor_1.png").setCreativeTab(KCCreativeTabs.tabClothing), "boneArmor_1"); // chestplate
		boneArmor[2] = addItem(new ItemKCArmor(ArmorMaterial.DIAMOND, 0, 2, "bone_armor_2.png").setCreativeTab(KCCreativeTabs.tabClothing), "boneArmor_2"); // leggings
		boneArmor[3] = addItem(new ItemKCArmor(ArmorMaterial.DIAMOND, 0, 3, "bone_armor_1.png").setCreativeTab(KCCreativeTabs.tabClothing), "boneArmor_3"); // boots
		
		bacteria = addItem(new Item().setCreativeTab(KCCreativeTabs.tabCollectables), "bacteria");
		
		dinoMeat = addItem(new ItemFood(1, true).setCreativeTab(KCCreativeTabs.tabFoods), "dinoMeat");
		cookedDinoMeat = addItem(new ItemFood(3, true).setCreativeTab(KCCreativeTabs.tabFoods), "cookedDinoMeat");
		embroidery = addItem(new ItemFood(1, true).setCreativeTab(KCCreativeTabs.tabFoods), "embroidery");
		cookedEmbroidery = addItem(new ItemFood(3, true).setCreativeTab(KCCreativeTabs.tabFoods), "cookedEmbroidery");
		meat = addItem(new ItemFood(1, true).setCreativeTab(KCCreativeTabs.tabFoods), "meat");
		
		dna = addItem(new Item().setCreativeTab(KCCreativeTabs.tabCollectables), "dna");
		dinoCell = addItem(new Item().setCreativeTab(KCCreativeTabs.tabCollectables), "dinoCell");
		fernItem = addItem(new Item().setCreativeTab(KCCreativeTabs.tabCollectables), "fernItem");
		insect = addItem(new Item().setCreativeTab(KCCreativeTabs.tabCollectables), "insect");
		protein = addItem(new Item().setCreativeTab(KCCreativeTabs.tabCollectables), "protein");
		seaAmber = addItem(new Item().setCreativeTab(KCCreativeTabs.tabCollectables), "seaAmber");
		shell = addItem(new Item().setCreativeTab(KCCreativeTabs.tabCollectables), "shell");
		tooth = addItem(new Item().setCreativeTab(KCCreativeTabs.tabCollectables), "tooth");
	}

	private static Item addItem(Item item, String unlocalizedName) {
		item.setUnlocalizedName(unlocalizedName);
		GameRegistry.registerItem(item, unlocalizedName);
		items.add(item);
		return item;
	}
}
