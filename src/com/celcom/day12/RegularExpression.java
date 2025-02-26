package com.celcom.day12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email to check");
		String email = sc.nextLine();
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.+]+@gmail\\.com$");
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches())
		{
			System.out.println("Valid Email");
		}
		else
		{
			System.out.println("Not Valid Email");
		}
		System.out.println("Enter password to check");
		String password = sc.nextLine();
		Pattern pattern1 = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&]).{8,}$");
		Matcher matcher1 = pattern1.matcher(password);
		if(matcher1.matches()) {
			System.out.println("Valid Password");
		}
		System.out.println("Enter Phone number to check");
		String phone = sc.nextLine();
		Pattern pattern2 = Pattern.compile("^[0-9]+{10}");
		Matcher matcher2 = pattern2.matcher(phone);
		if(matcher2.matches())
		{
			System.out.println("Valid Number");
		}
	}

}
