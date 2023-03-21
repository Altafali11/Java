package collection_framework;

import java.util.Enumeration;
import java.util.Vector;

public class Demo_cursors {

	public static void main(String[] args) {
		
		// Emumeration is a cursor which is used to retrieve the collection object  one by one;
		// Enumeration can be used only in read operation;
		// Enumeration is used to retrieve element  in forward direction only;
		// Enumeration can be used only in legacy class i.e = vector ,stack;
		// Enumeration has two methods (1)= HasMoreElement(); (2)= nextElement();
		
		Vector v = new Vector();
		v.add(10);
		v.add("altaf");
		v.add(200);
		
		Enumeration e =v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		

	}

}
