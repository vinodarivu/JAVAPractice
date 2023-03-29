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
