package com.celcom.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Task1DBConnection {
	private static final String URL = "jdbc:oracle:thin:@172.19.0.5:1521/trainingsql.celcom.com";
	private static final String USER = "training";
	private static final String PASSWORD = "Celcom123";
	public static Connection getConnetion()
	{
		Connection conn;
		try {
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("Database Connected");
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
