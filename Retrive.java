package arrays;

/*public class Retrive {
	public static void main(String[] args) {
		// retrive of array value
		int[] a = new int [3];
		a[0] = 10;
		a[1] = 15;
		a[2] = 20;
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
		

	}

}
*/
/*public class Retrive {
	public static void main(String[] args) {
		// retrive using for each loop
		int[] a = {11,12,13};
		for(int search : a) {
			System.out.print(search + " ");
		}
	}
	}
*/
//  2D array
public class Retrive {
	public static void main(String[] args) {
		int[][] a = new int[2][3];
		a[0][0] = 12;
		a[0][1] = 14;
		a[0][2] = 15;
		a[1][0] = 16;
		a[1][1] = 17;
		a[1][2] = 18;
		
		for(int i=0; i<a.length; i++) {
		    for(int j=0; j<a[i].length; j++) {
		    	System.out.print(a[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}