package com.wbl.logic;

public class LargestSmallestArray {
public int[] findLargestAndSmallestArray(int[] arr) {
	
	int largest=arr[0];
	int smallest=arr[0];
	int[] temp=new int[2];
	for(int i=0;i<arr.length;i++) {
		if(largest<arr[i] ||smallest>arr[i]) {
			largest=arr[i];
		smallest=arr[i];
		}	
	}
	temp[0]=largest;
	temp[1]=smallest;
	return temp;
}
}