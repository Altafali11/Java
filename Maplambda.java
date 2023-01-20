package TestLambda;

import java.util.HashMap;
import java.util.Map;

public class Maplambda {
		
	public static void main(String[] args) {
	Map<Integer,String>courseMap= new HashMap<>();	
    courseMap.put(1, "c");
    courseMap.put(2, "c++");
    courseMap.put(3, "java");
    courseMap.put(4, "python");
    courseMap.forEach((k,v)-> printAll(k,v)); // using lambda Expression
    courseMap.forEach((k,v)-> System.out.println("no"+ k+ "name"+v));
    courseMap.forEach(Maplambda:: printAll);// using static method 
	}
	static void printAll(Integer no, String course) {
		System.out.println("course number is"+ no+ "course name is "+ course);
	
	}

}
