package javaprep1;

public class AddArr {
public static int getAddedNum(int[] arr) {
	int add = 0;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>0) {
			add=add+arr[i];
		}
	}
	return add;
}
public static void main(String[] args) {
int[] arr= {-1,2,3,4,-5};
	System.out.println(getAddedNum(arr));
}
}
