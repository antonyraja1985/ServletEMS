package com.antonyit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.antonyit.entity.Employee;

public class EmployeeDao {

	// insert
	public void insert(Employee employee) {

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","admin");
			Statement statement = connection.createStatement();
			String inserQuery="insert into employeedt values(default,'"+employee.getName()+"','"+employee.getDesignation()+"','"+employee.getPhone()+"','"+employee.getSalary()+"');";
			int executeUpdate = statement.executeUpdate(inserQuery);
			System.out.println(executeUpdate);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

	// getAll
	public void getAll() {

	}

	// getById
	public void getById() {

	}
	
	//update
	public void update() {

	}
	
	//delete
	
	public void delete() {

	}

}
