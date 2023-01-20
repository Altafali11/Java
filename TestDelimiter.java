package delimiter;

import java.util.Scanner;
public class TestDelimiter {
	public static void main(String[] args) {
		String input = "1 fish 2 fish red fish blue fish";
	 Scanner sc = new Scanner(input).useDelimiter("\\s*fish\\s*");
	 System.out.println(sc.nextInt());
	 System.out.println(sc.nextInt());
	 System.out.println(sc.next());
	 System.out.println(sc.next());
	 sc.close();
	 
	 
	 
	 Scanner sc1 = new Scanner("Scanner Altaf ali");
	 sc1.useDelimiter("\\s");
	 while(sc1.hasNext()) {
		 System.out.println(sc1.next());
	 }
	 sc1.close();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}
}
// * means all the space considered










