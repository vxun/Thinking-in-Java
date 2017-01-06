package chapter13;

/**
 * 正则表达式
 * @author ZhangXiuwu
 *
 */
public class IntegerMatch {

	public static void main (String[] args) {
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("5678".matches("-?\\d+"));
		System.out.println("+911".matches("-?\\d+"));
		System.out.println("+911".matches("(-?|\\+)\\d+"));
	}
	
}
/**
true
true
false
true
**/