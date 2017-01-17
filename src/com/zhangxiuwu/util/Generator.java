package com.zhangxiuwu.util;
/**
 * 生成器：不同于工厂方法， 工厂方法一般需要参数；生成器不需要参数
 * @author ZhangXiuwu
 *
 */
public interface Generator<T> {

	T next();
	
}
