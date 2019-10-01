package com.wbl.business;

public class Account {
public  int accountId;
public double accountBaal;
public void withDaarw(double amount) {
	accountBaal=accountBaal-amount;
}
public void dposit(double depAmount) {
	accountBaal=accountBaal+depAmount;
}
public double getAccountBal() {
return accountBaal;	
}
}
