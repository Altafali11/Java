package collection;
import java.util.*;

public class Arraydeque {
	public static void main(String[]args) {
		ArrayDeque<Integer>de=new ArrayDeque<>();
		de.add(45);
		de.add(95);
		de.add(65);
		de.addFirst(100);
		de.addLast(78);
		System.out.println(de.getFirst());
		System.out.println(de.getLast());
	}

}

