package strings;

public class String_method {

	public static void main(String[] args) {
		
    String str = "Altaf";
    System.out.println(str.toLowerCase());
    System.out.println(str.toUpperCase());
    
    System.out.println("============================================================");
    System.out.println(str.trim());
    
    System.out.println("============================================================");
    System.out.println(str.substring(3));
    System.out.println(str.subSequence(2, 4));
    
    
    System.out.println("============================================================");
    System.out.println(str.replace('f', 'p'));
    
    System.out.println("============================================================");
    System.out.println(str.startsWith("A")); // return boolean value 
    System.out.println(str.startsWith("f", 3)); 
    System.out.println(str.endsWith("f"));
    
    
    System.out.println("===============================================");
    System.out.println(str.charAt(3));
    
    System.out.println("===============================================");
    System.out.println(str.indexOf("t"));
    
    System.out.println("===============================================");
    System.out.println(str.equals("Altaf"));   // check capital or small also 
    System.out.println(str.equalsIgnoreCase("altaf")); // it ignore case 
	}

}
