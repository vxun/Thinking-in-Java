package chapter15_generics;

import java.util.*;
/**
 * @author ZhangXiuwu
 * 协变 和 通配符
 * 
 * 读取： 采用 类型通配符
 * 写入： 采用超类型通配符
 * 
 */
public class GenericReading {

	// 没有使用通配符
	static <T> T readExact(List<T> list)
	{
		return list.get(0);
	}
	
	static List<Apple> apples = Arrays.asList(new Apple());
	static List<Fruit> fruits = Arrays.asList(new Fruit());
	
	static void f1()
	{
		Apple apple = readExact(apples);
		Fruit fruit = readExact(fruits);
	}
	
	static class Reader<T> {
		T readerExact(List<T> list)
		{
			return list.get(0);
		}
	}
	
	static void f2()
	{
		// 在对象创建成功之后，即确定类型
		Reader<Fruit> fruitR = new Reader<Fruit>();
//		fruitR.readerExact(apples); Error
		fruitR.readerExact(fruits);
	}
	
	// 协变类型
	static class CovariantReader<T> {
		T readerExact(List<? extends T> list)
		{
			return list.get(0);
		}
	}
	
	static void f3()
	{
		CovariantReader<Fruit> fruitC = new CovariantReader<Fruit>();
		Fruit fruit1 = fruitC.readerExact(fruits);
		Fruit fruit2 = fruitC.readerExact(apples);
		Apple apple = (Apple) fruitC.readerExact(apples);
	}
	
	public static void main(String[] args)
	{
		f1();
		f2();
		f3();
	}
	
}
