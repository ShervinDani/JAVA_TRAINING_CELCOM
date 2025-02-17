package com.celcom.day10.railwayreservation;

import java.util.HashMap;
import java.util.Scanner;

public class AccountManager {
	static HashMap<String,Account> accounts = new HashMap<>();
	static String username;
	Scanner sc = new Scanner(System.in);
	public void addAccount()
	{
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter phone number");
		long phone = sc.nextLong();
		sc.nextLine();
		String print = "Enter user name :";
		String username;
		do
		{
			System.out.println(print);
			username = sc.nextLine();
			print = "Username already exist Please try another one";	
		}while(accounts.containsKey(username));
		System.out.println("Enter a password");
		String password = sc.nextLine();
		Account newAccount = new Account(name, phone, password);
		accounts.put(username, newAccount);
		System.out.println("Added Successfully");
	}
	public void deleteAccount()
	{
		System.out.println("Enter the username you wanna delete");
		String username = sc.nextLine();
		System.out.println("Enter the password");
		String password = sc.nextLine();
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
	public void editAccount()
	{
		System.out.println("Enter the username : ");
		String username = sc.nextLine();
		System.out.println("Enter the password");
		String password = sc.nextLine();
		if(accounts.containsKey(username))
		{
			Account updateAccount = accounts.get(username);
			if(updateAccount.getPassword().equals(password))
			{
				System.out.println("Enter the choice you want to update : ");
				System.out.println("1. NAME");
				System.out.println("2. PHONE NUMBER");
				System.out.println("3. PASSWORD");
				int choice = sc.nextInt();
				sc.nextLine();
				
				switch(choice)
				{
				case 1 : 
					System.out.println("Enter the new name");
					String updateName = sc.nextLine();
					updateAccount.setName(updateName);
					break;
				case 2 :
					System.out.println("Enter new phone number");
					long updatePhone = sc.nextLong();
					sc.nextLine();
					updateAccount.setPhone(updatePhone);
					break;
				case 3 :
					System.out.println("Enter new Password");
					String updatePassword = sc.nextLine();
					updateAccount.setPassword(updatePassword);
					break;
				}
				System.out.println("Updated Successfully");
				return;
				
			}
		}
		System.out.println("Invaid Credentials");

	}
	public void viewAccount()
	{
		System.out.println("Enter the username : ");
		String username = sc.nextLine();
		System.out.println("Enter the password");
		String password = sc.nextLine();
		if(accounts.containsKey(username))
		{
			Account viewAccount = accounts.get(username);
			if(viewAccount.getPassword().equals(password))
			{
				System.out.println("Name : " + viewAccount.getName());
				System.out.println("Phone : " + viewAccount.getPhone());
				return;
			}
		}
		System.out.println("Invaid Credentials");
	}
	public boolean verify() 
	{
		System.out.println("Enter username");
		String username = sc.nextLine();
		System.out.println("Enter Password");
		String password = sc.nextLine();
		if(accounts.containsKey(username))
		{
			Account verifyAccount = accounts.get(username);
			if(verifyAccount.getPassword().equals(password))
			{
				System.out.println("Verified");
				AccountManager.username = username;
				return true;
			}
		}
		return false;
	}

}
