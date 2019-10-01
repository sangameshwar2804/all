package com.wbl.business;

public class IndexOfArrayElement {
public static void main(String[] args) {
	int[] a= {5,4,3,2,1};
	int element=2;
	int index=0;
	for(int i=0;i<a.length;i++) {
		if(element==a[i]) {
			index=i;
			System.out.println(index);
		}
		
	}
}
}
