package exception;

public class Specific_exception {
	public static void main(String[] args) {
		try {
		int [] arr = new int[3];
		arr[5]=100;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println(e);
		}
	}
}
