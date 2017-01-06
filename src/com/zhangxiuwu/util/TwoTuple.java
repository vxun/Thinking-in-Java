package com.zhangxiuwu.util;
/**
 * 二元元组（可以在一个return 中返回多个对象）
 * @author ZhangXiuwu
 *
 * @param <F>
 * @param <S>
 */
public class TwoTuple<A, B> {

	public final A a;
	public final B b;
	public TwoTuple(A a, B b)
	{
		this.a = a;
		this.b = b;
	}
	public String toString()
	{
		return "(" + a + "." + b + ")";
	}
	
	public static void main(String[] args)
	{
		TwoTuple<Integer,String> tuple1 = new TwoTuple<Integer, String>(1, "111");
		TwoTuple<Integer,String> tuple2 = new TwoTuple<>(2, "222");
		System.out.println(tuple1);
		System.out.println(tuple2);
	}
	
	
}
