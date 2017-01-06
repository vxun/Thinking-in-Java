package chapter15_generics;

import java.util.*;
/**
 * @author ZhangXiuwu
 *
 */
public class GenericsAndConvariant {

	public static void main(String[] args)
	{
		List<? extends Fruit> flist = new ArrayList<Apple>();
		/**
		Compile Error 
		flist.add(new Apple());
		flist.add(new Fruit());
		flist.add(new Orange());
		*/
		flist.add(null);
		Fruit fruit = flist.get(0);
		System.out.println(fruit);
		
		
		
		/**
		 * flist2 can add any Object
		 */
		List flist2 = new ArrayList<Apple>();
		flist2.add(new Apple()); // add any Object
		
	}
	
	
}
