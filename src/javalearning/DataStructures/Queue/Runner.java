/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.DataStructures.Queue;

/**
 *
 * @author U6032545
 */
public class Runner {

    public static void main(String args[]) {
        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(10);
        q.enQueue(19);
        q.enQueue(11);
        q.enQueue(113);
        //  q.enQueue(8777);
        System.out.println("before dequeue==>size=>" + q.size());
        q.show();
        q.deQueue();
        q.deQueue();
        System.out.println("after Dequeue==>size=>" + q.size());
        q.show();
        q.enQueue(192);
        q.enQueue(1772);
        q.enQueue(32423);
        System.out.println("after adding new elements==>size=>" + q.size());
        q.show();

    }

}
