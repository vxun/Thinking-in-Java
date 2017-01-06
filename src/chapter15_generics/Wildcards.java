package chapter15_generics;

/**
 * @author ZhangXiuwu
 * 通配符：
 * 原生类型， 参数类型， 无界通配符， 上界通配符， 下界通配符
 * 之间的区别
 */
public class Wildcards {

	static void rawArgs(Holder holder, Object obj) 
	{
		holder.set(obj); // Waring
		Object object = holder.get();
		System.out.println(object.getClass().getSimpleName());
	}
	static void unbondedArgs(Holder<?> holder, Object obj)
	{
//		holder.set(obj);  error
		Object object = holder.get();
		System.out.println(object.getClass().getSimpleName());

	}
	static <T> T exact1(Holder<T> holder) 
	{
		T t = holder.get();
		System.out.println(t.getClass().getSimpleName());
		return t;
	}
	static <T> T exact2(Holder<T> holder, T t)
	{
		holder.set(t);
		System.out.println(t.getClass().getSimpleName());
		return holder.get();
	}
//	Compile Error
//	static <T> void exact3(Holder<T> holder, Object obj)
//	{
//		holder.set(obj);
//	}
	static <T> T wildSubtype(Holder<? extends T> holder, T t)
	{
		T t2 = holder.get();
		System.out.println(t.getClass().getSimpleName());
		return t2;
	}

	static <T> void wildSupertype(Holder<? super T> holder, T t)
	{
		holder.set(t);
		Object object = holder.get();
		System.out.println(object.getClass().getSimpleName());
	}
	
	public static void main(String[] argsa)
	{
		Holder raw = new Holder();
		Holder<Long> qualified = new Holder<Long>();
		Holder<?> unbunded = new Holder<Long>();
		Holder<? extends Long> sub = new Holder<Long>();
		Holder<? super Long> sup = new Holder<Long>();
		Long lng = 1l;
		System.out.println(" None ");
		rawArgs(raw, lng);
		rawArgs(qualified, lng);
		rawArgs(unbunded, lng);
		rawArgs(sub, lng);
		rawArgs(sup, lng);
		System.out.println(" UnBounded ");
		unbondedArgs(raw, lng);
		unbondedArgs(qualified, lng);
		unbondedArgs(unbunded, lng);
		unbondedArgs(sub, lng);
		unbondedArgs(sup, lng);
		System.out.println(" Exact1 ");
		exact1(raw);
		exact1(qualified);
		exact1(unbunded);
		exact1(sub);
		exact1(sup);
		System.out.println(" Exact2 ");
		exact2(raw, lng);
		exact2(qualified, lng);
//		Error
//		exact2(unbunded, lng);
//		exact2(sub, lng);
		exact2(sup, lng);
		System.out.println(" wildSubtype ");
		wildSubtype(raw, lng);
		wildSubtype(qualified, lng);
		wildSubtype(unbunded, lng); // 
		wildSubtype(sub, lng);
		wildSubtype(sup, lng);
		System.out.println(" wildSuptype ");
		wildSupertype(raw, lng);
		wildSupertype(qualified, lng);
//		wildSupertype(unbunded, lng); // Error
//		wildSupertype(sub, lng);
		wildSupertype(sup, lng);
	}
	
	
	
}
