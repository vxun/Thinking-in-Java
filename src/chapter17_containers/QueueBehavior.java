package chapter17_containers;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

import com.zhangxiuwu.util.*;

/**
 * @author ZhangXiuwu
 * LinkedList 和 PriorityQueue 的差异在排序行为上， 而不再性能上
 *
 */
public class QueueBehavior {

	private static int count = 10;
	static <T> void test(Queue<T> queue, Generator<T> gen) {
		for (int i = 0; i < count; i++)
		{
			queue.offer(gen.next());
		}
		while(queue.peek() != null) {
			System.out.print(queue.remove() + " ");
		}
		System.out.println();
	}
	
	static class Gen implements Generator<String> {
		String[] s = "one two three four five six seven eight".split(" ");
		int i;
		@Override
		public String next() {
			if (i >= s.length)
				i = 0;
			return s[i++];
		}
	}
	
	/**
	 * 	除了优先级队列，Queue将精确的按照插入的顺序产生（先进先出）
	 * @param args
	 */
	public static void main(String[] args) {
		test(new LinkedList<String>(), new Gen());
		test(new PriorityQueue<String>(), new Gen());
		test(new ArrayBlockingQueue<String>(count), new Gen());
		test(new ConcurrentLinkedQueue<String>(), new Gen());
		test(new LinkedBlockingQueue<String>(), new Gen());
		test(new PriorityBlockingQueue<String>(), new Gen());
	}
	
}
