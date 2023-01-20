package collection;
import java.util.*;

public class Array_list {

	public static void main(String[] args) {
	 ArrayList<Integer>l1=new ArrayList<>();
	 ArrayList<Integer>l2=new ArrayList<>(5);
	 l2.add(16);
	 l2.add(15);
	 l2.add(14);
     l1.add(6);
     l1.add(4);
     l1.add(7);
     l1.add(5);
  //   l1.add(0,5);// method to set index position
  //  l1.addAll(l2);// method to add l1+l2 array without set index position
    // System.out.println(l1.lastIndexOf(4));
   // l1.remove(4);// remove the element of the given index num
    l1.addAll(0,l2);// with set index position
  //  l1.clear();// method to clear array
  //  l1.set(5, 16);// use to set the value in any index position and remove which already existed
    
    
    
     for(int i=0; i<l1.size();i++) {
    System.out.println(l1.get(i));
    
     }
   //  System.out.print(l1.indexOf(15));// method is used to identify the index position of given number
    
    // System.out.println(l1.contains(7)); used to check the value of array is existed or not
	}

}
