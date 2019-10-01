package com.collectionexaamples;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExamplE {
public static void main(String[] args) {
	Map<Integer, String> m=new TreeMap<>();
	m.put(1, "Aryav");
	m.put(2,"vikas");
	m.put(3, null);
	for(Map.Entry<Integer, String>entry:m.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
}
}
