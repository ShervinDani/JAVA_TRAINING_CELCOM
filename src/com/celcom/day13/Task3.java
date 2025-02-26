package com.celcom.day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task3 {

	public static void main(String[] args) {
		ExecutorService exe = Executors.newCachedThreadPool();
		for(int i = 1 ; i <=10 ; i++)
		{
			exe.execute(()->{
				System.out.println("Task is going on " + Thread.currentThread());
				try {
					Thread.currentThread().sleep(5000);
					System.out.println("Task is completed on " + Thread.currentThread());;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}
	}

}
