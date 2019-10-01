package com.collectionexaamples;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
public static void main(String[] args) {
	Set<String> s=new HashSet<String>();
	s.add("hello");
	s.add("hi");
	s.add("this");
	s.add("is");
	s.add("Aryav");
	s.add("Aryav");
	for(String s1:s) {
		System.out.println(s1);
	}
}
}
