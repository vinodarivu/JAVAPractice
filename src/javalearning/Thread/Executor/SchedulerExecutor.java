package javalearning.Thread.Executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerExecutor {
	public static void main(String args[]) {
		SchedulerThread st = new SchedulerThread();
		SchedulerThread st1 = new SchedulerThread();
		ScheduledExecutorService es = Executors.newScheduledThreadPool(1);
		es.scheduleWithFixedDelay(st, 1l, 2l,TimeUnit.SECONDS );
		es.scheduleAtFixedRate(st, 1l, 2l,TimeUnit.SECONDS );
		
	}

}

class SchedulerThread implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("I value ===>" + i + " Exceuted by Thread Name==>" + Thread.currentThread().getName());
			
		}

	}

}



