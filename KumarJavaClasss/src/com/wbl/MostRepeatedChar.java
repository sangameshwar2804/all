package com.wbl;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedChar {
public char findMostRepeatingChars(String str) {
		HashMap<Character,Integer>hm=new HashMap<>();
	for(int i=0;i<str.length();i++) {
		if(hm.containsKey(str.charAt(i))) {
			hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
		}
		else {
			hm.put(str.charAt(i), 1);
		}
	}
	int count=0;
	char ch=str.charAt(0);
	for(Map.Entry<Character, Integer>entry:hm.entrySet()) {
		if(entry.getValue()>count) {
			ch=entry.getKey();
			count=entry.getValue();
		}
	}
	System.out.println(ch);
	return ch;
}
public static void main(String[] args) {
	MostRepeatedChar ch=new MostRepeatedChar();
	ch.findMostRepeatingChars("aaccbbb");
	
}
}
