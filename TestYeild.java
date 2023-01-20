package thread;

public class TestYeild  extends Thread{
	public void run() {
		for(int i=0; i<=5; i++)
			System.out.println("current thread is" +Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		TestYeild ty = new TestYeild();
		TestYeild ty1 = new TestYeild();
		ty.start();
		ty1.start();
		//for(int i=0; i<=5; i++) {
		  ty.yield();
			System.out.println("current thread is" + Thread.currentThread().getName());

	}

}
//}
