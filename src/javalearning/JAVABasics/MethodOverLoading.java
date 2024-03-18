
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.JAVABasics;

/**
 *
 * @author U6032545
 */
public class MethodOverLoading {

	public static void main(String args[]) {

		int intt = 100000000;
		long lon = 100000000l;
		double doub = 100000000l;
		MOL ml = new MOL();
		ml.check();
		ml.check('a');
		ml.check("vinod");
		ml.check(0);
		ml.check(3f);
		ml.check(intt);
		ml.check(lon);
		ml.check(doub);
		ml.check(1, 1);
		ml.check(1.1f, 1.1f);
		ml.check(1.1, 1.1f);
		ml.check(1.1f, 1.1);
		ml.check(1.1, 1.1);
		ml.check(100000, 1.1);
		ml.check(100000.45, 100000);
		ml.check(10, 100000000);
		ml.check(10, intt);
		ml.check(10, lon);
		ml.check(10, doub);
		ml.check('a');
		MOLTest mlTest = new MOLTest();
		// mlTest.sum(10, 11000000);

	}

}

class MOL {

	public void check() {
		System.out.println("empty Parameter");
		System.out.println("*********************************************************************************");

	}

	public void check(String name) {
		System.out.println("single String param");
		System.out.println("value======>" + name);
		System.out.println("*********************************************************************************");
	}

	public void check(char name) {
		System.out.println("single char param");
		System.out.println("value======>" + name);
		System.out.println("*********************************************************************************");
	}

//	public void check(int name) {
//		System.out.println("single int param");
//		System.out.println("value======>" + name);
//		System.out.println("*********************************************************************************");
//	}

	public void check(float name) {
		System.out.println("single float param");
		System.out.println("value======>" + name);
		System.out.println("*********************************************************************************");
	}

	public void check(byte name) {
		System.out.println("single byte param");
		System.out.println("value======>" + name);
		System.out.println("*********************************************************************************");
	}

	public void check(short name) {
		System.out.println("single short param");
		System.out.println("value======>" + name);
		System.out.println("*********************************************************************************");
	}

//	public void check(long name) {
//		System.out.println("single long param");
//		System.out.println("value======>" + name);
//		System.out.println("*********************************************************************************");
//	}

	public void check(double name) {
		System.out.println("single double param");
		System.out.println("value======>" + name);
		System.out.println("*********************************************************************************");
	}

	public void check(int emp, int name) {
		System.out.println("single int param and single int param");
		System.out.println("value======>" + emp + ",   " + name);
		System.out.println("*********************************************************************************");
	}

	public void check(byte emp, byte name) {
		System.out.println("single byte param and single byte param");
		System.out.println("value======>" + emp + ",   " + name);
		System.out.println("*********************************************************************************");
	}

	public void check(short emp, short name) {
		System.out.println("single short param and single short param");
		System.out.println("value======>" + emp + ",   " + name);
		System.out.println("*********************************************************************************");
	}

	public void check(char emp, char name) {
		System.out.println("single char param and single char param");
		System.out.println("value======>" + emp + ",   " + name);
		System.out.println("*********************************************************************************");
	}

	public void check(float emp, float name) {
		System.out.println("single float param and single float param");
		System.out.println("value======>" + emp + ",   " + name);
		System.out.println("*********************************************************************************");
	}

	public void check(long emp, long name) {
		System.out.println("single long param and single long param");
		System.out.println("value======>" + emp + ",   " + name);
		System.out.println("*********************************************************************************");
	}

	public void check(double emp, double name) {
		System.out.println("single double param and single double param");
		System.out.println("value======>" + emp + ",   " + name);
		System.out.println("*********************************************************************************");
	}

	public void check(double name, String emp) {
		System.out.println("single double param and single String param");
		System.out.println("value======>" + emp + ",   " + name);
		System.out.println("*********************************************************************************");
	}

	public void check(String emp, double name) {
		System.out.println("single String param and single double param");
		System.out.println("value======>" + emp + ",   " + name);
		System.out.println("*********************************************************************************");
	}

	public void check(int emp, double name) {
		System.out.println("single int param and single double param");
		System.out.println("value======>" + emp + ",   " + name);
		System.out.println("*********************************************************************************");
	}

	public void check(double emp, int name) {
		System.out.println("single double param and single int param");
		System.out.println("value======>" + emp + ",   " + name);
		System.out.println("*********************************************************************************");
	}

	public void check(double emp, float name) {
		System.out.println("single double param and single float param");
		System.out.println("value======>" + emp + ",   " + name);
		System.out.println("*********************************************************************************");
	}

	public void check(float emp, double name) {
		System.out.println("single float param and single double param");
		System.out.println("value======>" + emp + ",   " + name);
		System.out.println("*********************************************************************************");
	}

	public void check(short emp, int name) {
		System.out.println("single short param and single int param");
		System.out.println("value======>" + emp + ",   " + name);
		System.out.println("*********************************************************************************");
	}

	public void check(int emp, short name) {
		System.out.println("single int param and single short param");
		System.out.println("value======>" + emp + ",   " + name);
		System.out.println("*********************************************************************************");
	}

	public void check(int emp, long name) {
		System.out.println("single int param and single long param");
		System.out.println("value======>" + emp + ",   " + name);
		System.out.println("*********************************************************************************");
	}

	public void check(long emp, int name) {
		System.out.println("single long param and single int param");
		System.out.println("value======>" + emp + ",   " + name);
		System.out.println("*********************************************************************************");
	}

}

class MOLTest {
	public void sum(int a, long b) {

		// return (int) (a+b);
	}

	public void sum(long a, int b) {

		// return (int) (a+b);
	}

}
