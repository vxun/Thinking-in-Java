package com.zhangxiuwu.util;
import java.util.*;
/**
 * @author ZhangXiuwu
 * 双端队列
 * 从JDK1.6开始， JDK开始有Deque
 */
public class Deque<T> {

	private LinkedList<T> deque = new LinkedList<T>();
	public void addFrist(T t) {
		deque.addFirst(t);
	}
	public void addLast(T t)
	{
		deque.addLast(t);
	}
	public T getFrist() {
		return deque.getFirst();
	}
	public T getLast() {
		return deque.getLast();
	}
	public T removeFrist() {
		return deque.removeFirst();
	}
	public T removeLast() {
		return deque.removeLast();
	}
	public int size() {
		return deque.size();
	}
}
