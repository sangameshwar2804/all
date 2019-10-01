package com.wbl.business;

public class Manager extends Employee{
	public String dept;
public Manager(int empId) {
		super(empId);
	}


public String getDetails() {
	return super.getDetails()+" -"+dept;
}
}
