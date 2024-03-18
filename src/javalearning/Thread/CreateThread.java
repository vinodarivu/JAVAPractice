/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author U6032545
 */

/*
 * A thread is a lightweight sub-process, the smallest unit of processing.
 * Multiprocessing and multithreading, both are used to achieve multitasking.
 * 
 * 
 */
public class CreateThread extends Thread {

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {

			Logger.getLogger(CreateThread.class.getName()).log(Level.SEVERE, null, ex);
		}
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		CreateThread t1 = new CreateThread();
		t1.start();
		t1.interrupt();
	}
}
