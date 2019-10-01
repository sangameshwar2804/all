package com.wbl;

import com.collectionexaamples.*;

public class IntfTest implements intf1 {

	@Override
	public void getMethod() {
		System.out.println("get method");
	}

	@Override
	public void setMethod() {
		System.out.println("set methood");
	}

	@Override
	public String getString(String value) {
		System.out.println("getString method");
		return value;
	}
public static void main(String[] args) {
	IntfTest i=new IntfTest();
	i.getMethod();
	i.setMethod();
	i.getString("chrome");
}
}
