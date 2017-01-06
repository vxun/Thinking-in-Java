package chapter13;
import java.util.*;
import java.util.regex.MatchResult;
import com.zhangxiuwu.util.*;
/**
 * 
 * @author ZhangXiuwu
 *
 * Scanner 用正则表达式扫描， next只是针对下一个分词进行匹配，所以配置的Pattern中不应该有定界符（有定界符一定不能匹配成功）
 * 
 */
public class ThreatAnalyzer {
	  static String threatData =
			    "58.27.82.161@02/10/2005\n" +
			    "204.45.234.40@02/11/2005\n" +
			    "58.27.82.161@02/11/2005\n" +
			    "58.27.82.161@02/12/2005\n" +
			    "58.27.82.161@02/12/2005\n" +
			    "[Next log section with different data format]";
	  
	  public static void main(String[] args)
	  {
		  Scanner scanner = new Scanner(threatData);
		  String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@(\\d{2}/\\d{2}/\\d{4})";
		  while(scanner.hasNext(pattern))
		  {
			  String next = scanner.next(pattern);
			  MatchResult matchResult = scanner.match();
			  String result = matchResult.group();
			  String ip = matchResult.group(1);
			  String date = matchResult.group(2);
			  Print.print("next = " + next + "; result = " + result + "; ip = " + ip + "; date = " + date);
		  }
		  scanner.close();
	  }
	  
	  
}
