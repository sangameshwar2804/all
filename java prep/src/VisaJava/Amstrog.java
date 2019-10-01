package VisaJava;

public class Amstrog {

	public static void main(String[] args) {
		int num = 371, temp, digit, total = 0;//3*3*3+7*7*7+1*1*1=371

		temp = num;
		while (temp != 0) {
			digit = temp % 10;//1,7,3
			total = total + digit * digit * digit;
			temp /= 10;
		}

		if (total == num)
			System.out.println(num + " is an Armstrong number");
		else
			System.out.println(num + " is not an Armstrong number");
	}
}
