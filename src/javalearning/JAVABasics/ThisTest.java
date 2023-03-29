package javalearning.JAVABasics;

/*What are the main uses of this keyword?
There are the following uses of this keyword.

this can be used to refer to the current class instance variable.
this can be used to invoke current class method (implicitly)
this() can be used to invoke the current class constructor.
this can be passed as an argument in the method call.
this can be passed as an argument in the constructor call.
this can be used to return the current class instance from the method.*/

public class ThisTest {
	static int pincode;
	int id;
	int age;

	ThisTest() {
		super();
		System.out.println("no paramterized constructor called");
	}

	ThisTest(int id, int age, int pincode) {
		System.out.println("three paramterized constructor called");
		pincode = pincode;
		this.id = id;
		this.age = age;
	}

	ThisTest(int id, int age) {

		this();

		System.out.println("two paramterized constructor called");
		this.id = id;
		this.age = age;
		cloneObject(this);
	}

	public static void main(String args[]) {
		ThisTest tt = new ThisTest(10, 12, 30);
		ThisTest tt1 = new ThisTest(11, 13);

	}

	public void cloneObject(ThisTest tt) {
		ThisTest ft = tt;
		System.out.println("ft.id===>" + ft.id);
	}

}
