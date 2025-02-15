package com.celcom.railwayreservtion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountManager manage = new AccountManager();
		int choice;
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("1. Add new Account");
			System.out.println("2. Update Account");
			System.out.println("3. Book Ticket");
			System.out.println("4. View Ticket");
			System.out.println("5. Delete Account");
			choice = sc.nextInt();
			if(choice == 1)
			{
				manage.addAccount();
			}
			else if(choice == 5)
			{
				manage.deleteAccount();
			}
			else
			{
				sc.close();
				return;
			}
		}
	}

}
