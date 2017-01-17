package chapter17_containers;
import java.util.*;
import com.zhangxiuwu.util.*;

class Government implements Generator<String> {

	String[] fundation = ("strange women lying in ponds ").split(" ");
	private int index;
	@Override
	public String next() {
		return fundation[index++];
	}
}

public class CollectionDataTest {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>(new CollectionData<String>(new Government(), 4));
		System.out.println(set);
		set.addAll(new CollectionData<String>(new Government(), 4));
		System.out.println(set);
	}
}
