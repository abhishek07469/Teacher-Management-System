package com.Teacher.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Teacher.bean.Teacher;

public class LoginDAO {

	
		public String login(Teacher t) throws ClassNotFoundException, SQLException {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Teacher","root","root");
			PreparedStatement ps = con.prepareStatement("select * from teacher where email = ? and password = ?");
			
			ps.setString(1,t.getEmail());
			ps.setString(2, t.getPassword());
			
			ResultSet rs = ps.executeQuery();
			
			
				if(rs.next()) {
					
					return rs.getString("name");
				}else {
					
					return null;
				}
		}
}
