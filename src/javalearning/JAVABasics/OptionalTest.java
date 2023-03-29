/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.JAVABasics;

import java.util.Optional;

/**
 *
 * @author U6032545
 */
/*
 * Java introduced a new class Optional in jdk8. It is a public final class and
 * used to deal with NullPointerException in Java application. You must import
 * java.util package to use this class. It provides methods which are used to
 * check the presence of value for particular variable.
 */
public class OptionalTest {

	public static void main(String[] args) {
		String[] str = new String[10];
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		System.out.println("Optional.ofNullable(str[5])====>" + Optional.ofNullable(str[5]));

		System.out.println("checkNull.isPresent()===>" + checkNull.isPresent());

		if (checkNull.isPresent()) { // check for value is present or not It returns true if there is a value
										// present, otherwise false.
			System.out.println("inside ispresent if condition");
			String lowercaseString = str[5].toLowerCase();
			System.out.print(lowercaseString);
		} else {
			System.out.println("string value is not present");
		}

		String[] str1 = new String[10];
		str1[0] = "vinod";
		str1[1] = "kumar";
		str1[2] = "busineni";
		str1[3] = "suresh";
		str1[9] = "ramesh";
		// str1[10] = "sunil";
		Optional<String> chckNull = Optional.ofNullable(str1[1]);
		chckNull.ifPresent(System.out::println);// If a value is present, invoke the specified consumer with the value,
												// otherwise do nothing.

		String[] stringArray = new String[10];
		stringArray[5] = "JAVA OPTIONAL CLASS EXAMPLE"; // Setting value for 5th index
		// It returns an empty instance of Optional class
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		// It returns a non-empty Optional
		Optional<String> value = Optional.of(stringArray[5]);
		// If value is present, it returns an Optional otherwise returns an empty
		// Optional
		System.out.println("Filtered value: " + value.filter((s) -> s.equals("Abc")));
		System.out.println("Filtered value: " + value.filter((s) -> s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
		// It returns value of an Optional. if value is not present, it throws an
		// NoSuchElementException
		System.out.println("Getting value: " + value.get());
		// It returns hashCode of the value
		System.out.println("Getting hashCode: " + value.hashCode());
		// It returns true if value is present, otherwise false
		System.out.println("Is value present: " + value.isPresent());
		// It returns non-empty Optional if value is present, otherwise returns an empty
		// Optional
		System.out.println("Nullable Optional: " + Optional.ofNullable(stringArray[5]));
		// It returns value if available, otherwise returns specified value,
		System.out.println("orElse: " + value.orElse("Value is not present"));
		System.out.println("orElse: " + empty.orElse("Value is not present"));
		value.ifPresent(System.out::println); // printing value by using method reference

	}

}
