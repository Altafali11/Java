package exception;

import java.util.Scanner;


class MyException extends Exception{
	  public String toString() {
		  return "i am toString()";
	  }
	  public String getMessage() {
		  return " i am getMessage()";
	  }
}

public class Exception_class {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the number");
         int a = sc.nextInt();
         if(a<9) {
        	 try {
        	 throw new MyException();
         } 
        	 catch(Exception e) {
        		 System.out.println(e.getMessage());
        		 System.out.println(e.toString());
        		 e.printStackTrace();
        		 System.out.println("finished");
        	 }
        	 System.out.println("yes finished");
      
	}
        

	}
}
