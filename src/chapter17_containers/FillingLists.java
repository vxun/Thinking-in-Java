package chapter17_containers;
import java.util.*;
/**
 * @author ZhangXiuwu
 * 填充容器
 * 
 * Collections.fill 替换，而非添加
 */

class StringAddress {
	private String s;
	public StringAddress(String s) {
		this.s = s;
	}
	public String toString() {
		return super.toString() + " " + s;
	}
}

public class FillingLists {

	public static void main(String[] args) {
		
		List<StringAddress> list = new ArrayList<StringAddress>(
				Collections.nCopies(4, new StringAddress("Hello")));
		System.out.println(list);
		
		Collections.fill(list, new StringAddress("Word"));
		System.out.println(list);
	}
	
	
}
