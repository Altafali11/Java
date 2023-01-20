package arrays;

import java.util.Scanner;
//Take an array of numbers as input and check if it is an array sorted in ascending order.

/*public class Sorted_array {
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
      int arr[] = new int[size];
      
      for(int i=0; i<arr.length; i++) {
    	  arr[i]=sc.nextInt();
      }
       
      boolean isAscending = true;
      for(int i=0; i<arr.length-1; i++) {
    	  if(arr[i]> arr[i+1]) { // this is the condition for descending order
    		   
    		  isAscending =false;
    	  }
      }
      if (isAscending) {
    	  System.out.println("the array is sorted in ascending order");
      }
      else{
    	 System.out.println("the array is not sorted in ascending order"); 
      }
      
      
	}
    
}
*/
public class Sorted_array {
      int i;
	public static boolean isSorted(int[] ar) {
		for(int i=0; i<ar.length-1; i++) {
			if(ar[i]>ar[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int arr[]= {1,0,4,8};
		System.out.println(isSorted(arr));
	}
}
















