package com.wbl.test;

import com.wbl.business.Account;

public class AccountMain {
public static void main(String[] args) {
	Account a=new Account();
	a.accountId=100;
	a.accountBaal=150;
	a.dposit(150);
	
	a.withDaarw(100);
	System.out.println(a.getAccountBal());
	Account a1=new Account();
	a1.accountId=101;
	a1.accountBaal=150;
	a1.dposit(3000.50);
a1.withDaarw(150.85);
System.out.println(a1.getAccountBal());
a=a1;
System.out.println(a1.getAccountBal());
}
}
