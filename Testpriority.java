package thread;

public class Testpriority extends Thread{
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
	Testpriority tp= new Testpriority();
	Testpriority tp1= new Testpriority();
    System.out.println("priority of thread tp is"+tp.getPriority());
    System.out.println("priority of thread tp1 is"+tp1.getPriority());
    tp.setPriority(6);
    tp1.setPriority(2);
    System.out.println("priority of thread tp is"+tp.getPriority());
    System.out.println("priority of thread tp1 is"+tp1.getPriority());
    System.out.println("current thread name is "+ Thread.currentThread().getName());
    System.out.println("current thread priority value" +Thread.currentThread().getPriority());
    Thread.currentThread().setPriority(8);
    System.out.println("current thread is "+Thread.currentThread().getPriority());
    Testpriority tp2 = new Testpriority();
    System.out.println("priority of thread tp2 is "+Thread.currentThread().getPriority());
	}

}
