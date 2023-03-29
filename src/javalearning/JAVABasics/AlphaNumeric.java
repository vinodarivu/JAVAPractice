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
public class AlphaNumeric {

    public static void main(String args[]) {

        String val = "376327gdewgfjdwjcj34uu2riuduhw*(U(*Y#HUI#HUH#*(YDHEJBdhebd36t^&*#^*&^#*";
        String result = getAlphanumeric(val);
        System.out.println(result);
    }

    public static String getAlphanumeric(String inputVal) {
        String outPut = "";
        byte s[] = inputVal.getBytes();
        for (int i = 0; i < s.length; i++) {
            int asci = s[i];
            if ((asci >= 48 && asci <= 57) || (asci >= 65 && asci <= 90) || (asci >= 97 && asci <= 122)) {
                String val = String.valueOf((char) asci);
                outPut = outPut + val;

            }
        }

        return outPut;
    }

}
