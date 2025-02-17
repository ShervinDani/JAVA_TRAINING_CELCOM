package com.celcom.day10;
class Resource1
{
	private String msg;
	public void setMessage(String msg)
	{
		this.msg = msg;
	}
	public String getMessage()
	{
		return msg;
	}
}
class Reader extends Thread
{
	Resource1 resource;
	Reader(Resource1 resource)
	{
		this.resource = resource;
	}
	public void run()
	{
		synchronized (resource) {
			System.out.println("Waiting for the Writer");
			try
			{
				resource.wait();
			}
			catch(Exception e) {}
			System.out.println("Message : " + resource.getMessage());
		}
	}
}
class Writer extends Thread
{
	Resource1 resource;
	Writer(Resource1 resource)
	{
		this.resource = resource;
	}
	public void run()
	{
		synchronized(resource)
		{
			System.out.println("Writing Data");
			resource.setMessage("Hello World");
			resource.notify();
		}
	}
}
public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		Resource1 resource = new Resource1();
		Reader reader = new Reader(resource);
		reader.start();
		Writer writer = new Writer(resource);
		writer.sleep(2000);
		writer.start();
		System.out.println("Main");
		
	}
}