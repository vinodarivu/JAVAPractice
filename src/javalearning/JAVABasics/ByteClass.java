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
public class ByteClass {
    
    public static void main(String args[]){
   String data = "hello vinod";
   byte[] b = data.getBytes();
   for(byte bq :b){
   System.out.println(bq);
   }
    }
    
}
