package chapter15_generics;

import com.zhangxiuwu.util.*;

public class TupleTest2 {

	
	static TwoTuple<String, Integer> f() 
	{
		return Tuple.twoTuple("Hi", 47);
	}
	
	static TwoTuple f2() // 编译器警告
	{
		return Tuple.twoTuple("Hi", 46);
	}
	
	
}
