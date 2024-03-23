/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.JAVA8;

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
 * method 3)static method and default method cannot be
 * override4) Abstract Class vs Java 8 Interface After having default and static
 * methods inside the interface, we think about the need of abstract class in
 * Java. An interface and an abstract class is almost similar except that you
 * can create constructor in the abstract class whereas you can't do this in
 * interface.
 */
interface TestInterface {

	// Default method
	default void say() {
		System.out.println("PPPPPP----parent(interface) say default method called");
	}

	static void test() {
		System.out.println("PPPPPP----parent(interface) test static method called");
	}

	// Abstract method
	void sayMore(String msg);
}



class ImplementInterfaceTest implements TestInterface {

	@Override
	public void sayMore(String msg) {
		System.out.println("CCCCCCC----inside saymore ImplementInterfaceTest");

	}

	@Override
	public void say() {
		System.out.println("CCCCCCC----inside say default method ImplementInterfaceTest");

	}
	
	
	public static void test() {
		System.out.println("CCCCCCC----inside test static method ImplementInterfaceTest");

	}

}
public class DefaultMethodsInInterface {

	public static void main(String args[]) {
		TestInterface tiInterface = (msg) -> {
			System.out.println("marker interface function override by using lamda expression and msg=>" + msg);
		};
		tiInterface.sayMore("hello");
		tiInterface.say();

		DefaultMethodsInInterface dmi = new DefaultMethodsInInterface();
		dmi.say();
		TestInterface.test();
		dmi.test();
		
		
		TestInterface testInt = new ImplementInterfaceTest();
		testInt.say();
		testInt.sayMore(null);
		TestInterface.test();
		

	}

	static void test() {
		System.out.println("CCCCCCC----child test static method  called");
	}

	public void say() { // implementing abstract method
		System.out.println("CCCCCCC----child say default method called");
	}

}
