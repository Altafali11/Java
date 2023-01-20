package arrays;

import java.util.Scanner;

public class A_2Darray {

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter the 2D array size");
	  int row = sc.nextInt();
	  int col = sc.nextInt();
	  int[][] matrix = new int [row][col];
	  //  outer loop for row
	  for(int i=0; i<row; i++ ) {
		  // inner loop for column
		  for(int j=0; j<col; j++ ) {
			  matrix[i][j]=sc.nextInt();
		  }
	  }
	  int x = sc.nextInt();
	  for(int i=0; i<row; i++) {
		  for(int j=0; j<col; j++) {
			if(matrix[i][j]==x) {
				  System.out.println(" X locate in "+ i+"," +j );
			  }
		  }
	  }

	}

}

