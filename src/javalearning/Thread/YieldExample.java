package javalearning.Thread;

public class YieldExample {

	public static void main(String[] args) throws InterruptedException {
		Thread producer = new Producer();
		Thread consumer = new Consumer();

		producer.setPriority(Thread.MIN_PRIORITY); // Min Priority
		consumer.setPriority(Thread.MAX_PRIORITY); // Max Priority

		producer.start();
		//producer.join();
		consumer.start();
		
	}
}

class Producer extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Producer threadName=>" + Thread.currentThread() + ": Produced Item=>" + i);
			Thread.yield();
		}
	}
}

class Consumer extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Consumer with threadName=>" + Thread.currentThread() + ": Consumed Item=>" + i);
			Thread.yield();
		}
	}
}
