/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.JAVABasics;

import java.util.ArrayList;

/**
 *
 * @author U6032545
 */
public class StringTest extends Throwable {

	public static void main(String args[]) {
		String s1 = "ABCD";
		System.out.println(s1.toCharArray());
		char c[] = s1.toCharArray();
		int i = c.length;
		System.out.println(i);
		System.out.println("hash code====" + s1.hashCode());
		String s2 = s1.concat(" Vinod");
		System.out.println("s2===" + s2);
		System.out.println("hash code====" + s2.hashCode());

		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" vinod");
		System.out.println("String builder hashcode==>" + sb.hashCode());
		sb.append(" Kumar");
		System.out.println("After Appending String builder hashcode==>" + sb.hashCode());

		/* Memory String and object test very Important */

		ArrayList<String> v1 = new ArrayList<String>();
		v1.add("vinod");
		v1.add("kumar");
		System.out.println("Before cloning the object ........for V1");
		v1.stream().forEach(System.out::println);
		ArrayList<String> v2 = (ArrayList<String>) v1.clone();
		ArrayList<String> v3 = v1;
		v2.add("Busineni");
		v3.add("Sunil");
		v1.add("Ramesh");
		System.out.println("After cloning the object ........for V1");
		v1.stream().forEach(System.out::println);
		System.out.println("After cloning the object ........for V2");
		v2.stream().forEach(System.out::println);
		System.out.println("After cloning the object ........for V3");
		v3.stream().forEach(System.out::println);

	}

}
