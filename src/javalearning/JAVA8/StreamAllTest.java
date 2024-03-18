/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.JAVA8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
/**
 *
 * @author U6032545
 */
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAllTest {
	public static void main(String[] args) {
		Stream.iterate(50, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
				.forEach(System.out::println);

		System.out.println("***************************************************************");
		BigInteger b = Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE)).limit(9).reduce(BigInteger.ONE,
				BigInteger::multiply);

		System.out.println("factorial====>" + b);

		System.out.println("***************************************************************");

		List<String> words = Arrays.asList("Hello", "World", "Java", "Streams");

		List<String> letters = words.stream().flatMap(word -> Stream.of(word.split(""))) // Splits each word into
																							// individual letters
				.collect(Collectors.toList());

		System.out.println(letters);

		System.out.println("***************************************************************");
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		System.out.println(productsList.stream().filter(p -> p.price > 30000)// filtering data
				.map(p -> p.price) // fetching price
				.collect(Collectors.toList())); // collecting as list
		System.out.println("***************************************************************");
		System.out.println(productsList.stream().collect(Collectors.toMap(p -> p.id, p -> p.name)));
		System.out.println("***************************************************************");

		Stream.iterate(100, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
				.forEach(System.out::println);
		System.out.println("***************************************************************");
		int i = Stream.iterate(10, element -> element - 1).filter(element -> element > 0).limit(9).reduce(1,
				(sum, element) -> sum * element);
		System.out.println("fibonanci value ===>" + i);
		System.out.println("***************************************************************");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Using reduce to find the sum of elements
		Optional<Integer> sumOptional = numbers.stream().reduce((x, y) -> x + y);
		int sum = sumOptional.orElse(0); // Default value if the stream is empty

		System.out.println("Sum of elements: " + sum);
		System.out.println("***************************************************************");

		productsList.stream().filter(product -> product.price > 30000)
				.forEach(product -> System.out.println(product.name));
		System.out.println("***************************************************************");

		System.out.println(
				"reduce sum==>" + productsList.stream().map(product -> product.price).reduce(0.0f, Float::sum));
		System.out.println("***************************************************************");

		Product pd = productsList.stream().max((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
		System.out.println("max Product always give object==>" + pd.toString());
		System.out.println("***************************************************************");

		List<String> al = new ArrayList<String>();
		al.add("vinod");
		al.add("kumar");
		al.add("suresh");
		al.add("ramesh");
		al.add("v");

		al.stream().filter(p -> p.length() > 2).collect(Collectors.toSet()).forEach(System.out::println);
		System.out.println("***************************************************************");

	}
}
