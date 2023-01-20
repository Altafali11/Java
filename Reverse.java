package strings;
//public class Reverse {
//	public static void main(String[] args) {
//		 String  str =  "ALTAF";
//		String reverse = "";
//		char ch ;
//		
//		for(int i=0; i<5; i++) {
//             ch= str.charAt(i);
//			 reverse =ch+reverse;
//		}
//		System.out.println(reverse);
////		for(int i=0; i<str.length(); i++) {
////			System.out.println(str.charAt(i));
////		}
//	}
//
//}  
	
/*public class Reverse {
	public static void main(String[] args) {
		String str = "PANDEY";
		  StringBuilder ast = new StringBuilder();
		
		ast.append(str);
		ast.reverse();
		System.out.println(ast);
	}
	}
*/
// to check == or equal operator
/*public class Reverse {
	public static void main(String[] args) {
		String s = "altaf";
		String s1 = "altaf";
		if (s==s1) {
			System.out.println("yes it is equal");
		}
		else if(s!=s1) {
			System.out.println("yes it is not equal");
		}
		
	}
	}

*/

public class Reverse {
	public static void main(String[] args) {
		String str = "ALTAF";
		int length = str.length();
		String reverse ="";
		for(int i=length-1; i>=0; i--) {
		   reverse = reverse+ str.charAt(i);
		}
		System.out.println(reverse);
		
		}
	
	}
	
 































