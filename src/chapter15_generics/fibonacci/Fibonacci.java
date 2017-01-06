package chapter15_generics.fibonacci;

/**
 * 
 * @author ZhangXiuwu
 *
 */
public class Fibonacci {

	private int count = 0;
	public Integer next()
	{
		return fib(count++);
	}
	private int fib(int n )
	{
		if (n <2)
		{
			return 1;
		}
		else 
		{
			return fib(n-2) + fib(n-1);
		}
	}
	public static void main(String[] args)
	{
		Fibonacci gen = new Fibonacci();
		for(int i = 0; i < 18; i++)
		{
			System.out.print( gen.next() + " ");
		}
	}
}
