package chapter14;

import static com.zhangxiuwu.util.Print.*;

/**
 * Class 对象， 一旦某个类的Class对象被夹在进内存中，他就用来创建这个类的对象
 * Class 只有在使用的时候才会被加载到内存中
 * @author ZhangXiuwu
 * 
 */
class Candy {
	static {print("Loading Candy");}
}

class Gum {
	static {print("Loading Gum");}
}

class Cookie {
	static {print("Loading Cookie");}
}

public class SweetShop {
	public static void main(String[] args) {
		print("inside main");
		new Candy();
		print("after Creating Candy");
		try {
			Class.forName("chapter14.Gum");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		print("After Class.forName(\"Gum\")");
		new Cookie();
		print("After Creating Cookie");
	}
}
