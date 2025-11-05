package com.Teacher.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Teacher.bean.Teacher;

public class LogOutDAO {
	
		public boolean logOut(Teacher t) throws ClassNotFoundException, SQLException {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Teacher","root","root");
			PreparedStatement ps = con.prepareStatement("delete from teacher where email = ? ");
			
			ps.setString(1,t.getEmail());
			
			int rs = ps.executeUpdate();
			
				if(rs > 0) {
					
					return true;
				}else {
					
					return false;
				}
		}
}
