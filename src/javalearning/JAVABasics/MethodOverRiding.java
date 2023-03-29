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
public class MethodOverRiding {

    public static void main(String args[]) {
        SuperClass scRef = new Subclass();
        scRef.method();
        scRef.test();
        Subclass subRef = new Subclass();
        subRef.test();
    }

}

class SuperClass {

    public void method() {
        System.out.println("Super class method");
    }
    public SuperClass test() {
        System.out.println("Super class method with superclass Return Type");
        return new SuperClass();
    }
     void defaultMethod(){
     System.out.println("Super Default method");
    }
     public String stringTest(){
     System.out.println("String method in superclass");
     return "this is string";
     }

}

class Subclass extends SuperClass {

    public void method() {
        System.out.println("sub class method");
    }
     public Subclass test() {
        System.out.println("subclass class method with Subclass Return Type");
        return new Subclass();
    }
//     public Double stringTest(){
//     }

}
