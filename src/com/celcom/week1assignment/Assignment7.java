package com.celcom.week1assignment;

import java.util.HashMap;
import java.util.Scanner;

//7. Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.

class Account
{
	String holderName;
	String branchName;
	long phone;
	String accountType;
	double balance;
	public Account(String holderName, String branchName, long phone, String accountType) {
		this.holderName = holderName;
		this.branchName = branchName;
		this.phone = phone;
		this.accountType = accountType;
		this.balance=0;
	}
	
}
class Bank
{
	private HashMap<Long,Account> bank = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	void addAccount()
	{
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter your phone number");
		long phone = sc.nextLong();
		System.out.println("Enter Account Type");
		String type = sc.next();
		System.out.println("Enter the branch name");
		String branch = sc.next();
			Account account = new Account(name,branch,phone,type);
			long newaccountnumber = bank.size()+1;
			bank.put(newaccountnumber,account);
			System.out.println("Created Successfully and the account number is " + newaccountnumber);
			return;
	}
	void deleteAccount()
	{
		System.out.println("Enter the account number of the account holder");
		long accountnumber = sc.nextLong();
		if(bank.containsKey(accountnumber))
		{
			bank.remove(accountnumber);
			System.out.println("Removed Successfully");
			return;
		}
		System.out.println("Invalid Input");
	}
	void accountDetails()
	{
		System.out.println("Enter the account number");
		long accountnumber = sc.nextLong();
		if(!bank.containsKey(accountnumber))
		{
			System.out.println("Account Not Found");
			return;
		}
		Account account = bank.get(accountnumber);
		System.out.println("Name : " + account.holderName);
		System.out.println("Account Type : " + account.accountType);
		System.out.println("Balance : " + account.balance);
	}
	void deposit()
	{
		System.out.println("Enter the account number");
		long accountnumber=sc.nextLong();
		System.out.println("Enter the amount");
		double amount=sc.nextDouble();
		if(bank.containsKey(accountnumber))
		{
			Account account = bank.get(accountnumber);
			account.balance+=amount;
			System.out.println("Deposited");
			return;
		}
		System.out.println("Account Not Fount");
		
	}
	void withDraw()
	{
		System.out.println("Enter the account number");
		long accountnumber=sc.nextLong();
		System.out.println("Enter the amount");
		double amount=sc.nextDouble();
		if(bank.containsKey(accountnumber))
		{
			Account account = bank.get(accountnumber);
			if(account.balance<amount)
			{
				System.out.println("Cannot Done");
				return;
			}
			account.balance-=amount;
			System.out.println("Completed");
			return;
		}
		System.out.println("Account Not Fount");
	}
}
public class Assignment7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		while(true)
		{
			System.out.println("*========================*\n");
			System.out.println("Enter your choice");
			System.out.println("1. Create new acount");
			System.out.println("2. View Account Details");
			System.out.println("3. Delete Account");
			System.out.println("4. Deposit");
			System.out.println("5. Withdraw");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				bank.addAccount();
				break;
			case 2:
				bank.accountDetails();
				break;
			case 3:
				bank.deleteAccount();
				break;
			case 4:
				bank.deposit();
				break;
			case 5:
				bank.withDraw();
			default:
				System.out.println("Invalid");
			}
			System.out.println("*========================*\n\n\n");
		}
	}

}
