package com.celcom.day7;

public class ThreadUsingAnonymousInnerClass {

	public static void main(String[] args) {
		
		
		//Using Runnable Interface
		Runnable t1 = new Runnable() {
			public void run() {
				for(int i = 0 ; i <= 10 ; i++)
				{
					System.out.println("t1 : " + i);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread thread1 = new Thread(t1);
		thread1.start();
	}

}
