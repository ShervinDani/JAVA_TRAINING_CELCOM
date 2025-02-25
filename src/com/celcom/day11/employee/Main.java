package com.celcom.day11.employee;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		JDBCClass.getConnection();
		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("1. Add new Employee");
			System.out.println("2. Remove Employee");
			System.out.println("3. View an Emloyee");
			System.out.println("4. View Employees based on age");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				manager.addUser();
				break;
			case 2:
				manager.deleteUser();
				break;
			case 3:
				manager.viewUser();
				break;
			case 4:
				manager.viewUsers();
				break;
			default:
				return;
			}
		}
	}

}
