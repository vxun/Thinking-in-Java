package chapter14;
import static com.zhangxiuwu.util.Print.*;
/**
 * @author ZhangXiuwu
 * Class 的一些方法
 * 
 * 在使用forName() 时，必须使用完全限定名;
 * 
 * newInstance()方法创建的类，必须带有默认构造器;
 * 
 * 类如果没有继承其他的类时，superClass获取的就是Object
 * 
 */

interface HasBatteries{}
interface Waterproof{} // 不透水的
interface Shoots {}

interface TestInterface{}

class Toy {
	Toy() {} // 去掉默认构造器，就无法通过newInstance创建实例对象
	Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots{
	FancyToy(){ super(1); }
}

public class ToyTest implements TestInterface{

	static void printInfo(Class cc) {
		print("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
		print("Simple name: " + cc.getSimpleName());
		print("Canonical name: " + cc.getCanonicalName()); //canonical 权威的
		delimite();
	}
	
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("chapter14.FancyToy");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			print("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		
		Class[] interfaces = c.getInterfaces();
		for (Class i : interfaces)
		{
			printInfo(i);
		}
		Class superclass = c.getSuperclass();
		printInfo(superclass);
		try {
			Object superC = superclass.newInstance();
			print(superC.getClass());
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			print("can't find SuperClass");
		}
		
	}
}
