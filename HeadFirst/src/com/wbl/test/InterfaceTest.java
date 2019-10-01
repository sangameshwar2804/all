package com.wbl.test;

import com.wbl.business.Intf2;
import com.wbl.business.intf1;

public class InterfaceTest implements intf1,Intf2 {

	@Override
	public void m1() {
	System.out.println("implemented in InterfaaceTest");
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}
public static void main(String[] args) {
	InterfaceTest i=new InterfaceTest();
	i.m1();
	System.out.println(i.sub(10, 5));
	intf1.m2(10);
	System.out.println(Intf2.add(10, 20));
}
}
