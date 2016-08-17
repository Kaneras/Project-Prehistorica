package uk.org.softart.kc;

import net.minecraftforge.fml.common.FMLModContainer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.org.softart.kc.common.init.KCBlocks;
import uk.org.softart.kc.common.init.KCCreativeTabs;
import uk.org.softart.kc.common.init.KCItems;

@Mod(modid = KCMain.MOD_ID, name = KCMain.MOD_NAME, version = KCMain.MOD_VERSION)
public class KCMain {

	public static final String MOD_ID = "kc";
	public static final String MOD_NAME = "Kingdoms of Craftzoic";
	public static final String MOD_VERSION = "[TB-1] Alpha 1.0";
	
	@SidedProxy(clientSide = "uk.org.softart.kc.ClientProxy", serverSide = "uk.org.softart.kc.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		KCCreativeTabs.init();
		KCBlocks.init();
		KCItems.init();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.init();
	}
	
}
