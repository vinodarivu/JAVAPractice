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
public class Operators{

    public static void main(String args[]) {
        String s1 = "vinod";
        String s2 = new String("vinod");
        String s3 = "vinod";
        String s4 = "VINOD";
        
        

        System.out.println("S1===S2=>" + (s1 == s2)); // it will compare memory reference
        System.out.println("S1===S3=>" + (s1 == s3)); 

        System.out.println("S1.equals(S2)=>" + (s1.equals(s2)));// it will compare values
        System.out.println("S1.equals(S3)=>" + (s1.equals(s3)));      
        
        
        System.out.println("s1.compareTo(s2)====>"+s1.compareTo(s2)); // comparable interface alrdy string has been overrided
         System.out.println("s1.compareTo(s3)====>"+s1.compareTo(s3));
         System.out.println("s1.compareTo(s4)====>"+s1.compareTo(s4)); 
         
         
         
         
         
         

    }


}
