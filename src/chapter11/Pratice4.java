package chapter11;

import java.util.*;

public class Pratice4 {

	public static void main(String[] args) {
		String[] arrays = new String[10];
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		Set<String> hashSet = new HashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		Creator.fill(arrayList);
		Creator.fill(linkedList);
		Creator.fill(hashSet);
		Creator.fill(treeSet);
		Creator.fill(linkedHashSet);
		Creator.print(arrayList);
		Creator.print(linkedList);
		Creator.print(hashSet); // 无序
		Creator.print(treeSet); // 自然顺序
		Creator.print(linkedHashSet); // 按添加顺序
	}
	
	
	
}


class Creator {
	
	private static final String[] names = {"ZooTiPar", "Greet Wall", "Dog", "Walking Death"};
	private static int count=0;
	static String next() {
		String result = null;
		if (count < names.length) {
			result = names[count];
			count++;
		} else {
			count = 0;
			result = names[0];
		}
		return result;
	}
	
	static Collection<String> fill(Collection<String> collection) {
		for(int i = 0; i < 10; i++) {
			collection.add(Creator.next());
		}
		return collection;
	}
	static void print(Collection<String> collection) {
		System.out.println( Arrays.toString(collection.toArray()) ); 
	}
}