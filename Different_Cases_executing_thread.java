package thread;

//  performing single task from multiple thread
//class Test extends Thread{
//	public void run() {
//		System.out.println("thread running");
//	}
//}
//
//public class Different_Cases_executing_thread {
//	public static void main(String[] args) {
//		Test t = new Test();
//		t.start();
//		Test t1 = new Test();
//		t1.start();
//
//	}
//
//}


             //performing multiple task from multiple thread//
class Test extends Thread{
	public void run() {
		System.out.println("thread running");
	}
}
class Test1 extends Thread{
	
	public void run() {
		System.out.println("2nd thread is running");
	}
}
class Test2 extends Thread{
	public void run() {
		System .out .println("3rd thread is running");
	}
}

public class Different_Cases_executing_thread {
	public static void main(String[] args) {
		Test t = new Test();
		t.start();
		Test1 t1 = new Test1();
		t1.start();
        Test2 t2 = new Test2();
        t2.start();
	}

}


