package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class loginDao {
	
	String url = "jdbc:mysql://localhost:3306/org";
	String username = "root";
	String password = "kuch@123";
	public boolean checkCredentials(String  username, String pass) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.driver");
			Connection con = DriverManager.getConnection(url , username , password);
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

}
