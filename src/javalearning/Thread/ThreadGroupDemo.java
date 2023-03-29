/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.Thread;

/**
 *
 * @author U6032545
 */
public class ThreadGroupDemo implements Runnable {

	public static void main(String args[]) {
		ThreadGroupDemo tg = new ThreadGroupDemo();
		ThreadGroupDemo tg1 = new ThreadGroupDemo();
		ThreadGroupDemo tg2 = new ThreadGroupDemo();
		ThreadGroupDemo tg3 = new ThreadGroupDemo();
		ThreadGroup tgMain = new ThreadGroup("Group A");

		Thread t1 = new Thread(tgMain, tg1, "one");
		System.out.println("before start count===>" + tgMain.activeCount());
		t1.start();
		System.out.println("after start count===>" + tgMain.activeCount());
		// t1.setPriority(10);
		Thread t2 = new Thread(tgMain, tg2, "two");
		t2.start();
		System.out.println("after 2nd thread start count===>" + tgMain.activeCount());
		Thread t3 = new Thread(tgMain, tg3, "three");
		t3.start();
		System.out.println("after 3rd thread start count===>" + tgMain.activeCount());
		tgMain.list();
		// tgMain.destroy();

		System.out.println("get Max priority==>" + tgMain.getMaxPriority());
		System.out.println("active count===>" + tgMain.activeCount());

	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {

		}
		System.out.println("Run method running, ThreadName===>" + Thread.currentThread().getName());
	}

}
