package arrays;

/*public class Bubble_sort {
	public static void main(String[] args) {
		// bubble sort
		int[] a= {12,35,24,29,5};
		int temp;
        for(int i=0; i<a.length; i++) { 
        	     
        	for(int j=0; j<a.length-1; j++) { // for two adjacent element 
        		if(a[j]>a[j+1]) {
        			// swap values
        			temp = a[j];
        			a[j] = a[j+1];
        			a[j+1] =temp;
        		      
        		}
        	
        	}
        }
        	for(int i=0; i<a.length; i++) {
        		System.out.print(a[i]+ " ");
        	}
        	
        }
	}
	*/
// for more value 
public class Bubble_sort {
	public static void main(String[] args) {
		// bubble sort 
		int temp;
		int[] a= {45,23,10,56,43,34};
		
		for(int i=0; i<a.length; i++) {
			   int flag=0;
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
					
				}
			}
			if(flag==0) {
				break;
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	}