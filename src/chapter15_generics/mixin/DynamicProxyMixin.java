package chapter15_generics.mixin;

import java.lang.reflect.*;
import java.util.*;
import com.zhangxiuwu.util.*;


/**
 * @author ZhangXiuwu
 * 使用动态代理 创建一种比装饰器更贴近混合模型的机制
 */

class MixinProxy implements InvocationHandler {

	Map<String, Object> delegatesByMethod = new HashMap<String, Object>();
	public MixinProxy(TwoTuple<Object, Class<?>>...pairs)
	{
		for (TwoTuple<Object, Class<?>> pair : pairs)
		{
			Class<?> clazz = pair.b;
			Object obj = pair.a;
			Method[] methods = clazz.getMethods();
			for (Method method : methods)
			{
				if (!delegatesByMethod.containsKey(method.getName()))
				{
					delegatesByMethod.put(method.getName(), obj);
				}
			}
		}
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String name = method.getName();
		Object obj = delegatesByMethod.get(name);
		return method.invoke(obj, args);
	}
	
	/**
	 * 创建代理对象
	 * @param pairs <实例对象， 接口>
	 * @return
	 */
	public static Object newInstance(TwoTuple<Object, Class<?>>...pairs) {
		
		Class<?>[] clazzs = new Class[pairs.length];
		
		for (int i = 0; i < pairs.length; i++)
		{
			clazzs[i] = pairs[i].b;
		}
		ClassLoader classLoader = pairs[0].a.getClass().getClassLoader();
		return Proxy.newProxyInstance(classLoader, clazzs, new MixinProxy(pairs));
	}
	
}
public class DynamicProxyMixin {

	public static void main(String[] args) {
		Object mixinProxy = MixinProxy.newInstance(
				new TwoTuple(new BasicImp(), Basic.class),
				new TwoTuple(new TimeStampedImp(), TimeStamped.class),
				new TwoTuple(new SerialNumberedImp(), SerialNumbered.class));
		Basic b = (Basic)mixinProxy;
		TimeStamped t = (TimeStamped)mixinProxy;
		SerialNumbered s = (SerialNumbered)mixinProxy;
		b.set("Hello Basic");
		System.out.println( t.getStamp() );
		System.out.println( s.getSerialNumber() );
	}
	
}
