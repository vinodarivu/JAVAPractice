package javalearning.Thread;

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

