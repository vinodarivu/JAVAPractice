/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruff;

/**
 *
 * @author vinodarivu
 */
public class   constructorTest {
    final static int  i;
    final int z;
    static{
    i=0;
    }
    {
    z=0;
    
    }

    public static void main(String args[]) {
        int j;
        String k;
       TestCons test = new TestCons("vinod"
       		+ "");
    }
    static class  NestedClass{
    }

}

class  TestCons {

     public TestCons(String name) {

    }
      public TestCons(String name , String age) {

    }

}
