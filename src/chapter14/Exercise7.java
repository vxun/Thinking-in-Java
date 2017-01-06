package chapter14;

/**
 * 
 * @author ZhangXiuwu
 *
 */
public class Exercise7 {
	public static void main(String[] args) {
		if (args.length < 1)
		{
			System.err.println("Usage: java Exercise7 ClassName");
		}
		for (String arg : args)
		{
			try {
				Class<?> class1 = Class.forName(arg);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println("Can't find " + arg);
			}
		}
	}
}
