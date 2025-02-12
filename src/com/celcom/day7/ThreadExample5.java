package com.celcom.day7;

class TwoTable extends Thread
{
	@Override
	public synchronized void run()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i + "* 2 = " + (i*2));
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
		}
	}
}
class FiveTable implements Runnable
{
	@Override
	public synchronized void run()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.err.println(i + "* 5 = " + (i*5));
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
		}
	}
}
public class ThreadExample5 {

	public static void main(String[] args) throws InterruptedException {
		TwoTable t1 = new TwoTable();
		Thread t2 = new Thread(new FiveTable());
		t1.start();
		t2.start();
		
		System.out.println(t1.getState());
		System.out.println(t2.getState());
	}

}
