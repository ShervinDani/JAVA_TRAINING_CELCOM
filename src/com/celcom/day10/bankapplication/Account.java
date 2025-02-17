package com.celcom.day10.bankapplication;

public class Account {
	private String name;
	private long phone;
	private double balance;
	private String type;
	private String password;
	static Account user ;
	public Account(String name, long phone, double balance, String type, String password) {
		super();
		this.name = name;
		this.phone = phone;
		this.balance = balance;
		this.type = type;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
