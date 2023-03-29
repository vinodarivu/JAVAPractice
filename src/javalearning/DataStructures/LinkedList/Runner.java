/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.DataStructures.LinkedList;

/**
 *
 * @author U6032545
 */
public class Runner {

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        for (int j = 0; j < 100; j++) {
            list.pop();
        }
        list.show();
        System.out.println("Count====" + list.size());

    }

}
