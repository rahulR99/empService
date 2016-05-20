package ems.com.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Employee {
	@JsonProperty
	long empId;
	@JsonProperty
	String empName;
	@JsonProperty
	Address address;
	@JsonProperty
	Department dept;
	@JsonProperty
	double salary;
	@JsonProperty
	String empDesg;
	
	public Employee(){
	}
	
	public long getEmpId() {
		return empId;
	}
	
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", address=" + address + ", dept=" + dept + ", salary="
				+ salary + ", empDesg=" + empDesg + "]";
	}
	
}
