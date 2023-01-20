package stream;

import java.util.LinkedList;
import java.util.List;

public class Sortedmethod {

	public static void main(String[] args) {
		 List<Integer>l1 = new LinkedList<>();
	     l1.add(1);
	     l1.add(3);
	     l1.add(5);
	     l1.add(6);
	     l1.stream().sorted().forEach(sortedNum->System.out.println(sortedNum));

	}

}
