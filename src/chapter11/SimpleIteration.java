package chapter11;

import java.util.Iterator;
import java.util.List;

import com.zhangxiuwu.typeinfo.pets.Pet;
import com.zhangxiuwu.typeinfo.pets.Pets;
/**
 * 
 * @author ZhangXiuwu
 *
 */
public class SimpleIteration {
	public static void main(String[] args) {
		List<Pet> pets = Pets.arrayList(12);
		Iterator<Pet> iterator = pets.iterator();
		
//		while(iterator.hasNext()) {
//			Pet p = iterator.next();
//			System.out.println(p.getName());
//		}
		System.out.println(pets);
		
		iterator = pets.iterator();
		for(int i = 0; i < 6; i++) {
			iterator.next();
			iterator.remove();
		}
		System.out.println(pets);
		
	}
}
