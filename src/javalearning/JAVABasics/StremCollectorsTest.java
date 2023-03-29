package javalearning.JAVABasics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StremCollectorsTest {

	public static void main(String args[]) {
		List<ProductCollect> productsList = new ArrayList<ProductCollect>();
		// Adding Products
		productsList.add(new ProductCollect(1, "HP Laptop", 25000));
		productsList.add(new ProductCollect(2, "Dell Laptop", 30000));
		productsList.add(new ProductCollect(3, "Lenevo Laptop", 28000));
		productsList.add(new ProductCollect(4, "Sony Laptop", 28000));
		productsList.add(new ProductCollect(5, "Apple Laptop", 90000));
		
		System.out.println("Total elements : " + productsList.stream().collect(Collectors.counting()));
		System.out.println("Price Summing Double: " + productsList.stream().collect(Collectors.summingDouble(p->p.price)));
		System.out.println("Price Average double Amount:"+productsList.stream().collect(Collectors.averagingDouble(p->p.price)));
		System.out.println("Price Average Long Amount:"+productsList.stream().collect(Collectors.averagingLong(p->p.price)));
		System.out.println("to set Names:"+productsList.stream().collect(Collectors.toSet()));
		System.out.println("to List Names:"+productsList.stream().collect(Collectors.toList()));
		System.out.println("to MAP Names:"+productsList.stream().collect(Collectors.toMap(ProductCollect::getName,ProductCollect::getPrice)));
		
	
	}

}

class ProductCollect {
	int id;
	String name;
	int price;

	public ProductCollect(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "ProductCollect [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
