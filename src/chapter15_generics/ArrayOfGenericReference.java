package chapter15_generics;

/**
 * @author ZhangXiuwu
 * Java 中不能直接创建泛型数组eg：T[] t = new T[3];
 * 1. 一般在使用泛型数组时，使用ArrayList
 * 2. 可以使用一个引用：如下
 * @param <T>
 */
class Generic<T>{}
public class ArrayOfGenericReference<T> {
	static Generic<Integer>[] gia; // 一个Integer的引用 
}

