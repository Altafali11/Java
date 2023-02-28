package thread;

class Demo extends Thread {                                 // and this part outside the main method are handled by (02 thread) 
	public void run() {
		System.out.println("Running");
		Thread.currentThread().setName("Altaf");   // set name method set the name of thread 
		System.out.println(Demo.currentThread().getName());    // get name return the current thread name 
	}
}

public class Basic_Naming_method {
	public static void main(String[] args) {     // all the coding part inside the main are handled by main thread by jvm
		
   Demo t = new Demo();
   t.start();	
   t.currentThread().setName("Junaid");
   System.out.println( t.currentThread().getName());
   
  
	}

}


/////////////////////////////////////////////////////////
/*class Demo {
   int a  , b ;  
		 public int Division(int n ,int  i) {                                                         
		return a/b;
	}
	}
                                                                                          
public class Basic_Naming_method {               
	public static void main(String[] args) {      
		Thread T = new Thread();                    
		T.currentThread().setName("altaf");;         
		Demo D = new Demo (); 
//		try {
		D.Division(10,0);  
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
	}                                                   
	}*/                                                    
//////////////////////////////////////////////////////////// 












