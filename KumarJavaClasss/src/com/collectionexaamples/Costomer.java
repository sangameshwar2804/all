package com.collectionexaamples;

import java.util.Date;

public class Costomer implements Comparable {
String cstName;
String mobileNum;
Date dateOfOrder;
int age;
public Costomer(String cstName,String mobileNum,Date dateOfOrder,int age) {
	this.cstName=cstName;
	this.mobileNum=mobileNum;
	this.dateOfOrder=dateOfOrder;
	this.age=age;
}
public String getCstName() {
	return cstName;
}
public void setCstName(String cstName) {
	this.cstName = cstName;
}
public String getMobileNum() {
	return mobileNum;
}
public void setMobileNum(String mobileNum) {
	this.mobileNum = mobileNum;
}
public Date getDateOfOrder() {
	return dateOfOrder;
}
public void setDateOfOrder(Date dateOfOrder) {
	this.dateOfOrder = dateOfOrder;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public int compareTo(Object obj) {
	Costomer cu=(Costomer)obj;
	if(this.age==cu.age) 
		return 0;
	else if(this.age>cu.age)
		return 1;
	else
	return -1;
}

}
