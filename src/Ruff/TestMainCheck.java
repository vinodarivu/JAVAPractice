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
abstract class GrandFather {

    abstract public void loan();

    public void assets() {
        System.out.println("Father assests");

    }

}

abstract class Father extends GrandFather {

  

    private void keep() {
        System.out.println("Father keep");
    }
    public void wife(){
    System.out.println("father wife");
    }

}

class grandchild extends Father {
      @Override
    public void loan() {
        System.out.println("grandchild loan cleared");
    }
    public void grandChildMethod(){
    System.out.println("hello this is grand child method");
    }

}

public class TestMainCheck {

    public static void main(String args[]) {
        
        grandchild gc = new grandchild();
        gc.wife();
        gc.loan();
        gc.grandChildMethod();
        gc.assets();
        
        GrandFather gf = new grandchild();
        gf.assets();
        gf.loan();
       
           
        

    }

}
