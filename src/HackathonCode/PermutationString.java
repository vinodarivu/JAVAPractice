/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackathonCode;

import java.util.TreeSet;

/**
 *
 * @author U6032545
 */
public class PermutationString {

    public static TreeSet<String> getValues(String input) {

        TreeSet<String> al = new TreeSet<String>();
        for (int i = 0; i < input.length(); i++) {
            String val = String.valueOf(input.charAt(i));
            for (int j = 0; j < input.length(); j++) {
                if (i == j) {

                } else {
                    val = val + String.valueOf(input.charAt(j));
                }

            }
            al.add(val);
        }

        return al;
    }

    public static void main(String args[]) {
        TreeSet al = PermutationString.getValues("ABCDEFGH");
        for (Object o : al) {
            System.out.println("o===" + o);
        }

    }

}
