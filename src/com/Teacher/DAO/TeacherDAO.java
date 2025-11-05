package com.Teacher.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Teacher.bean.Teacher;

public class TeacherDAO {
	
		public boolean insert(Teacher t) throws ClassNotFoundException, SQLException {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Teacher","root","root");
			PreparedStatement ps = con.prepareStatement("insert into teacher values(?,?,?,?,?,?,?,?,?,?)");
			
			
			ps.setInt(1,t.getId());
			ps.setString(2,t.getName());
			ps.setString(3,t.getCity());
			ps.setString(4,t.getCollege());
			ps.setInt(5, t.getAge());
			ps.setString(6,t.getEmail());
			ps.setString(7,t.getPassword());
			ps.setString(8, t.getGender());
			ps.setString(9, t.getBloodgroup());
			ps.setString(10, t.getContact());
			
			int rs = ps.executeUpdate();
			
				if(rs > 0) {
					
					return true;
					
				}else {
					
					return false;
				}
			
		}
}
