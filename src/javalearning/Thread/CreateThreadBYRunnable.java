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
public class CreateThreadBYRunnable  implements Runnable{

    @Override
    public void run() {
      
        System.out.println("my thread is running");
    }
    
    public static void main(String args[]){
    CreateThreadBYRunnable ctr = new CreateThreadBYRunnable();
    Thread t1 = new Thread(ctr);
    t1.start();
    }
    
}
