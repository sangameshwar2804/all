package javaprep1;

public class Rev {
public static void main(String[] args) {
	String str="hello";
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
}
}
