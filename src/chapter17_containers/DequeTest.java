package chapter17_containers;

import java.nio.charset.MalformedInputException;

import com.zhangxiuwu.util.*;

/**
 * @author ZhangXiuwu
 * 测试双端队列
 */
public class DequeTest {

	static void fillTest(Deque<Integer> deque)
	{
		for (int i = 20; i < 27; i++)
		{
			deque.addFrist(i);
		}
		
		for (int i = 50; i < 55; i++)
		{
			deque.addLast(i);
		}
		
	}

	public static void main(String[] args) {
		Deque<Integer> di = new Deque<Integer>();
		fillTest(di);
		while(di.size() != 0) {
			System.out.print(di.removeFrist() + " ");
		}
		System.out.println();
		fillTest(di);
		while(di.size() != 0)
		{
			System.out.print(di.removeLast() + " ");
		}
	}
	
}
