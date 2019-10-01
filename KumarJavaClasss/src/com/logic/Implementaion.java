package com.logic;

public class Implementaion implements A,B{
	@Override
	public void get() {
System.out.println("Implemented method1");		
	}
	
	@Override
	public void g() {
		System.out.println("implemented");
		
	}

	public static void main(String[] args) {
		Implementaion i=new Implementaion();
		i.g();
		i.g1();
	}

	@Override
	public void g1() {
		System.out.println("G!");
		
	}

}
