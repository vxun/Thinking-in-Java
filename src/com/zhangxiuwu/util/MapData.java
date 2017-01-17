package com.zhangxiuwu.util;
import java.util.*;
/**
 * @author ZhangXiuwu
 *
 * @param <K>
 * @param <V>
 */
public class MapData<K, V> extends LinkedHashMap<K, V>{

	private static final long serialVersionUID = -8025451432538205839L;

	public MapData(Generator<TwoTuple<K, V>> gen, int quantity) {
		for (int i = 0; i < quantity; i++)
		{
			TwoTuple<K,V> next = gen.next();
			put(next.a, next.b);
		}
	}
	
	public MapData(Generator<K> k, Generator<V> v, int quantity) {
		for (int i = 0; i < quantity; i++)
		{
			put(k.next(), v.next());
		}
	}
	
	public MapData(Generator<K> k, V v, int quantity) {
		for (int i = 0; i < quantity; i++)
		{
			put(k.next(), v);
		}
	}
	
	public MapData(Iterable<K> ks, Generator<V> v) {
		for (K k : ks)
		{
			put(k, v.next());
		}
	}
	
	public MapData(Iterable<K> ks, V v) {
		for (K k : ks)
		{
			put(k, v);
		}
	}
}
