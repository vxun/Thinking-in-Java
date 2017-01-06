package chapter11;
import java.util.*;
import com.zhangxiuwu.util.*;
public class PrintingContainers {
	static Collection<String> fill(Collection<String> collection) {
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}
	static Map<String, String> fill(Map<String, String> map) {
		map.put("rat", "Fuzzy");
		map.put("cat", "Rags");
		map.put("dog", "Bosco");
		map.put("dog", "Spot");
		return map;
	}
	
	public static void main(String[] args) {
		Print.print(fill(new ArrayList<String>()));
		Print.print(fill(new LinkedList<String>()));
		Print.print(fill(new HashSet<String>()));
		Print.print(fill(new TreeSet<String>()));
		Print.print(fill(new LinkedHashSet<String>()));
		Print.print(fill(new HashMap<String, String>()));
		Print.print(fill(new TreeMap<String, String>()));
		Print.print(fill(new LinkedHashMap<String, String>()));
	}
	
	
}
