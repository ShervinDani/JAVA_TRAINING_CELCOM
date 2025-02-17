package com.celcom.day10.railwayreservation;

public class Account {
	private  String name;
	private long phone;
	private String password;
	public Account(String name, long phone, String password) {
		this.name = name;
		this.phone = phone;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}