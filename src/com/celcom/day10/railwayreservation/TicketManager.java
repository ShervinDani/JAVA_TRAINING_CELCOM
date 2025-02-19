package com.celcom.day10.railwayreservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TicketManager {
	HashMap<String, ArrayList<Ticket>> trains = new HashMap();
	Scanner sc = new Scanner(System.in);
	public TicketManager() {
		trains.put("120 CHENNAI EGMORE", null);
		trains.put("131 KOLLAM", null);
	}
	public void bookTicket() {
		System.out.println("Enter the number of Persons");
		int noOfPerson = sc.nextInt();
		Person[] person = new Person[noOfPerson];
		for(int i = 0; i <noOfPerson; i++)
		{
			System.out.println("Enter the Name of Person " + (i+1));
			String name = sc.nextLine();
			System.out.println("Enter the age of Person " + (i+1));
			int age = sc.nextInt();
			System.out.println("Enter the gender: M/F");
			String gender = sc.nextLine();
			person[i] = new Person(name, age, gender);
		}
		
	}
}
