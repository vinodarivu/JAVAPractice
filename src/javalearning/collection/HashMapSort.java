/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author U6032545
 */
public class HashMapSort {

    public static void main(String args[]) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "B");
        hm.put(3, "C");
        hm.put(99, "A");
        hm.put(37, "Z");
        hm.put(442, "X");
        System.out.println("before sorting");
        for (Map.Entry<Integer, String> me : hm.entrySet()) {

            System.out.println(me.getKey() + "," + me.getValue());

        }
        System.out.println("After sorting by keys ");
        TreeMap<Integer, String> sortedHM = new TreeMap(hm);
        for (Map.Entry<Integer, String> me : sortedHM.entrySet()) {

            System.out.println(me.getKey() + "," + me.getValue());

        }
        List ls = new ArrayList(hm.entrySet());
        Collections.sort(ls, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) o1).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        Iterator it = ls.iterator();
        System.out.println("Sorted by value");
        while (it.hasNext()) {

            Map.Entry<Integer, String> sortedentry = (Map.Entry) it.next();
            System.out.println(sortedentry.getKey() + "," + sortedentry.getValue());

        }
        
        //Different ways
        //Sorting by keys
        System.out.println("comparingByKey()=======>");
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("comparingByValue()=======>");
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println("comparingByKey()===By Descending order====>");
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
        System.out.println("comparingByValue()===By Descending order====>");
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
        
    }

}
