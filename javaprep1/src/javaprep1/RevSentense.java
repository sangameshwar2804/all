package javaprep1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RevSentense {
	public static void main(String[] args) {
		
	
String s="this is string";
String[] s1=s.split(" ");
/*String temp=" ";
for(int i=0;i<s1.length;i++) {
for(int j=s1[i].length()-1;j>=0;j--) {
	temp=temp+s.charAt(j);
}
}
System.out.println(temp);*/
List al=new ArrayList<>();
for(int i=0;i<s1.length;i++) {
	al.add(s1[i]);
}
Collections.reverse(al);
System.out.println(al.toString());
}
}