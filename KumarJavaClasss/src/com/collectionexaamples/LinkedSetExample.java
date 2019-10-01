package com.collectionexaamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetExample {
public static void main(String[] args) {
	Set<String> s=new LinkedHashSet<String>();
	s.add("hello");
	s.add("hi");
	s.add("this");
	s.add("is");
	s.add("Aryav");
	s.add("Aryav");
	s.add(null);
	s.add(null);
	for(String s1:s) {
		System.out.println(s1);
}
}
}