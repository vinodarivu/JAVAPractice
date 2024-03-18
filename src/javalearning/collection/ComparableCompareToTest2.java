/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author U6032545
 */

/*
1) compareTo is abstract method in Comparable interface
2)It provides a single sorting sequence only
3)Comparable should be generic by passing the class name
4)positive integer, if the current object is greater than the specified object.
5)negative integer, if the current object is less than the specified object.
6)zero, if the current object is equal to the specified object
7) it will be inside  in java.lang.package;

*/




 class persondata implements Comparable<persondata> {
    private String name;
    private int age;

    public persondata(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and setter methods

    @Override
    public int compareTo(persondata otherPerson) {
        // First, compare by name
        int nameComparison = this.name.compareTo(otherPerson.name);
        
        // If names are equal, compare by age
        if (nameComparison == 0) {
            return Integer.compare(this.age, otherPerson.age);
        }
        
        return nameComparison;
    }

  
}
 
 public class ComparableCompareToTest2 {
	  public static void main(String[] args) {
	        persondata person1 = new persondata("Alice", 30);
	        persondata person2 = new persondata("Bob", 25);
	        persondata person3 = new persondata("Alice", 25);

	        System.out.println("Comparison result between Alice and Bob: " + person1.compareTo(person2));
	        System.out.println("Comparison result between Bob and Alice: " + person2.compareTo(person1));
	        System.out.println("Comparison result between Alice and Alice (with different age): " + person1.compareTo(person3));
	    }
 }

