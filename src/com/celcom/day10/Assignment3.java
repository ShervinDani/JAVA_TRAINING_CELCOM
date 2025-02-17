package com.celcom.day10;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TaskManager manage = new TaskManager();
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("1. Add Task");
			System.out.println("2. View Tasks");
			System.out.println("3. Mark as complete");
			System.out.println("4. Delete a task");
			System.out.println("5. Search for task");
			System.out.println("6. View Completed Tasks");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				manage.addTask();
				break;
			case 2:
				manage.viewTask();
				break;
			case 3:
				manage.updateTask();
				break;
			case 4:
				manage.deleteTask();
				break;
			case 5:
				manage.searchTask();
				break;
			case 6:
				manage.viewCompletedTast();
				break;
			default:
				System.out.print("Thank you..!");
				return;
			}
		}
	}

}
