package com.celcom.day10.bankapplication;

import java.util.Scanner;

//System.out.println("1. Deposit Balance");
//System.out.println("2. Money Transfer");
//System.out.println("3. Withdraw Money");

public class TransactionManager {
	Account account;
	Scanner sc = new Scanner(System.in);
	
	// Deposit Money
	public void deposit()
	{
		
		System.out.println("Enter the amount to deposit: ");
		long amount = sc.nextLong();
		account = Manager.accounts.get(Manager.accountnumber);
		System.out.println("Initial Amount is : " + account.getBalance());
		account.setBalance(account.getBalance()+amount);
		System.out.println("Total Balance : " + account.getBalance());
		return;
	}
	
	// WithDraw Money
	public void withDraw()
	{
		System.out.println("Enter the amount to withdraw: ");
		long amount = sc.nextLong();
		account = Manager.accounts.get(Manager.accountnumber);
		System.out.println("Initial Amount is : " + account.getBalance());
		if(account.getBalance()<amount)
		{
			System.out.println("Insufficient Balance");
			return;
		}
		account.setBalance(account.getBalance()-amount);
		System.out.println("Total Balance : " + account.getBalance());
		return;
	}
	
	// Transfer Money to a new Account
	public void moneyTransfer()
	{
		System.out.println("Enter the amount to transfer: ");
		long amount = sc.nextLong();
		account = Manager.accounts.get(Manager.accountnumber);
		System.out.println("Initial Amount is : " + account.getBalance());
		if(account.getBalance()<amount)
		{
			System.out.println("Insufficient Balance");
			return;
		}
		System.out.println("Enter the account number you want to tansfer");
		long accno = sc.nextLong();
		if(!Manager.accounts.containsKey(accno))
		{
			System.out.println("Invalid Number");
			return;
		}
		System.out.println("Transfering money to " + Manager.accounts.get(accno).getName());
		Manager.accounts.get(accno).setBalance(Manager.accounts.get(accno).getBalance()+amount);
		account.setBalance(account.getBalance()-amount);
		System.out.println("Money Transfered");
		System.out.println("Total Balance : " + account.getBalance());
		return;
	}
	
}
