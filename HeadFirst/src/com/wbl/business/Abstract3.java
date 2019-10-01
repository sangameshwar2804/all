package com.wbl.business;

public class Abstract3 extends Abstracct2{

	@Override
	public void m2() {
	System.out.println("Method 2 is implemented");
		
	}
	public void m1() {
		
		System.out.println("M1 is implemented in abstract class");
	}
	public void m3() {
		System.out.println("M3 is concrete method");
	}
public static void main(String[] args) {
	Abstract3 a=new Abstract3();
	a.m1();
	a.m2();
	a.m3();
	System.out.println(a.add(10, 20));
}
}
