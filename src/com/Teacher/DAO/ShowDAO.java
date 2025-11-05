package com.Teacher.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Teacher.bean.Teacher;
import com.mysql.cj.xdevapi.Statement;

public class ShowDAO {
	
		public void show(Teacher t) throws ClassNotFoundException, SQLException {
			

			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Teacher","root","root");
			java.sql.Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from teacher");
			
				while(rs.next()) {
					
					System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getInt(5)+" | "+rs.getString(6)+" | "+rs.getString(7)+" | "+rs.getString(8)+" | "+rs.getString(9)+" | "+rs.getString(10));
				}
			
			
		}
}
