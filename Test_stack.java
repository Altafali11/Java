package collection;

import java.util.Stack;

public class Test_stack {

	public static void main(String[] args) {
		Stack<String> s1= new Stack<>();   // last in first out ( for e.g= bread bundle)
		s1.push("altaf");
		s1.push("Saif");
		s1.push("junaid");
		
		System.out.println(s1);
		System.out.println(s1.peek());
		
		s1.pop();  // top element removed
		System.out.println(s1);
		System.out.println(s1.peek()); // peek is used to show which element is in top position in statck
		

	}

}
