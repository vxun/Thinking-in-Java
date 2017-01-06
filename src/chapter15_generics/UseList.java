package chapter15_generics;

/**
 * @author ZhangXiuwu
 * 重载
 * @param <W>
 * @param <T>
 */
public class UseList<W, T> {
//  由于擦除原因，重载方法将产生相同的类型签名
//	void f(W w){}
//	void f(T t){}
	
	void f1(W w){}
	void f2(T t){}
	
}
