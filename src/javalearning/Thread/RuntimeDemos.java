/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.Thread;

import java.io.IOException;

/**
 *
 * @author U6032545
 */
public class RuntimeDemos {
    public static void main(String args[]) throws IOException{
    Runtime r = Runtime.getRuntime();
    // r.exec("notepad");
     System.out.println("Available process==>"+Runtime.getRuntime().availableProcessors()); 
    
    }
    
}
