package chapter15_generics.watercolors;

import java.util.*;

import com.zhangxiuwu.util.Sets;

public class WaterColorSets {

	public static void main(String[] args)
	{
		Set<WaterColors> set1 = EnumSet.range(WaterColors.BRILLIANT_RED, WaterColors.CERULEAN_BLUE_HUE);
		Set<WaterColors> set2 = EnumSet.range(WaterColors.ROSE_MADDER, WaterColors.PHTHALO_BLUE);
		
		System.out.println(" set1: " + set1);
		System.out.println(" set2: " + set2);
		System.out.println(" union(set1, set2) " + Sets.union(set1, set2));
		System.out.println(" intersection(set1, set2) " + Sets.intersection(set1, set2));
		System.out.println(" difference(set1, set2) " + Sets.difference(set1, set2));
		System.out.println(" complement(set1, set2) " + Sets.complement(set1, set2));
	}
	
}
