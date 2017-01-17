package chapter15_generics.mixin;
import java.util.*;
/**
 * @author ZhangXiuwu
 * 混型， 混合多个类的能力
 * 1. 与接口混合
 */

interface TimeStamped { 
	long getStamp();
}

class TimeStampedImp implements TimeStamped {
	private final long timeStamp;
	public TimeStampedImp ()
	{
		timeStamp = new Date().getTime();
	}
	public long getStamp() {
		return timeStamp;
	}
}

interface SerialNumbered {
	long getSerialNumber ();
}

class SerialNumberedImp implements SerialNumbered {
	private static long counter = 1;
	private final long serialNumber = counter++;
	public long getSerialNumber ()
	{
		return serialNumber;
	}
}

interface Basic {
	public void set(String val);
	public String get();
}

class BasicImp implements Basic {
	private String value;
	public void set(String val) {
		this.value = val;
	}
	public String get() {
		return value;
	}
}

/**
 * @author ZhangXiuwu
 * 使用代理， 当混合类很多时候， 代码会臃肿
 */
class Mixin extends BasicImp implements TimeStamped, SerialNumbered {

	private TimeStamped timeStamp = new TimeStampedImp();
	private SerialNumbered serialNumber = new SerialNumberedImp();
	
	@Override
	public long getSerialNumber() {
		return serialNumber.getSerialNumber();
	}

	@Override
	public long getStamp() {
		return timeStamp.getStamp();
	}
	
}

public class Mixins {

	public static void main(String[] args)
	{
		Mixin mixin1 = new Mixin(), mixin2 = new Mixin();
		mixin1.set("test String 1");
		mixin2.set("test String 2");
		System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber());
		System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber());
		
	}
	
}
