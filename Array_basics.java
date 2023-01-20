package arrays;

import java.util.Scanner;


//public class Array_basics {
//	public static void main(String[] args) {
//	  int marks[] = new int[3];
//	  marks[0] =  95;
//	  marks[1] =  89;
//	  marks[2] =  90;
//	  System.out.println(marks[1]);
//      System.out.println(marks[0]);
//	}
//}
abstract class Parent{
	void sum() {
		System.out.println("Sum");
	}
	abstract void sub();
}
class Child extends Parent{
	void sub() {
		System.out.println("SUB");
	}
}
public class Array_basics{
	public static void main(String[]args) {
		Child c = new Child();
		
	}
}

/*public class Array_basics {
	public static void main(String[] args) {
	  int marks[] = new int[8]; 
	  for(int i=0; i<8; i++) {
		  System.out.println(marks[i]);
	  }
	}
}
*/

/*public class Array_basics {
public static void main(String[] args) {
	Scanner sc  =new Scanner (System.in);
	System.out.println("Enter the size of array");
    int number = sc.nextInt();
	  int marks[] = new int[number];
	  for(int i=0; i<number; i++) {
		  System.out.println(marks[i]);
	  }
	}
}
*/

/*public class Array_basics {
public static void main(String[] args) {
	Scanner sc  =new Scanner (System.in);
	System.out.println("Enter the size of array");
	int Size =  sc.nextInt();
	int marks[] = new int[Size];
	System.out.println("enter the array values");
	// outer loop
	for(int i=0; i<Size; i++) {
		marks[i] = sc.nextInt();
		 
	}
	// inner loop;
	 for(int i=0; i<Size; i++) {
	System.out.println(marks[i]); 
}
}
}
*/


/*public class Array_basics {
public static void main(String[] args) {
	Scanner sc  =new Scanner (System.in);
	System.out.println("Enter the size of array");
	int Size =  sc.nextInt();
	int marks[] = new int[Size];
	System.out.println("enter the array values");
	// outer loop
	for(int i=0; i<marks.length; i++) {
		marks[i] = sc.nextInt(); 
	}
	// inner loop;
	System.out.println("enter the arr value which is search");
	int searchvalue =sc.nextInt();
	 for(int i=0; i<marks.length; i++) {
		 if(marks[i]== searchvalue) {
			 System.out.println(" array value found in " + i);
		 } 
}
}
}
*/

//Take an array of names as input from the user and print them on the screen.
//public class Array_basics{
//	public static void main(String[]args) {
//		Scanner sc = new Scanner (System.in);
//		System.out.println("enter the size of array");
//		int size = sc.nextInt();
//		System.out.println("Enter your Array names values");
//		String arr[] = new String[size];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.next();
//			
//		}
//		for(int i=0; i<arr.length; i++) {
//			 System.out.println("name " + (i+1) +" is : " + arr[i]);
//
//		}
//	}
//}


//Find the maximum & minimum number in an array of integers.
/*public class Array_basics{
	public static void main(String[]args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
	   
		
	  System.out.println("Enter the values of array");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				min= arr[i];
				
			}
			if(arr[i]< min) {
				min= arr[i];
				
			}
			
		}
		System.out.println(max);
		System.out.println(min);
	}
	}

*/









