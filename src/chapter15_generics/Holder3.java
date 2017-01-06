package chapter15_generics;

/**
 * 使用容器可以存储多种类型，但是在实例时，之存储一种类型
 * 使用泛型可以在编译期间即可保证类型正确
 * @author ZhangXiuwu
 */
public class Holder3<T> {

	private T t;
	public Holder3(T t)
	{
		this.t = t;
	}
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
	
}
