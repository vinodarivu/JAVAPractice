/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.JAVABasics;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author U6032545
 */
public class ArrayListTest {

    public static void main(String args[]) {
 
      String abc[] = new String[] { "A", "B", "C", "D" };  
            // getting the list view of Array 
            List<String> list = Arrays.asList(abc); 
            
            System.out.println(list);
            ArrayList<String> alnew = new ArrayList<String>(list);
            alnew.add("vinod");
           alnew.add("E");
            for(Object test : alnew){
            System.out.println(test);
            }
        ArrayList al = new ArrayList();
        for (int i = 0; i < 20; i++) {
            al.add(i + "a");
        }
        for (Object a : al.subList(0, 5)) {

            System.out.println("a===" + a);
        }

    }

}
