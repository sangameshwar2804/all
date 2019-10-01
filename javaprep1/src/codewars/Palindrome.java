package codewars;

public class Palindrome {
public static void main(String[] args) {
	int num=101;
	int digit,rem,total=0;
	while(num>10) {
		digit=num%10;
		
		total=(total*10)+digit;
		rem=num/10;
	}
	System.out.println(total);
	if(num==total) {
		System.out.println("true");
	}
	else
		System.out.println("false");
}
}
