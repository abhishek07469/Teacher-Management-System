package com.Teacher.Controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.Teacher.DAO.PersonalDAO;
import com.Teacher.bean.Teacher;

public class PersonalController {

	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Email :");
		t.setEmail(sc.nextLine());
		
		PersonalDAO pd = new PersonalDAO();
		try {
			pd.personalInfo(t);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
