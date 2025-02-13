package com.celcom.day7;

public class ThreadUsingLambdaExpression {

	public static void main(String[] args) {
		
		Runnable t2 = ()->{
			for(int i = 0 ; i <= 10 ; i++)
			{
				System.err.println("t1 : " + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread thread1 = new Thread(t2);
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		Thread thread2 = new Thread(()->{
			for(int i = 0 ; i <= 10 ; i++)
			{
				System.out.println("t2 : " + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread2.start();
	}

}
