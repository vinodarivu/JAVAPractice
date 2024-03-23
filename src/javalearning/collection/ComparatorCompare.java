/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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

class NameComparator implements Comparator<Map.Entry<Integer, Student>> {

	@Override
	public int compare(Entry<Integer, Student> o1, Entry<Integer, Student> o2) {
		return o1.getValue().getName().compareTo(o2.getValue().getName());

	}
}

public class ComparatorCompare {

	public static void main(String args[]) {

		HashMap<Integer, Student> hm = new HashMap<>();
		hm.put(3, new Student(101, "Vijay", 23));
		hm.put(2, new Student(106, "Ajay", 27));
		hm.put(6, new Student(105, "Jai", 21));
		hm.put(1, new Student(105, "ZEEVAN", 31));
		hm.put(5, new Student(105, "Vihaan", 31));
		hm.put(9, new Student(105, "Agastya", 31));
		
		Set<Map.Entry<Integer, Student>> entrySet = hm.entrySet();
		Collections.sort(new ArrayList<>(entrySet),new NameComparator());
		for(Map.Entry<Integer, Student> mp : entrySet) {
			System.out.println(mp.getKey() +","+mp.getValue().getName());
			
		}

		System.out.println("==========before Sorting========");
		Set<Map.Entry<Integer, Student>> hs = hm.entrySet();

		for (Map.Entry<Integer, Student> me : hs) {
			System.out.println(me.getKey() + "::::" + me.getValue().getName());
		}

		System.out.println("=======Sorting by Name========");

		List<Map.Entry<Integer, Student>> hsName = new ArrayList(hm.entrySet());
		Collections.sort(hsName, new NameComparator());

		for (Map.Entry<Integer, Student> me1 : hsName) {
			System.out.println(me1.getKey() + "::::" + me1.getValue().getName());
		}

	}

}
