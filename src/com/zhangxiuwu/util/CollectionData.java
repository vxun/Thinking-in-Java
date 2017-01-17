package com.zhangxiuwu.util;
import java.util.*;
/**
 * @author ZhangXiuwu
 * @param <T>
 * 容器
 */
public class CollectionData<T> extends ArrayList<T>{
	private static final long serialVersionUID = -1560730508291539794L;
	public CollectionData(Generator<T> gen, int quantity)
	{
		for (int i = 0; i < quantity; i++)
		{
			add(gen.next());
		}
	}
	
	public static <T> CollectionData<T> list(Generator<T> gen, int quantity) 
	{
		return new CollectionData<T>(gen, quantity);
	}

}
