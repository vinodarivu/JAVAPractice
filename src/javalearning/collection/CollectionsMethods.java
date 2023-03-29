/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the edcollection1or.
 */
package javalearning.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author U6032545
 */
public class CollectionsMethods {

    public static void main(String args[]) {
        Collection<String> collection1 = new ArrayList<String>();

        System.out.println("-------------------Collection methods-----------------");
        collection1.add("vinodh");
        collection1.add("sunil");
        collection1.add("ramesh");
        collection1.add("dinesh");
        ArrayList<String> arrayList = new ArrayList<String>();
        Collection<String> collection2 = new ArrayList<String>();
        Collection<String> collection3 = new ArrayList<String>();
        Collection<String> collection4 = new ArrayList<String>();
        Collection<String> collection5 = new ArrayList<String>();
        Collection<String> collection6 = new ArrayList<String>();

        collection2.addAll(collection1);
        collection3.addAll(collection1);
        collection4.addAll(collection1);
        collection5.addAll(collection1);
        collection6.addAll(collection1);

        System.out.println("Array list Collection reference : add Methods");
        for (String as : collection1) {
            System.out.println(as);

        }
        Collection<String> col = new LinkedList<String>();
        col.addAll(collection1);
        System.out.println("Linked list  Collection reference : addAll Methods");
        for (String ts : col) {
            System.out.println(ts);

        }

        System.out.println("Linked list  Collection reference : removeIf Methods");
        col.removeIf(n -> (n.equals("vinodh")));
        for (String ts : col) {
            System.out.println(ts);

        }
        System.out.println("Linked list  Collection reference : retainAll Methods");
        collection1.retainAll(col);
        for (String ts : collection1) {
            System.out.println(ts);

        }
        System.out.println("Linked list  Collection reference : clear  Methods");
        collection1.clear();
        for (String ts : collection1) {
            System.out.println(ts);

        }
        System.out.println("Linked list  Collection reference : contain vinodh element  Methods  " + collection2.contains("vinodh"));
        System.out.println("Linked list  Collection reference : containAll collection2 check in collection 3 element  Methods  " + collection3.containsAll(collection2));
        System.out.println("Linked list  Collection reference : equals vinodh element  Methods  " + collection2.equals(collection3));
        System.out.println("iterator using collections");
       
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        
    }

}
