package com.logic;
import com.wbl.*;
public class InheritanceTest {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.id=100;
		e1.salary=1000.0;
		e1.name="Aryav";
		System.out.println(e1.getDetals());
		Manager m1=new Manager();
		m1.id=101;
		m1.name="Kumar";
		m1.salary=100000.0;
		m1.department="QA";
		System.out.println(m1.getDetals());
		Director d1=new Director();
		d1.id=102;
		d1.name="Sindhu";
		d1.salary=1000000.0;
		d1.department="All";
		d1.organization="Innovapath";
		System.out.println(d1.getDetals());
		Employee e2=new Manager();
		e2.id=104;
		e2.name="Lakshay";
		e2.salary=1000.0;
		
	System.out.println(e2.getDetals());
	}

}
