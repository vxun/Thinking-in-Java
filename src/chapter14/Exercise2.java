package chapter14;

import static com.zhangxiuwu.util.Print.delimite;
import static com.zhangxiuwu.util.Print.print;

import java.lang.annotation.Annotation;

import javax.jws.WebService;

/**
 * @author ZhangXiuwu
 * ***************************************
 * 添加新借口
 * 
 * ***************************************
 */
@WebService
interface HasCPU{}

@Deprecated
class FancierToy extends FancyToy implements HasCPU{}

public class Exercise2 {

	public static void printInfo(Class c)
	{
		print("Class name: " + c.getName());
		print("Simple name: " + c.getSimpleName());
		print("Canonical name: " + c.getCanonicalName());
		Annotation[] annotations = c.getAnnotations();
		for (Annotation annotation : annotations)
		{
			print("Annotation " + annotation.annotationType().getName());
		}
		
		delimite();
	}
	
	public static void main(String[] args)
	{
		Class c = null;
		try {
			c = Class.forName("chapter14.FancierToy");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			print("FancierToy can't find");
		}
		printInfo(c);
		
		Class[] interfaces = c.getInterfaces();
		for(Class i : interfaces)
		{
			printInfo(i);
		}
		Class sup = c.getSuperclass();
		printInfo(sup);
		
		
	}
	
	
	
}
