package optionalclass;

import java.util.Optional;

// under java 8 features
public class Optinal {
	public static void main(String[] args) {
		// code without Optional class
	/*	
		String[]words = new String[10];
		String s = words[6].toUpperCase();
		System.out.println(s);
	*/	
		
		String[]word = new String[10];
		Optional<String> checknull= Optional.ofNullable(word[5]);
		System.out.println(checknull);
		
		if(checknull.isPresent()) {
			String text= word[5].toUpperCase();
			System.out.println(text);
		}
		else {
			System.out.println("word is null");
		}
	}

}

