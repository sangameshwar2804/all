package com.wbl;

public class PassByValue {
public static void main(String[] args) {
	int i=10; 
	int b=20;
int c=add(i, b);
System.out.println(c);
}
public static int add(int x,int y) {
	return x+y;
}
}
