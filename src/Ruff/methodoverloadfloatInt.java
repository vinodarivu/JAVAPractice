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
public class methodoverloadfloatInt {
    
    public static int  test(int i , long j){
        System.out.println("test1");
    return 1;
    }
      public static String  test(long i , long j){
            System.out.println("test2");
             return "1";
    
    }
    
    public static void main(String args[]){
        //\/
       test(10,10);
    
    }
    
}
