package chapter11;

import java.util.*;
import com.zhangxiuwu.typeinfo.pets.*;
/**
 * 
 * @author ZhangXiuwu
 *
 */
public class ListIteration {

	public static void main(String[] args) {
		List<Pet> pets = Pets.arrayList(8);
		ListIterator<Pet> it = pets.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next() + " " + it.nextIndex() + " " + it.previousIndex() + " " );
		}
		System.err.println("============================================");
		while(it.hasPrevious()) {
			System.out.println(it.previous() + " " + it.nextIndex() + " " + it.previousIndex() );
		}
	}
	
	
}
