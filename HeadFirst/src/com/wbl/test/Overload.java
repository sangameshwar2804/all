package com.wbl.test;

public class Overload {
public int add(int a,int b) {
	return a+b;
}
public void add(double a,int b) {
	double c=a+b;
	System.out.println(c);
}
public String addd(String a,String b) {
	return a+b;
}
public static void main(String[] args) {
	Overload o=new Overload();
			System.out.println(o.add(10, 20));
	System.out.println(o.addd("hello","123"));
	o.add(10.3, 1);
}
}
