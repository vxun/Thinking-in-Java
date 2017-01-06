package chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试正则
 * @author ZhangXiuwu
 *
 */
public class TestRegularExpression {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Usage: java TestRegularExpression characterSequence regularExpression ");
			System.exit(0);;
		}
		System.out.println("Input: \"" + args[0] + "\"");
		for (int i = 1; i < args.length; i++) {
			System.out.println("Regular expression: \"" + args[i] + "\"");
			Pattern p = Pattern.compile(args[i]);
			Matcher matcher = p.matcher(args[0]);
			while(matcher.find()) {
				System.out.println("Match \"" + matcher.group() + "\" at positions " + matcher.start() + " - " + matcher.end());
			}
		}
	}
	
}
