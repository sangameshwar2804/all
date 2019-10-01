package com.collectionexaamples;

import java.util.List;
import java.util.Vector;

public class VectorExample {
public static void main(String[] args) {
	List<Integer>list=new Vector<Integer>(5,2);
	list.add(10);
	list.add(30);
	list.add(40);
	list.add(20);
	list.add(50);
	System.out.println("Size of the Vector is"+list.size());
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	list.remove(3);
	System.out.println("Aftre removing element"+list.size());
}
}
