package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {
		// list can contain any number of null values
		// List follow the insertion order
		// List can contain duplicate element 
		// list is an index based data structure
		List l = new ArrayList();
		l.add(100);
		l.add(125);
		l.add(150);
		l.add(175);
		l.add(4,200);     
		l.add(null);     
		l.add(null); 
		
	     System.out.println(l.contains(null));   // return boolean value by checking value present in list or not
	  //    l.clear();  delete all element in list
	        l.remove(4);
		
		System.out.println(l);
		
 ///////////////////////////////////////////////
		
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
	
		
	// get values by iterator	
		Iterator it = l.iterator();           // list also has ListIterator to get element 
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
