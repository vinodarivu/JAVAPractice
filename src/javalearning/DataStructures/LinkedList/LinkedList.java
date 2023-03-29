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
public class LinkedList {

    Node head; // create object
    int count = 0;

    public void add(int data) { //10,20,30,40
        Node node = new Node();//one more object
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;

        }
        count++;

    }

    public void addAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
        count++;

    }

    public void add(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (index == 0) {
            addAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
            count++;
        }
    }

    public void delete(int index) {
        if (index == 0) {
            pop();
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            count--;
        }

    }

    public void pop() {
        // Node node = head;
        if (head.next != null) {

            head = head.next;
        } else {
            head = null;
        }
        count--;

    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public int size() {
        return count;

    }

}
