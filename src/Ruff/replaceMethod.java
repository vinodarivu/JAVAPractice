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
public class replaceMethod {
    public static void main(String args[]){
    
    String acctnumber =  "32404385575";
    System.out.println(maskNumber(acctnumber, ""));}
    
       public static String maskNumber(String number, String lastUnMaskCount) {
           String newMaskNumber = "";
           newMaskNumber = number.substring(0, number.length()-4).replaceAll("[0-9]","X")+number.substring(number.length()-4, number.length());
           return newMaskNumber;
           
          
 
 
   }
    
}
