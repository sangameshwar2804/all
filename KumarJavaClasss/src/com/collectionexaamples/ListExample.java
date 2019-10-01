package com.collectionexaamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
public void listBasic() {
	List<Integer> l=new ArrayList<Integer>();
	l.add(9);
	l.add(20);
	l.add(24);
	l.add(56);
	l.add(38);
	System.out.println("size of the List :"+l.size());
	System.out.println("second Element:"+l.get(1));
	l.remove(3);
	System.out.println("Aftre Removing:"+l.size());
	for(int i=0;i<l.size();i++) {
		if(l.get(i)%2==0) {
			System.out.println(l);
		}
	}
}
public static void main(String[] args) {
	ListExample le=new ListExample();
	le.listBasic();
	
}
}
