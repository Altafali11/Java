package stream;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Reducemethod {

	public static void main(String[] args) {
		// sum of even number
		List<Integer>l1 = new LinkedList<>();
	     l1.add(1);
	     l1.add(2);
	     l1.add(6);
	     l1.add(5);
	     int even= l1.stream().filter(x -> x%2 ==0).reduce(0,(sum,i)->sum+i);
         System.out.println("sum of even number is"+ even);
         
         
  //   min or max method       
         Optional<Integer>minNumber=l1.stream().min((num1,num2)->num1.compareTo(num2));
         System.out.println("min num is"+ minNumber.get());
         
  //    distict method
         l1.stream().distinct().forEach(n->System.out.println(n));
         
	}

}