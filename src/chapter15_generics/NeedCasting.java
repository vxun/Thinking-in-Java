package chapter15_generics;

import java.io.*;
import java.util.*;
/**
 * @author ZhangXiuwu
 * 有时，泛型没有消除对转型的需要，这就会由编译器产生警告，而这个警告是不恰当的。
 */
public class NeedCasting {

	public static void main(String[] args)
	{
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
			Object object = in.readObject();
			// in.readObject() 不知道返回的什么类型，所以必须转型. 但是转型又有警告
			List<NeedCasting> obj = (List<NeedCasting>) object;
			
			// 可以通过JDK1.5引入新的转型形式
			List cast = List.class.cast(object);
			
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
	
}
