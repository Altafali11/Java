package stream;

import java.util.LinkedList;
import java.util.List;

public class Allmethod {

	public static void main(String[] args) {
		List<Integer>l1 = new LinkedList<>();
	     l1.add(1);
	     l1.add(2);
	     l1.add(6);
	     l1.add(5);
	     boolean allneg= l1.stream().allMatch(n->n<0);
	    boolean allneg2= l1.stream().noneMatch(n->n<0);
	    boolean allneg3= l1.stream().anyMatch(n->n<0);
	    System.out.println("all matching elements are"+ allneg);
	     
	}

}
