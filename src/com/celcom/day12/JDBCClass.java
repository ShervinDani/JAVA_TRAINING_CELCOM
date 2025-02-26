package com.celcom.day12;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JDBCClass {
	private static final String url = "jdbc:oracle:thin:@Shervin-Dani:1521:xe";
	private static final String user = "system";
	private static final String password = "123456788";
	private static Connection conn = null;
	public static void getConnection ()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("Connected");
			PreparedStatement st = conn.prepareStatement("select * from sample");
			st.executeQuery();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}

}
