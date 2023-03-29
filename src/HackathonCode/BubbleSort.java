/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackathonCode;

/**
 *
 * @author U6032545
 */
public class BubbleSort {

    static int[] inputValue = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    //8,9,7,6,5,4,3,2,1
    //8,7,9,6,5,4,3,2,1
    //8,7,6,5,4,3,2,1,9

    public static int[] bubbleSortMethod(int[] input) {

        int temp = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < (input.length - i); j++) {
                if (input[j - 1] > input[j]) {
                    //swap elements  
                    temp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temp;
                }

            }

        }

        return input;
    }

    public static void main(String args[]) {
        System.out.println("after Sorting==>");
        int[] output = bubbleSortMethod(inputValue);
        for (int number : output) {
            System.out.println(number);
        }

    }

}
