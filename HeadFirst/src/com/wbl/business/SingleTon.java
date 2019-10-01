package com.wbl.business;

public class SingleTon {
private static  SingleTon obj;
static {
	obj=new SingleTon();
}
private SingleTon()
{
	System.out.println("This is Singleton Object..");
}
public static SingleTon getInstance()
{
	return obj;
}
public void testSingleton()
{
	System.out.println("Class Created..");
}
public static void main(String[] args) {
	SingleTon s=new SingleTon().getInstance();
}
}
