package chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheReplacements {

	private static  String s = "Here's a block of text to use as input to \n" +
    " the regular expression matcher. Note that we'll \n"+
    "first extract the block of text by looking for \n" +
    "the special delimiters, then process the \n" +
    "extracted block.";

	
	public static void main(String[] args) {
		s = s.replaceAll(" {2,}", " ");
		s = s.replaceAll("(?m)^ +", "");
		s = s.replaceFirst("[aeiou]", "(VOWEL1)");
		
		StringBuffer sbuf = new StringBuffer();
		Pattern pattern = Pattern.compile("[aeiou]");
		Matcher m = pattern.matcher(s);
		String r = "";
		while(m.find()) {
			String g = m.group().toUpperCase();
			m.appendReplacement(sbuf, g);
//			r = m.replaceAll(g);
		}
		System.out.println(r);
		System.out.println("==================");
		System.out.println(sbuf.toString());
		
		
	}
	
}
