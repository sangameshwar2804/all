package com.collectionexaamples;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class CostomerTest {
public static void main(String[] args) {
	Set<Costomer> s=new TreeSet<Costomer>();
	Costomer c=new Costomer("Aryav","9908753539",new Date("19-jan-2019"),25);
	Costomer c1=new Costomer("Lakshaay","9908753540",new Date("19-feb-2019"),24);
	Costomer c2=new Costomer("Vedang","9908753541",new Date("19-mar-2019"),23);
	Costomer c3=new Costomer("Bhaskar","9908753542",new Date("19-apr-2019"),22);
	s.add(c);
	s.add(c1);
	s.add(c2);
	s.add(c3);
	for(Costomer s1:s) {
		System.out.println("Customer name:"+s1.getCstName()+" Customer Age:"+s1.getAge()+" Customer Mobile Number:"+s1.getMobileNum()+" Customer Age:"+s1.getAge());
	}
}
}
