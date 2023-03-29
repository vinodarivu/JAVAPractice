/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.Thread;

/**
 *
 * @author u6032545
 */
class Counter {

      int count = 0;

    public void increment() {
        count++;
    }

}

public class inconsitencyThread {

    public static void main(String args[]) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                c.increment();
            }
        });
          Thread t2 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                c.increment();
            }
        });
          Thread t3 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                c.increment();
            }
        });
          Thread t4 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                c.increment();
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
      // t1.join();
       //t2.join();
      // t3.join();
       t4.join();
          
     

        System.out.println(c.count);

    }

}
