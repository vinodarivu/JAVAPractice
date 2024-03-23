/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.JAVABasics;

/**
 *A process of Hiding Implementation details and showing only functionality to user (or) hiding internal details and showing functionality
 *It can have abstract and non abstract methods , abstract class (0 to 100)% , Interface(100%)
 *It can't be initiated but it can have constructor and static methods, it can have final non-abstract methods(concrete)
 *
 *it helps to reduce complexity and also improve maintainability of the system.
 *private static , final can't be used in abstract method , it can be used in concrete methods.
 * @author U6032545
 */
public abstract class AbstractClass {
    // we can write constructors in abstract method
  
    AbstractClass(int i){
    
    }
    
}
class  test extends AbstractClass{

    //if super class doesn't have default constructor and if it has parameterized constructor , in child class we should write parameter constructor
    public test(int i) {
        super(i);
    }




}
