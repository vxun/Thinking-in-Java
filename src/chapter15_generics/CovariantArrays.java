package chapter15_generics;

import java.util.*;

/**
 * @author ZhangXiuwu
 * 数组可以向导出类的数组中赋予基类性的数组引用
 */

class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Orange extends Fruit{}

public class CovariantArrays {
	public static void main(String[] args)
	{
		Fruit[] fruit = new Apple[10];
		fruit[0] = new Apple();
		fruit[1] = new Jonathan();
		try 
		{
			fruit[2] = new Orange(); // 编译器不会报错
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		try {
			fruit[0] = new Fruit();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
}
