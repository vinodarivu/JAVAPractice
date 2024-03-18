package javalearning.Thread.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest {

	public static void main(String[] args) {
		// Create an ExecutorService with a fixed thread pool size
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		// Submit Runnable tasks for execution
		executorService.execute(new MyRunnableTest("Task 1"));
		executorService.execute(new MyRunnableTest("Task 2"));

		// Submit Callable tasks for execution and retrieve Future objects
		Future<Integer> future1 = executorService.submit(new MyCallable(10));
		Future<Integer> future2 = executorService.submit(new MyCallable(20));

		// Shutdown the ExecutorService after tasks are submitted
		executorService.shutdown();

		// Retrieve and print the results from Callable tasks
		try {
			int result1 = future1.get();
			int result2 = future2.get();
			System.out.println("Result from Task 1: " + result1);
			System.out.println("Result from Task 2: " + result2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

class MyRunnableTest implements Runnable {
	private final String taskName;

	public MyRunnableTest(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public void run() {
		System.out.println("Running " + taskName);
	}
}

class MyCallable implements java.util.concurrent.Callable<Integer> {
	private final int number;

	public MyCallable(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		// Simulate some computation
		Thread.sleep(1000000);
		return number * 2;
	}
}
