package thread;
class Studentcount{
	 void showcount(int n) {
		 synchronized (this) { // using synchronizes block 
		for(int i=1; i<=5; i++) {
			System.out.println(n*i);
		}
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	 }
	
}
class Thread1 extends Thread{
	Studentcount s;
	
	public Thread1(Studentcount s) {
		this.s = s;
	}
	public void run() {
		s.showcount(10);
	}
}
class Thread2 extends Thread{
Studentcount s;
	
	public Thread2(Studentcount s) {
		this.s = s;
	}
	public void run() {
		s.showcount(100);
	}
}
public class Testsynchronization{
  public static void main (String[]args) {
  Studentcount sc = new Studentcount();
	  Thread1 th1 = new Thread1(sc);
	  Thread2 th2 = new Thread2(sc);
	  th1.start();
	  th2.start();
  }
	   
   }