package chapter16_arrays;
import java.util.*;
/**
 * @author ZhangXiuwu
 * 通过Comparator接口实现排序
 */
class CompTypeComparator implements Comparator<CompType>
{
	@Override
	public int compare(CompType arg0, CompType arg1) {
		return arg0.j < arg1.j ? -1 : (arg0.j == arg1.j ? 0 : 1);
	}
}

public class ComparatorTest {

	public static void main(String[] args) {
		CompType[] a = new CompType[10];
		for (int i = 0; i < 10; i++)
		{
			a[i] = CompType.generator().next();
		}
		System.out.println("befor sorting");
//		System.out.println(Arrays.toString(a));
		Arrays.sort(a, new CompTypeComparator());
		System.out.println("arter sorting");
		System.out.println(Arrays.toString(a));
		
		/**
		 * 针对排序后的数组进行查找
		 */
		while(true) 
		{
			CompType type = CompType.generator().next();
			// 根据排序规则比较是否相等
			int idx = Arrays.binarySearch(a, type);
			System.out.println(" idx " + idx + " j " + type.j + " i " + type.i);
			
			if (idx > 0)
			{
				System.out.println(a[idx]);
				break;
			}
		}
		
		
	}
	
}
