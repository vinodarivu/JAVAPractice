/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.JAVABasics;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author U6032545
 */
public class HashcodeTest {
	public static void main(String args[]) {
		
		String v1 = "Vinod";
		String v2= "Vinod";
		String v3 =  new String("Vinod");
		String v4 = new String("Vinod");
		System.out.println(v1==v2);
		System.out.println(v2==v3);
		System.out.println(v1==v3);
		System.out.println(v3==v4);
		System.out.println(v3.compareTo(v4));
		System.out.println(v4.compareTo(v3));
		
		System.out.println(v1.compareTo(v3));
		System.out.println(v1.compareTo(v2));
		System.out.println("******************************************************************************");
		
		HashCodeOveride hc = new HashCodeOveride("vinod", "vinod");
		hc.test();
		HashCodeOveride hc1 = new HashCodeOveride("Sunil", "Sunil");
		hc1.test();

		Map<HashCodeOveride, String> map = new HashMap<HashCodeOveride, String>();
		map.put(hc, "CSE");
		map.put(hc1, "IT");

		for (HashCodeOveride geek : map.keySet()) {
			System.out.println(map.get(geek).toString());
		}

	}
}

class HashCodeOveride {
	String t1 = null;
	String t2 = null;

	HashCodeOveride(String v1, String v2) {
		this.t1 = v1;
		this.t2 = v2;
	}

	public void test() {

		String t3 = new String("vinod");
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());

		System.out.println(t1 == t3);
		System.out.println(t2 == t3);
		System.out.println(t1 == t2);
		System.out.println("t1.equals(t2)===>" + t1.equals(t2));
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode entering");
		int hash = 7;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Test");
		return true;
	}

}
