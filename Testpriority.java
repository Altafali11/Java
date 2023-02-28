package thread;

class Priority extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
	}
}
public class Thread_Priority {
	public static void main(String[] args) {
		
		System.out.println("Default priority  " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println("new Priority  "  + Thread.currentThread().getPriority());
        Priority p = new Priority();
        p.start();
	}

}

