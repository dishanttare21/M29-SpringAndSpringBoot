package org.sjcem.literals;
//Program to demonstrate DI in the form of literals
public class Employee {
	
	//private data members
	// 1. DI in form of literals
	private int empId;
	private String empName;
	private String address;
	private float salary;
	
	/* If you are achieving AI using setters then use <property> tag in literals.xml file */
	
	//getters and setters
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	//2. DI using constructor
	//parameterized constructor
	public Employee(int empId, String empName, String address, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.salary = salary;
	}
	
	
	//methods
	public void print() {
		System.out.println("Emp Id: "+empId+" Emp Name: "+empName+" Emp Address: "+address+" Emp Salary: "+salary);
	}
	
}
