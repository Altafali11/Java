package arrays;

/*public class alltype_of_array_retrive {

	public static void main(String[] args) {
		// 1D Array
		int[] a = new int[5] ;
		a[0] = 45;
		a[1] =65;
		a[2] =75;
		a[3] =66;
		a[4] =55;
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}
}
*/
/*public class alltype_of_array_retrive {
	public static void main(String[] args) {
		//1D Array using for each loop
		int[] a = {10,15,20,35};
		for(int i:a) {
			System.out.print(i+ " ");
		}
}
}
*/
/*public class alltype_of_array_retrive {
	public static void main(String[] args) {
		// 2D Array
		int[][] a = new int[2][3];
		a[0][0] = 45;
		a[0][1] = 55;
		a[0][2] = 75;
		a[1][0] = 64;
		a[1][1] = 78;
		a[1][2] = 35;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	}
	*/
/*public class alltype_of_array_retrive {
	public static void main(String[] args) {
		int[][] a= {{12,15,16},{12,13},{24,25},{16,17,45,67}};
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	}
	
*/
/*public class alltype_of_array_retrive {
	public static void main(String[] args) {
		// 2d ARRAY USING FOR EACH LOOP
		 int [][] a = {{12,13},{13,45},{12,65}};
		 for(int [] i : a) {
			 for(int j: i) {
				 System.out.print(j + " ");
			 }
			 System.out.println();
		 }
	}
	}
*/

//public class alltype_of_array_retrive {
//	public static void main(String[] args) {
//		// 3D Array
//		int[][][] a= {{{12,13,14},{45,65,45,45},{23,24,45}}};
//		 for(int i=0; i<a.length; i++) {
//			 for(int j=0; j<a[i].length; j++) {
//				 for(int k=0; k<a[i][j].length; k++) {
//					 System.out.print(a[i][j][k]+ " ");
//				 }
//				 System.out.println();
//			 }
//		 }
//	}
//	}

 /// ANONYMUS ARRAY

public class alltype_of_array_retrive {
	public static void main(String[] args) {
		alltype_of_array_retrive.sum(new int[]{12,23,14});
	}
	 static void sum(int[] a){
		int total = 0;
		for(int i=0; i<3; i++) {
			total = total+a[i];
		}
		System.out.println(total);
	}
	}









