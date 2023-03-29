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
public class ShutDownHook extends Thread {
    
    public void run(){
    System.out.println("shudownhook is running");
    }
    
    public static void main(String args[]) throws InterruptedException{
       Runtime r = Runtime.getRuntime();
       r.addShutdownHook(new ShutDownHook()); 
       //r.exit(MIN_PRIORITY);
       System.out.println("now main is sleeping");
       Thread.sleep(30000);
    
    }
    
}
