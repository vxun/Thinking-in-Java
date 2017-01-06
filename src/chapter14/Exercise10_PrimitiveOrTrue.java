package chapter14;
import static com.zhangxiuwu.util.Print.*;
/**
 * 判断char数组是基本类型还是对象
 * @author ZhangXiuwu
 *
 */
public class Exercise10_PrimitiveOrTrue {

	public static void main(String[] args)
	{
		char[] ac = "Hello Word".toCharArray();
		print("ac.getClass = " + ac.getClass());
		print("ac.getSuperClass = " + ac.getClass().getSuperclass());
		char c = 'c';
//		print("c.getClass = " + c.getClass); 基本类型没有方法 
		int[] ia= new int[3];
		print("ia.getClass = " + ia.getClass());
		print("ia.getSuperClass = " + ia.getClass().getSuperclass());
		long[] la = new long[3];
		print("la.getClass = " + la.getClass());
		print("la.getSuperClass = " + la.getClass().getSuperclass());
		double[] da = new double[3];
		print("da.getClass = " + da.getClass());
		print("da.getSuperClass = " + da.getClass().getSuperclass());
		String[] sa = new String[3];
		print("sa.getClass = " + sa.getClass());
		print("sa.getSuperClass = " + sa.getClass().getSuperclass());
		
		Exercise10_PrimitiveOrTrue[] ea = new Exercise10_PrimitiveOrTrue[3];
		print("ea.getClass = " + ea.getClass());
		print("ea.getSuperClass = " + ea.getClass().getSuperclass());
		
		int[][][] thread = new int[3][][];
		print("thread.getClass = " + thread.getClass());
		print("thread.getSuperClass = " + thread.getClass().getSuperclass());
		
	}
	
	
}
