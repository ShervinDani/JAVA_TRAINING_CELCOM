package com.celcom.day3;


class Employee
{
	private int eid;
	private String name;
	private double salary;
	
	public Employee() {
	}
	public Employee(int eid, String name, double salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
public class EncapsulationExample1 {
	public static void main(String[] args)
	{
		System.out.println("Employee 1 Details : ");
		Employee emp1=new Employee(100,"Shervin",120000);
		display(emp1);
		System.out.println("Employee 2 Details : ");
		Employee emp2=new Employee();
		emp2.setEid(101);
		emp2.setName("Dhanavel");
		emp2.setSalary(12000);
		display(emp2);
		
	}
	static void display(Employee emp1)
	{
		System.out.println("Employee ID : " + emp1.getEid());
		System.out.println("Employee Name : " + emp1.getName());
		System.out.println("Employee Salary : " + emp1.getSalary());
	}
}
