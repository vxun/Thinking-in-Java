package chapter15_generics;

/**
 * @author ZhangXiuwu
 * 泛型方法：
 * 1. 泛型方法所在的类可以是非泛型类
 * 2. static 修饰的方法不能访问泛型类的类型参数，可以通过泛型方法访问类型参数
 * 使用：
 * 将泛型参数列表置于返回值之前
 * 
 */
public class GenericMethod {

	public <T> void f(T t)
	{
		System.out.println(t.getClass().getSimpleName());
	}
	
	public static void main(String[] args)
	{
		GenericMethod gm = new GenericMethod();
		gm.f("");
		gm.f(1);
		gm.f(1.1);
		gm.f('c');
		gm.f(true);
	}
	
	
}
