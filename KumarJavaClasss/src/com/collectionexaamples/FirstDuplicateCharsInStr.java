package com.collectionexaamples;

import java.util.HashSet;

public class FirstDuplicateCharsInStr {
public char getFirtsDuplicate(String ip) {
	char output=' ';
	HashSet<Character>hs=new HashSet<Character>();
	if(ip!=null && !ip.isEmpty()) {
		for(int i=0;i<ip.length();i++) {
			char ch=ip.charAt(i);
			if(hs.contains(ch)) {
				return ch; 
			}else {
			hs.add(ch);
			}
		}
	}
	return output;
}
public static void main(String[] args) {
	FirstDuplicateCharsInStr f=new FirstDuplicateCharsInStr();
	System.out.println(f.getFirtsDuplicate("ccel"));
}
}
