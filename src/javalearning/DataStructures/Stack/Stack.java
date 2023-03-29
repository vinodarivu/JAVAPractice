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
public class Stack {

    int stack[] = new int[5];
    int top = 0;

    public void push(int data) {
        if (top == 5) {
            System.out.println("Stack over flow");
        } else {
            stack[top] = data;
            top++;
        }
    }

    public int pop() {

        int data =0;
        if (isEmpty()) {
            System.out.println("stack under flow");
        }else{
        top--;
        data = stack[top];
        stack[top] = 0;
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

}
