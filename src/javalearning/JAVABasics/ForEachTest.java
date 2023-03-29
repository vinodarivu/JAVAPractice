package javalearning.JAVABasics;

import java.util.ArrayList;
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
		al.forEach(s->System.out.println(s));
		System.out.println("================ for each System.out::println");
		al.forEach(System.out::println);
		System.out.println("================ forEachOrdered");
		al.stream().forEachOrdered(System.out::println);
		System.out.println("================");
		al.stream().forEachOrdered(s->System.out.println(s));
		System.out.println("================");
		al.stream().forEach(s->System.out.println(s));
		System.out.println("================");
		al.stream().forEach(System.out::println);
		System.out.println("================");
		
		List<Integer> alint = new ArrayList<Integer>();
		alint.add(1222);
		alint.add(3432423);
		alint.add(43543543);
		alint.add(423423);
		alint.stream().filter(s->s>312765).forEach(System.out::println);
		System.out.println("================");

	}

}
