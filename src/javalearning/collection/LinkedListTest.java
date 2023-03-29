/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author U6032545
 */
//peek:first element
//peek first : return first , null if empty
//peek last : return last , null if empty
//poll: remove first element
//pollFirst: remove first element or null returns
//pollLast:remove last element return null if a list is empty
//pop:remove first element and retrieve the element
public class LinkedListTest {

	public static void main(String as[]) {
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("hello");
		ls.add("vinod");
		ls.add("kumar");
		ls.add("busineni");
		ls.push("suresh");
		ls.push("ramesh");
		ls.offer("offer");
		Collections.sort(ls, Collections.reverseOrder());

		System.out.println("ls.element()===>" + ls.element());
		
		System.out.println("===all elements====");
		ls.forEach(n->System.out.println(n));
		System.out.println("================");
		
		Collections.sort(ls, Comparator.reverseOrder());

		System.out.println("ls.element()===>" + ls.element());

		System.out.println("ls.poll===" + ls.poll());
		System.out.println("after poll ls.element()===>" + ls.element());
		System.out.println("ls.pop===" + ls.pop());
		System.out.println("after pop ls.element()===>" + ls.element());

		ls.forEach(n -> {
			System.out.println(n);
		});

		System.out.println("---------add First----------");
		ls.addFirst("Im First");

		ls.forEach(n -> {
			System.out.println(n);
		});

		System.out.println("---------addLast----------");
		ls.addLast("Im Last");

		ls.forEach(n -> {
			System.out.println(n);
		});

		System.out.println("---------getFirst----------");
		System.out.println(ls.getFirst());

		System.out.println("---------getLast----------");
		System.out.println(ls.getLast());

		System.out.println("---------Peek----------");
		System.out.println(ls.peek());

		LinkedList emptyOne = new LinkedList();
		System.out.println("-----peekFirst()-----------");
		System.out.println(emptyOne.peekFirst());
		System.out.println("-----peekLast()-----------");
		System.out.println(emptyOne.peekLast());

		System.out.println("-----poll()-----------");
		System.out.println(ls.poll());

		System.out.println("-----pollFirst()-----------");
		System.out.println(emptyOne.pollFirst());

		System.out.println("-----pollLast()-----------");
		System.out.println(emptyOne.pollLast());

		System.out.println("-----before pop()-----------");
		ls.forEach(n -> {
			System.out.println(n);
		});

		System.out.println("-----pop()-----------");
		System.out.println(ls.pop());

		System.out.println("********after Poping*********");
		ls.forEach(n -> {
			System.out.println(n);
		});

		System.out.println("*********************----NULL SCENARIO----*******************");
		LinkedList<String> lsNull = new LinkedList<String>();
		lsNull.add(null);
		lsNull.add(null);
		lsNull.add(null);
		lsNull.add(null);
		lsNull.add(null);
		lsNull.add(null);
		lsNull.add(null);
		lsNull.add(null);

		System.out.println("ls.pop===" + lsNull.pop());
		System.out.println("ls.element()===>" + lsNull.element());

		System.out.println("ls.poll===" + lsNull.poll());
		System.out.println("after poll ls.element()===>" + lsNull.element());

		lsNull.forEach(n -> {
			System.out.println(n);
		});

		System.out.println("---------add First----------");
		lsNull.addFirst("Im First");

		lsNull.forEach(n -> {
			System.out.println(n);
		});

		System.out.println("---------addLast----------");
		lsNull.addLast("Im Last");

		lsNull.forEach(n -> {
			System.out.println(n);
		});

		System.out.println("---------getFirst----------");
		System.out.println(lsNull.getFirst());

		System.out.println("---------getLast----------");
		System.out.println(lsNull.getLast());

		System.out.println("---------Peek----------");
		System.out.println(lsNull.peek());

		System.out.println("-----poll()-----------");
		System.out.println(lsNull.poll());

		System.out.println("-----before pop()-----------");
		lsNull.forEach(n -> {
			System.out.println(n);
		});

		System.out.println("-----pop()-----------");
		System.out.println(lsNull.pop());

		System.out.println("after Poping");
		lsNull.forEach(n -> {
			System.out.println(n);
		});

	}

}
