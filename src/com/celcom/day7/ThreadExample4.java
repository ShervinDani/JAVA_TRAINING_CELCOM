package com.celcom.day7;
class ThreadTest implements Runnable
{
	@Override
	public void run()
	{
		for(int i = 0 ;i <= 10 ;i++)
		{
			System.out.println("Number : " + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExample4 {
	public static void main(String[] args)
	{
		Thread main = Thread.currentThread();
		main.setPriority(Thread.MIN_PRIORITY);
		Thread thread1 = new Thread(new ThreadTest());
		thread1.setName("T1");
		thread1.setPriority(Thread.MAX_PRIORITY);
		Thread thread2 = new Thread(new ThreadTest());
		thread2.setName("T2");
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		thread2.start();
		for(int i = 0; i <= 10 ; i++)
			System.out.println("Main : " + i);
	}
}
