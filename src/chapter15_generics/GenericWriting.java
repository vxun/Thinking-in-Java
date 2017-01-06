package chapter15_generics;
import java.util.*;
public class GenericWriting {

	static <T> void writeExact(List<T> list, T item)
	{
		list.add(item);
	}
	
	static List<Apple> apples = new ArrayList<Apple>();
	static List<Fruit> fruits = new ArrayList<Fruit>();
	
	static void f1() 
	{
		try {
			writeExact(apples, new Apple());
			writeExact(fruits, new Apple());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static <T> void writeWithWildCard(List<? super T> list, T item)
	{
		list.add(item);
	}
	
	static void f2()
	{
		try {
			writeWithWildCard(apples, new Apple());
			writeWithWildCard(fruits, new Apple());
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		f1();
		f2();
		System.out.println(apples);
		System.out.println(fruits);
		
	}
}
