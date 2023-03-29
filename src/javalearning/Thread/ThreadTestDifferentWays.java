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
public class ThreadTestDifferentWays extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadName=>" + Thread.currentThread().getName());
        }

    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("System.gc threadName=>" + Thread.currentThread().getName());
        super.finalize();
    }

    public static void main(String args[]) throws InterruptedException, Throwable {
        System.out.println("main function enters with thread=>"+Thread.currentThread().getName());
        ThreadTestDifferentWays jmt = new ThreadTestDifferentWays();
        ThreadTestDifferentWays jmt1 = new ThreadTestDifferentWays();
        ThreadTestDifferentWays jmt2 = new ThreadTestDifferentWays();
        ThreadTestDifferentWays jmt3 = new ThreadTestDifferentWays();
        jmt3 = null;
        System.gc();
        jmt2.finalize();

        jmt.start();
        //jmt.join();
        jmt1.run();
        // jmt1.join();
        Thread t1 = new Thread(jmt1);
        t1.start();
          

        //jmt.setName("JMT");
        //jmt.setPriority(MIN_PRIORITY);
        //   jmt1.start();
        //jmt1.setName("JMT1");
        //jmt1.setPriority(MIN_PRIORITY);
        //jmt1.join();
        // jmt2.start();
        //jmt2.setPriority(MIN_PRIORITY);
        //jmt2.setName("JMT2");
        //jmt2.join();
        //jmt3.setName("JMT3");
        //jmt3.start();
        // jmt3.setPriority(MIN_PRIORITY);
        //jmt3.join();
    }

}
