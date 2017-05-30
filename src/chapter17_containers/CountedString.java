package chapter17_containers;
import java.util.*;

/**
 * @author ZhangXiuwu
 * HashCode 生成案例
 * 
 * 常见方法：
 * 1. gei int 变量result 赋予某个非零值常量 例如 17，
 * 2. 为对象内每个有意义的域f（即每个可以做equals()操作的域）计算出一个int散列码
 * 3. 合并计算得到的散列码 result = 37*result + c;
 * 4. 返回result
 */
public class CountedString {

	private static List<String> created = new ArrayList<String>();
	
	private String s;
	private int id = 0;
	public CountedString (String str) {
		s = str;
		created.add(str);
		
		for(String s2 : created)
		{
			if(s2.equals(s2))
				id++;
		}
	}
	@Override
	public String toString() {
		return "String: " + s + " id: " + id + " hashCode(): " + hashCode();
	}
	
	public int hashCode() {
		int result = 17;
		result = 37 * result + s.hashCode();
//		result = 37 * result + id;
		return result;
	}
	
	public boolean equals(Object o)
	{
		return o instanceof CountedString 
				&& s.equals( ((CountedString)o).s)
				&& id == ((CountedString)o).id
				;
	}
	
	public static void main(String[] args) {
		Map<CountedString, Integer> map = new HashMap<CountedString, Integer>();
		CountedString[] cs = new CountedString[5];
		for (int i = 0; i < cs.length; i++)
		{
			cs[i] = new CountedString("hi");
			map.put(cs[i], i);
		}
		System.out.println(map);
		for (CountedString csString : cs)
		{
			System.out.println("Looking up " + csString);
			System.out.println(map.get(csString));
		}
	}
	
}
