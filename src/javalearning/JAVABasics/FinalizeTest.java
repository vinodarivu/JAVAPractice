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
public class FinalizeTest {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize is happening");

		 super.finalize();

	}

	public static void main(String args[]) {
		System.out.println("finalize main method started");
		FinalizeTest ft = new FinalizeTest();
//		FinalizeTest ft1 = new FinalizeTest();
//		ft = ft1;
//		 ft1=null;
		 ft = new FinalizeTest();
		System.gc();
	}

}
