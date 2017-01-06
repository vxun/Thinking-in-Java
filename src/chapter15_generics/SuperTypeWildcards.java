package chapter15_generics;
import java.util.*;
/**
 * @author ZhangXiuwu
 * 逆变
 * 使用超类型通配符
 */
public class SuperTypeWildcards {

	/**
	 * 未出现编译
	 * @param apples
	 */
	static void writeTo(List<? super Apple> apples)
	{
		apples.add(new Apple());
		apples.add(new Jonathan());
	}
	
}
