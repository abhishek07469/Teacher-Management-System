package com.Teacher.Controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.Teacher.DAO.LoginDAO;
import com.Teacher.bean.Teacher;

public class LoginController {

	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Gmail :");
		t.setEmail(sc.nextLine());
		
		System.out.println("Enter a Password :");
		t.setPassword(sc.nextLine());
		
		LoginDAO ld = new LoginDAO();
		try {
			
			String result = ld.login(t);
			
				if(result != null) {
					
					System.out.println("Login Successfully...");
					System.out.println("Hello "+ result);
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
