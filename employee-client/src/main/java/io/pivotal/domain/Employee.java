package io.pivotal.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee implements Comparable<Employee>{

	public Employee() {
	}

	private int empId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	@JsonProperty(value="firstName")
	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee(int empId, String salutation, String empFirstName, String empLastName, String dept) {
		super();
		this.empId = empId;
		this.salutation = salutation;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.dept = dept;
	}

	private String salutation;
	private String empFirstName;
	@JsonProperty(value="lastName")
	private String empLastName;
	private String dept;

	@Override
	public int compareTo(Employee emp) {
		
		
		
		// TODO Auto-generated method stub
		return 0;
	}

}
