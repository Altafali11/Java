package regularExpression_Regex;

import java.util.regex.Pattern;

public class Allmetacharacter {

	public static void main(String[] args) {
	//  \\d means find one digit
		System.out.println(Pattern.matches("\\d","1")); 
		System.out.println(Pattern.matches("\\d","a")); // false because a is not a digit
		System.out.println(Pattern.matches("\\d","12"));// false because here is two digit found
		System.out.println("----------------------------");	
		
	//	. means one instance of any character
		System.out.println(Pattern.matches(".","1"));
		System.out.println(Pattern.matches(".","a"));
		System.out.println(Pattern.matches(".","12"));
		System.out.println("----------------------------");
		
		
	//  ^ used to find a match as the begining of a string
		System.out.println(Pattern.matches("^Hello","Hello"));
		System.out.println(Pattern.matches("^Hello","Hel"));
		System.out.println(Pattern.matches("^.",".")); 
		System.out.println(Pattern.matches("^123","12"));
		System.out.println("----------------------------");
		
	//
		System.out.println(Pattern.matches("\\s"," "));
	}

}
