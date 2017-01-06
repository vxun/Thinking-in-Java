package com.zhangxiuwu.util;

public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D>{

	public final E e;
	
	public FiveTuple(A a, B b, C c, D d, E e)
	{
		super(a, b, c, d);
		this.e = e;
	}
}
