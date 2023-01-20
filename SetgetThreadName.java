package thread;

public class SetgetThreadName extends Thread {
	public   SetgetThreadName(String name) {
	       super(name);
	}
	public SetgetThreadName() {
		System.out.println("thread name updated");
		
	}
	public void run() {
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		SetgetThreadName st = new SetgetThreadName();
		SetgetThreadName st1 = new SetgetThreadName("Altaf");
		st.start();
		st1.start();
		st.setName("Altaf");
		System.out.println("after setting thread name"+st.getName());

	}

}
