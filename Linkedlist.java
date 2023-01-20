package collection;

import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {
	
	 LinkedList<Integer>l1=new LinkedList<>();
	 LinkedList<Integer>l2=new LinkedList<>();
	 l2.add(16);
	 l2.add(15);
	 l2.add(14);
     l1.add(6);
     l1.add(4);
     l1.add(7);
     l1.add(5);
     l1.addAll(0,l2);
     l1.addFirst(155);
     l1.addLast(169);
     for(int i=0; i<l1.size();i++) {
    	 System.out.println(l1.get(i));
     }
	}

}


