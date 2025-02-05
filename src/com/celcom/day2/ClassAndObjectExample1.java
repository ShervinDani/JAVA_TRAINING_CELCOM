package com.celcom.day2;

class Employee
{
	// Variable Declaration
	int eid;
	String name;
	double salary;
	
	// Constructor
	Employee(int eid,String name,double salary)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
	}
	
	// Methods
	public void display()
	{
		System.out.println("Employee ID : " + eid);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Salary : " + salary);
	}
}
public class ClassAndObjectExample1 {

	public static void main(String[] args) {
		
		//Object Initialization
		Employee emp1 = new Employee(100,"SHERVIN",1000000);
		emp1.display();
		Employee emp2 = new Employee(101,"DHANAVEL",1000000);
		emp2.display();
		Employee emp3 = new Employee(102,"MANIKANDAN",1000000);
		emp3.display();
	}

}
