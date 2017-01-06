package chapter15_generics;

public class GenericArray<T> {
	private T[] array;
	public GenericArray(int size)
	{
		array = (T[]) new Object[size];
	}
	public void put(int index, T item)
	{
		array[index] = item;
	}
	
	public T get(int index){return array[index];}
	
	public T[] rep() { return array; }
	
	public static void main(String[] args)
	{
		 GenericArray<String> ga = new GenericArray<String>(10);
		 ga.put(1, "one");
		 String one = ga.get(1);
//		 String[] array = ga.rep(); //java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.String;
		 Object[] array = ga.rep(); // 泛型擦除，实际运行时的类型为Object[]
		 System.out.println("one " + one + " array " + array);
	}

	
}
