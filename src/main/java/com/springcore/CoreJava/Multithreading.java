package com.springcore.CoreJava;

class Threadclass extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {

			try {
				sleep(200);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			Thread th=Thread.currentThread();
			System.out.println(i + " "+th);
		}
	}
}

class RunnableInterface implements Runnable {
	@Override
	public void run() {

		for (int i = 5; i < 9; i++) {
			try {
				Thread.sleep(200);// sleep with thread in runnable interface
			} catch (Exception e) {
				// TODO: handle exception
			}
			Thread th=Thread.currentThread();
			System.out.println(i + " "+th);
		}
	}

}

public class Multithreading {

	public static void main(String[] args) {

		Threadclass thObj = new Threadclass();
		thObj.start();

		RunnableInterface runObj = new RunnableInterface();
		Thread th2 = new Thread(runObj);
		th2.start();

		System.out.println(false);

		// here is random output. JVM will decide when its need to execute

		/*
		 * 1 false 2 3 4 5 6 7 8
		 * 
		 * 1 2 3 5 6 false 7 4 8
		 */

	}

}
