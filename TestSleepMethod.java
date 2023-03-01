package thread;

//  Sleep method without making thread
//public class Demo_Sleep {
//	public static void main(String[] args) {
//
//		for(int i=1; i<=10; i++) {
//			try {
//				Thread.sleep(1000);
//				System.out.println(i);
//			}
//			catch(Exception e) {
//				System.out.println(e);
//			}
//		}
//	}
//
//}



                        // sleep method by making thread

//public class Demo_Sleep extends Thread {
//	 public void run() {
//		 
//		 for(int i=1; i<=5; i++) {      
//			 try {
//				 Thread.sleep(1000);
//				
//			 }
//			 catch(Exception e) {
//				 System.out.println(e);
//			 }
//			 System.out.println(i);
//		 }
//	 }
//	
//	public static void main(String[] args) {
//		
//		Demo_Sleep DM = new Demo_Sleep();
//		DM.start();	
//	}
//	}




public class Demo_Sleep extends Thread {
	 public void run() {
		 
		 for(int i=1; i<=5; i++) {      
			 try {
				 Thread.sleep(1000);
				
			 }
			 catch(Exception e) {
				 System.out.println(e);
			 }
			 System.out.println( i + Thread.currentThread().getName());
		 }
	 }
	
	public static void main(String[] args) {
		
		Demo_Sleep DM = new Demo_Sleep();
			DM.start();     
	//		DM.run();   // if we call run method then thread is not created and main thread running
			
		Demo_Sleep Dm = new Demo_Sleep();
		Dm.start();
	}
	}


