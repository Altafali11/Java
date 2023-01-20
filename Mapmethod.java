package stream;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Mapmethod {

	public static void main(String[] args) {
		  // USE MAP
		// square of number present in list
	     List<Integer>l1 = new LinkedList<>();
	     l1.add(1);
	     l1.add(2);
	     l1.add(3);
	     l1.add(4);
	     List<Integer>Sq=l1.stream().map(num->num*num).collect(Collectors.toList());
	     System.out.println("squared numbers are:"+Sq);

	}

}
