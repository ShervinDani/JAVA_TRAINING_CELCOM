package com.celcom.day7;
class ThreadDemo extends Thread
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
public class ThreadExample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread main = Thread.currentThread();
		main.sleep(900);
		ThreadDemo thread1 = new ThreadDemo();
		ThreadDemo thread2 = new ThreadDemo();
		
		thread1.start();
		thread2.start();
		
		for(int i=0 ;i<10;i++)
		{
			System.out.println("main " + i);
		}
		System.out.println(thread2.getState());
		thread1.setName("SHERVIN");
		System.out.println("Priority : " + main.getPriority());
	}

}
