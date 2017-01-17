package chapter15_generics.decorator;
import java.util.*;
/**
 * @author ZhangXiuwu
 * 装饰器模式
 */
class Basic {
	private String value;
	public void set(String val)
	{
		this.value = val;
	}
	public String get() { 
		return value;
	}
}

class Decorator extends Basic {
	protected Basic basic;
	public Decorator(Basic basic) {
		this.basic = basic;
	}
	public void set(String val)
	{
		basic.set(val);
	}
	public String get()
	{
		return basic.get();
	}
}

class TimeStamped extends Decorator {
	private final long timestamp;
	public TimeStamped(Basic basic)
	{
		super(basic);
		timestamp = new Date().getTime();
	}
	public long getTimestamp() {
		return timestamp;
	}
}

class SerialNumbered extends Decorator {
	private static long counter;
	private final long serialNumber = counter++;
	public SerialNumbered (Basic basic)
	{
		super(basic);
	}
	public long getSerialNumber() {
		return serialNumber;
	}
}


public class Decoration {

	public static void main(String[] args) {
		TimeStamped t1 = new TimeStamped(new Basic());
		TimeStamped t2 = new TimeStamped(new SerialNumbered(new Basic()));
//		t2.getSerialNumber();  not variable
		SerialNumbered s1 = new SerialNumbered(new Basic());
		SerialNumbered s2 = new SerialNumbered(new TimeStamped(new Basic()));
//		s2.getTimestamp(); not variable
	}
}
