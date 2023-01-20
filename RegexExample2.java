package regularExpression_Regex;

import java.util.regex.Pattern;

public class RegexExample2 {

	public static void main(String[] args) {
		/*System.out.println(Pattern.matches(".t","at"));
		System.out.println(Pattern.matches(".t","ats"));
		System.out.println(Pattern.matches(".t","22at"));// 
		System.out.println(Pattern.matches(".t","a6t45"));
		System.out.println(Pattern.matches(".t","a45klt"));

		// Regex character class
		System.out.println(Pattern.matches("[amn]","amma")); //[amn] with in these bracket it takes only one character
		System.out.println(Pattern.matches("[amn]","m"));
		System.out.println(Pattern.matches("[^amn]","cd"));
		*/System.out.println(Pattern.matches("[^amn]","d"));
		System.out.println(Pattern.matches(" a-z&&[def]]","a")); // doubt in this ask later

		
		// Regex Quantifiers in class
		System.out.println(Pattern.matches("[amn]?","amma")); //? one or not occurence
		System.out.println(Pattern.matches("[amn]?","n"));
		System.out.println(Pattern.matches("[amn]?","t"));
		System.out.println(Pattern.matches("[amn]?","aazzzaaaannn"));
		
		
		System.out.println(Pattern.matches("[amn]+","amma")); // + one or more than once
		System.out.println(Pattern.matches("[amn]+","mamma"));
		System.out.println(Pattern.matches("[amn]+","aravind"));
		System.out.println(Pattern.matches("[amn]+","n"));
		
		System.out.println(Pattern.matches("[amn]","n"));
		
		
		
	}

}
