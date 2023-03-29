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
public class TrimImplementationClass {

    public static void main(String args[]) {

       // String s = "  vinod kumar Busineni  ";
        String s = " V KB C D E     G h  ";
        String val = trim(s);
        System.out.println(val);
       
         
    }

    public static String trim(String inputString) {
        String outputVal = "";
        String space = "";
        for (int i = 0; i < inputString.length(); i++) {
            String iterateElement = String.valueOf(inputString.charAt(i));
            if (iterateElement.equals(" ")){
                space = space + iterateElement;
            }else if (outputVal.equals("")) {
                outputVal = outputVal + iterateElement;
                space = "";
            } else if (!space.equals("")) {
                outputVal = outputVal + space + iterateElement;
                space = "";
            } else {
                outputVal = outputVal + iterateElement;
                space = "";
            }

        }

        return outputVal;
    }

}
