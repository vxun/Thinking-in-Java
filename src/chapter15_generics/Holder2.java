package chapter15_generics;

/**
 * 持有一个对象的容器类，类型为Object，实现一定的复用(可以存储不同对象)
 * 但是在获取时，需要知道存储的类型就需要强制转换
 * @author ZhangXiuwu
 */
public class Holder2 {
	
	private Object a;
	public Holder2(Object a) {
		this.a = a;
	}
	public void set(Object a){
		this.a = a;
	}
	public Object get() {
		return a;
	}
	
	
}
