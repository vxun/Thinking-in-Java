package com.zhangxiuwu.util;
import java.util.*;
/**
 * @author ZhangXiuwu
 *
 */
public class CountingMapData extends AbstractMap<Integer, String>{

	private int size;
	private static String[] chars = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".split(" ");
	public CountingMapData(int size)
	{
		if (size < 0)
			size = 0;
		this.size = size;
	}
	
	@Override
	public Set<Map.Entry<Integer, String>> entrySet() {
		Set<Map.Entry<Integer, String>> entries = new LinkedHashSet<Map.Entry<Integer, String>>();
		for (int i = 0; i < size; i++)
		{
			entries.add(new Entry(i));
		}
		return entries;
	}

	private class Entry implements Map.Entry<Integer, String>
	{
		int index;
		Entry(int index) {
			this.index = index;
		}
		
		@Override
		public boolean equals(Object obj) {
			return Integer.valueOf(index).equals(obj);
		}
		
		@Override
		public int hashCode() {
			return Integer.valueOf(index).hashCode();
		}
		
		@Override
		public Integer getKey() {
			return index;
		}
		@Override
		public String getValue() {
			return chars[index % chars.length] + Integer.toString(index / chars.length);
		}
		@Override
		public String setValue(String value) {
			throw new UnsupportedOperationException();
		}
		
	}
	
	
	
}
