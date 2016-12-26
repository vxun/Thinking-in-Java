package chapter11;

import java.util.*;
/**
 * 
 * @author ZhangXiuwu
 * Arrays.asList()的输出，将其当做List。在这种情况下，list底层是作为数组的，因此不能调整尺寸，在使用add和delete方法时，会引发错误
 *
 */

class Snow{}
// 粉末
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
// 有壳的
class Crusty extends Snow{}
// 烂泥
class Slush extends Snow{}

public class AsListInference {
	
	public static void main(String[] args) {
//		List<Snow> snow1 = new ArrayList<Snow>();
		List<Snow> snow1 = Arrays.asList(new Powder(), new Crusty(), new Slush());
		/**
		 * snow1 底层实现是一个数组，是不能够增加数据的，因此会出错
		 * snow1.add(new Powder());
		 */
		System.out.println(snow1);
		
		List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
//		snow2.add(new Light());
		System.out.println(snow2);
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		System.out.println(snow3);
		
		/**
		 * 显示类型参数说明
		 */
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
		System.out.println(snow4);
		
	}
	
	
	
}
