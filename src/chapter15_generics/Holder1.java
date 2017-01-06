package chapter15_generics;

/**
 * 简单自定义容器类， 只持有一个对象
 * 可复用性差
 * @author ZhangXiuwu
 */

class Automobile{}

public class Holder1 {
	private Automobile a;
	public Holder1(Automobile a) 
	{
		this.a = a;
	}
	public Automobile get() 
	{
		return a;
	}
}
