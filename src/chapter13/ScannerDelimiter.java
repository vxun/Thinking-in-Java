package chapter13;

import java.util.Scanner;
import com.zhangxiuwu.util.*;

/**
 * 
 * @author ZhangXiuwu
 * Scanner 定界符， 默认的Scanner根据空白字符进行分词；
 * 可以通过delimiter方法自定义定界符
 */
public class ScannerDelimiter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner("12, 42, 78, 99");
		scanner.useDelimiter(","); // 使用逗号和逗号前后的空白符分割
		while(scanner.hasNext())
			System.out.println(scanner.next()); // 将空白符当做字符串
		Print.delimite();
		scanner.close();
		
		scanner = new Scanner("12, 42, 78, 99");
		scanner.useDelimiter("\\s*,\\s*");
		while (scanner.hasNext())
			Print.print(scanner.nextInt());
		
		
		scanner.close();
	}
	
}
