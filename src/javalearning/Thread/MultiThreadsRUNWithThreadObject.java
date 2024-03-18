package javalearning.Thread;

public class MultiThreadsRUNWithThreadObject extends Thread {
	public void run() {
//       	try {
//					Thread.sleep(3000);
//					Thread.yield();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
		for (int j = 0; j < 1000; j++) {

			System.out.println("thread name" + Thread.currentThread().getName());

		}
	}

	public static void main(String[] args) {

		int numberOfThreads = 100;

		for (int i = 0; i < numberOfThreads; i++) {
			int threadNumber = i + 1;

			MultiThreadsRUNWithThreadObject t1 = new MultiThreadsRUNWithThreadObject();
			t1.setName("" + i);
			t1.start();

		}

	}
}
