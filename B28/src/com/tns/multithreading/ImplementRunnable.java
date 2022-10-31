package com.tns.multithreading;

public class ImplementRunnable implements Runnable {

	public static void main(String[] args) {
		ImplementRunnable t=new ImplementRunnable ();
		Thread t1=new Thread(t);
		t1.start();
		// TODO Auto-generated method stub

	}
	
	@Override
	public void run() {
		System.out.println("Runnable interface");
	}

}
