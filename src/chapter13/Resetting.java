package chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author ZhangXiuwu
 * 通过matcher.reset()方法，可以将现有的Matcher对象应用于一个新的字符序列
 * 1. 有参数
 * 2. 无参数的reset方法，将现有的Matcher对象重置到当前字符序列的起始位置
 */
public class Resetting {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("([frb][aiu])[gx]");
		Matcher m = p.matcher("fix the rug whit bags");
		while(m.find()) {
			System.out.println(m.group() + " " + m.start() + " " + m.end());
		}
		m.reset("fix the rig with rags");
		while(m.find()) {
			System.out.println(m.group());
		}
	}
	
}
