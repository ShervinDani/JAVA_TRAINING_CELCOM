package com.celcom.railwayreservtion;

import java.util.HashMap;
import java.util.Scanner;

public class AccountManager {
	private static HashMap<String,Account> accounts = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	void addAccount()
	{
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter phone number");
		long phone = sc.nextLong();
		String print = "Enter user name :";
		String username;
		do
		{
			System.out.println(print);
			username = sc.nextLine();
			print = "Username already exist Please try another one";	
		}while(accounts.containsKey(username));
		System.out.println("Enter a password");
		String password = sc.next();
		Account newAccount = new Account(name, phone, password);
		accounts.put(username, newAccount);
		System.out.println("Added Successfully");
	}
	void deleteAccount()
	{
		System.out.println("Enter the username you wanna delete");
		String username = sc.next();
		System.out.println("Enter the password");
		String password = sc.next();
		if(accounts.containsKey(username))
		{
			Account deleteAccount = accounts.get(username);
			if(deleteAccount.getPassword().equals(password))
			{
				accounts.remove(username);
				System.out.println("Deleted Successfully");
				return;
			}
		}
		System.out.println("Invalid Credentials");
	}
	void editAccount()
	{
		System.out.println("Enter the username : ");
		String username = sc.next();
		System.out.println("Enter the password");
		String password = sc.next();
		if(accounts.containsKey(username))
		{
			Account deleteAccount = accounts.get(username);
			if(deleteAccount.getPassword().equals(password))
			{
				accounts.remove(username);
			}
		}

	}
}
