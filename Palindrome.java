package strings;

//public class Palindrome {
//
//	public static void main(String[] args) {
//		String str = "NAMAN";
//		
//		if(str.charAt(0)== str.charAt(4)|| str.charAt(1)==str.charAt(3)) {
//			System.out.println("yes "+ str + " is a Palindrome");
//		}
//		else {
//			System.out.println("no" +str+ "is not a palindrome");
//		}
//		
//	}
//
//}

public class Palindrome{
	public static void main (String[]args) {
		String str = "naman";
		int length = str.length();
		String reverse ="";
		
		for(int i= length-1; i>=0; i--) {
			reverse= reverse+str.charAt(i);
		}
	//	System.out.println(reverse);
		if(str.equals(reverse)) {   // use equalsignorecase to ignore the case in string while match the string
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not palindrome");
		}
	}
}