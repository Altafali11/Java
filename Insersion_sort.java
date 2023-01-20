package arrays;

public class Insersion_sort {

	public static void main(String[] args) {
		int[] a = {12,15,4,5,34};
         int temp, j=0;
		for(int i=1; i<a.length; i++) {
			 temp=a[i];
			 j=i;
			while(j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		for(int i=1; i<a.length; i++) {
			System.out.println(a[i] +"");
		}
	}

}
