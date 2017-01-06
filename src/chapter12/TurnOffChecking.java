package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author ZhangXiuwu
 * "被检查的异常",在某些情况下，程序员并不知道如何处理异常或者不想处理异常，但是编辑器要求异常必须检查，从而导致异常可能被吞噬
 * 把"被检查的异常"转换为"不检查的异常"
 */

/**** 丢失异常举例 *****/
class LoseException {
	public void loseException() {
		try {
			FileInputStream inputStream = new FileInputStream("");
			inputStream.close();
		} catch (FileNotFoundException e) {
			// 此时不做异常的处理, 就导致异常的丢失
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/******************************
 * 防止异常丢失的一方法： 将‘被检查异常’转换为 ‘不检查异常’, 使用getCause捕获异常
 ***********************************/
class SomeOtherEception extends Exception {
	private static final long serialVersionUID = 5361378555819825627L;
}

class WrapCheckedExeption {
	void throwRuntimeException(int type) {
		try {
			switch (type) {
			case 0:
				throw new FileNotFoundException();
			case 1:
				throw new IOException();
			case 2:
				throw new RuntimeException("Where am I?");
			default: 
				return;
			} 
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}


public class TurnOffChecking {

	public static void main(String[] args) throws SomeOtherEception {
		WrapCheckedExeption wce = new WrapCheckedExeption();
		// 不在需要捕获异常
		wce.throwRuntimeException(3); 
		
		// 也可以捕获异常
		for(int i = 0; i < 4; i++) {
			try {
				if ( i < 3)
					wce.throwRuntimeException(i);
				else 
					throw new SomeOtherEception();
			} catch (SomeOtherEception e) {
				System.out.println(" SomeOtherException: " + e);
			} catch (RuntimeException e) {
				try {
					throw e.getCause();
				} catch (FileNotFoundException e1) {
					System.out.println(" FileNotFoundException: " + e1);
				} catch (IOException e2) {
					System.out.println(" IOException: " + e2);
				} catch (Throwable t) {
					System.out.println(" Throwable: " + t);
				}
			}
		}
		
	}
}
