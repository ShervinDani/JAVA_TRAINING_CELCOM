package com.celcom.day12;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Task3Manager {
	Task3DB db = new Task3DB();
	Scanner sc = new Scanner(System.in);
	public void addCustomer() {
		Task3Customer newCustomer = new Task3Customer();
		System.out.println("Enter Customer Name");
		newCustomer.setName(sc.nextLine());
		System.out.println("Enter Phone Number");
		newCustomer.setPhone(sc.nextLong());
		sc.nextLine();
		System.out.println("Enter Address");
		newCustomer.setAddress(sc.nextLine());
		System.out.println("Enter Fathers Name");
		newCustomer.setFathername(sc.nextLine());
		System.out.println("Enter AADHAR Number");
		newCustomer.setAadhar(sc.nextLong());
		sc.nextLine();
		if(db.addUser(newCustomer))
		{
			System.out.println("Added Successfully");
			return;
		}
		System.out.println("Error");
	}

	public void updateCustomer() {
		Task3Customer customer = new Task3Customer();
		System.out.println("Enter Customer Name");
		customer.setName(sc.nextLine());
		System.out.println("Enter Phone Number");
		customer.setPhone(sc.nextLong());
		sc.nextLine();
		System.out.println("Enter Address");
		customer.setAddress(sc.nextLine());
		System.out.println("Enter AADHAR Number");
		customer.setAadhar(sc.nextLong());
		sc.nextLine();
		if(db.UpdateUser(customer))
		{
			System.out.println("Updated Successfully");
			return;
		}
		System.out.println("Error");
	}

	public void removeCustomer() {
		System.out.println("Enter the aadhar number of the customer to remove");
		long aadhar = sc.nextLong();
		sc.nextLine();
		if(db.removeCustomer(aadhar))
		{
			System.out.println("Deleted");
			return;
		}
		System.out.println("Not Found");
	}

	public void viewAll() {
		ResultSet set = db.viewAll();
		try {
			while(set.next())
			{
				System.out.println("Name : " + set.getString(1));
				System.out.println("Address : " + set.getString(2));
				System.out.println("Fathers Name : " + set.getString(3));
				System.out.println("Aadher Number : " + set.getLong(4));
				System.out.println("Phone Number : " + set.getLong(5));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
