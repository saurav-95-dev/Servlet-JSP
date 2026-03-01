package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginDao {
	String query = "select * from login where uname= ? and pass = ?";
	
	String url = "jdbc:mysql://localhost:3306/org";
	String username = "root";
	String password = "kuch@123";
	public boolean checkCredentials(String  uname, String pass) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.driver");
			Connection con = DriverManager.getConnection(url , username , password);
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true;
			}
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

}
