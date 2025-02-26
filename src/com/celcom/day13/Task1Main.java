package com.celcom.day13;

import java.util.Scanner;

public class Task1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Task1Manager manage = new Task1Manager();
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("1. Add new Customer");
			System.out.println("2. View All based on amount");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");
			System.out.println("5. View Customer");
			System.out.println("6. Delete Customer");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				manage.addAccount();
				break;
			case 2:
				manage.viewAll();
				break;
			case 3:
				manage.deposit();
				break;
			case 4:
				manage.withdraw();
				break;
			case 5:
				manage.viewOne();
				break;
			case 6:
				manage.delete();
				break;
			default:
				System.out.println("Thank you....!");
				return;
			}
		}
	}

}
