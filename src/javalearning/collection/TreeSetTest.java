/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.collection;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author U6032545
 */
public class TreeSetTest {

	public static void main(String args[]) {
		TreeSet s = new TreeSet();
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(99);
		s.add(333);
		s.add(34534);
		s.add(534534);
		s.add(324324);
		s.add(324234234);
		s.add(323);
		s.add(311);
		s.add(56);
		s.add(11);
		s.add(23);

		s.forEach(n -> System.out.println(n));

		System.out.println("ceiling==>" + s.ceiling(10));

		System.out.println("floor==>" + s.floor(10));

		TreeSet s1 = (TreeSet) s.headSet(999);

		System.out.println("-------------after headSet-----------");

		s1.forEach(n -> {
			System.out.println(n);
		});

		s1.forEach(System.out::println);

		Iterator decitr = s.descendingIterator();
		System.out.println("*****tree descending way ....STARTS******");
		while (decitr.hasNext()) {
			System.out.println(decitr.next());

		}
		System.out.println("*****tree descending way ....ENDS********");

	}

}
