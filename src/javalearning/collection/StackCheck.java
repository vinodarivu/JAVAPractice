/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.collection;

import java.util.Stack;

/**
 *
 * @author U6032545
 */
public class StackCheck {

    public static void main(String args[]) {
        Stack sc = new Stack();
        sc.push("Vinod");
        sc.push("suresh");
        sc.push("ramesh");
        sc.push("Madesh");
        sc.push("Sailesh");
          System.out.println("--------------before pop------------");
        sc.forEach(n -> {
            System.out.println(n);
        });
        System.out.println("---------------After pop--------------");
        sc.pop();
         sc.forEach(n -> {
            System.out.println(n);
        });
         
         Stack emptyStack = new Stack<>();
         System.out.println("--------------pop on EmptyStack--------------");
         emptyStack.pop();
         
         
         
        
        
      
    }
    
}
