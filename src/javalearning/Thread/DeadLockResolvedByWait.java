package javalearning.Thread;

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		while(this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
	}
	
	synchronized void withdraw1(int amount) {
		System.out.println("going to withdraw... in withdraw1");

		while(this.amount < amount) {
			System.out.println("Less balance; waiting for deposit... in withdraw1");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed... in withdraw1");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notifyAll();
	}
}

class DeadLockResolvedByWait {
	public static void main(String args[]) {
		final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
				
			}
		}.start();
		new Thread() {
			public void run() {
				c.withdraw1(15000);
				
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(20000);
			}
		}.start();

	}
}
