package com.Teacher.Controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.Teacher.DAO.LogOutDAO;
import com.Teacher.DAO.TeacherDAO;
import com.Teacher.bean.Teacher;

public class LogOutController {

	public static void main(String[] args) {


		Teacher t = new Teacher();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  your Email :");
		t.setEmail(sc.nextLine());
		
		LogOutDAO ld = new LogOutDAO();
		try {
			
			boolean result = ld.logOut(t);
			
				if(result == true) {
					
					System.out.println("Delete Successfully...");
				}else {
					
					System.out.println("Please try Again...");
				}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
