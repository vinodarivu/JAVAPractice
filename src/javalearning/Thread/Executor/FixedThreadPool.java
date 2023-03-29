package javalearning.Thread.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*FixedThreadPool is another special type of executor that is a thread pool having a fixed number of threads.
 *  By this executor, the submitted task is executed by the n thread. 
 *  In case when we need to execute more tasks after submitting previous tasks, 
 *  they store in the LinkedBlockingQueue until previous tasks are not completed.
 *   The n denotes the total number of thread which are supported by the underlying processor.
*/

public class FixedThreadPool {
	public static void main(String args[]) {
		FixedThread st = new FixedThread();
		FixedThread st1 = new FixedThread();
		ExecutorService es = Executors.newFixedThreadPool(10);
		es.execute(st);
		es.execute(st1);// even if it throws exception at first call , this executor is running that is
						// magic.
	}

}

class FixedThread implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("I value ===>" + i + " Exceuted by Thread Name==>" + Thread.currentThread().getName());
			if (i == 6) {
				throw new ArithmeticException("reached to 6");
			}
		}

	}

}
