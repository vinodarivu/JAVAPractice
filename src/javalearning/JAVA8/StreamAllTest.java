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
		
		/*
		 * In Java, reduce() is a terminal operation in the Stream API that performs a reduction on the elements of the stream. It combines all elements of the stream into a single result. The reduce() operation takes two parameters:

An identity value: This is the initial value of the reduction operation.
An accumulator function: This function takes two parameters (accumulated value and current element) and returns a new accumulated value.
*/
		BigInteger b = Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE)).limit(9).reduce(BigInteger.ONE,
				BigInteger::multiply);

		System.out.println("factorial====>" + b);
		
		Long result = Stream.iterate(1L, ele->ele+1).limit(9).reduce(1L,(first,second)->first*second);
		System.out.println("OTHER WAY ====>result=====>"+result);

		System.out.println("***************************************************************");

		List<String> words = Arrays.asList("Hello", "World", "Java", "Streams");
		/*
		 * flatMap() is a method in the Java Stream API that transforms each element of a 
		 * stream of collections (or other kinds of elements that can be transformed into streams) 
		 * into a stream of elements, and then flattens the resulting streams into a single stream.
		 * 
		 * */

		List<String> letters = words.stream().flatMap(word -> Stream.of(word.split(""))) // Splits each word into
																							// individual letters
				.collect(Collectors.toList());
		

		System.out.println(letters);
		
		System.out.println("***************************************************************");
		 List<List<Integer>> nestedList = Arrays.asList(
		            Arrays.asList(1, 2, 3),
		            Arrays.asList(4, 5, 6),
		            Arrays.asList(7, 8, 9)
		        );

		        List<Integer> flattenedList = nestedList.stream()
		                                                .flatMap(List::stream)
		                                                .collect(Collectors.toList());

		        System.out.println(flattenedList); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
		        
		      
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
