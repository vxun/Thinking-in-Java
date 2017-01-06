package chapter15_generics;
import java.util.*;
/**
 * @author ZhangXiuwu
 * 因为contains 和 indexOf 参数为Object， 所以编译器可以检查，不会报错
 */
public class CompilerIntelligence {

	public static void main(String[] args) {
		List<? extends Fruit> flist = Arrays.asList(new Apple());
		Apple a = (Apple) flist.get(0);
		flist.contains(new Apple());
		flist.indexOf(new Apple());
	}
	
	
	
}
