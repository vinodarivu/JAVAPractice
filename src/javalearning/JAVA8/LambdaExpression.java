/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.JAVA8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Stream;

/**
 *
 * @author U6032545
 */
/*Important points
1)lambda expressions: It provide a clear and concise way to represent one method interface using an expression.
1) we should not implements the interface when we use lambda expressions
-->Java lambda expression is treated as a function, so compiler does not create .class file.
-->Less coding.

(argument-list) -> {body}  

1) Argument-list: It can be empty or non-empty as well.

2) Arrow-token: It is used to link arguments-list and body of expression.

3) Body: It contains expressions and statements for lambda expression.

 */
@FunctionalInterface // it is optional
interface Drawable{

    public void draw();
    default void hello() {
    	System.out.println("adding default methold in function interface to check lambda expression");
    }
}

interface Bike {

    public void setbike(String color);
    //public void setbikec(String color,String b);
}

interface Employee {

    public String setEmployeeName(String Name);
}

interface World {

    public String mapWorldDetails(String country, String state);

}

public class LambdaExpression {

    int age;
    String name;
    int id;
    String phoneName;
    int cost;

    LambdaExpression(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;

    }

    LambdaExpression(String phoneName, int cost) {
        this.phoneName = phoneName;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "LambdaExpression{" + "age=" + age + ", name=" + name + ", id=" + id + ", phoneName=" + phoneName + ", cost=" + cost + '}';
    }

    

    public static void main(String args[]) {
        int width = 10;
// without lamba expression
        /* Drawable d = new Drawable() {

            public void draw() {
                System.out.println("Drawaing");
            }
        };*/

        //with lambda expression
        Drawable d = ()-> System.out.println("lambda expression is working ");

        d.draw();

        // with parameter 
        Bike b = color -> {
            System.out.println("getColor:" + color);
        };
        b.setbike("Green");
        // we can write also like this for above code 
        /* 
        Bike b = (color) -> {
            System.out.println("getColor:" + color);
        };
        b.setbike("Green");*/

        //Return Example
        /* Employee e = empName -> {
            return "EmployeeName:" + empName;
        };       
         */
        // we can write above code to below also 
        Employee e = empName -> ("EmployeeName:" + empName);

        System.out.println(e.setEmployeeName("vinod"));

        //Multiple Parameter
        World w = (country, state) -> (country + ":" + state);
        System.out.println(w.mapWorldDetails("India", "Andhrapradesh"));

        //forEachLoop
        LinkedList<String> ls = new LinkedList<String>();
        ls.add("a");
        ls.add("b");
        ls.add("c");
        ls.add("d");

        ls.forEach((n) -> System.out.println(n));

        //Creating a Thread 
        //without lambda expression
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Thread1 is running without lambda expression....");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        //Thread Example with lambda
        Runnable r2 = () -> {
            System.out.println("Thread2 is running with Lambda Expression...");
        };
        Thread t2 = new Thread(r2);
        t2.start();

        //comparate Interface
        ArrayList<LambdaExpression> al = new ArrayList<LambdaExpression>();
        al.add(new LambdaExpression(27, "vinod", 1));
        al.add(new LambdaExpression(25, "sunil", 3));
        al.add(new LambdaExpression(24, "ramesh", 2));

        //One way
//        Collections.sort(al, (p1, p2) -> {
//            return p1.name.compareTo(p2.name);
//        });
        //second way
        Collections.sort(al, (p1, p2) -> {

            if (p1.age > p2.age) {
                return 1;
            } else if (p1.age < p2.age) {
                return -1;
            } else {
                return 0;
            }
        });

        al.forEach((n) -> System.out.println(n));

        //Filter Collection Data
        ArrayList<LambdaExpression> als = new ArrayList<LambdaExpression>();
        als.add(new LambdaExpression("Nokia", 20000));
        als.add(new LambdaExpression("sony", 60000));
        als.add(new LambdaExpression("Redmi", 15000));
        als.add(new LambdaExpression("OnePlus", 32000));
        als.add(new LambdaExpression("samsung", 4000));
        
        Stream<LambdaExpression> strd = als.stream().filter(p->p.cost>=20000);
        strd.forEach(n->System.out.println(n));

    }

}
