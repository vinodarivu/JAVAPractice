package javalearning.JAVA8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Java provides a new method forEach() to iterate the elements. 
 * It is defined in Iterable and Stream interface. 
 * It is a default method defined in the Iterable interface. 
 * Collection classes which extends Iterable interface can use forEach loop to iterate elements.
This method takes a single parameter which is a functional interface. 
So, you can pass lambda expression as an argument.*/
public class ForEachTest {

	public static void main(String args[]) {
		List<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("vinod");
		al.add("kumar");
		al.add("busineni");
		al.forEach(s -> System.out.println(s));
		System.out.println("================ for each System.out::println");
		al.forEach(System.out::println);
		System.out.println("================ forEachOrdered");
		al.stream().forEachOrdered(System.out::println);
		System.out.println("================");
		al.stream().forEachOrdered(s -> System.out.println(s));
		System.out.println("================");
		al.stream().forEach(s -> System.out.println(s));
		System.out.println("================");
		al.stream().forEach(System.out::println);
		System.out.println("================");

		List<Integer> alint = new ArrayList<Integer>();
		alint.add(1222);
		alint.add(3432423);
		alint.add(43543543);
		alint.add(423423);
		alint.stream().filter(s -> s > 312765).forEach(System.out::println);
		System.out.println("================");

		System.out.println("*********************************************");
		System.out.println("=======forEach vs forEachOrdered=======");

		/*
		 * In Java streams, both forEach and forEachOrdered are terminal operations used
		 * to process the elements of a stream. However, they differ in how they handle
		 * ordering and parallelism:
		 * 
		 * forEach: The forEach method is a terminal operation that iterates over the
		 * elements of a stream in their natural order. It allows you to specify an
		 * action (a lambda expression or method reference) that is applied to each
		 * element of the stream.
		 * 
		 * Example:
		 */

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		names.stream().forEach(name -> System.out.println("Hello, " + name));

		/*
		 * The forEach operation doesn't guarantee any specific order if the stream is
		 * processed in parallel. Elements might be processed concurrently, leading to
		 * non-deterministic output.
		 * 
		 * forEachOrdered: The forEachOrdered method is also a terminal operation that
		 * guarantees the order of processing, even in parallel streams. It iterates
		 * over the elements of a stream in the encounter order, which is the order the
		 * elements appear in the source.
		 * 
		 * Example:
		 */

		List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie");
		names1.parallelStream().forEachOrdered(name -> System.out.println("Hello, " + name));

		/*
		 * In this case, even though the stream is parallel, the forEachOrdered
		 * operation ensures that elements are processed in the original order ("Alice",
		 * "Bob", "Charlie") regardless of parallelism.
		 * 
		 * In summary:
		 * 
		 * Use forEach when you don't need to guarantee the order of processing and when
		 * you're not concerned about potential parallelism-related non-determinism. Use
		 * forEachOrdered when you want to ensure the order of processing, even in
		 * parallel streams, and you need predictable output. In most cases, if order
		 * matters or if you're dealing with parallel streams, it's a good practice to
		 * use forEachOrdered to ensure correctness and predictable behavior.
		 */

	}

}
