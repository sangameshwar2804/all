package com.wbl;

public class BikeImplementation extends Bike {

public static void main(String[] args) {
	Bike b= new BikeImplementation();
	b.drive();
	b.getDetails();
}
void drive() {
	System.out.println("Implemented Method");
}
}

