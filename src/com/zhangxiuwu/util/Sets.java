package com.zhangxiuwu.util;
import java.util.*;
/**
 * @author ZhangXiuwu
 * 集合计算工具
 * 通过Set计算集合的交集， 并集， 差集等
 */
public class Sets {

	// 并集
	public static <T> Set<T> union(Set<T> a, Set<T> b)
	{
		Set<T> result = new HashSet<T>(a);
		result.addAll(b);
		return result;
	}
	
	// 交集
	public static <T> Set<T> intersection(Set<T> a, Set<T> b)
	{
		Set<T> result = new HashSet<T>(a);
		result.retainAll(b);
		return result;
	}
	
	// 差集
	public static <T> Set<T> difference(Set<T> superset, Set<T> subset)
	{
		Set<T> result = new HashSet<T>(superset);
		superset.removeAll(subset);
		return result;
	}
	
	// 补集
	public static <T> Set<T> complement(Set<T> a, Set<T> b)
	{
		Set<T> union = union(a, b);
		Set<T> intersection = intersection(a, b);
		return difference(union, intersection);
	}
	
}
