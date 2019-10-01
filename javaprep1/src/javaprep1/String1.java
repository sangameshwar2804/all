package javaprep1;

public class String1 {
public static void main(String[] args) {
	String s=new String("hello");
	s=s.concat("hi");
	

	System.out.println(s);
	StringBuffer sb=new StringBuffer("hello");
	sb.append("hi");
	System.out.println(sb);
}
}
