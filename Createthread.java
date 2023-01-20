package thread;
/*
public class Createthread extends Thread {  // note whenever we extends or implement the thread and create a thread object (cr) are not ordinary object it is thread object
	public void run(){
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
	
        Createthread  cr = new  Createthread();
        cr.start();
        System.out.println("current thread name is"+Thread.currentThread().getName());
	}

}
*/

/*public class Createthread implements Runnable { 
	public void run() {
		System.out.println("thread is running");
	}
	public static void main(String[]args) {
		Createthread cr = new Createthread();// (cr) is runabble object
		Thread obj = new Thread(cr);// when we use implements runnable we have to create Thread object manually
		obj.start();
	}
}
*/






/*    // this is the other method to create a constructor in thread class
class Createthread{
	public static void main(String[]args) {
		Thread t = new Thread("this is my first name");
		t.start();
		String str = t.getName();
		System.out.println(str);
	}
}
*/

/*class Createthread implements Runnable{
	public void run() {
		System.out.println("thread is running");
	}

	public static void main(String[]args) {
		Createthread cr = new Createthread();
		Thread t = new Thread("this is my first name");
		t.start();
		String str = t.getName();
		System.out.println(str);
	}
}
*/





