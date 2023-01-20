package strings;

public class Case_type_conversion {

	public static void main(String[] args) {
		String str = "Altaf";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//  type conversion
		int a= 10 , b=20;
		System.out.println(a+b); // here it is int value
		String s = String.valueOf(a); // but using valueof method to change type cast int value change to string
		String s1 = String.valueOf(b);
		System.out.println(s+s1);  // so this will give 1020 like string
		 
		
		///////////////////////
        
	}

}
