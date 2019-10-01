package com.collectionexaamples;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("hello");
		ts.add("hi");
		ts.add("this");
		ts.add("is");
		ts.add("Collections");
		ts.add("xebia");
		ts.add("apple");
		ts.add("Apple");
		for (String s : ts) {
			System.out.println(s);
		}
	}
}
