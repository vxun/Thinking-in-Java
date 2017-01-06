package chapter15_generics;

import com.zhangxiuwu.typeinfo.pets.*;
import com.zhangxiuwu.util.New;

import java.util.*;

/**
 * @author ZhangXiuwu
 * 类型推断的局限：
 * 类型推断只对赋值操作有效，其他时候并不起作用。例如当New.hashMap() 当成参数时，编译器是报错的（JDK1.8已经可以了）
 */
public class LimitsOfInference {
	static void f(Map<Integer, List<? extends Pet>> map) {
		System.out.println(map);
	}
	public static void main(String[] args)
	{
		// JDK1.5时会变编译出错
		f(New.hashMap()); 
	}
}
