package javaprep1;

public class MissingNumArray {
public static void main(String[] args) {
	int[] a= {1,3};
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	int sum1=1;
	for(int j=0;j<a.length;j++) {
		sum1=sum1+j;
	}
	int r=sum-sum1;
	System.out.println(r);
}
}
