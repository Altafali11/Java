package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet {

	public static void main(String[] args) {
		// Set is not an index based ds  it stores data according to hash code value;
		// set does not follow insertion order;
		// set interface does not stor duplicate value
		// set use iterator to iterate element  in set interface it does not have listiterator 
		// set can store only one null values
		
		Set s = new HashSet();
		s.add(100);
		s.add(200);
		s.add(150);
		s.add(200);
		
		
	 Iterator itr = s.iterator();
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
		
	}

}
