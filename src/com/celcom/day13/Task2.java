package com.celcom.day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exe = Executors.newFixedThreadPool(6);
		for(int i = 1 ; i <=10 ; i++)
		{
			exe.execute(()->{
				System.out.println("Task is going on " + Thread.currentThread());
				try {
					Thread.currentThread().sleep(1000);
					System.out.println("Task is completed on " + Thread.currentThread());;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}
	}

}
