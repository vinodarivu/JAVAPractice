package javalearning.collection;

import java.util.*;

class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// Constructor, getters, setters, etc.
}

class AgeComparatorPerson implements Comparator<Person> {

	public int compare(Person o1, Person o2) {
		Person s1 = (Person) o1;
		Person s2 = (Person) o2;

		if (s1.getAge() == s2.getAge()) {
			return 0;
		} else if (s1.getAge() > s2.getAge()) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class ComparatorSecondExample {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		// Add Person objects to the list

		// Using lambda expression with a Comparator and Collections.sort()
		Collections.sort(people, (person1, person2) -> person1.getName().compareTo(person2.getName()));

		// Print the sorted list
		for (Person person : people) {
			System.out.println(person.getName() + ": " + person.getAge());
		}

		// Using lambda expression with a Comparator and Collections.sort()
		Collections.sort(people, new AgeComparatorPerson());

		// Print the sorted list
		for (Person person : people) {
			System.out.println(person.getName() + ": " + person.getAge());
		}
	}
}
