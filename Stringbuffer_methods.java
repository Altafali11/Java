package strings;

public class Stringbuffer_methods {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		System.out.println(s.capacity());   // defines the capacity (how many character we can put in string)
		
        s.append("Altaf");
        System.out.println(s.capacity());
        
        s.append("likes   java");               // (old capacity*2) +2
        System.out.println(s.capacity());       // here the new capacity 34
        
        s.append("python             ");        // now the capacity 34 but we put more than capacity 
        System.out.println(s.capacity());       // so again (34*2)+2
        
    System.out.println("=================================================================");    
        
        StringBuffer sb = new StringBuffer("Altafali");
        System.out.println(sb.length());   // defines the length of the existing string
        
        System.out.println(sb.charAt(2));
        System.out.println(sb.deleteCharAt(4));
        System.out.println(sb.delete(1, 4));    //   delete  starting index to lastindex+1   
        
        
        StringBuffer sb3 = new StringBuffer("altaf");
  //      StringBuffer sb4 = new StringBuffer("altaf"); // it gives false because sb3 and sb4 both points different object
        StringBuffer sb4 = sb3.append("java");
        System.out.println(sb3.equals(sb4));   // because equals method in stringbuffer class does not override the equals method of object class
                                               // but string class override the equals method of object class
        
        StringBuffer s5 = new StringBuffer("Altaaf");
        System.out.println(s5.indexOf("a"));
        System.out.println(s5.lastIndexOf("a"));
        
       
        
	}

}
