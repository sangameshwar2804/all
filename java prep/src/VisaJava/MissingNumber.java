package VisaJava;

public class MissingNumber {
public static void main(String[] args) {
	int[] arr= {1,2,4};
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	int sum1=1;
	for(int j=0;j<arr.length;j++) {
		sum1=sum1+j;
	}
	int r=sum-sum1;
	System.out.println(r);
}
}
