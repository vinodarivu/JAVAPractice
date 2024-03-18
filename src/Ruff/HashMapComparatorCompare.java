/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author U6032545
 */
/*
 * Java Comparator interface is used to order the objects of a user-defined
 * class.
 * 
 * This interface is found in java.util package and contains 2 methods
 * compare(Object obj1,Object obj2) and equals(Object element).
 * 
 * It provides multiple sorting sequences, i.e., you can sort the elements on
 * the basis of any data member, for example, rollno, name, age or anything else
 */
class Student {

	int rollno;
	String name;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

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

	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		if (s1.age == s2.age) {
			return 0;
		} else if (s1.age > s2.age) {
			return 1;
		} else {
			return -1;
		}
	}
}

class NameComparator implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		return s1.name.compareTo(s2.name);
	}
}

public class HashMapComparatorCompare {

	public static void main(String args[]) {

		ArrayList<Student> al = new ArrayList();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("==========Sorting by age============");

		Collections.sort(al, new AgeComparator());
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student st = (Student) itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("===========Sorting by Name=============");
		// Using lambda expression with a Comparator and Collections.sort()
		Collections.sort(al, (student1, student2) -> student1.getName().compareTo(student2.getName()));
		Iterator itr3 = al.iterator();
		while (itr3.hasNext()) {
			Student st = (Student) itr3.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
