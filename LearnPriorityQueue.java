package collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

	public static void main(String[] args) {
	  
		Queue<Integer> q1 = new PriorityQueue<>(Comparator.reverseOrder());
		Queue<Integer> q2 = new PriorityQueue<>();
		
		q1.offer(11);
		q1.offer(9);
		q1.offer(45);
		
		System.out.println(q1);
		
		q1.poll();
		System.out.println(q1);
		System.out.println(q1.peek());
		

	}

}
