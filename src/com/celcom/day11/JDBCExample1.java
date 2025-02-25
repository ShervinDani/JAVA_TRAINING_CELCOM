package com.celcom.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JDBCExample1 {
	private static final String url = "jdbc:mysql://localhost:3306/demo";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn = DriverManager.getConnection(url,"root","Shervin@2003");
			String sql = "insert into test(name,age) values('shervin',21)";
			PreparedStatement st = conn.prepareStatement(sql);
			st.executeUpdate();
			System.err.println("Done");
			st = conn.prepareStatement("drop table test");
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
