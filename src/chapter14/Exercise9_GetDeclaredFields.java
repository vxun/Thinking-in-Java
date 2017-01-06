package chapter14;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
import static com.zhangxiuwu.util.Print.*;

/**
 * 采用Class.getDeclaredField打印类的相关信息
 * @author ZhangXiuwu
 *
 */

interface Iface{
	int i = 47;
	void f();
}
class Base implements Iface
{
	String s;
	double d;
	public void f() 
	{
		System.out.println(" Base.f ");
	}
}
class Composed
{
	Base b;
}
class Derived extends Base
{
	Composed c;
	String s;
}


public class Exercise9_GetDeclaredFields {

	static Set<Class<?>> alreadyDisplayed = new HashSet<Class<?>>();
	static void printClass(Class<?> c)
	{
		if (c == null)
		{
			return;
		}
		System.out.println("Name: " + c.getName());
		Field[] fields = c.getDeclaredFields();
		for (Field field : fields)
		{
			System.out.println("Field: " + field);
		}
		for (Field field : fields)
		{
			Class<?> k = field.getType();
			if (k!= null && !alreadyDisplayed.contains(k))
			{
				printClass(k);
				alreadyDisplayed.add(k);
			}
		}
		for(Class<?> k : c.getInterfaces())
		{
			System.out.println("Interface: " + k.getName());
		}
		printClass(c.getSuperclass());
		delimite();
	}
	
	public static void main(String[] args)
	{
		printClass(Derived.class);
	}
	
	
	
}
