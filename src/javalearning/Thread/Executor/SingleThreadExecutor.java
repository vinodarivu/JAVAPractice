package javalearning.Thread.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*The SingleThreadExecutor is a special type of executor that has only a single thread.
 *  It is used when we need to execute tasks in sequential order.
 *  In case when a thread dies due to some error or exception at the time of executing a task, 
 * a new thread is created, and all the subsequent tasks execute in that new one.*/
public class SingleThreadExecutor {

	public static void main(String args[]) {
		SingleThread st = new SingleThread();
		SingleThread st1 = new SingleThread();
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.execute(st);
		es.execute(st1);// even if it throws exception at first call , this executor is running that is
						// magic.
	}

}

class SingleThread implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("I value ===>" + i);
			if (i == 6) {
				throw new ArithmeticException("reached to 6");
			}
		}

	}

}
