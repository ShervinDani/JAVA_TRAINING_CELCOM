package com.celcom.day13;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class Task1Manager {
	Scanner sc;
	Task1DBOperations op;
	public Task1Manager() {
		sc = new Scanner(System.in);
		op = new Task1DBOperations();
	}
	public void addAccount() {
		Random rand = new Random();
		Task1Customer customer = new Task1Customer();
		System.out.println("Enter customer name");
		customer.setName(sc.nextLine());
		customer.setAccount_number(rand.nextLong(100000,999999));
		if(op.insert(customer))
		{
			System.out.println("Added Successfully");
		}
		else
		{
			System.out.println("Error while Adding....");
		}
		
	}

	public void viewAll() {
		System.out.println("Enter the basic amount");
		double amount = sc.nextDouble();
		sc.nextLine();
		ResultSet set = op.viewAll(amount);
		try {
			while(set.next())
			{
				System.out.println("ID : " + set.getInt(1));
				System.out.println("Name: " + set.getString(2));
				System.out.println("AccountNumber : " + set.getLong(3));
				System.out.println("Balance : " + set.getDouble(4));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deposit() {
		System.out.println("Enter the customer id to deposit");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the amount to deposit");
		double amount = sc.nextDouble();
		sc.nextLine();
		if(op.deposit(id,amount))
		{
			System.out.println("Deposited");
		}
		else
		{
			System.out.println("Error occured");
		}
	}

	public void withdraw() {
		System.out.println("Enter the customer id to withdraw");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the amount to withdraw");
		double amount = sc.nextDouble();
		sc.nextLine();
		if(op.withdraw(id,amount))
		{
			System.out.println("Withdrawn Successfully");
		}
		else
		{
			System.out.println("Insufficient Amount");
		}
	}

	public void viewOne() {
		System.out.println("Enter the id of the customer");
		int id = sc.nextInt();
		sc.nextLine();
		ResultSet set = op.view(id);
		try {
			if(set.next())
			{
				System.out.println("ID : " + set.getInt(1));
				System.out.println("Name: " + set.getString(2));
				System.out.println("AccountNumber : " + set.getLong(3));
				System.out.println("Balance : " + set.getDouble(4));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete() {
		System.out.println("Enter the id to delete");
		int id = sc.nextInt();
		sc.nextLine();
		if(op.delete(id))
		{
			System.out.println("Deleted Successfully");
		}
		else
		{
			System.out.println("Not found");
		}
		
	}

}
