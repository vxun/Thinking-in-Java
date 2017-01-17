package chapter17_containers;
import java.util.*;
public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet<String> sortedSet = new TreeSet<String>();
		Collections.addAll(sortedSet, "one two three four five six seven eight".split(" "));
		System.out.println(sortedSet);
		String first = sortedSet.first();
		String last = sortedSet.last();
		System.out.println(first);
		System.out.println(last);
		Iterator<String> it = sortedSet.iterator();
		for (int i = 0; i < 7; i++)
		{
			if (i == 3) first = it.next();
			else if (i == 6) last = it.next();
			else it.next();
		}
		System.out.println(first);
		System.out.println(last);
		System.out.println(sortedSet.subSet(first, last));
		System.out.println(sortedSet.headSet(last));
		System.out.println(sortedSet.tailSet(first));
	}
}
