package com.celcom.day11;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the number of items: ");
			int i = sc.nextInt();
			
			if (i >= 4) {
				System.out.println("Invalid Input");
				return;
			}
			System.out.println("Enter the heating time for one item (in seconds):");
			float sec = sc.nextFloat();
			sc.nextLine();
			System.out.println("Enter the type of food (e.g., pasta, frozen meal, vegetables):");
			String food = sc.nextLine();
			System.out.println("Enter the microwave model (high, medium, low): ");
			String model = sc.nextLine();
			float time = sec;
				if(i == 2)
				{
					time+=(time*0.5);
				}
				else if(i == 3)
				{
					time=(time*2);
				}
				if(food.equalsIgnoreCase("pasta"))
				{
					time+=(time*(0.1));
				}
				else if(food.equalsIgnoreCase("frozen meal"))
				{
					time+=(time*(0.2));
				}
				if(model.equalsIgnoreCase("medium"))
				{
					time-=(time*(0.1));
				}
				else if(model.equalsIgnoreCase("low"))
				{
					time+=(time*(0.15));
				}
			System.out.println(time);
		}
	}

}
