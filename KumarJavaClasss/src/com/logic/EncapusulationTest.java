package com.logic;

import com.wbl.Accouunt;

public class EncapusulationTest {
public static void main(String[] args) {
	Accouunt a=new Accouunt();
	a.setAccounId(10);;
	a.setAccounNumber(2);;
	System.out.println(a.getAccounId());
	System.out.println(a.getAccountNumber());
}
}
