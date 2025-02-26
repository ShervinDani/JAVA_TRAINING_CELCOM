package com.celcom.day13;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Task4 {

	public static void main(String[] args) {
		// 4. Create an ExecutorService using the ScheduledExecutorService
		// to schedule a task that runs every 1.5 seconds.
		// The task should print the current time.
		ScheduledExecutorService exe = Executors.newScheduledThreadPool(3);
		for (int i = 0; i <= 10; i++) {
			exe.schedule(() -> {
				System.out.println("Current Time is : " + LocalTime.now());
			}, (long) i*1500, TimeUnit.MILLISECONDS);
		}
		exe.shutdown();
	}

}
