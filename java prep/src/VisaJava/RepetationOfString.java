package VisaJava;

import java.util.HashMap;
import java.util.Map;

public class RepetationOfString {
public static void main(String[] args) {
	String[] str= {"hello","hi","hello","h"};
	Map<String, Integer>hm=new HashMap<String, Integer>();
	for(int i=0;i<str.length;i++) {
		if(hm.containsKey(str[i])) {
			hm.put(str[i], hm.get(str[i])+1);
		}
		else {
			hm.put(str[i], 1);
		}
	}
	for(Map.Entry<String, Integer>entry:hm.entrySet()) {
		System.out.println(entry.getKey()+"-"+entry.getValue());
	}
}
}
