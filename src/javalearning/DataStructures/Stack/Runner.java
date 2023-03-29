/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.DataStructures.Stack;

/**
 *
 * @author U6032545
 */
public class Runner {

    public static void main(String args[]) {
        DStack nums = new DStack();
        System.out.println("nums.size()====>"+nums.size());
        nums.push(15);
        System.out.println("peek Element==>" + nums.peek());
        nums.push(8);
         

        nums.push(10);
        nums.push(14);
        nums.push(14);
        nums.push(14);
        nums.push(14);
        nums.push(14);
        nums.push(14);
        nums.push(14);
        nums.push(14);
        nums.push(14);
        System.out.println("nums.size()====>"+nums.size());
        
        System.out.println("delete pop element==>" + nums.pop());
        nums.show();
    }

}
