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
public class ObjectRefTest {

    public static void main(String args[]) {
        Test ts = new Test();
        ts.name = "sunil";
        System.out.println("ts.name==>" + ts.name);
        Test ts1 = ts;
        System.out.println("ts1.name=>" + ts1.name);
        ts1.name = "suresh";
        System.out.println("ts.name==>" + ts.name);
        Class t1 = ts.getClass();
    }

}

class Test {

    int data = 0;
    String name = "vinod";

}
