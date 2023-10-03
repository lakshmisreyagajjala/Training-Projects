package com.spring.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private String empName;
	private int employeeId;
	private Address address;
	
	public String getEmpName() {
		return empName;
	}
	@Value("Lucky")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	@Value("535")
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", employeeId=" + employeeId + ", address=" + address + "]";
	}
	
	
}

