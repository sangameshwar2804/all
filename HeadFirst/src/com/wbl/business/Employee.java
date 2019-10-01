package com.wbl.business;

public class Employee {
public int empId;
public double sal;
public String name;
public Employee(int empId) {
	this.empId=empId;
}
public String getDetails() {
	return name+""+sal+":"+empId;
}
}
