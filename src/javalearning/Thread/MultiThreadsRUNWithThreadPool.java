package javalearning.Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class MultiThreadsRUNWithThreadPool {
	    public static void main(String[] args) {
	        int numberOfThreads = 100;
	        
	        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
	        
	        for (int i = 0; i < numberOfThreads; i++) {
	            int threadNumber = i + 1;
	           
	            executor.execute(() -> {
	            	for(int j=0;j<1000;j++) {
	                System.out.println("Thread " + threadNumber + " is running.");}
	                try {
						Thread.sleep(100000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                // Perform your task here
	            });
	        }
	        
	        executor.shutdown();
	    }
	}


