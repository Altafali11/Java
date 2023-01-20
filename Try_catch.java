package exception;

public class Try_catch {
	public static void main(String[] args) {
		int a= 100;
		int b= 0;
	//	without using try catch it gave error
	//	int c= a/b;
	//	System.out.println(c);
		
      try {
    	  int c= a/b;
    	  System.out.println("the result is"  + c);
    	  
	}
      catch(Exception e) {
    	  System.out.println("we failed to divide ");
    	  System.out.println(e);
      }
      System.out.println("end of program");
}
}