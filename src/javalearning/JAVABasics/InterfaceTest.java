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
interface parentInterface {

    default void defaultMethod() {
        System.out.println("parent default method");
    }

    public static void staticMethod() {
        System.out.println("parent Static method called");
    }

    void say();

}

class SubclassInter implements parentInterface {

    @Override
    public void defaultMethod() {
        System.out.println("child default method called");
    }
   
 
    @Override
    public void say() {
        System.out.println("child say override method called");

    }
     
     public static void staticMethod() {
        System.out.println("child static method called");

    }

}

public class InterfaceTest {

    public static void main(String args[]) {
        parentInterface pI = new SubclassInter();
        pI.defaultMethod();
       // pI.staticMethod(); 
    }

}
