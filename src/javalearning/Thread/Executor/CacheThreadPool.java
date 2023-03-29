package javalearning.Thread.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*The CachedThreadPool is a special type of thread pool that is used to execute short-lived parallel tasks.
 *  The cached thread pool doesn't have a fixed number of threads. 
 *  When a new task comes at a time when all the threads are busy in executing some other tasks, 
 *  a new thread creates by the pool and add to the executor. When a thread becomes free, 
 *  it carries out the execution of the new tasks.
 *  Threads are terminated and removed from the cached when they remain idle for sixty seconds.*/

public class CacheThreadPool {
	public static void main(String args[]) {
		CachedThread st = new CachedThread();
		CachedThread st1 = new CachedThread();
		ExecutorService es = Executors.newCachedThreadPool();
		es.execute(st);
		es.execute(st1);// even if it throws exception at first call , this executor is running that is
						// magic.
	}

}

class CachedThread implements Runnable {

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
