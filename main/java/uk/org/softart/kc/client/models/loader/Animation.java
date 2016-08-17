package uk.org.softart.kc.client.models.loader;

import java.util.ArrayList;
import java.util.TreeMap;

import com.google.common.collect.Ordering;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Animation {
	public String name;
	public String identifier;

	public boolean loops;

	public TreeMap<String, ArrayList<AnimationComponent>> sets = new TreeMap<String, ArrayList<AnimationComponent>>(Ordering.natural()); // cube
																																			// identifier
}
