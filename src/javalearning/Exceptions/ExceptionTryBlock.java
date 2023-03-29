/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.Exceptions;

/**
 *
 * @author U6032545
 */
public class ExceptionTryBlock {

    public static void main(String args[]) {
        try {
            int i = 10 / 0;
        } catch (NullPointerException e) {
            try {
                int i = 10 / 0;

            } catch (Exception e1) {
                System.out.println("finally caught");

            }
        } catch (ArithmeticException e2) {
            System.out.println("arthimatic exception executing");

        } catch (Exception e3) {
            System.out.println("any exception may come");
        } finally {

            System.out.println("hello doctor");
        }

    }

}
