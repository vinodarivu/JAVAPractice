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
public class Queue {

    int queue[] = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data) {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        } else {
            System.out.println("queue is full");
        }
    }

    public int deQueue() {
        int data = queue[front];
        if (!isEmpty()) {
            front = (front + 1) % 5;
            size--;
        } else {
            System.out.println("queue is empty");
        }
        return data;
    }

    public void show() {
        System.out.print("Elements:  ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % 5] + " ");

        }
        System.out.println("");
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;

    }

    public boolean isFull() {
        return size() == 5;
    }

}
