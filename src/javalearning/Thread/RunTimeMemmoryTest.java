/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.Thread;

/**
 *
 * @author U6032545
 */
public class RunTimeMemmoryTest {
    
public static void main(String args[])throws Exception{  
  Runtime r=Runtime.getRuntime();  
  System.out.println("Total Memory: "+r.totalMemory());  
  System.out.println("Free Memory: "+r.freeMemory());  
    
  for(int i=0;i<100000000;i++){  
   new RunTimeMemmoryTest();  
  }  
  System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());  
  System.gc();  
  System.out.println("After gc(), Free Memory: "+r.freeMemory());  
 }  
} 