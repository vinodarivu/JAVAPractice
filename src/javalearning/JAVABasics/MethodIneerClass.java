/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.JAVABasics;

/**
 *
 * @author U6032545
 */
public class MethodIneerClass {

    private int data = 30;//instance variable

    void display() {
        class Local {

            void msg() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String args[]) {
        MethodIneerClass obj = new MethodIneerClass();

        obj.display();
    }
}
