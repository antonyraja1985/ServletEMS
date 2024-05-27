package com.antonyit.entity;

public class Employee {
	
	private int id;
	private String name;
	private String designation;
	private long phone;
	private double salary;
	
   public	Employee(){
		
	}
	
	public Employee(int id, String name, String designation, long phone, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.phone = phone;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", phone=" + phone
				+ ", salary=" + salary + "]";
	}
	
	
	
	

}
