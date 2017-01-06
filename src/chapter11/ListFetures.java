package chapter11;

import java.util.*;
import com.zhangxiuwu.typeinfo.pets.*;
import static com.zhangxiuwu.util.Print.*;
/**
 * 
 * @author ZhangXiuwu
 * List 方法
 */
public class ListFetures {

	public static void main(String[] args) {
		List<Pet> pets = Pets.arrayList(7);
		print("1: " + pets);
		Pet hamster = new Pet("Hamster");
		pets.add(hamster);
		print("2: " + pets);
		print("3: " + pets.contains(hamster));
		pets.remove(hamster);
		Pet p = pets.get(2);
		print("4: " + p + " " + pets.indexOf(p));
		Pet cymric = new Pet("cymric");
		print("5: " + pets.indexOf(cymric));
		print("6: " + pets.remove(cymric));
		print("7: " + pets.remove(p));
		print("8: " + pets);
		pets.add(3, new Pet("Mouse"));
		print("9: " + pets);
		List<Pet> sub = pets.subList(1, 4);
		print("sub: " + sub);
		print("10: " + pets.containsAll(sub));
		Collections.sort(sub, new Comparator<Pet>() {
			@Override
			public int compare(Pet o1, Pet o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});
		print("sorted: " + sub);
		print("11: " + pets.containsAll(sub));
		Collections.shuffle(sub, new Random(24));
		print("shuffled: " + sub);
		print("12: " + pets.containsAll(sub));
		List<Pet> copy = new ArrayList<Pet>(pets);
		sub = Arrays.asList(pets.get(1), pets.get(4));
		print("sub: " + sub);
		copy.retainAll(sub);
		print("13: " + copy);
		copy = new ArrayList<Pet>(pets);
		copy.remove(2);
		print("14: " + copy);
		copy.removeAll(sub);
		print("15: " + copy);
		copy.set(0, new Pet("Mouse"));
		print("16: " + copy);
		copy.addAll(1, sub);
		print("17: " + copy);
		print("18: " + pets.isEmpty());
		pets.clear();
		print("19: " + pets);
		print("20: " + pets.isEmpty());
		pets.addAll(Pets.arrayList(4));
		print("21: " + pets);
		Object[] o = pets.toArray();
		print("22: " + o[3]);
		Pet[] pa = pets.toArray(new Pet[0]);
		print("23: " + pa[4]);
		
	}
	
	
}
