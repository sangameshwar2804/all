package VisaJava;

public class StrRev {
public static String getRevstr(String str) {
	String s=str.toLowerCase();
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	return rev;
}
public static void main(String[] args) {
	System.out.println(getRevstr("helo"));
}
}
