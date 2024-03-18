/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.JAVABasics;

/**
 *
 * @author U6032545
 */
public class PassByValue {

	public static void main(String[] args) {
		int x = 5;
		String name = "vinod";
		changeIntPrimitive(x);
		changeStringprimitive(name);
		System.out.println(x);
		System.out.println(name);
		testpass tp = new testpass();
		tp.name = "suresh";
		System.out.println("*************************************************************************************");
		System.out.println("befor tp passing reference value=>" + tp + "    ,hashcode==>" + tp.hashCode());

		System.out.println("creating new Object inside the changecheckNewobject ===>tp.name=>" + tp.name);
		changecheckNewobject(tp);
		System.out.println("tp.name=>" + tp.name);

		System.out.println("*************************************************************************************");
		System.out.println("changing the value in changecheckobject method to kumar tp.name=>" + tp.name);
		changecheckobject(tp);
		System.out.println("tp.name=>" + tp.name);

	}

	public static void changeIntPrimitive(int x) {
		x = 10;
	}

	public static void changeStringprimitive(String name) {
		name = "sunil";
	}

	public static void changecheckNewobject(testpass tp) {
		tp = new testpass();
		tp.name = "kumar";
		System.out.println("inside method tp passing reference value=>" + tp + "    ,hashcode==>" + tp.hashCode()
				+ "identity hashcode==>" + System.identityHashCode(tp));
	}

	public static void changecheckobject(testpass tp) {

		tp.name = "kumar";
		System.out.println("inside method tp passing reference value=>" + tp + "    ,hashcode==>" + tp.hashCode()
				+ "identity hashcode==>" + System.identityHashCode(tp));
	}

}

class testpass {

	int i = 10;
	String name = "suresh";
}
