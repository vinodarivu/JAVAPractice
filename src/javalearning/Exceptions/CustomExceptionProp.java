/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.Exceptions;

import java.io.IOException;

class myOwnUnCheckedException extends RuntimeException {

    public myOwnUnCheckedException(String s) {
        super(s);

    }
}

class myOwnCheckedException extends Exception {

    public myOwnCheckedException(String s) {
        super(s);

    }

}

/**
 *
 * @author U6032545
 */
public class CustomExceptionProp {

    void m() throws myOwnCheckedException {
        throw new myOwnCheckedException("device error");//checked exception  
    }

    void n() throws myOwnCheckedException {
        m();
    }

    void p() throws myOwnCheckedException,NullPointerException {

        n();

    }

    void m1() {
        throw new myOwnUnCheckedException("device error");//checked exception  
    }

    void n1() {
        m1();
    }

    void p1() {

        n1();

    }

    public static void main(String args[]) throws myOwnCheckedException {
        CustomExceptionProp obj = new CustomExceptionProp();
        obj.p();
        obj.p1();
        System.out.println("normal flow");
    }

}
