package chapter15_generics;
/**
 * @author ZhangXiuwu
 * 
 */
public class ArrayOfGeneric {

	static final int SIZE = 100;
	static Generic<Integer>[] gia;
	
	public static void main(String[] args)
	{
//		gia = new Generic<Integer>[SIZE];  // compile error
		gia = ((Generic<Integer>[])new Generic[SIZE]);
		gia[0] = new Generic<Integer>();
//		gia[1] = new Object();  // compile error
//		gia[1] = new Generic<Double>(); // compile error
		System.out.println(gia);
		System.out.println(gia.getClass().getSimpleName());
	}
}
