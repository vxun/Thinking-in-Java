package chapter15_generics;

/**
 * 内部链时存储机制实现堆栈
 * 内部类可以访问外部类的类型参数
 * @author ZhangXiuwu
 * @param <T>
 */
public class LinkedStack<T> {

	private Node<T> top = new Node<T>(); // End sentinel
	private static class Node<T> {
		T item;
		Node<T> next;
		Node(){
			item = null;
			next = null;
		}
		Node(T item, Node<T> next)
		{
			this.item = item;
			this.next = next;
		}
//		boolean end(){
//			return item == null && next == null;
//		}
	}
	public void push(T item){
		top = new Node<T>(item, top);
	}
	public T pop() {
		T result = top.item;
		if (top.next != null)
			top = top.next;
		return result;
	}
	
	public static void main(String[] args){
		LinkedStack<String> l = new LinkedStack<String>();
		for(String s : "Phasers on stun!".split(" "))
		{
			l.push(s);
		}
		String r ;
		while( ( r = l.pop() ) != null)
		{
			System.out.println(r);
		}
	}
	
}
