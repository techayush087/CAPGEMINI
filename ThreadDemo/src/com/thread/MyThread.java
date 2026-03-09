package com.thread;

public class MyThread implements Runnable {
	
	
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+"is running");
	}
	public static void main(String[] args) {
		
		Thread t2=new Thread("My Thread");
		t2.start();
		
	
		
	}

}
