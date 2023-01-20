package optionalclass;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		TestOptional tol = new TestOptional();
        Integer value1 = null;
        Integer value2 = new Integer(5);
   // Optional.ofNullable-allow null parameter to pass     
        Optional<Integer> a = Optional.ofNullable(value1);
   //  Optional.of throw nullpointer exception if parameter is null       
        Optional<Integer> b = Optional.of(value2);
        System.out.print(" addition of two number" +tol.add(a,b));
	}
	public Integer add(Optional<Integer> a,Optional<Integer>b) {
		System.out.println("value is present " +a.isPresent());// check value is present (true)else false
		System.out.println("value is present " +b.isPresent());
		Integer value1 =a.orElse(new Integer(0));// returns value if present otherwise default values is passed
		Integer value2 =b.get();
		return value1+value2;
	}

}

