package com.celcom.day10.bankapplication;

import java.util.HashMap;
import java.util.Scanner;

public class Manager {
	static HashMap<Long, Account> accounts = new HashMap<>();
	static long accountnumber;
	Scanner sc = new Scanner(System.in);
	
	//For user login
	public boolean verify()
	{
		System.out.println("Enter the Account Number");
		long accno = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Account Password");
		String password = sc.nextLine();
		if(accounts.containsKey(accno))
		{
			if(accounts.get(accno).getPassword().equals(password))
			{
				accountnumber = accno;
				System.out.println("Login Success");
				return true;
			}
		}
		System.out.println("Try again");
		return false;
	}
	
	// New Account Creation
	public void addAccount()
	{
		System.out.println("Enter Holder Name");
		String name = sc.nextLine();
		System.out.println("Enter Phone Number");
		long phone = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter a Password");
		String password = sc.nextLine();
		Account account = new Account(name,phone,0,"SAVINGS",password);
		accounts.put((long) (accounts.size()+1), account);
		System.out.println("Account Created");
		System.out.println("The Account Number is : " + accounts.size());
	}
	
	// Delete an account
	public void deleteAccount()
	{
		System.out.println("Enter Account Number for delete");
		long account = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Password for Confirmation");
		String password = sc.nextLine();
		if(accounts.containsKey(account))
		{
			Account delaccount = accounts.get(account);
			if(delaccount.getPassword() == password)
			{
				accounts.remove(delaccount);
				System.out.println("Account Removed");
				return;
			}
		}
		System.out.println("Invalid Creditionals");
	}
	
	// To view account
	public void viewDetails() 
	{
		Account viewAccount = Manager.accounts.get(Manager.accountnumber);
		System.out.println("Name : " + viewAccount.getName());
		System.out.print("Account Number : " + Manager.accountnumber);
		System.out.println("Balance : " + viewAccount.getBalance());
	}
}
