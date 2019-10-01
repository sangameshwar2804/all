package com.logic;

class Implementtion implements Robot,Robot1{

	public void setChip() {
		System.out.println("hello world");
		System.out.println("welcome to my world");
	}
	public void setMethod() {
	System.out.println("implemented public method");
	}
	public void unImplmented() {
	System.out.println("un implemented method of interface 2");
	}
	public static void main(String[] args) {
		Implementtion r=new Implementtion();
		r.setChip();
		r.setMethod();
		r.unImplmented();
		Robot.conCreteMethod();
	}
}
