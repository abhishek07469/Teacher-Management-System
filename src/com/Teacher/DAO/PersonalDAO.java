package com.Teacher.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Teacher.bean.Teacher;

public class PersonalDAO {

	public void personalInfo(Teacher t) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Teacher","root","root");
		PreparedStatement ps = con.prepareStatement("select * from teacher where email = ?");
		
		ps.setString(1,t.getEmail());
		ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				System.out.println("-----Your Details-----");
				System.out.println("Your ID :"+rs.getInt(1));
				System.out.println("Your Name :"+rs.getString(2));
				System.out.println("Your City :"+rs.getString(3));
				System.out.println("Your College :"+rs.getString(4));
				System.out.println("Your Age :"+rs.getInt(5));
				System.out.println("Your Email :"+rs.getString(6));
				System.out.println("Your Password :"+rs.getString(7));
				System.out.println("Your Gender :"+rs.getString(8));
				System.out.println("Your Bloodgroup :"+rs.getString(9));
				System.out.println("Your Contact :"+rs.getString(10));
			}
		
	}
		
}
