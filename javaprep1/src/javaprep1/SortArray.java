package javaprep1;

public class SortArray {
public static void sortArraay(int[] arr) {
	int min=0,temp;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				min=j;
			}
		}
		temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
public static void main(String[] args) {
	int[] ar= {1,4,7,2,9};
	sortArraay(ar);
}
}
