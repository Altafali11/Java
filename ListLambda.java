package TestLambda;

import java.util.ArrayList;

public class ListLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String>statesname = new ArrayList<String>();
      statesname.add("kerla");
      statesname.add("karnataka");
      statesname.add("up");
      statesname.add("mp");
      statesname.forEach(name->System.out.println(name));
      
	}

}
