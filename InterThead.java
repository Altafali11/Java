package thread;

class Customer implements Runnable{
	int amount = 5000;
	public void run() {
		System.out.println("Thread is running");
	}
	void Withdraw(int amount) {
		System.out.println("amount is withdraw");
	if(this.amount<amount) {
		System.out.println("amount insufficient");
	}
	
	
	
	try {
		wait();
	}
	catch(Exception e) {
		System.out.println(e);
	}

}


    void Deposit(int amount) {
    	System.out.println("going to deposit");
    	this.amount=amount;
    	notify();
    }
    }
public class InterThead {
	public static void main(String[] args) {
		Customer cs = new Customer();
		Thread tr = new Thread(cs);
	     tr.start();
        cs.Withdraw(1000);
        cs.Deposit(5000);
	}

}
// this code is not correct try after class
