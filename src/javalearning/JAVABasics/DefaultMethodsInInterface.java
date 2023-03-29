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
/*
 * 
 * 1)Java provides a facility to create default methods inside the interface.
 * Methods which are defined inside the interface and tagged with default are
 * known as default methods. These methods are non-abstract methods 2)You can
 * override default method also to provide more specific implementation for the
 * method -- check this line 3)static method and default method cannot be
 * override Abstract Class vs Java 8 Interface After having default and static
 * methods inside the interface, we think about the need of abstract class in
 * Java. An interface and an abstract class is almost similar except that you
 * can create constructor in the abstract class whereas you can't do this in
 * interface.
 */
interface TestInterface {

	// Default method
	default void say() {
		System.out.println("parent(interface) say default method called");
	}

	static void test() {
		System.out.println("parent(interface) test static method called");
	}

	// Abstract method
	void sayMore(String msg);
}

public class DefaultMethodsInInterface {

	public static void main(String args[]) {
		TestInterface tiInterface = (msg) -> {
			System.out.println("functional interface function override by using lamda expression and msg=>" + msg);
		};
		tiInterface.sayMore("hello");
		tiInterface.say();

		DefaultMethodsInInterface dmi = new DefaultMethodsInInterface();
		dmi.say();
		TestInterface.test();
		
		
		TestInterface testInt = new ImplementInterfaceTest();
		testInt.say();
		testInt.sayMore(null);
		TestInterface.test();
		

	}

	static void test() {
		System.out.println("child test static method  called");
	}

	public void say() { // implementing abstract method
		System.out.println("child say default method called");
	}

}

class ImplementInterfaceTest implements TestInterface {

	@Override
	public void sayMore(String msg) {
		System.out.println("inside saymore ImplementInterfaceTest");

	}

	@Override
	public void say() {
		System.out.println("inside say default method ImplementInterfaceTest");

	}

}
