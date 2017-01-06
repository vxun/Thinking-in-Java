package chapter15_generics;

import java.util.*;

import com.zhangxiuwu.util.New;

/**
 * @author ZhangXiuwu
 * 泛型方法显示置顶类型说明
 * 用法：
 * 必须在.操作符与方法名之间插入尖括号<>，然后将类型置于尖括号<>内
 * 在类的内部调用，需要在.操作符之前使用this关键词
 * 如果方法为static，必须在.操作符之前加上类名
 */
public class ExplicitTypeSpecification {

	static void f(Map<Integer, List<String>> map)
	{
		System.out.println(map);
	}
	
	public static void main(String[] args)
	{
		// 显示指定泛型方法的 类型参数
		f(New.<Integer, List<String>>hashMap());
	}
	
}
