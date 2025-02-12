package com.celcom.day7;

class ThreadDemo1 implements Runnable
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
public class ThreadExample3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new ThreadDemo1());
		Thread thread2 = new Thread(new ThreadDemo1());
		thread1.start();
		thread2.start();
		for(int i=0 ;i<10;i++)
		{
			System.out.println("main " + i);
		}
		System.out.println(thread2.getState());
		thread1.setName("SHERVIN");
		
	}

}
