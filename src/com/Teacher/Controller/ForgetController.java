package com.Teacher.Controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.Teacher.DAO.ForgetDAO;
import com.Teacher.bean.Teacher;

public class ForgetController {

	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Email :");
		t.setEmail(sc.nextLine());
		
		System.out.println("Enter a New Password :");
		t.setPassword(sc.nextLine());
		
		ForgetDAO fd = new ForgetDAO();
		try {
			
			boolean result = fd.forgetPass(t);
			
				if(result == true) {
					
					System.out.println("Update Password Successfully...");
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
