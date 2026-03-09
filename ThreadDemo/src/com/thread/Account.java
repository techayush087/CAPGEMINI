package com.thread;

public class Account implements Runnable {
	private static double accBalance = 20000;

	public static void withdraw(String name, double amt) {

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

}
