package TestLambda;

 interface Arry{
 double avg(int[] a);
 }
public class Lambda {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,};
		Arry ar = (x) ->{
		 double sum = 0;
		 int size = x.length;
		 for(int i=0; i<size; i++) {
			 sum= sum+x[i];
		 }
		 System.out.println(sum);
		 return sum/size;
		};
        System.out.println("average of array elements is" +ar.avg(arr));
	}

}
