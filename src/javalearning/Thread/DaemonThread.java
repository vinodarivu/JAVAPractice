package javalearning.Thread;


/*
 * In Java, a daemon thread is a type of thread that runs in the background,
 * providing support to other non-daemon threads. When all non-daemon threads
 * have finished executing, the JVM (Java Virtual Machine) terminates the
 * program, regardless of whether any daemon threads are still running. This
 * makes daemon threads suitable for tasks that are meant to provide supporting
 * functionality and do not need to keep the program alive.
 */

/*
 * In this example, the DaemonThreadExample class demonstrates the usage of a
 * daemon thread. The DaemonTask class represents the code that the daemon
 * thread will run. When you run this program, you'll notice that the daemon
 * thread continues to run in the background even after the main thread
 * finishes. Eventually, when the JVM decides to terminate the program, it will
 * stop the daemon thread as well, without waiting for it to complete.
 * 
 * Keep in mind that daemon threads are typically used for tasks like garbage
 * collection, monitoring, logging, and other background activities that should
 * not prevent the program from exiting when its main tasks are done.
 */

public class DaemonThread {
	public static void main(String[] args) {
		Thread daemonThread = new Thread(() -> {
			while (true) {
				System.out.println("Daemon thread is running.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		daemonThread.setDaemon(true); // Setting the thread as daemon
		daemonThread.start(); // Starting the daemon thread

		System.out.println("Main thread is done.");
	}
}

