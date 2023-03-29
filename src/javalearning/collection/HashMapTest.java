/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author U6032545
 */
public class HashMapTest {

    public static void main(String args[]) {
        HashMap hm = new HashMap();
        hm.put("1", "vinod");
        hm.put("3", "suresh");
        hm.put("10", "rajesh");
        hm.put("5", "busineni");

        Set s = hm.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey() + "," + entry.getValue());

        }
          System.out.println("====================");
          
       
        
      System.out.println("comparing by Key in ascending order");   
         hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
         
         System.out.println("comparing by key in descending order");
           hm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
              
         System.out.println("comparing by value");
           hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
           
           
            System.out.println("comparing by value in descending order");
           hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
           
      
    }

}
