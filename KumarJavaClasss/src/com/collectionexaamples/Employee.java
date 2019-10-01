package com.collectionexaamples;

import java.util.Comparator;

public class Employee implements Comparator {
	String empName;
	int age;

	public String toString() {
		return "employee name:" + empName + "/n Emp age:" + age;
	}

	public Employee(String empName, int age) {
		this.empName = empName;
		this.age = age;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		Employee e = (Employee) obj1;
		Employee e1 = (Employee) obj2;

		return e.getEmpName().compareTo(e1.getEmpName());
	}

}
