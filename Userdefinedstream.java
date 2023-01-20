package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	Float price;
	public Product(int id, String name, float price) {
		this.id =id;
		this.name= name;
		this.price = price;
	}
}


public class Userdefinedstream {

	public static void main(String[] args) {
		Product p1 = new Product(1,"Asus",50000);
		Product p2 = new Product(1,"Legion",80000);
		Product p3 = new Product(1,"Dell",48000);
		List<Product>l1 = new ArrayList<Product>();
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		List<String>Productprice =l1.stream().filter(p->p.price<50000).map(p->p.name).collect(Collectors.toList());
		System.out.println(Productprice);
		
		l1.stream().filter(p->p.price<50000);
	}

}

