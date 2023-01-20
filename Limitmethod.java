package stream;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Limitmethod {

	public static void main(String[] args) {
		
		 List<Integer>l1 = new LinkedList<>();
	     l1.add(1);
	     l1.add(2);
	     l1.add(3);
	     l1.add(4);
	     l1.stream().limit(2).forEach(num->System.out.print(" "+num));
	     
	    // for random     
	     Random r = new Random();
	     r.ints().limit(10).sorted().forEach(sortedNum->System.out.println(sortedNum));
		}

	}

