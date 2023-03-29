/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruff;

/**
 *
 * @author U6032545
 */
public class ExceptionTest {

    ExceptionTest() {
        System.out.println("constructor of Exception Test");
    }

    public static void main(String args[]) throws Exception {
        try {
            int i = 10 / 0;

        } finally {
            System.out.println("exception occured");
            ExceptionTest et = new ExceptionTest();
            throw new Exception("hello vinod exception had been thrown");

        }
       
    }

}
