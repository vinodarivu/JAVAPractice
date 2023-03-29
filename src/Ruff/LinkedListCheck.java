/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruff;

import java.util.LinkedList;

/**
 *
 * @author U6032545
 */
public class LinkedListCheck {

    public static void main(String args[]) {

        LinkedList ls = new LinkedList();
        ls.add("Heelo");
        ls.add("ramesh");
        ls.add("madesh");
        ls.add("sailesh");

        System.out.println("-------before pop the elements-----------");

        ls.forEach(n -> {
            System.out.println(n);
        });
        System.out.println(ls.pop());

        System.out.println("-------After pop the elements-----------");
        ls.forEach(n -> {
            System.out.println(n);
        });

        System.out.println("---------------Poll ----------");

        System.out.println(ls.poll());

        System.out.println("---------------After poll the elements  ----------");

        ls.forEach(n -> {
            System.out.println(n);
        });;

        LinkedList ls1 = new LinkedList();
        System.out.println("ls1 empty  peeks==>"+ls1.peek());

    }

}
