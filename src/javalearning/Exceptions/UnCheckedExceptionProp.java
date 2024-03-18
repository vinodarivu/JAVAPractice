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
public class UnCheckedExceptionProp {

	void m() {
		throw new ArithmeticException("device error");// checked exception
	}

	void n() {
		m();
	}

	void p() throws ArithmeticException, IOException {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) throws IOException {
		UnCheckedExceptionProp obj = new UnCheckedExceptionProp();
		obj.p();
		System.out.println("normal flow");
	}
}
