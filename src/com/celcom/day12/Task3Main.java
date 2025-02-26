package com.celcom.day12;

import java.util.Scanner;


public class Task3Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Task3DB.getConnection();
		Task3Manager manage = new Task3Manager();
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("1. Add new Customer");
			System.out.println("2. Update a customer");
			System.out.println("3. Remove a customer");
			System.out.println("4. View All Customer");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				manage.addCustomer();
				break;
			case 2:
				manage.updateCustomer();
				break;
			case 3:
				manage.removeCustomer();
				break;
			case 4:
				manage.viewAll();
				break;
			default:
				return;
			}
		}
	}

}

