package com.lkm.bean;

public class Employee {
	private int empId;
	private String empName;
	private String role;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, String role, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.role = role;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", role=" + role + ", salary=" + salary + "]";
	}
	
	
}
