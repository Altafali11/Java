package regularExpression_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexpression_pattern {
	public static void main(String[] args) { // [abc] Find one character from the options between the brackets
	 Pattern p = Pattern.compile("[abc]"); //  [] are used to find the range of character 
	 Matcher m =p.matcher("a");
	 boolean b = m.matches();
	 System.out.println(b);
	 
	 
	// other way to write regular expression syntax 
	  boolean b1 = Pattern.compile("[^abc]").matcher("d").matches(); //[^abc] find one character except abc
	 System.out.println(b1);
	 boolean bo = Pattern.compile("[^abc]").matcher("a").matches(); 
	 System.out.println(bo);
	 
	 
	// one  other way 
	 boolean b2 = Pattern.matches("[0-9]", "5");//[0-9] one character from range  0 to 9
	 System.out.println(b2);
	 boolean b3 = Pattern.matches("[0-9]", "59");//[0-9] one character from range  0 to 9
	 System.out.println(b3);
	 
	// other way
	 System.out.println(Pattern.matches("[0-9]","9"));
	}

}
