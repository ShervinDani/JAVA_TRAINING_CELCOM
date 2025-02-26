package com.celcom.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Task3DB {
//	vcreate table customer(
//	name varchar(20),
//	address varchar(20),
//	fathername archar(20),
//	aadhar number,
//	phone number);
	private static final String URL = "jdbc:oracle:thin:@172.19.0.5:1521/trainingsql.celcom.com";
	private static final String USER = "training";
	private static final String PASSWORD = "Celcom123";
	private static Connection conn = null;
	public static void getConnection()
	{
		try {
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("Database Connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public boolean addUser(Task3Customer newCustomer) {
		String sql = "insert into shervincustomer values(?,?,?,?,?)";
		try
		{
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, newCustomer.getName());
			st.setString(2, newCustomer.getAddress());
			st.setString(3, newCustomer.getFathername());
			st.setLong(4, newCustomer.getAadhar());
			st.setLong(5, newCustomer.getPhone());
			st.executeQuery();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public boolean removeCustomer(long aadhar) {
		String sql = "delete shervincustomer where aadhar = " + aadhar;
		try
		{
			PreparedStatement st = conn.prepareStatement(sql);
			st.execute();
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public ResultSet viewAll() {
		String sql = "select * from shervincustomer";
		try
		{
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet set = st.executeQuery();
			return set;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public boolean UpdateUser(Task3Customer customer) {
		String sql = "update shervincustomer set name = ? ,phone = ?, address = ? where aadhar = " + customer.getAadhar();
		try
		{
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, customer.getName());
			st.setString(3, customer.getAddress());
			st.setLong(2, customer.getPhone());
			st.execute();
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
 }
