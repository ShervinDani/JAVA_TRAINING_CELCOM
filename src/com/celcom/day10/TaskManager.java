package com.celcom.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
	Scanner sc = new Scanner(System.in);
	List<Task> tasks = new ArrayList<>();
	List<Task> completed = new ArrayList<Task>();
	public void addTask()
	{
		System.out.println("Enter the task you want to Add: ");
		String task = sc.nextLine();
		Task newtask = new Task(tasks.size()+1,task);
		tasks.add(newtask);
		System.out.println("Added");
	}
	public void viewTask()
	{
		System.out.println("The Incomplete Tasks are : ");
		for(Task task : tasks)
		{
			System.out.println("ID : " + task.getId());
			System.out.println("Task : " + task.getTask() + "\n");
		}
	}
	public void deleteTask()
	{
		System.out.println("The Incomplete Tasks are : ");
		for(Task task : tasks)
		{
			System.out.println("ID : " + task.getId());
			System.out.println("Task : " + task.getTask() + "\n");
		}
		System.out.println("Enter the Id of the tast you wanna delete :");
		int id = sc.nextInt();
		sc.nextLine();
		for(Task task : tasks)
		{
			if(task.getId() == id)
			{
				tasks.remove(task);
				System.out.println("Deleted");
				for(int i = 0 ;i <tasks.size();i++)
				{
					Task task1 = tasks.get(i);
					task1.setId(i+1);
					tasks.set(i, task1);
				}
				return;
			}
			System.out.println("Not Completed");
		}
	}
	public void updateTask()
	{
		System.out.println("The Incomplete Tasks are : ");
		for(Task task : tasks)
		{
			System.out.println("ID : " + task.getId());
			System.out.println("Task : " + task.getTask() + "\n");
		}
		System.out.println("Enter the Id of the tast you want to mark as complete :");
		int id = sc.nextInt();
		sc.nextLine();
		for(Task task : tasks)
		{
			if(task.getId() == id)
			{
				tasks.remove(task);
				System.out.println("Updated");
				completed.add(task);
				return;
			}
			
		}
		System.out.println("Not Completed");
	}
	public void searchTask()
	{
		System.out.println("Enter the task:");
		String task = sc.nextLine();
		for(Task i : tasks)
		{
			if(i.getTask().equalsIgnoreCase(task))
			{
				System.out.println(i.getTask());
				System.out.println("Status : Not Completed");
				return;
			}
		}
		for(Task i : completed)
		{
			if(i.getTask().equalsIgnoreCase(task))
			{
				System.out.println(i.getTask());
				System.out.println("Status : Completed");
				return;
			}
		}
		System.out.println("Data not found");
	}
	public void viewCompletedTast()
	{
		System.out.println("The completed Task are :");
		for(Task task : completed)
		{
			System.out.println("ID : " + task.getId());
			System.out.println("Task : " + task.getTask() + "\n");
		}
	}
}
