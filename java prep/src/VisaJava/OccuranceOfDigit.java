package VisaJava;

public class OccuranceOfDigit {
public static void main(String[] args) {
	int num=233;
	int digit,num1,count=0;
while(num!=0) {
	digit=num%10;//2,2,2
	num=num/10;
	if(digit==2) {
		count++;
	}	
}
System.out.println(count);
}
}
