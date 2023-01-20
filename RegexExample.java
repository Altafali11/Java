package regularExpression_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(".s");// . means one character (s)it means end with  character s  
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		System.out.println(b);
		
		
		
		boolean b1 = Pattern.compile(".s").matcher("as").matches();
		System.out.println(b1);
		
		
		
		boolean b2 = Pattern.matches(".s", "2ps");
		System.out.println(b2);

	}

}
