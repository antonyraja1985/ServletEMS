package com.antonyit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.antonyit.dao.EmployeeDao;
import com.antonyit.entity.Employee;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		String name = request.getParameter("name");
		String designation = request.getParameter("designation");
		String phone = request.getParameter("phone");
		String empSalary = request.getParameter("salary");
		
        long phoneNo = Long.parseLong(phone);
        double salary = Double.parseDouble(empSalary);
		
        Employee employee=new Employee();
        employee.setName(name);
        employee.setDesignation(designation);
        employee.setPhone(phoneNo);
        employee.setSalary(salary);
        
		EmployeeDao dao=new EmployeeDao();
		 dao.insert(employee);
		
		System.out.println(name);
		System.out.println(designation);
		System.out.println(phone);
		System.out.println(salary);
	}

	

}
