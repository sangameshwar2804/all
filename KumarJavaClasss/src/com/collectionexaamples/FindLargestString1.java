package com.collectionexaamples;

import java.util.ArrayList;
import java.util.List;

public class FindLargestString1 {
public static String getlargestStr(List<String> list) {
	String result=list.get(0);
	for(int i=0;i<list.size();i++) {
		int length=list.get(i).length();
		if(length>result.length()) {
			result=list.get(i);
		}
	}
	return result;
}
public static void main(String[] args) {
List<String> list=new ArrayList<>();
list.add("hello");
list.add("hello");
list.add("hello");
System.out.println(getlargestStr(list));
}
}
