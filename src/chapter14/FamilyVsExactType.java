package chapter14;
import static com.zhangxiuwu.util.Print.*;
/**
 * The different between instanceof and class
 * instanceof 和 isInstance 相同，保存了继承体系
 * == 和 equales 相同， 未保存继承体系
 * @author ZhangXiuwu
 *
 */
class TBase{}
class TDerived extends TBase{}

public class FamilyVsExactType {

	static void test(Object x)
	{
		print("Testing x of type " + x.getClass());
		print("x instanceof TBase " + (x instanceof TBase));
		print("x instanceof TDerived " + (x instanceof TDerived));
		
		print("TBase.isInstance(x) " + TBase.class.isInstance(x));
		print("TDerived.isInstance(x)" + TDerived.class.isInstance(x));
		
		print("x.getClass == TBase.class " + (x.getClass() == TBase.class));
		print("x.getClass == TDerived.class " + (x.getClass() == TDerived.class));
		
		print("x.getClass.equals(TBase.class) " + (x.getClass().equals(TBase.class)));
		print("x.getClass.eauqls(TDerived.class) " + (x.getClass().equals(TDerived.class)));
	}

	public static void main(String[] args)
	{
		test(new TBase());
		delimite();
		test(new TDerived());
	}
	
}
/**
Testing x of type class chapter14.TBase
x instanceof TBase true
x instanceof TDerived false
TBase.isInstance(x) true
TDerived.isInstance(x)false
x.getClass == TBase.class true
x.getClass == TDerived.class false
x.getClass.equals(TBase.class) true
x.getClass.eauqls(TDerived.class) false
=============================================================================================
Testing x of type class chapter14.TDerived
x instanceof TBase true
x instanceof TDerived true
TBase.isInstance(x) true
TDerived.isInstance(x)true
x.getClass == TBase.class false
x.getClass == TDerived.class true
x.getClass.equals(TBase.class) false
x.getClass.eauqls(TDerived.class) true
**/