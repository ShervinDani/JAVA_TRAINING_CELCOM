package com.celcom.day11.employee;

import java.util.List;
import java.util.Scanner;

public class Manager {
	Scanner sc = new Scanner(System.in);
	JDBCClass db = new JDBCClass();
	public void addUser() {
		Emp emp = new Emp();
		System.out.println("Enter employee name");
		emp.setName(sc.nextLine());
		System.out.println("Enter Phone number");
		emp.setPhone(sc.nextLong());
		System.out.println("Enter Salary");
		emp.setSalary(sc.nextDouble());
		sc.nextLine();
		System.out.println("Enter Address");
		emp.setAddress(sc.nextLine());
		System.out.println("Enter employee age");
		emp.setAge(sc.nextInt());
		if(db.addnewUser(emp))
		{
			System.out.println("Added Successfully");
			System.out.println("Employee id is : " + emp.getId());
		}
	}

	public void deleteUser() {
		System.out.println("Enter Employee ID to delete");
		int id = sc.nextInt();
		sc.nextLine();
		if(db.removeUser(id))
		{
			System.out.println("Employee Deleted Successfully");
			return;
		}
		System.out.println("Employee not found");
	}

	public void viewUser() {
		System.out.println("Enter Employee ID to view");
		int id = sc.nextInt();
		sc.nextLine();
		Emp emp = db.viewUser(id);
		if(emp!=null)
		{
			System.out.println("Employee ID : " + emp.getId());
			System.out.println("Employee Name : " + emp.getName());
			System.out.println("Employee Phone : " + emp.getPhone());
			System.out.println("Employee Salary : " + emp.getSalary());
			System.out.println("Employee Address : " + emp.getAddress());
			return;
		}
		System.out.println("Employee not found");
	}

	public void viewUsers() {
		System.out.println("Enter Employee Age to view");
		int age = sc.nextInt();
		sc.nextLine();
		List<Emp> list = db.viewUsers(age);
		if(list == null)
		{
			System.out.println("Employees not found");
			return;
		}
		for(Emp emp : list)
		{
			System.out.println("Employee ID : " + emp.getId());
			System.out.println("Employee Name : " + emp.getName());
			System.out.println("Employee Phone : " + emp.getPhone());
			System.out.println("Employee Salary : " + emp.getSalary());
			System.out.println("Employee Address : " + emp.getAddress());
		}
	}

}
