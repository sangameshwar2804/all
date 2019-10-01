package javaprep1;

public class AddEvenArray {
public static int getAddedArray(int[] arr) {
	int add=0;
	if(arr.length<0) {
		return 0;
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			add=arr[i]+add;
		}
	
	}
	return add;
}
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,8};
	System.out.println(getAddedArray(arr));
}
}
