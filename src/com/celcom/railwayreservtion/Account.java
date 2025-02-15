package com.celcom.railwayreservtion;

public class Account {
	private final String name;
	private final long phone;
	private String password;
	public Account(String name, long phone, String password) {
		this.name = name;
		this.phone = phone;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public long getPhone() {
		return phone;
	}
}
class Inhertiance extends Account
{

	public Inhertiance(String name, long phone, String password) {
		super(name, phone, password);
		// TODO Auto-generated constructor stub
	}
	@Override
	public
	String getPassword()
	{
		return null;
		
	}
}