package com.collectionexaamples;

import java.util.HashSet;
import java.util.Set;

public class StudentTest {
	public static void main(String[] args) {
		Set<Students> set = new HashSet<Students>();
		Students s1 = new Students();
		s1.setId(2);
		s1.setName("aryav");
		Students s2 = new Students();
		s2.setId(1);
		s2.setName("Bhaskar");
		set.add(s1);
		set.add(s2);
		for (Students stu : set) {
			System.out.println(stu.getId() + "  " + stu.getName());
		}
	}
}
