package VisaJava;

public class StrPalindrome {
public static boolean  checkStrIsPalindrome(String str) {
	String rev="";
	if(str.length()<=1) {
		return false;
	}
	for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);//
	}
	if(str.equalsIgnoreCase(rev)) {
		return true;
	}
	return false;
	
}
public static void main(String[] args) {
	System.out.println(checkStrIsPalindrome("Aba"));
}
}
