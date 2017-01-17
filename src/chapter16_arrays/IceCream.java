package chapter16_arrays;
import java.util.*;

/**
 * @author ZhangXiuwu
 * 返回一个数组。对于C和C++不能返回一个数组，只能返回数组的指针。
 * Java 可以直接返回一个数组，无需担心内存泄漏问题
 */
public class IceCream {

	private static Random random = new Random(47);
	
	static final String[] FLAVORS = {
			"Chocolate", "Strawbrry", "Vanilla Fudge Swirl", "Mint Chip",
			"Mocha Almond Fudge", "Rum Raisin", "Praline Cream", "Mud Pie"
	};
	
	public static String[] flavorSet(int n) 
	{
		if (n > FLAVORS.length)
		{
			throw new IllegalArgumentException("Set to Big");
		}
		String[] results = new String[n];
		boolean[] picked = new boolean[FLAVORS.length];
		for (int i = 0; i < n; i++)
		{
			 int t;
			 do
				 t = random.nextInt(FLAVORS.length);
			 while (picked[t]);
			 results[i] = FLAVORS[t];
			 picked[t] = true;
		}
		return results; 
	}
	public static void main(String[] args) {
		for(int i = 0; i < 7; i++)
			System.out.println(Arrays.toString(flavorSet(3)));
	}
	
}
