package uk.org.softart.kc.common.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import uk.org.softart.kc.KCMain;

public class ItemKCArmor extends ItemArmor {
	
	private String loc;

	public ItemKCArmor(ArmorMaterial material, int renderIndex, int armorType, String loc) {
		super(material, renderIndex, armorType);
		this.loc = loc;
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return KCMain.MOD_ID + ":textures/armor/" + loc;
	}

}
