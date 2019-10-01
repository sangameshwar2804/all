package com.collectionexaamples;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTest {
	public EmployeeTest() {
		Set<Employee> s = new TreeSet<Employee>();
		Employee e = new Employee("Aryav", 21);
		Employee e1 = new Employee("Lakshay", 22);
		Employee e2 = new Employee("Vedang", 23);
		Employee e3 = new Employee("Bhaskar", 24);
		s.add(e);
		s.add(e1);
		s.add(e2);
		s.add(e3);
	}

	public static void main(String[] args) {
		new EmployeeTest();

	}
}
