package com.collectionexaamples;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LinkedList {
public static void main(String[] args) {
	java.util.LinkedList<Integer> li=new java.util.LinkedList<>();
	
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	li.add(50);
	li.addFirst(100);
	li.addLast(200);
	li.add(4,150);
	Collections.replaceAll(li, 150, 15);
	System.out.println(li.size());
	
	Iterator itr=li.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println(li.contains(20));
}
}
