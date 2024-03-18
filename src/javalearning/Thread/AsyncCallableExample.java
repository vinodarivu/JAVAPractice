package javalearning.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncCallableExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(1);

		// Submit a Callable task for execution
		Future<Integer> future = executorService.submit(new MyCallable(10));

		// Continue with other tasks
		System.out.println("Continuing with other tasks...");

		// Perform other operations while waiting for the result
		while (!future.isDone()) {
			// Do something else
			System.out.println("Waiting for the result...");
		}

		// Retrieve the result when it's available
		try {
			int result = future.get();
			System.out.println("Result: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Shutdown the ExecutorService
		executorService.shutdown();
	}
}

class MyCallable implements Callable<Integer> {
	private final int number;

	public MyCallable(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		// Simulate some computation
		Thread.sleep(2000);
		return number * 2;
	}
}
