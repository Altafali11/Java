package collection;
import java.util.*;
public class Hash_set {
	public static void main(String[]args) {
		HashSet<String>MyHashSet = new HashSet<>();
		MyHashSet.add("altaf");
		MyHashSet.add("saif");
		MyHashSet.add("pandey");
		MyHashSet.add("junaid");
		MyHashSet.remove("junaid");
		
		System.out.println(MyHashSet);
		System.out.println(MyHashSet.isEmpty());
		System.out.println(MyHashSet.size());
		System.out.println(MyHashSet.clone());
		Iterator itr = MyHashSet.iterator();
		while(itr.hasNext()) {
			
			System.out.print(itr.next());
			for(String s : MyHashSet)
			        System.out.println();	
			}		
	}
}


