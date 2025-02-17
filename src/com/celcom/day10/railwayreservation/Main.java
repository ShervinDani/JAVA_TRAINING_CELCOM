package com.celcom.day10.railwayreservation;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountManager manage = new AccountManager();
		TicketManager ticketManage = new TicketManager();
		int choice;
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("1. Add new Account");
			System.out.println("2. Update Account");
			System.out.println("3. Login");
			System.out.println("4. Delete Account");
			choice = sc.nextInt();
			if(choice == 1)
			{
				manage.addAccount();
			}
			else if(choice == 2)
			{
				manage.editAccount();
			}
			else if(choice == 3)
			{
				if(!manage.verify())
				{
					System.out.println("Invalid Credintials");
				}
				else
				{
					boolean flag = true;
					while(flag)
					{
						System.out.println("Enter your choice");
						System.out.println("1. Book Tickets");
						System.out.println("2. View Ticket");
						System.out.println("3. View Account");
						System.out.println("4. Delete Account");
						int newChoice = sc.nextInt();
						switch(newChoice)
						{
						case 1 :
							break;
						case 2:
							break;
						case 3:
							break;
						case 4:
							break;
						case 5:
							break;
						default:
							flag = false;
							break;
								
						}
					}
				}
				
			}
			else if(choice == 6)
			{
				manage.deleteAccount();
			}
			else
			{
				System.out.println("Thank you..!");
				sc.close();
				return;
			}
		}
	}

}