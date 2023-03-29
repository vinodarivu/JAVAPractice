/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackathonCode;

/**
 *
 * @author u6032545
 */
public class FibonaciSeries {

    public static void main(String args[]) {
        long prevFirstNumber = 0;
        long prevSecondNumber = 0;
        for (int i = 0; i <= 10; i++) {
            long number = prevFirstNumber + prevSecondNumber;
            if (i >= 2) {
                System.out.println(number);
                prevSecondNumber = prevFirstNumber;
                prevFirstNumber = number;

            } else {
                System.out.println(i);
                prevFirstNumber = i;
                prevSecondNumber = i - 1;
            }

        }

    }

}

//0 1 1 2 3 5 8 13
