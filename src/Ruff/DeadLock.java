package Ruff;

public class DeadLock {

	String s1 = "First Resource";
	String s2 = "Second Resource";

	public static void main(String args[]) {

		
	}

	synchronized public void thread1Processing() {

		synchronized (s1) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		synchronized (s2) {
			System.out.println("procissing S2 by Thread1");
		}

	}

	synchronized public void thread2Processing() {

		synchronized (s2) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		synchronized (s1) {
			
				System.out.println("procissing S2 by Thread1");
			
		}

	}
}
