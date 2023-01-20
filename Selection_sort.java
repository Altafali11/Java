package arrays;

public class Selection_sort {

	public static void main(String[] args) {
		int[] a = {45,44,34,12,10,23};
         int min; int temp;
		for(int i=0; i<a.length; i++) {
			  min=i;
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			temp =a[i];
			a[i]=a[min];
			a[min] =temp;
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}

}





































































