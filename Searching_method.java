package strings;

public class Searching_method {

	public static void main(String[] args) {
		String str = "Altaaf";
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf("a")); // return int value
		System.out.println(str.charAt(5));
        System.out.println(str.contains("aa")); // return boolean value
        System.out.println(str.startsWith("A"));
        System.out.println(str.endsWith("f"));
        
	}

}
