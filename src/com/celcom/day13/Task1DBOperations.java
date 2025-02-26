package com.celcom.day13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Task1DBOperations {
//	id int primary key,
//	name varchar(20),
//	account_number varchar(20),
//	balance decimal.
	private static final String GET_ID = "SELECT MAX(id) FROM sbi";
	private static final String INSERT = "insert into sbi values(?,?,?,?)";
	private static final String SELECT_ALL = "select * from sbi where balance >= ?";
	private static final String SELECT_BY_ID = "select * from sbi where id = ?";
	private static final String UPDATE_BALANCE = "update sbi set balance = ? where id = ?";
	private static final String DELETE = "delete sbi where id = ?";
	Connection conn;
	PreparedStatement st;
	public Task1DBOperations() {
		conn = Task1DBConnection.getConnetion();
	}
	public boolean insert(Task1Customer customer)
	{
		try
		{
			int newId;
			st = conn.prepareStatement(GET_ID);
			ResultSet set = st.executeQuery();
			if(set.next())
			{
				newId = set.getInt(1)+1;
			}
			else
			{
				newId = 1;
			}
			st = conn.prepareStatement(INSERT);
			st.setInt(1, newId);
			st.setString(2, customer.getName());
			st.setLong(3, customer.getAccount_number());
			st.setDouble(4,0);
			st.executeQuery();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public boolean delete(int id)
	{
		try
		{
			st = conn.prepareStatement(DELETE);
			st.setInt(0, id);
			return st.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public ResultSet viewAll(double amount)
	{
		try
		{
			st = conn.prepareStatement(SELECT_ALL);
			st.setDouble(1,amount);
			ResultSet set = st.executeQuery();
			return set;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	public ResultSet view(int id)
	{
		try
		{
			st = conn.prepareStatement(SELECT_BY_ID);
			st.setInt(1, id);
			ResultSet set = st.executeQuery();
			return set;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	public boolean deposit(int id,double amount)
	{
		try
		{
			st = conn.prepareStatement(SELECT_BY_ID);
			st.setInt(1, id);
			ResultSet set = st.executeQuery();
			set.next();
			double balance = set.getDouble(4);
			balance += amount;
			st = conn.prepareStatement(UPDATE_BALANCE);
			st.setDouble(1, balance);
			st.setInt(2, id);
			st.execute();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public boolean withdraw(int id,double amount)
	{
		try
		{
			st = conn.prepareStatement(SELECT_BY_ID);
			st.setInt(1, id);
			ResultSet set = st.executeQuery();
			set.next();
			double balance = set.getDouble(4);
			if(balance < amount)
			{
				return false;
			}
			balance -= amount;
			st = conn.prepareStatement(UPDATE_BALANCE);
			st.setDouble(1, balance);
			st.setInt(2, id);
			st.execute();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}