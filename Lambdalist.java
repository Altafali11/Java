package TestLambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Person{
	public int age;
	public String name;
	public Person(int age,String name) {
		super();
		this.age=age;
		this.name= name;
		
	}
	public int getAge() {
		return age;
	}
}

public class Lambdalist {
	public static void main(String[] args) {
		List<Person>lop = new ArrayList<>();
		lop.add(new Person(12,"Altaf"));
		lop.add(new Person(13,"saif"));
		lop.add(new Person(14,"pandey"));
		lop.add(new Person(15,"junaid"));
		
		Collections.sort(lop,(Person p1, Person p2)->{
			return p1.getAge()-p2.getAge();
		});
		for(Person p: lop) {
			System.out.println(p.name +p.age);
		}
	}

}
