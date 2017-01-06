package chapter15_generics;

/**
 * @author ZhangXiuwu
 * 基类劫持接口
 */
public class ComparablePet implements Comparable<ComparablePet>{
	@Override
	public int compareTo(ComparablePet arg0) {
		return 0;
	}
}


/**
 * @author ZhangXiuwu
 * Error
class Cat extends ComparablePet implements Comparable<Cat> {
	
}
*/

/**
 * @author ZhangXiuwu
 * Correct
 */
class Cat extends ComparablePet implements Comparable<ComparablePet> {
	
}