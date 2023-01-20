package regularExpression_Regex;

import java.util.regex.Pattern;

public class MetaCharacter {

	public static void main(String[] args) {
    /*System.out.println(Pattern.matches("\\d", "aamma"));
    System.out.println(Pattern.matches("\\d", "aamma123"));
    System.out.println(Pattern.matches("\\d", "1")); // \\d taking only one digit 1 to 9  but only one occurence
    System.out.println(Pattern.matches("\\d", "456"));
    
    
    System.out.println(Pattern.matches("\\D", "a"));// \\D means taking only non digit value but one occurence  
    System.out.println(Pattern.matches("\\D", "aamma"));
    System.out.println(Pattern.matches("\\D", "1"));
    System.out.println(Pattern.matches("\\D*", "Vanithamam"));
   */
		
		
		
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","altafali12"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","1muhammad"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","vani12"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","jay2SI"));
		
		
		System.out.println(Pattern.matches("[978]{1}[0-9]{9}","6394048730"));
		System.out.println(Pattern.matches("[978]{1}[0-9]{9}","9198938820"));
		System.out.println(Pattern.matches("[978]{1}[0-9]{9}","99358892900"));
		
	}

}