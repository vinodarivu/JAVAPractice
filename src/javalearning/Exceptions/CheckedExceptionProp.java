/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.Exceptions;

import java.io.IOException;

/**
 *
 * @author U6032545
 */
public class CheckedExceptionProp {
     void m() throws IOException  {
        throw new IOException("device error");//checked exception  
    }

    void n() throws IOException  {
        m();
    }

    void p()  throws IOException {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handeled");
        }
    }

    public static void main(String args[]) throws IOException {
        CheckedExceptionProp obj = new CheckedExceptionProp();
        obj.p();
        System.out.println("normal flow");
    }
    
}
