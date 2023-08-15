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

1)An Interface that contains exactly one abstract method is known as functional interface. It can have any number of default, 
static methods but can contain only one abstract method. It can also declare methods of object class
2)A functional interface can extends another interface only when it does not have any abstract method.
3)

*/
interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
} 
@FunctionalInterface  // this is also functional interface since parent interface doesnt have abstarct methods
interface Test extends Doable{  
    void say(String msg);   // abstract method  
}

@FunctionalInterface
interface sayable {

    void say(String msg);   // abstract method  
    // It can contain any number of Object class methods.  

    int hashCode();

    String toString();

    boolean equals(Object obj);
}

public class FunctionalInterfaceTest implements sayable ,Doable{
	public void doIt() {
		System.out.println("child class");
	}
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceTest fie = new FunctionalInterfaceTest();
        fie.say("Hello there");
    }
}
