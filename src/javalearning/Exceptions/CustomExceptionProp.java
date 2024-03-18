/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.Exceptions;

class MyOwnUnCheckedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2376996570710832L;

	public MyOwnUnCheckedException(String s) {
		super(s);

	}
}

class MyOwnCheckedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6777532825400870971L;

	public MyOwnCheckedException(String s) {
		super(s);

	}

}

/**
 *
 * @author U6032545
 */
public class CustomExceptionProp {

	void m() throws MyOwnCheckedException {
		throw new MyOwnCheckedException("device error");// checked exception
	}

	void n() throws MyOwnCheckedException {
		m();
	}

	void p() throws MyOwnCheckedException, NullPointerException {

		n();

	}

	void m1() {
		throw new MyOwnUnCheckedException("device error");// checked exception
	}

	void n1() {
		m1();
	}

	void p1() {

		n1();

	}

	public static void main(String args[]) throws MyOwnCheckedException {
		CustomExceptionProp obj = new CustomExceptionProp();
		obj.p();
		obj.p1();
		System.out.println("normal flow");
	}

}
