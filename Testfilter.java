package stream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Testfilter {

	public static void main(String[] args) {
     List<String> names = new ArrayList<String>();
     names.add("altaf");
     names.add("saif");
     names.add("");
     names.add("pandey");
     names.add("");
     names.add("junaid");
    int count_empty= (int)names.stream().filter((name)-> name.isEmpty()).count();
     System.out.println("total number of empty names are "+ count_empty);
 //    
     List<String>nonempty=  names.stream().filter(name->!name.isEmpty()).collect(Collectors.toList());
     System.out.println(nonempty);		 
 //
     
    List<String>result = names.stream().filter(s->s.startsWith("p")).collect(Collectors.toList());
    System.out.println(result);
     
    
    
    
    
    
   
	}

}
