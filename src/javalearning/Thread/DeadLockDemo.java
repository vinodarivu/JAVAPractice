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
public class DeadLockDemo {

	public static void main(String[] args) {
		final String resource1 = "ratan jaiswal";
		final String resource2 = "vimal jaiswal";
		// t1 tries to lock resource1 then resource2
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1: locked resource 1");
					notify();
					
					try {
						wait();
					} catch (InterruptedException ex) {
						Logger.getLogger(DeadLockDemo.class.getName()).log(Level.SEVERE, null, ex);
					}
					

					synchronized (resource2) {
						System.out.println("Thread 1: locked resource 2");

					}

				}
			}
		};

		// t2 tries to lock resource2 then resource1
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2: locked resource 2");
					notify();
					try {
						wait();
					} catch (InterruptedException ex) {
						Logger.getLogger(DeadLockDemo.class.getName()).log(Level.SEVERE, null, ex);
					}

					;

					synchronized (resource1) {
						System.out.println("Thread 2: locked resource 1");

					}

				}
			}
		};

		t1.start();
		t2.start();
	}

}
