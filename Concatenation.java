package strings;

/*public class Concatenation {

	public static void main(String[] args) {
		
		// + Operator 
		String s1 = "Altaf";
		String s2 = "Sabiya";
		
		System.out.println(s1+s2);
		System.out.println(s1+10);
		System.out.println(s1+10+20);
		System.out.println(s1+10+(-5));
		System.out.println(10+s1+20);
		System.out.println(10+20+s1);
	  //	System.out.println(s1+10-5); //not applicable 
		System.out.println(s1+20/10);
		System.out.println(s1+20+s2+10+10);
		System.out.println(s1+20*3);
		

	}

}
*/

//public class Concatenation {
//	public static void main(String[] args) {
//		// concat()
//		
//		String s1 = "pandey";
//		String s2 = "chutiya";
//		
//	    System.out.println(s1.concat(s2)); // to add two strings
//	    System.out.println(String.join("gandu" , s1,s2)); // join method is static method of 
//	}
//	}
       //("-----------------------------------------------------------------------------------")
public class Concatenation {
	public static void main(String[] args) {
  // to get subsequence , substring
		
		String st1 = "Altaf";
		System.out.println(st1.subSequence(2, 5)); // starting index position to end position-1
		                                           // it returns char sequence value
		System.out.println(st1.substring(3));
		System.out.println(st1.substring(2, 3)); // it returns String value
	}
}








		