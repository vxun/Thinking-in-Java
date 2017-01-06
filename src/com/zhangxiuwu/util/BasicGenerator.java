package com.zhangxiuwu.util;

public class BasicGenerator<T> implements Generator<T>{

	private Class<T> type;
	
	private BasicGenerator(Class<T> type){
		this.type = type;
	}
	
	public static <T> Generator<T> create(Class<T> type){
		return new BasicGenerator<T>(type);
	}
	@Override
	public T next() {
		// 生成的类必须是有默认构造器的
		try {
			return type.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			throw new RuntimeException(e); 
		}
	}

}
