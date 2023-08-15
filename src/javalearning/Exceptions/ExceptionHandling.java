/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author u6032545
 */
public class ExceptionHandling {
    

    public static void main(String[] args) throws FileNotFoundException, IOException {  
          
        FileOutputStream fs = new FileOutputStream("dinesh.txt");
        fs.write(64);    
        FileInputStream fis = new FileInputStream("dinesh.txt");
        char val = (char)(fis.read());
        System.out.println(val);
       
// providing the checked exception handler  
        
    System.out.println("File saved successfully");  
    }  
}
