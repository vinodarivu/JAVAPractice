/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackathonCode;

import java.util.Arrays;

/**
 *
 * @author U6032545
 */
public class MissingRepeatNumbersinArray {

    static int[] values = {18, 2, 3, 4, 5, 6, 7, 8, 7, 543, 43453, 5, 18, 3, 2, 6};
    static int[] smallest = {3, 6, 23, 1, 4, 89, 67, 33, 44,1, 66, 77, 88, 99, 22, 90, 80, 70, 60, 40,10111};
    static int length = values.length;
    static int lengthSmallest = smallest.length;

    public static void unRepeatElements() {
        for (int i = 0; i < length; i++) {
            boolean check = false;
            for (int j = 0; j < length; j++) {
                if (values[i] == values[j] && i != j) {
                    check = true;

                }

            }
            if (!check) {
                System.out.println("missing number===>" + values[i]);
            }

        }

    }

    public static void smallestNumber() {

        System.out.println("smallestNumber===>" + smallest[0]);
        System.out.println("SecondSmallestNumber===>" + smallest[1]);
        System.out.println("LargestNumber===>" + smallest[lengthSmallest - 1]);
        System.out.println("secondLargestNumber===>" + smallest[lengthSmallest - 2]);
    }

    public static void main(String args[]) {
        Arrays.sort(smallest);
        smallestNumber();
        unRepeatElements();

    }
}
