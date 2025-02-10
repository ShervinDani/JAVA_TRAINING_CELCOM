package com.celcom.saturday_assignment_08_feb_2025;


//6. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.

class Employee
{
	String name;
	String designation;
	double salary;
	public Employee(String name, String designation, double salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	void updateSalary(double salary)
	{
		this.salary = salary;
	}
	
	void calculateSalary()
	{
		System.out.println("Calculated Salary is : " + salary);
	}
}
public class Assignment6 {

	public static void main(String[] args) {
		Employee employee = new Employee("SHERVIN","Trainee",120000);
		employee.updateSalary(200000);
		employee.calculateSalary();
	}

}
