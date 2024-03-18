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
		System.out.print("s1.toCharArray()====>");
		System.out.println(s1.toCharArray());

		System.out.println("*************************************");

		char c[] = s1.toCharArray();
		int i = c.length;
		System.out.println("c.length==>"+i);
		System.out.println("*************************************");
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

		String a1 = "Vinod";
		String a2 = new String("Vinod");
		String a3 = new String("Vinod");
		String a4 = "Vinod";

		System.out.println("====================string test=====================");
		System.out.println("a1.equals(a4)=>" + a1.equals(a4));
		System.out.println("a2.equals(a3)=>" + a2.equals(a3));
		System.out.println("a1.equals(a2)=>" + a1.equals(a2));
		System.out.print("a2==a3=>");
		System.out.println(a2 == a3);
		System.out.print("a1==a4=>");
		System.out.println(a1 == a4);
		System.out.print("a1==a2=>");
		System.out.println(a1 == a2);
		System.out.println("a1.compareTo(a4)=>" + a1.compareTo(a4));
		System.out.println("a1.compareTo(a2)=>" + a1.compareTo(a2));
		System.out.println("a2.compareTo(a3)=>" + a2.compareTo(a3));

	}

}
