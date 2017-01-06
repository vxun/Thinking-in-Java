package chapter14;

/**
 * 递归打印出一个对象的所有继承结构
 * @author ZhangXiuwu
 *
 */
interface I {}
interface II extends I {}
interface III extends II {}

class A {}
class AA extends A{}
class AAA extends AA{}
class AB extends A{}
class ABA extends AB implements III {}

public class Exercise8 {

	public static void myPrintClasses(Class<?> c)
	{
		if (c == null) {
			return;
		}
		Class<?> superClass = c.getSuperclass();
		Class<?>[] interfaces = c.getInterfaces();
		if (interfaces != null)
		{
			for (Class<?> i : interfaces) 
			{
				System.out.println(c.getName() + " 实现了 " + i.getName());
				if (i.isInterface()) {
					myPrintClasses(i);
				}
			}
		}
		if (superClass != null) {
			System.out.println(c.getName() + " 继承自 " + superClass.getName());
			myPrintClasses(superClass);
		} else {
			return;
		}
	}
	
	public static void printClasses(Class<?> c)
	{
		if (c == null)
		{
			return;
		}
		System.out.println(c.getName());
		for (Class<?> i : c.getInterfaces())
		{
			System.out.println("Interface: " + i.getName());
			printClasses(i.getSuperclass());
		}
		printClasses(c.getSuperclass());
		
	}
	
	
	public static void main (String[] args)
	{
		Exercise8.printClasses(ABA.class);
	}
	
}
