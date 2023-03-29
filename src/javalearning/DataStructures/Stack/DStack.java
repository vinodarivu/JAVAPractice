/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.DataStructures.Stack;

/**
 *
 * @author U6032545
 */
public class DStack {

    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;

    public void push(int data) {
        if (size() == capacity) {
            expand();
        }
        stack[top] = data;
        top++;

    }

    public int pop() {

        int data = 0;
        if (isEmpty()) {
            System.out.println("stack under flow");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public int peek() {
        int data;

        data = stack[top - 1];

        return data;
    }

    public void show() {
        for (int n : stack) {
            System.out.println(n);
        }

    }

    private void expand() {
        int length = size();
        int newStack[] = new int[capacity * 2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        capacity *= 2;
    }

    private void shrink() {

        int length = size();
        if (length <= (capacity / 2) / 2) {
            capacity = capacity / 2;
        }
        int newStack[] = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;

    }

}
