package thread;

public class Testjoin extends Thread{
                      
      public void run() {
    	  // t1.interrupt(); when you try to use interrupt method during join method it gives interuppted exception
    	  for(int i=0; i<3;i++) {
    		  try {
    			  Thread.sleep(500);
    			  System.out.println("Current thread "+Thread.currentThread().getName() );
    		  }
    		  catch(Exception e) {
    			  System.out.println(e);
    		  }
    		  System.out.println(i);
    	  }
      }
	public static void main(String[]args) {
		Testjoin tj = new Testjoin();
		Testjoin tj1 = new Testjoin();
		tj.start();
		try {
			System.out.println("current thread"+Thread.currentThread().getName());
			tj.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		tj1.start();
		try {
			System.out.println("current thread"+Thread.currentThread().getName());
			tj1.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
