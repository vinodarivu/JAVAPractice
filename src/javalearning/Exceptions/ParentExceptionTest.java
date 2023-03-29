/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.Exceptions;

import java.io.IOException;

/**
 *
 * @author U6032545
 */

/*If the superclass method does not declare an exception
If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but it can declare unchecked exception.
If the superclass method declares an exception
If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.*/
class ParentClass {

    public void hello() throws IOException {
    }

}

class A
{
public void hi()throws RuntimeException{}	
}

public class ParentExceptionTest extends ParentClass {

    @Override
    public void hello() throws RuntimeException {
    	System.out.println("hello");

    }
    public static void main(String args[]) {
    	ParentClass pc = new ParentExceptionTest();
    	//pc.hello();
    	
    } 

}
