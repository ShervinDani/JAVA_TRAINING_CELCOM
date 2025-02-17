package com.celcom.day10.bankapplication;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Manager accountmanage = new Manager();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter your choice :");
			System.out.println("1. Login");
			System.out.println("2. Create new Account");
			System.out.println("3. Delete an account");
			System.out.println("4. Exit");
			int mainchoice = sc.nextInt();
			boolean flag = true;
			switch(mainchoice)
			{
			case 1:
				if(accountmanage.verify())
				{
					TransactionManager tmanage = new TransactionManager();
					
					while(flag)
					{
						System.out.println("Enter your Choice");
						System.out.println("1. Deposit Balance");
						System.out.println("2. Money Transfer");
						System.out.println("3. Withdraw Money");
						System.out.println("4. View Detais");
						System.out.println("5. Exit");
						int choice = sc.nextInt();
						switch(choice)
						{
						case 1:
							tmanage.deposit();
							break;
						case 2:
							tmanage.moneyTransfer();
							break;
						case 3:
							tmanage.withdraw();
							break;
						case 4:
							tmanage.viewDetails();
							break;
						default:
							flag = false;
						}
					}
				}
				break;
			case 2:
				accountmanage.addAccount();
				break;
			case 3:
				accountmanage.deleteAccount();
				break;
			default:
				System.out.println("Thank You...!");
				return;
			}
		}
	}

}
