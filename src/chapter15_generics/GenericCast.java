package chapter15_generics;

/**
 * @author ZhangXiuwu
 * 使用带有泛型类型参数的类型或instancof不会有任何效果。
 */
class FixedSizeStack<T> {
	private int index = 0;
	private Object[] storage; // 只能是Object， 其他类型均不可
	public FixedSizeStack(int size) {
		storage = new Object[size];
	}
	public void push(T item) 
	{
		storage[index++] = item;
	}
	public T pop() 
	{
		// 被强制要求转型，但是又被警告不应该转型
		return (T) storage[--index];
	}
}

public class GenericCast {

	public static final int SIZE = 6;
	public static void main(String[] args)
	{
		FixedSizeStack<String> f = new FixedSizeStack<String>(SIZE);
		for (String s : "A B C D E F".split(" "))
		{
			f.push(s);
		}
		for(int i = 0; i < SIZE; i++)
		{
			String s = f.pop();
			System.out.println(s + " ");
		}
	}
	
}
