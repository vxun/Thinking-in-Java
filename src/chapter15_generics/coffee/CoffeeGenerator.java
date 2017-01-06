package chapter15_generics.coffee;

import java.util.*;

import com.zhangxiuwu.util.Generator;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

	private Class<?>[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class};
	private Random random = new Random(47);
	private int size = 0;
	public CoffeeGenerator(){}
	public CoffeeGenerator(int size) {this.size = size;}
	
	class CoffeeIterator implements Iterator<Coffee> {
		int count = size;
		@Override
		public boolean hasNext() {
			return count > 0;
		}
		@Override
		public Coffee next() {
			count--;
			try {
				return CoffeeGenerator.this.next();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	@Override
	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}

	@Override
	public Coffee next() {
		try {
			return (Coffee) types[random.nextInt(types.length)].newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args){
		CoffeeGenerator gen = new CoffeeGenerator();
		for(int i = 0; i < 5; i++)
		{
			System.out.println(gen.next());
		}
		System.out.println(" ====== ");
		for(Coffee c : new CoffeeGenerator(5))
		{
			System.out.println(c);
		}
	}
	
	
}
