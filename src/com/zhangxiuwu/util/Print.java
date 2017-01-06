package com.zhangxiuwu.util;

import java.util.*;

public class Print {

	public static void print(Object obj) {
		if (obj instanceof Collection) {
			Collection<?> co = (Collection<?>) obj;
			String str = Arrays.toString(co.toArray());
			System.out.println(str);
		} else {
			System.out.println(obj);
		}
	}
	
	public static void delimite() {
		System.out.println("=============================================================================================");
	}
	
}
