package com.Teacher.Controller;

import java.sql.SQLException;

import com.Teacher.DAO.ShowDAO;
import com.Teacher.bean.Teacher;

public class ShowController {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		ShowDAO sd = new ShowDAO();
		
		try {
			sd.show(t);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
