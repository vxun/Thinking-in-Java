package chapter17_containers;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
/**
 * @author ZhangXiuwu
 * 
 * 不同Set之前的实现不同。对放入容器中的元素要求也不一样
 * Set中存储的值必须有equals方法
 * 1. HashSet ： 要求存入的数据必须定义hashCode; 根据HashCode判断是否重复
 * 2. TreeSet ： 要求存入的数据必须实现Comparable接口; 根据comparable判断是否重复
 * 3. LinkedHashSet ： 必须定义hashCode
 * 
 */
class SetType {
	int i;
	public SetType(int n)
	{
		i = n;
	}
	public boolean equals(Object o)
	{
		return o instanceof SetType && (i == ((SetType)o).i);
	}
	@Override
	public String toString() {
		return Integer.toString(i);
	}
}
class HashType extends SetType {

	public HashType(int n) {
		super(n);
	}
	@Override
	public int hashCode() {
		return i;
	}
}

class TreeType extends SetType implements Comparable<TreeType>{

	public TreeType(int n) {
		super(n);
	}

	@Override
	public int compareTo(TreeType o) {
		return o.i < i ? -1 : (o.i == i ? 0 : 1);
	}
}

public class TypesForSets {
	static <T> Set<T> fill(Set<T> set, Class<T> type)
	{
		for (int i = 0; i < 10; i++)
		{
			try {
				set.add(type.getConstructor(int.class).newInstance(i));
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
		}
		return set;
	}
	
	static <T> void test(Set<T> set, Class<T> type)
	{
		fill(set, type);
		fill(set, type);
		fill(set, type);
		System.out.println(set);
	}
	
	public static void main(String[] args) {
		test(new HashSet<HashType>(), HashType.class);
		test(new LinkedHashSet<HashType>(), HashType.class);
		test(new TreeSet<TreeType>(), TreeType.class);
		test(new HashSet<SetType>(), SetType.class);
		test(new HashSet<TreeType>(), TreeType.class);
		test(new LinkedHashSet<SetType>(), SetType.class);
		test(new LinkedHashSet<TreeType>(), TreeType.class);
		test(new TreeSet<HashType>(), HashType.class);
		test(new TreeSet<SetType>(), SetType.class);
	}
}
