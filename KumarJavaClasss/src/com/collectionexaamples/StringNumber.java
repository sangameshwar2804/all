package com.collectionexaamples;

public class StringNumber {
public boolean checkNumStr(String str) {
	char[] ch=str.toCharArray();
	int actualLength=str.length();
	int strNumCount=0;
	for(int i=0;i<str.length();i++) {
		if(ch[i]=='1' | ch[i]=='2' | ch[i]=='3' |ch[i]=='4'|ch[i]=='5'|ch[i]=='6'|ch[i]=='7'|ch[i]=='8'|ch[i]=='9' |ch[i]=='0') {
			strNumCount++;
			
		}
	}
	if(actualLength==strNumCount) {
		System.out.println("true");
		return false;
	}
	return false;
	
}
public static void main(String[] args) {
	StringNumber sn=new StringNumber();
System.out.println(sn.checkNumStr("12345"));
}
}
