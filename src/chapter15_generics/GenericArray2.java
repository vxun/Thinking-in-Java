package chapter15_generics;

/**
 * @author ZhangXiuwu
 * 添加对T的显示转型
 * @param <T>
 */
public class GenericArray2<T> {

	private Object[] array;
	public GenericArray2(int size)
	{
		array = new Object[size];
	}
	
	public void put(int index, T item)
	{
		array[index] = item;
	}
	
	public T get(int index)
	{
		return (T)array[index];
	}
	
	public T[] rep(){
		return (T[])array;
	}
	
	public static void main(String[] args)
	{
		GenericArray2<Integer> ga = new GenericArray2<Integer>(10);
		for (int i = 0; i < 10; i++)
		{
			ga.put(i, i);;
		}
		for (int i = 0; i < 10; i++) 
		{
			ga.get(i);
		}
		
//		Integer[] rep = ga.rep(); //  java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.Integer;
		Object[] rep = ga.rep();
	}
	
	
}
