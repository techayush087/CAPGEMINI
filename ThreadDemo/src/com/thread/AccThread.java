package com.thread;

public class AccThread {
	
	private static double accBalance = 20000;

	public synchronized static void withdraw(String name, double amt) {

	//	synchronized (Object.class) { //this keyword is non static so we have to use Account.class or Object.class
			if (amt < accBalance) {
				System.out.println(name + " is going to withdraw.");
				accBalance -= amt;
		

			} else {
				System.out.println(name + " has not enough balance.");
			}

		//}
		System.out.println(name + " has avaialable balance: " + accBalance);
	}

	public void run() {
		withdraw(Thread.currentThread().getName(), 10000);
	}
     public static void main(String[] args) {
		Account acc=new Account();
		Account acc1=new Account();
		Account acc2=new Account();
		
		Thread t1=new Thread(acc,"Ayush");
		Thread t2=new Thread(acc,"Amit");
		Thread t3=new Thread(acc,"Romi");
		
		
		t1.start();
		withdraw("Main",5000);
		t2.start();
		t3.start();
	}
}
