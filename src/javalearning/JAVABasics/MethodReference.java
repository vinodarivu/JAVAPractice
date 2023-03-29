package javalearning.JAVABasics;



/**
 *
 * @author U6032545
 */
/*
Java provides a new feature called method reference in Java 8. Method reference is used to refer method of functional interface.
It is compact and easy form of lambda expression. Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference

Reference to a static method.
Reference to an instance method.
Reference to a constructor.

Rules :
1) it should not contain () symbol for method reference

 */
interface SayableFI {

    void say();
}

interface NonStaticTest {

    void test();

}

interface ConstructorRefTest {

    MethodReference getMethodReference();

}
interface ParameterInterface {
	void threeParam(int a, int b, int c);
}

public class MethodReference {

    MethodReference() {
        System.out.println("methodReference class constructor");
    }

    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }

    public static String ThreadStatus() {
        System.out.println("Thread is running...");
        return "hello";
    }

    //non static method
    public void nonStaticMethod() {
        System.out.println("non static method called");

    }
    
    public static int threeParamMet(int a , int b,int c) {
    	return a+b;
    }

    public static void main(String[] args) {
        // Referring static method  
        SayableFI sayable = MethodReference::saySomething;
        // Calling interface method  
        sayable.say();

        Thread t2 = new Thread(MethodReference::ThreadStatus);   // check this we are returing the value as well 
        t2.start();

        MethodReference mr = new MethodReference();

        NonStaticTest nst = mr::nonStaticMethod;// we can also write new MethodReference()::nonStaticMethod;
        nst.test();

        ConstructorRefTest crt = MethodReference::new;
        crt.getMethodReference();
        
        ParameterInterface par = MethodReference::threeParamMet;

    }
}
