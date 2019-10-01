package com.wbl.test;

import com.wbl.business.Employee;
import com.wbl.business.Manager;

public class EmployeeTest {
public static void main(String[] args) {
	Employee e1=new Employee(100);
	e1.name="Lakshay";
	e1.sal=10005.0;
	System.out.println(e1.getDetails());
	Manager m=new Manager(101);
	m.dept="Qa";
	m.sal=10000.0;
	m.name="Aryav";
System.out.println(m.getDetails());
Employee e=m;
System.out.println(e.getDetails());

}
}
