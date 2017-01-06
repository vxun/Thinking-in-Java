package com.zhangxiuwu.util;

import java.util.*;

/**
 * @author ZhangXiuwu
 * 利用泛型方法的类型推断，简化一些泛型类的创建代码
 */
public class New {

	public static <K,V> HashMap<K,V> hashMap()
	{
		return new HashMap<K, V>();
	}
	
	public static <T> ArrayList<T> arrayList()
	{
		return new ArrayList<T>();
	}
	
	public static <T> LinkedList<T> linkedList()
	{
		return new LinkedList<T>();
	}
	
	public static <T> HashSet<T> hashSet()
	{
		return new HashSet<T>();
	}
	
	public static <T> TreeSet<T> treeSet()
	{
		return new TreeSet<T>();
	}
	
	
	public static void main(String[] args)
	{
		Map<Integer, String> m = New.hashMap();
		m.put(1, "11");
		List<Double> l = New.arrayList();
		l.add(2.0);
		System.out.println(m);
		System.out.println("====");
		System.out.println(l);
	}
	
	
}
