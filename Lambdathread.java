package TestLambda;

/*public class Lambdathread {
	public static void main(String[] args) {
	Runnable r =()->System.out.println("current thread name is" + Thread.currentThread().getName());	
    Thread t = new Thread(r,"Altaf");
    t.start();
	}

}
*/
  

interface R{
	void run();
}
public class Lambdathread {
	public static void main(String[] args) {
	Runnable r =()->System.out.println("current thread name is" + Thread.currentThread().getName());	
    Thread t = new Thread(r,"Altaf");
    t.start();
}
}