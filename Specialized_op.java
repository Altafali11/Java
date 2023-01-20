package stream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
/*// mapto() method
public class Specialized_op {
// to convert into specialized stream we use parse method
	public static void main(String[] args) {
		List<String>l1 = new ArrayList<String>();
		 l1.add("10");
	     l1.add("11");
	     l1.add("12");
	     l1.add("13");
	 // max()    
	     OptionalInt maxNumber=l1.stream().mapToInt(i->Integer.parseInt(i)).max();
	     System.out.println(maxNumber);
	     
	// sum method  // in sum method it is wriiten in Double directly not optinal double    
	    Double sum= l1.stream().mapToDouble(i->Double.parseDouble(i)).sum();
	    System.out.println(sum);
	    
	//  
	    OptionalDouble avg=l1.stream().mapToDouble(i->Double.parseDouble(i)).average();
	    System.out.println("average of the element " +avg);
	}

}
*/
//////////////////////////////////////////////////
// change stream to parallel stream
public class Specialized_op {
	public static void main(String[] args) {

List<Integer>l1 = new LinkedList<>();
l1.add(1);
l1.add(3);
l1.add(5);
l1.add(6);
l1.parallelStream().map(num->num+1).forEach(n->System.out.println(n));

	}
}























