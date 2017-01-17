package chapter16_arrays;
import java.util.*;
import com.zhangxiuwu.util.*;
/**
 * @author ZhangXiuwu
 * 数组元素的比较
 */


public class CompType implements Comparable<CompType>{

	int i;
	int j;
	private static int count = 1;
	public CompType(int n1, int n2){
		i = n1;
		j = n2;
	}
	public String toString() {
		String result = "[i = " + i + ", j = " + j + "]";
		if (count++ % 3 == 0)
		{
			result += "\n";
		}
		return result;
	}
	@Override
	public int compareTo(CompType o) {
		return (i < o.i ? -1: ( i == o.i ? 0 : 1));
	}
	
	/**
	 * Arrays.binarySearch(); 方法不会调用equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (CompType.class.isInstance(obj)) {
			CompType c = (CompType)obj;
			return  c.j == j;
		}
		return false;
	}
	
	private static Random random = new Random(47);
	public static Generator<CompType> generator()
	{
		return new Generator<CompType>() {
			@Override
			public CompType next() {
				return new CompType(random.nextInt(100), random.nextInt(100));
			}
		};
	}
	public static void main(String[] args) {
		CompType[] a = new CompType[10];
		for (int i = 0; i < 10; i++)
		{
			a[i] = CompType.generator().next();
		}
		System.out.println("befor sorting");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("arter sorting");
		System.out.println(Arrays.toString(a));
		
	}
}
