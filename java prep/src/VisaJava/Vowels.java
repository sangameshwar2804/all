package VisaJava;

public class Vowels {
public static void main(String[] args) {
	String str="hello";int count=0;
	char[] ch=str.toCharArray();//['h',e'..]
	for(int i=0;i<str.length();i++) {
		if(ch[i]=='a'|ch[i]=='e'|ch[i]=='i'|ch[i]=='o'|ch[i]=='u') {
			count++;
		}
	}
	System.out.println(count);
}
}
