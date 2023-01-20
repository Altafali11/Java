package strings;

public class Replacing_removing_strings {

	public static void main(String[] args) {
		String s = "This is my laptop";
		
		System.out.println(s.replace("is", "was")); // replace old character to new character
		
		System.out.println(s.replaceFirst("is", "was")); // replace only once where old element found 
		
		System.out.println(s.replaceAll("is", "was")); // replace all the old old character to new 
		                                // in this we provide a regex .
		System.out.println(s.replaceAll("is(.)", "was"));
		
		
		
	}

}
