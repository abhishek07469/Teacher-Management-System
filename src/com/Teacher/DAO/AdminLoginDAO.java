package com.Teacher.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Teacher.bean.Teacher;

public class AdminLoginDAO {
	
	public boolean adminLogin(Teacher t) throws SQLException, ClassNotFoundException {
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Teacher","root","root");
			PreparedStatement ps = con.prepareStatement("select * from admin where email = ? and password = ?");
			
			ps.setString(1,t.getEmail());
			ps.setString(2, t.getPassword());
			
			ResultSet rs = ps.executeQuery();
				
				if(rs.next()) {
					
					return true;
				}else {
				
					return false;
				}	
					
			
			
			
				
		}

}
