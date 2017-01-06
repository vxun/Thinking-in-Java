package chapter15_generics;

import java.util.*;
import com.zhangxiuwu.util.*;

/**
 * @author ZhangXiuwu
 * 匿名内部类
 */

class Customer {
	private static long counter = 1;
	private final long id = counter++;
	private Customer(){}
	@Override
	public String toString() {
		return "Customer [id=" + id + "]";
	}
	public static Generator<Customer> generator()
	{
		return new Generator<Customer>() {
			@Override
			public Customer next() {
				return new Customer();
			}
		};
	}
	
	
}

class Teller {
	private static long counter = 0;
	private final long id = counter++;
	@Override
	public String toString() {
		return "Teller [id=" + id + "]";
	}
	public static Generator<Teller> generator = new Generator<Teller>() {
		public Teller next(){
			return new Teller();
		}
	};
}

public class BankTeller {

	public static void server(Teller t, Customer c) 
	{
		System.out.println("Teller " + t + " servers " + c);
	}
	
	public static void main(String[] argds)
	{
		Random random = new Random(47);
	}
}
