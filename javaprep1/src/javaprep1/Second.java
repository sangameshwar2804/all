package javaprep1;

public class Second {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	int a=0;
	int b=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>a) {
			b=a;
			a=arr[i];
		}
		else if (arr[i]>b) {
			b=arr[i];
		}
	}
	System.out.println(b);
}
}
