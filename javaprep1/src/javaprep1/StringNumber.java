package javaprep1;

public class StringNumber {
public static boolean checkStringIsNum(String str) {
	String str1=str.toLowerCase();
	char[] ch=str1.toCharArray();
	int count=0;
	for(int i=0;i<str1.length();i++) {
		if(ch[i]=='0' | ch[i]=='1' |ch[i]=='2'| ch[i]=='3'|ch[i]=='4'|ch[i]=='5'|ch[i]=='6'|ch[i]=='7'|ch[i]=='8'|ch[i]=='9') {
			count++;
		}
	}
	if(count==str.length()) {
		System.out.println("true");
		return true;
	}
	else
		System.out.println("false");
		return false;
}
public static void main(String[] args) {
	checkStringIsNum("12345");
}
}
