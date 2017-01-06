package chapter15_generics;

public class Holder<T> {

	private T value;
	public Holder() {}
	public Holder(T t) { value = t; }
	public T get()
	{
		return value;
	}
	public void set(T t)
	{
		value = t;
	}
	public static void main(String[] args) {
		try {
			Holder<Apple> apple = new Holder<Apple>(new Apple());
			Apple d = apple.get();
			apple.set(d);
			Holder<? extends Fruit> fruit = apple;
			Fruit fruit2 = fruit.get();
			d = (Apple) fruit.get();
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
