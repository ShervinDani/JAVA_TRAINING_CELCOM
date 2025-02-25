package com.celcom.day11.employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCClass {
	private static final String url = "jdbc:mysql://localhost:3306/demo";
	private static final String user = "root";
	private static final String password = "Shervin@2003";
	private static Connection conn = null;
	public static void getConnection ()
	{
		try
		{
			conn = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	public boolean addnewUser(Emp emp) {
		String sql1 = "insert into emp(name,age,address,salary,phone) values (?,?,?,?,?)";
		String sql2 = "SELECT id FROM emp ORDER BY id DESC LIMIT 1";
		try
		{
			PreparedStatement st = conn.prepareStatement(sql1);
			st.setString(1, emp.getName());
			st.setInt(2, emp.getAge());
			st.setString(3, emp.getAddress());
			st.setDouble(4, emp.getSalary());
			st.setLong(5,emp.getPhone());
			st.executeUpdate();
			st = conn.prepareStatement(sql2);
			ResultSet set = st.executeQuery();
			if(set.next())
			{
				emp.setId(set.getInt(1));
			}
			return true;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public boolean removeUser(int id) {
		String sql = "delete from emp where id = ?";
		try
		{
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, id);
			st.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public Emp viewUser(int id) {
		String sql = "select * from emp where id = ?";
		try
		{
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, id);
			ResultSet set = st.executeQuery();
			if(set.next())
			{
				Emp emp = new Emp();
				emp.setId(id);
				emp.setName(set.getString(2));
				emp.setAge(set.getInt(3));
				emp.setAddress(set.getString(4));
				emp.setSalary(set.getDouble(5));
				emp.setPhone(set.getLong(6));
				return emp;
			}
			return null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	public List<Emp> viewUsers(int age) {
		String sql = "select * from emp where age >= ?";
		try
		{
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, age);
			ResultSet set = st.executeQuery();
			List<Emp> list = new ArrayList<>();
			while(set.next())
			{
				Emp emp = new Emp();
				emp.setId(set.getInt(1));
				emp.setName(set.getString(2));
				emp.setAge(set.getInt(3));
				emp.setAddress(set.getString(4));
				emp.setSalary(set.getDouble(5));
				emp.setPhone(set.getLong(6));
				list.add(emp);
			}
			return list;
		}
		catch(Exception e)
		{
			return null;
		}
	}
}
