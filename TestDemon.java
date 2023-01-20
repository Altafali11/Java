package thread;

public class TestDemon extends Thread {
	public void run() {
	 if(Thread.currentThread().isDaemon())	{
		 System.out.println("it is a demon thread");
	 }
	 else {
		 System.out.println("it is a user thread");
	 }
	}

	public static void main(String[] args) {
		TestDemon td = new TestDemon();
		TestDemon td1 = new TestDemon();
		TestDemon td2 = new TestDemon();
	//	td.start(); // if you make a thread is demon thread then you have not started the thread before make it demon thread
		td.setDaemon(true);
		td.start(); // after make demon thread then satrt the thread
		td1.start();
		td2.start();

	}

}
