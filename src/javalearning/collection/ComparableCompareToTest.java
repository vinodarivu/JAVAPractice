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
class Employee implements Comparable<Employee>{
    
    private int age;
    private String name;
    
    private int id;
    
    @Override
    public String toString() {
        return "Employee{" + "age=" + age + ", name=" + name + ", id=" + id + '}';
    }
    
    Employee(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
        
    }

	
    
    @Override
    public int compareTo(Employee o) {
        if (this.age > o.age) {
            return 1;// for reverse order we should make it as negative 
        } else if (this.age < o.age) {
            return -1;// for reverse order we should make it as positive value 
            
        } else {
            return 0;
            
        }
    }

    
}

public class ComparableCompareToTest {
    
    public static void main(String args[]) {
        
        ArrayList al = new ArrayList();
        al.add(new Employee(27, "vinod", 1));
        al.add(new Employee(25, "sunil", 2));
        al.add(new Employee(24, "ramesh", 3));

//         al.add("vinod");   this comparision do by string class 
//         al.add("suresh");
//         al.add("amit");
//         al.add("winith");
        Collections.sort(al);        
        al.forEach((n) -> System.out.println(n));
        Collections.sort(al);        
        al.forEach((n) -> System.out.println(n));
        
    }
}
